package P2Jobsheet10;
import java.util.Scanner;
public class AntrianKRSMain01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS01 antrian = new AntrianKRS01(10);
        int pilih;

        do {
            System.out.println("\n=== Menu Antrian Proses KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Memanggil Mahasiswa (2 Mahasiswa Terdepan)");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Lihat 2 Mahasiswa Terdepan");
            System.out.println("6. Lihat Mahasiswa Terakhir");
            System.out.println("7. Jumlah Mahasiswa dalam Antrian");
            System.out.println("8. Jumlah Mahasiswa yang Sudah Melakukan Proses KRS");
            System.out.println("9. Jumlah Mahasiswa yang Belum Melakukan Proses KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt(); 
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa01 mhs = new Mahasiswa01(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa01[] dilayani = antrian.layaniMahasiswa();
                    for (int i = 0; i < dilayani.length; i++) {
                        if (dilayani[i] != null) {
                            System.out.print("Mahasiswa ke-" + (i+1) + " dilayani: ");
                            dilayani[i].tampilkanData();
                        }
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    antrian.lihat2Terdepan();
                    break;
                case 6:
                    antrian.lihatAkhir();
                    break;
                case 7:
                    antrian.getJumlahAntrian();
                    break;
                case 8:
                    antrian.sudahKRS();
                    break;
                case 9:
                    antrian.belumKRS();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
        sc.close();
    }
}
