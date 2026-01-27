package sesion03.bt2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class bt2 {
    //mảng tên sách
    static String[] books = { "Doraemon", "Lão Hạc", "Chiếc Lá Cuối Cùng" };
    //tìm kiếm sách
    public static int searchBook(String[] arr, String search){
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(search)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ten sách cần tìm: ");
        String search =  sc.nextLine();
        int index = searchBook(books, search);
        if(index != -1){
            System.out.println("Tìm thấy sách '" + books[index] + "' tại vị trí số: " + index);
        } else {
            System.out.println("Không tìm thấy sách");
        }
    }
}
