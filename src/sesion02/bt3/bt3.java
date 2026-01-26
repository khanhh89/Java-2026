package sesion02.bt3;

import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sách trả muộn:");
        int n = sc.nextInt();
        int tongPhat = 0;
        int phatMoiNgay = 5000;
        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập số ngày chậm trễ thứ " + i +": ");
            int m = sc.nextInt();
            tongPhat += m * phatMoiNgay;

        }
        System.out.println("Tổng tiền phạt là: " + tongPhat + "VND");
    }
}
