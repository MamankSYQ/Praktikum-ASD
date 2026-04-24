package Jobsheet9;
public class StackSurat01 {
    Surat01[] stack;
    int top;
    int size;

    public StackSurat01(int size){
        this.size = size;
        stack = new Surat01[size];
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
    public void push(Surat01 srt){
        if (!isFull()){
            top++;
            stack[top] = srt;
        }
        else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi");
        }
    }
    public Surat01 pop(){
        if (!isEmpty()){
            Surat01 s = stack[top];
            top--;
            return s;
        }
        else{
            System.out.println("Stack kosong! Tidak ada surat untuk diproses");
            return null;
        }
    }
    public Surat01 peek(){
        if (!isEmpty()){
            return stack[top];
        }
        else {
            System.out.println("Stack kosong! Tidak ada surat yang diproses");
            return null;
        }
    }
    public Surat01 CariSurat(String namaMahasiswa){
        for (int i = top; i >= 0; i--){
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)){
                return stack[i];
            }
        }
        return null;
    }
}
