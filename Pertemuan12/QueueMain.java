package Pertemuan12;
import java.util.Scanner;
public class QueueMain {
    public static void main(String[] args) {
        QueueMahasiswa queue = new QueueMahasiswa();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        System.out.println("Sistem Antrian Unit Kemahasiswaan");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Daftar Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Jumlah Mahasiswa Mengantre");
            System.out.println("7. Cek Status Antrian");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\nPendaftaran Antrian");
                    System.out.print("NIM       : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama      : ");
                    String nama = sc.nextLine();
                    System.out.println("Keperluan:");
                    System.out.println("1. Beasiswa");
                    System.out.println("2. Surat Keterangan Aktif");
                    System.out.println("3. Konsultasi Akademik");
                    System.out.println("4. Lainnya");
                    System.out.print("Pilih: ");
                    int pilihanKeperluan = sc.nextInt();
                    sc.nextLine();
                    String keperluan;
                switch (pilihanKeperluan) {
                    case 1: 
                        keperluan = "Beasiswa"; 
                        break;
                    case 2: 
                        keperluan = "Surat Keterangan Aktif"; 
                        break;
                    case 3: 
                        keperluan = "Konsultasi Akademik"; 
                        break;
                    default: 
                        keperluan = "Lainnya"; 
                        break;
                    }
                    queue.enqueue(new Mahasiswa(nim, nama, keperluan));
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peekFront();
                    break;
                case 4:
                    queue.peekRear();
                    break;
                case 5:
                     queue.printQueue();
                     break;
                case 6:
                    System.out.println("Jumlah mahasiswa yang mengantre: " + queue.getSize() + " orang");
                    break;
                 case 7:
                    System.out.println("Status Antrian:");
                    System.out.println("Kosong : " + (queue.isEmpty() ? "Ya" : "Tidak"));
                    System.out.println("Penuh  : " + (queue.isFull() ? "Ya" : "Tidak"));
                    System.out.println("Jumlah : " + queue.getSize() + " orang");
                    break;
                case 8:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }while (pilihan != 0);
        sc.close();
    }
}
    


