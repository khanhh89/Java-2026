package onTap.Cau1.Phan2;
import java.util.Scanner;
public class ThongKeKiTuDuyNhat {
    public static void main(String[] args) {
        //nhập vào 1 chuỗi
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi: ");
        String input = sc.nextLine();
        //tìm và in ra các ký tự xuất hiện đúng 1 lần trong chuỗi đó theo thứ tự xuất hiện trong chuỗi
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char check = input.charAt(i);
            if (input.indexOf(check) == input.lastIndexOf(check)) {
                result.append(check);
            }
        }
        System.out.println("Các ký tự xuất hiện đúng 1 lần: "+ result.toString());
    }
}
