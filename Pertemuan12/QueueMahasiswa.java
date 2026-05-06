package Pertemuan12;
public class QueueMahasiswa {
    private NodeMahasiswa head;
    private NodeMahasiswa tail;
    private int size;
    private final int MAX_KAPASITAS = 10;

    public QueueMahasiswa() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    public boolean isFull() {
        return size >= MAX_KAPASITAS;
    }
    public void clear() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }
    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak dapat menambah antrian.");
            return;
        }
        NodeMahasiswa newNode = new NodeMahasiswa(mhs);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println(mhs.nama + " berhasil masuk antrian. Nomor antrian: " + size);
    }
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada yang dapat dipanggil.");
            return;
        }
        System.out.println("Memanggil antrian terdepan:");
        head.data.tampilInformasi();
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        System.out.println("Mahasiswa selesai dilayani. Sisa antrian: " + size);
    }
    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Antrian terdepan:");
        head.data.tampilInformasi();
    }
    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Antrian paling akhir:");
        tail.data.tampilInformasi();
    }
    public int getSize() {
        return size;
    }
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        NodeMahasiswa tmp = head;
        int no = 1;
        System.out.println("Daftar Antrian Kemahasiswaan:");
        while (tmp != null) {
            System.out.println(no + ". " + tmp.data.nama + " | NIM: " + tmp.data.nim + " | " + tmp.data.keperluan);
            tmp = tmp.next;
            no++;
        }
        System.out.println("Total antrian: " + size + " mahasiswa");
    }
}

