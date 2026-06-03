package Pertemuan14;
public class BinaryTree01 {
    Node01 root;

    public BinaryTree01(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void add(Mahasiswa01 mahasiswa) {
    Node01 newNode = new Node01(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node01 current = root;
            Node01 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void addRekursif(Mahasiswa01 mahasiswa) {
        root = addRekursifHelper(root, mahasiswa);
    }

    public Node01 addRekursifHelper(Node01 current, Mahasiswa01 mahasiswa) {
        if (current == null) {
            return new Node01(mahasiswa);
        }
        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursifHelper(current.left, mahasiswa);
        } else if (mahasiswa.ipk > current.mahasiswa.ipk) {
            current.right = addRekursifHelper(current.right, mahasiswa);
        }
        return current;
    }

    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Binary tree kosong!");
            return;
        }
        Node01 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.println("\n== Mahasiswa IPK Terkecil ==");
        current.mahasiswa.tampilInformasi();
    }

    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Binary tree kosong!");
            return;
        }
        Node01 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.println("\n== Mahasiswa IPK Terbesar ==");
        current.mahasiswa.tampilInformasi();
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        System.out.println("\n== Mahasiswa dengan IPK di atas " + ipkBatas + " ==");
        tampilIPKdiAtasHelper(root, ipkBatas);
    }

    public void tampilIPKdiAtasHelper(Node01 current, double ipkBatas) {
        if (current == null) return;
        tampilIPKdiAtasHelper(current.left, ipkBatas);
        if (current.mahasiswa.ipk > ipkBatas) {
            current.mahasiswa.tampilInformasi();
        }
        tampilIPKdiAtasHelper(current.right, ipkBatas);
    }

    boolean find(double ipk) {
        boolean result = false;
        Node01 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }
    
        void traversePreOrder(Node01 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node01 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node01 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node01 getSuccessor(Node01 del) {
    Node01 successor = del.right;
    Node01 successorParent = del;

    while (successor.left != null) {
        successorParent = successor;
        successor = successor.left;
    }

    if (successor != del.right) {
        successorParent.left = successor.right;
        successor.right = del.right;
    }

    return successor;
    }

    void delete(double ipk){
    if (isEmpty()){
        System.out.println("Binary tree kosong");
        return;
    }

   
    Node01 parent = root;
    Node01 current = root;
    boolean isLeftChild = false;

        while (current != null){
            if (current.mahasiswa.ipk == ipk){
                break;
            } else if (ipk < current.mahasiswa.ipk){
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null){
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null){
                if (current == root){
                    root = null;
                } else {
                    if (isLeftChild){
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null){
                if (current == root){
                    root = current.right;
                } else {
                    if (isLeftChild){
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            }else{
                Node01 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();

                if(current == root){
                    root = successor;
                }else{
                    if(isLeftChild){
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                }

            successor.left = current.left;
            }
        }
    }
}