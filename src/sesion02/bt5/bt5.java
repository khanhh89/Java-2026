package sesion02.bt5;

import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int uyTin = 100;
        int chamTre;
        System.out.println("--Hệ thống đánh giá người dùng-- ");
        while (true) {
            System.out.print("Số ngày chậm trễ của lần này: ");
            chamTre = sc.nextInt();
            if (chamTre == 999) {
                break;
            }
            int diemPhat = chamTre * 2;
            uyTin -= diemPhat;
            System.out.println("Trả trễ " + chamTre+ " ngày -" + diemPhat + " điểm");
        }
        System.out.println("Tổng điểm uy tín: "+uyTin);
        if(uyTin > 120){
            System.out.println("Độc giả Thân thiết");
        } else if (uyTin>=80||uyTin<=120) {
            System.out.println("Độc giả Tiêu chuẩn");
        } else {
            System.out.println("Độc giả cần lưu ý");
        }
    }
}
