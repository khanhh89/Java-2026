package sesion02.bt2;

import java.net.SocketOption;
import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã khu vực(A,B,C,D):");
        char a = sc.next().charAt(0);
        switch(a){
            case 'A':
                System.out.println("Tầng 1: sách văn học");
                break;
            case 'B':
                System.out.println("Tầng 2: Sách khoa học");
                break;
            case 'C':
                System.out.println("Tầng 3: Sách ngoại ngữ");
                break;
            case 'D':
                System.out.println("Tầng 4: Sách tin học");
                break;
            default:
                System.out.println("Lựa chọn không hợp le");
        }
    }
}
