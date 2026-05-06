package Pertemuan12;
public class Mahasiswa01 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa01(String nm, String name, String kls, double ip){
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    void tampilInformasi(){
        System.out.println(nama+"\t\t"+nim+"\t\t"+kelas+"\t\t"+ipk);
    }
}
