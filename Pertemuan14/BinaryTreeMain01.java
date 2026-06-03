package Pertemuan14;
public class BinaryTreeMain01 {
    public static void main(String[] args) {

        BinaryTree01 bst = new BinaryTree01();

        System.out.println("===== TEST addRekursif =====");
        bst.addRekursif(new Mahasiswa01("244160121", "Ali",    "A", 3.57));
        bst.addRekursif(new Mahasiswa01("244160221", "Badar",  "B", 3.85));
        bst.addRekursif(new Mahasiswa01("244160185", "Candra", "C", 3.21));
        bst.addRekursif(new Mahasiswa01("244160220", "Dewi",   "B", 3.54));
        bst.addRekursif(new Mahasiswa01("244160131", "Devi",   "A", 3.72));
        bst.addRekursif(new Mahasiswa01("244160205", "Ehsan",  "D", 3.37));
        bst.addRekursif(new Mahasiswa01("244160170", "Fizi",   "B", 3.46));

        System.out.println("\nInOrder Traversal:");
        bst.traverseInOrder(bst.root);

        bst.cariMinIPK();
        bst.cariMaxIPK();

        bst.tampilMahasiswaIPKdiAtas(3.50);

        System.out.println("\n\n===== TEST BinaryTreeArray01 =====");
        BinaryTreeArray01 bta = new BinaryTreeArray01();

        bta.add(new Mahasiswa01("244160121", "Ali",    "A", 3.57));
        bta.add(new Mahasiswa01("244160221", "Badar",  "B", 3.85));
        bta.add(new Mahasiswa01("244160185", "Candra", "C", 3.21));
        bta.add(new Mahasiswa01("244160220", "Dewi",   "B", 3.54));
        bta.add(new Mahasiswa01("244160131", "Devi",   "A", 3.72));
        bta.add(new Mahasiswa01("244160205", "Ehsan",  "D", 3.37));
        bta.add(new Mahasiswa01("244160170", "Fizi",   "B", 3.46));

        System.out.println("\nPreOrder Traversal:");
        bta.traversePreOrder(0);

        System.out.println("\nInOrder Traversal:");
        bta.traverseInOrder(0);
    }
}