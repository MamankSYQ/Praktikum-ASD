package Pertemuan12;
public class Mahasiswa {
    String nim;
    String nama;
    String keperluan;

    public Mahasiswa(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    public void tampilInformasi() {
        System.out.println("  NIM       : " + nim);
        System.out.println("  Nama      : " + nama);
        System.out.println("  Keperluan : " + keperluan);
    }
}

