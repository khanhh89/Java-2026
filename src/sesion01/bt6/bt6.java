package sesion01.bt6;

import java.util.Scanner;

public class bt6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tứ tự của sách trong hệ thống: ");
        int stt  = sc.nextInt();
        int shelf = (stt-1)/25+1;
        int positon = (stt-1)%25+1;
        String area = (shelf<=10) ? "Khu cận" : "Khu viễn";
        System.out.println("Thông tin đinh vị");
        System.out.println("Sách so: "+ stt);
        System.out.println("Địa chỉ: Kệ "+shelf +"- Vị trí: "+positon );
        System.out.println("Phân khu: "+ area);
    }
}
