package Jobsheet12;
public class DoubleLinkedList01 {
    Node01 head;
    Node01 tail;

    public DoubleLinkedList01(){
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    } 
    public void addFirst(Mahasiswa01 data){
        Node01 newNode = new Node01(data);
        if (isEmpty()){ 
            head = tail = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void addLast(Mahasiswa01 data){
        Node01 newNode = new Node01(data);
        if (isEmpty()){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void insertAfter(String keyNim, Mahasiswa01 data){
        Node01 current = head;
        while (current != null && !current.data.nim.equals(keyNim)){
            current = current.next;
        }
        if (current == null){
            System.out.println("Data dengan NIM : "+keyNim+" tidak ditemukan");
            return;
        }

        Node01 newNode = new Node01(data);
        if (current == tail){
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        }
        else{
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM : "+keyNim);
    }
    public void removeFirst(){
        if (isEmpty()){
            System.out.println("Linked list masih kosong");
            return;
        }
        if (head == tail){
            head.data.tampil();
            System.out.println("Berhasil dihapus");
            head = tail = null;
        }
        else{
            head.data.tampil();
            System.out.println("Berhasil dihapus");
            head = head.next;
            head.prev = null;
        }
    }
    public void removeLast(){
        if (isEmpty()){
            System.out.println("Linked list masih kosong");
            return;
        }
        if (head == tail){
            head.data.tampil();
            System.out.println("Berhasil dihapus");
            head = tail = null;
        }
        else{
            tail.data.tampil();
            System.out.println("Berhasil dihapus");
            tail = tail.prev;
            tail.next = null;
        }
    }
    public void print(){
        if (isEmpty()){
            System.out.println("Linked list masih kosong");
            return;
        }

        Node01 current = head;
        while (current != null){
            current.data.tampil();
            current = current.next;
        }
    }
    public void printReverse(){
        if (isEmpty()){
            System.out.println("Linked list masih kosong");
            return;
        }

        Node01 current = tail;
        while (current != null){
            current.data.tampil();
            current = current.prev;
        }
    }
}
