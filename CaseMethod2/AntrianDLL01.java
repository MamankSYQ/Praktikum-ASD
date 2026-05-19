package CaseMethod2;
public class AntrianDLL01 {
    NodeAntrian01 head;
    NodeAntrian01 tail;
    int hitungAntrian;

    AntrianDLL01(){
        head = tail = null;
        hitungAntrian = 0;
    }

    void tambahAntrian(Pembeli01 pembeli){
        hitungAntrian++;
        NodeAntrian01 newNode = new NodeAntrian01(hitungAntrian, pembeli);
        if (head == null){
            head = tail = newNode;
        }
        else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor : "+hitungAntrian);
    }
    void cetakAntrian(){
        System.out.println("==============================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("==============================");
        if (head == null){
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.printf("%-12s %-16s %s%n", "No Antrian", "Nama", "No HP");
        NodeAntrian01 current = head;
        while (current != null){
            System.out.printf("%-12d %-16s %s%n", current.noAntri, current.pembeli.namaPembeli, current.pembeli.noHp);
            current = current.next;
        }
    }
    NodeAntrian01 hapusAntrian(){
        if (head == null){
            return null;
        }
        NodeAntrian01 removed = head;
        head = head.next;

        if (head != null){
            head.prev = null;
        }
        else{
            tail = null;
        }
        removed.next = null;
        return removed;
    }
    boolean isEmpty(){
        return head == null;
    }
}
