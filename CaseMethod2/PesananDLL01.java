package CaseMethod2;
public class PesananDLL01 {
    NodePesanan01 head;
    NodePesanan01 tail;
    int totalPendapatan;

    PesananDLL01(){
        head = tail = null;
        totalPendapatan = 0;
    }

    void tambahPesanan(Pesanan01 pesanan){
        NodePesanan01 newNode = new NodePesanan01(pesanan);
        if (head == null){
            head = tail = newNode;
        }
        else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        totalPendapatan += pesanan.harga;
    }
    void urutNamaPesanan(){
        if (head == null || head.next == null){
            return;
        }
        boolean swapped;
        do{
            swapped = false;
            NodePesanan01 cur = head;
            while (cur.next != null) {
                if (cur.pesanan.namaPesanan.compareToIgnoreCase(cur.next.pesanan.namaPesanan) > 0){
                    Pesanan01 tmp = cur.pesanan;
                    cur.pesanan = cur.next.pesanan;
                    cur.next.pesanan = tmp;
                    swapped = true;
                }
                cur = cur.next;
            }
        } while (swapped);
    }
    void laporan(){
        System.out.println("======================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("======================================");

        if (head == null) {
            System.out.println("Belum ada pesanan.");
            return;
        }

        urutNamaPesanan();

        System.out.printf("%-15s %-20s %s%n", "Kode Pesanan", "Nama Pesanan", "Harga");
        NodePesanan01 cur = head;
        while (cur != null) {
            System.out.printf("%-15d %-20s %d%n", cur.pesanan.kodePesanan, cur.pesanan.namaPesanan, cur.pesanan.harga);
            cur = cur.next;
        }
    }
    boolean isEmpty(){
        return head == null;
    }
}
