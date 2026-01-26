package sesion01.bt2;

public class bt2 {
    public static  void  main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Nhap so ngay cham tre:");
        int outDate = scanner.nextInt();
        System.out.print("Nhap so luong sach muon: ");
        int numberOfBook = scanner.nextInt();
        //tiền phạt
        double total = outDate * numberOfBook * 5000;
        if(outDate > 7 && numberOfBook >= 3) {
            total *= 1.2;
        }
        System.out.println("Tien phat goc: "+  total + "VND");
        System.out.println("Tiền phạt sau khi điều chỉnh: " + (int)total + "VNĐ");
        boolean lookCard = total > 50000;
        System.out.println("Yêu cầu khóa thẻ: "+ lookCard );
        scanner.close();
    }
}
