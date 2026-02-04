package session07.bt4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ClassRoom sv1 = new ClassRoom("Sinh viên 1");
        ClassRoom sv2 = new ClassRoom("Sinh viên 2");
        ClassRoom sv3 = new ClassRoom("Sinh viên 3");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sinh viên 1 đóng vào quỹ: ");
        int tien1 = scanner.nextInt();
        System.out.print("Sinh viên 2 đóng vào quỹ: ");
        int tien2 = scanner.nextInt();
        System.out.print("Sinh viên 3 đóng vào quỹ: ");
        int tien3 = scanner.nextInt();
        sv1.dongTien(tien1);
        sv2.dongTien(tien2);
        sv3.dongTien(tien3);
        System.out.println("Tổng quỹ lớp: " + ClassRoom.getClassFund());
    }
}
