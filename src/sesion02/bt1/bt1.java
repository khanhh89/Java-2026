package sesion02.bt1;

import java.util.Scanner;
public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tuổi của bạn: ");
        int year = sc.nextInt();
        System.out.print("Nhập số sách đang mươn: ");
        int numberBook =  sc.nextInt();
        if(year >= 18 && numberBook < 3){
            System.out.print("Cho phép mượn sách");
        } else  {
            System.out.println("Không đủ điều kiện");
            if(numberBook >= 3){
                System.out.println("Bạn đã mượn tối đa 3 cuốn");
            }
            if(year < 18){
                System.out.println("Bạn chưa đủ tuổi");
            }
        }
    }
}
