package Jobsheet12;
import java.util.Scanner;
public class DoubleLinkedListMain {
    public static Mahasiswa01 inputMahasiswa(Scanner sc){
        System.out.print("NIM : ");
        String nim = sc.nextLine();
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("IPK : ");
        double ipk = sc.nextDouble();
        sc.nextLine();
        return new Mahasiswa01(nim, nama, kelas, ipk);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList01 list = new DoubleLinkedList01();
        int pilih;

        do{
            System.out.println("\n=== Menu Double Linked List ===");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (Setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data dari depan");
            System.out.println("7. Tampilkan data dari belakang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt(); 
            sc.nextLine();

            switch (pilih) {
                case 1:
                    Mahasiswa01 mhsAwal = inputMahasiswa(sc);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa01 mhsAkhir = inputMahasiswa(sc);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = sc.nextLine();
                    System.out.println("Masukkan data baru : ");
                    Mahasiswa01 dataBaru = inputMahasiswa(sc);  
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 7:
                    list.printReverse();
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Menu tidak valid");
            }
        } while (pilih != 0);
        sc.close();
    }
}
