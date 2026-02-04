package sesion02.bt6;

import java.util.Scanner;

public class bt6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int MIN = Integer.MAX_VALUE;
        int MAX = Integer.MIN_VALUE;
        for(int i=2; i<=8 ;i++){
            String day = (i==8) ? "Chủ nhật" : "Thứ " + i;
            System.out.print("Nhập lượt mượn "+day+" :");
            int luot =  sc.nextInt();
            sum += luot;
            if(luot<MIN){
                MIN = luot;
            }
            if(luot>MAX){
                MAX = luot;
            }
        }
        System.out.println("--Kết quả thống kê--");
        System.out.println("Lượt mượn cao nhất: "+MAX);
        System.out.println("Lượt mượn ít nhất: "+MIN);
        System.out.println("Trung bình lượt mượn mỗi ngày: "+sum/7);
    }
}
