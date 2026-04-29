package P2Jobsheet10;
public class AntrianKRS01 {
    Mahasiswa01[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudahKrs;

    public AntrianKRS01(int max){
        this.max = max;
        data = new Mahasiswa01[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.sudahKrs = 0;
    }

    public boolean isEmpty(){
        if (size == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull(){
        if (size == max){
            return true;
        }
        else{
            return false;
        }
    }
    public void lihatTerdepan(){
        if (isEmpty()){
            System.out.println("Antrian kosong.");
        }
        else{
            System.out.print("Mahasiswa terdepan : ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }
    public void lihat2Terdepan(){
        if (isEmpty()){
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("2 Mahasiswa terdepan : ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < 2; i++) {
            if (i >= size) {
                System.out.println("Antrian hanya berisi " + size + " mahasiswa.");
                break;
            }
        int index = (front + i) % max;
        System.out.print((i + 1) + ". ");
        data[index].tampilkanData();
    }
    }
    public void lihatAkhir(){
        if (isEmpty()){
            System.out.println("Antrian kosong.");
        }
        else{
            System.out.print("Mahasiswa terakhir : ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }
    public void tampilkanSemua(){
        if (isEmpty()){
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar mahasiswa dalam antrian : ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++){
            int index = (front + i) % max;
            System.out.print((i + 1)+". ");
            data[index].tampilkanData();
        }
    }
    public void clear(){
        if (!isEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan.");
        }
        else{
            System.out.println("Queue masih kosong.");
        }
    }
    public void tambahAntrian(Mahasiswa01 mhs){
        if (isFull()){
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear =(rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama+" berhasil masuk ke antrian.");
    }
    public Mahasiswa01[] layaniMahasiswa(){
        Mahasiswa01[] hasil = new Mahasiswa01[2];
        
        for (int i = 0; i < 2; i++){
            if (isEmpty()){
            System.out.println("Antrian kurang dari 2 mahasiswa. Hanya melayani "+i+" mahasiswa.");
            break;
            }
            hasil[i] = data[front];
            front = (front + 1) % max;
            size--;
            sudahKrs++;
        }
        return hasil;
    }
    public void getJumlahAntrian(){
        System.out.println("Jumlah dalam antrian : "+size);
    }
    public void sudahKRS(){
        System.out.println("Jumlah mahasiswa yang sudah melakukan proses KRS : "+sudahKrs);
    }
    public void belumKRS(){
    System.out.println("Jumlah mahasiswa yang belum melakukan proses KRS : " + size);
    }
}
