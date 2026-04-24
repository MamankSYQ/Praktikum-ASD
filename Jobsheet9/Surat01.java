package Jobsheet9;
public class Surat01 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    Surat01(){

    }
    Surat01(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi){
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }
}
