package Praktikum14;
import java.util.Stack;
public class StackDemo01 {
    public static void main(String[] args) {
        Book01 book1 = new Book01("1234", "Dasar Pemrograman");
        Book01 book2 = new Book01("7145", "Hafalan Shalat Delisa");
        Book01 book3 = new Book01("3562", "Muhammad Al-Fatih");

        Stack<Book01> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book01 temp = books.peek();

        if (temp != null){
            System.out.println(temp.toString());
        }

        Book01 temp2 = books.pop();

        if (temp2 != null){
            System.out.println(temp2.toString());
        }

        for (Book01 book : books){
            System.out.println(book.toString());
        }

        int posisi = books.search(book2);

        if (posisi != -1){
            System.out.println("Ditemukan di "+posisi);
        }
        else{
            System.out.println("Buku tidak ditemukan");
        }

        System.out.println(books);
    }
}
