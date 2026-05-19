package CaseMethod2;
public class NodePesanan01{
    Pesanan01 pesanan;
    NodePesanan01 next;
    NodePesanan01 prev;

    NodePesanan01(Pesanan01 pesanan){
        this.pesanan = pesanan;
        next = prev = null;
    }
}