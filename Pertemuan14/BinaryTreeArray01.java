package Pertemuan14;
public class BinaryTreeArray01 {
    Mahasiswa01[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray01() {
        this.dataMahasiswa = new Mahasiswa01[100];
        this.idxLast = -1;
    }

    void populateData(Mahasiswa01 dataMhs[], int idxLast){
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void add(Mahasiswa01 data) {
        if (idxLast == -1) {
            dataMahasiswa[0] = data;
            idxLast = 0;
        } else {
            addHelper(data, 0);
        }
    }

    public void addHelper(Mahasiswa01 data, int idx) {
        if (idx >= dataMahasiswa.length) {
            System.out.println("Array penuh, tidak bisa menambah data!");
            return;
        }

        if (dataMahasiswa[idx] == null) {
            dataMahasiswa[idx] = data;
            if (idx > idxLast) idxLast = idx;
            return;
        }

        if (data.ipk < dataMahasiswa[idx].ipk) {
            addHelper(data, 2 * idx + 1);
        } else if (data.ipk > dataMahasiswa[idx].ipk) {
            addHelper(data, 2 * idx + 2);
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }

    void traverseInOrder(int idxStart){
        if(idxStart <= idxLast){
            if(dataMahasiswa[idxStart] != null){
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
}