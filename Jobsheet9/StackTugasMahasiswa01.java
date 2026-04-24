package Jobsheet9;
public class StackTugasMahasiswa01 {
    Mahasiswa01[] stack;
    int top;
    int size;

    public StackTugasMahasiswa01(int size){
        this.size = size;
        stack = new Mahasiswa01[size];
        top = -1;
    }
    public boolean isFull(){
        if (top == size - 1){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isEmpty(){
        if (top == -1){
            return true;
        }
        else {
            return false;
        }
    }
    public void push(Mahasiswa01 mhs){
        if (!isFull()){
            top++;
            stack[top] = mhs;
        }
        else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi");
        }
    }
    public Mahasiswa01 pop(){
        if (!isEmpty()){
            Mahasiswa01 m = stack[top];
            top--;
            return m;
        }
        else{
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai");
            return null;
        }
    }
    public Mahasiswa01 peek(){
        if (!isEmpty()){
            return stack[top];
        }
        else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }
    public void print(){
        for (int i = 0; i <= top; i++){
            System.out.println(stack[i].nama+"\t"+stack[i].nim+"\t"+stack[i].kelas);
        }
        System.out.println("");
    }
}
