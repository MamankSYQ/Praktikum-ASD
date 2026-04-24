package Jobsheet9;
import java.util.Scanner;
public class SuratDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat01 stack = new StackSurat01(5);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Melihat Surat Izin Teratas");
            System.out.println("4. Cari Surat Izin");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat : ");
                    String idSurat = sc.nextLine();
                    System.out.print("Nama : ");
                    String namaMahasiswa = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    char jenisIzin;
                    do{
                        System.out.print("Jenis Izin (S/I): ");
                        jenisIzin = sc.next().toUpperCase().charAt(0);
                        if (jenisIzin != 'S' && jenisIzin != 'I') {
                            System.out.println("Input tidak valid, hanya boleh S (Sakit) atau I (Izin)");
                        }
                    } while (jenisIzin != 'S' && jenisIzin != 'I');
                    System.out.print("Durasi (hari) : ");
                    int durasi = sc.nextInt();

                    Surat01 srt = new Surat01(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(srt);

                    System.out.printf("Surat %s berhasil dikumpulkan\n", srt.namaMahasiswa);
                    break;
                case 2:
                    Surat01 diproses = stack.pop();
                    System.out.printf("Surat Izin %s sudah siproses\n", diproses.namaMahasiswa);
                    break;
                case 3:
                    Surat01 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir dikumpulkan oleh " + lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String nama = sc.nextLine();

                    Surat01 hasil = stack.CariSurat(nama);

                    if (hasil != null) {
                        System.out.println("Surat ditemukan!");
                        System.out.println("ID Surat    : " + hasil.idSurat);
                        System.out.println("Nama        : " + hasil.namaMahasiswa);
                        System.out.println("Kelas       : " + hasil.kelas);
                        System.out.println("Jenis Izin  : " + hasil.jenisIzin);
                        System.out.println("Durasi      : " + hasil.durasi + " hari");
                    } else {
                        System.out.println("Surat atas nama \"" + nama + "\" tidak ditemukan!");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
