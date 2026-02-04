package sesion03.bt1;

import java.util.Scanner;

public class bt1 {
    public static int [] addBookToLibraries(int n){
        Scanner sc = new Scanner(System.in);
        int [] bookId = new int [n];
        for(int i=0;i<n;i++){
            System.out.print("Nhập số cho "+ i +" cuốn sách: ");
            bookId[i] = sc.nextInt();
        }
        return bookId;
    }
    public static void displayLibraries(int[] arr){
        System.out.println("Kết quả");
        System.out.println("Danh sách mã sách: ");
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượt cần quản lý: ");
        int n = sc.nextInt();
        int [] bookList = addBookToLibraries(n);
        displayLibraries(bookList);
    }
}
