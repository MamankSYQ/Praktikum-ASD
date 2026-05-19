package CaseMethod2;
public class NodeAntrian01 {
    int noAntri;
    Pembeli01 pembeli;
    NodeAntrian01 next;
    NodeAntrian01 prev;

    NodeAntrian01(int noAntri, Pembeli01 pembeli){
        this.noAntri = noAntri;
        this.pembeli = pembeli;
        next = prev = null;
    }
}
