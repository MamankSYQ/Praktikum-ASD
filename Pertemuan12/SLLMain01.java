package Pertemuan12;
import java.util.Scanner;
public class SLLMain01 {
    public static void main(String[] args) {
        SingleLinkedList01 sll = new SingleLinkedList01();
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("input Mahasiswa ke-"+i);

            System.out.print("NIM : ");
            String nim = sc.nextLine();

            System.out.print("Nama   : ");
            String nama = sc.nextLine();

            System.out.print("Kelas  : ");
            String kelas = sc.nextLine();

            System.out.print("IPK    : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa01 mhs = new Mahasiswa01(nim, nama, kelas, ipk);
            System.out.println("Pilih metode penambahan : ");
            System.out.println("  1. addFirst (tambah di depan)");
            System.out.println("  2. addLast (tambah di belakang)");
            System.out.print("Pilihan : ");
            int pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    sll.addFirst(mhs);
                    break;
                case 2:
                    sll.addLast(mhs);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
            sll.print();
        }
        sc.close();
    }
}
    
