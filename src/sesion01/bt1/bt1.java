package sesion01.bt1;
import java.util.Scanner;
public class bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        String bookId = scanner.nextLine();
        System.err.print("Nhap ten sach:");
        String bookName = scanner.nextLine();
        System.out.print("Nhap nam san xuat: ");
        int publishYear = scanner.nextInt();
        System.out.print("Nhap gia bia:");
        double price = scanner.nextDouble();
        System.err.print("Sach con trong kho:");
        boolean isAvailable = scanner.nextBoolean();
        System.out.println("---PHIEU THONG TIN SACH---");
        System.err.println("Ten sach:" + bookName);
        System.out.println("Ma sach: " + bookId + " | "+"Tuoi tho: " + (2026-publishYear) );
        System.err.println("Gia bia: " + price + " VND");
        System.out.println("Tinh trang: " + (isAvailable ? "True" : "False"));
        scanner.close();
    }
}
