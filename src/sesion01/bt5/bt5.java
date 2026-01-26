package sesion01.bt5;
import java.util.Scanner;
public class bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào 1 số nguyên co 4 chữ số:");
        int number = sc.nextInt();
        int thousands =  number / 1000;
        int hundreds =  (number / 100) % 10;
        int dozens =   (number / 10) % 10;
        int units =  number % 10;
        int sumOfFirstThreeNumber = thousands + hundreds + dozens;
        System.out.println("Chữ số kiểm tra kì vọng: "+ sumOfFirstThreeNumber);
        if(sumOfFirstThreeNumber % 10 == units){
            System.out.println("Kết quả kiểm tra mã sách: Đúng");
        } else {
            System.out.println("Kết quả kiểm tra mã sách: Sai");
        }
    }
}
