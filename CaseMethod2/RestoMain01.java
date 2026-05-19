package CaseMethod2;
import java.util.Scanner;
public class RestoMain01 {
    static void printMenu() {
        System.out.println("==============================");
        System.out.println("SISTEM ANTRIAN ROYAL DELISH");
        System.out.println("==============================");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian dan Pesan");
        System.out.println("4. Laporan Pesanan");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu : ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AntrianDLL01 antrian = new AntrianDLL01();
        PesananDLL01 pesananList = new PesananDLL01();

        int pilih;
        do {
            printMenu();

            while (!sc.hasNextInt()) {
                 sc.next(); 
            }
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP : ");
                    String hp = sc.nextLine();
                    antrian.tambahAntrian(new Pembeli01(nama, hp));
                    break;
                case 2:
                    antrian.cetakAntrian();
                    break;
                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong.");
                        break;
                    }
                    NodeAntrian01 dipanggil = antrian.hapusAntrian();

                    System.out.print("Kode Pesanan : ");
                    while (!sc.hasNextInt()) { sc.next(); }
                    int kode = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nama Pesanan : ");
                    String namaPesanan = sc.nextLine();

                    System.out.print("Harga        : ");
                    while (!sc.hasNextInt()) { sc.next(); }
                    int harga = sc.nextInt();
                    sc.nextLine();

                    pesananList.tambahPesanan(new Pesanan01(kode, namaPesanan, harga));
                    System.out.println(dipanggil.pembeli.namaPembeli+" telah memesan "+namaPesanan);
                    break;
                case 4:
                    pesananList.laporan();
                    break;
                case 0:
                    System.out.println("Keluar dari sistem.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
        sc.close();
    }
}