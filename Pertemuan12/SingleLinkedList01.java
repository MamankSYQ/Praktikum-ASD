package Pertemuan12;

import org.w3c.dom.Node;

public class SingleLinkedList01 {
    NodeMahasiswa01 head;
    NodeMahasiswa01 tail;

    boolean isEmpty(){
        return (head == null);
    }
    public void print(){
        if (!isEmpty()){
            NodeMahasiswa01 tmp = head;
            System.out.println("Isi Linked List:\t");
            while (tmp != null){
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        }
        else{
            System.out.println("Linked List Kosong");
        }
    }
    public void addFirst(Mahasiswa01 input){
        NodeMahasiswa01 ndInput = new NodeMahasiswa01(input, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
        }
        else{
            ndInput.next = head;
            head = ndInput;
        }
    }
    public void addLast(Mahasiswa01 input){
        NodeMahasiswa01 ndInput = new NodeMahasiswa01(input, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
        }
        else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void insertAfter(String key, Mahasiswa01 input){
        NodeMahasiswa01 ndInput = new NodeMahasiswa01(input, null);
        NodeMahasiswa01 temp = head;
        do{
            if (temp.data.nama.equalsIgnoreCase(key)){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null){
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }
    public void insertAt(int index, Mahasiswa01 input){
        if (index < 0){
            System.out.println("indeks salah.");
        }
        else if (index == 0){
            addFirst(input);
        }
        else{
            NodeMahasiswa01 temp = head;
            for (int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa01(input, temp.next);
            if (temp.next.next == null){
                tail = temp.next;
            }
        }
    }
}
