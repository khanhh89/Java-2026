package sesion01.bt4;

import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá sách(USD): ");
        double price = sc.nextDouble();
        System.out.println("Nhập tỷ giá: ");
        float amount = sc.nextFloat();
        double sumTotal = amount * price;
        long roudTotal = (long) sumTotal;
        System.out.println("Giá làm trong thanh toán: " + roudTotal);
    }
}
