package sesion02.bt4;

import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ID;
        do{
            System.out.print("Nhập ID sách mới: ");
            ID = sc.nextInt();
            if(ID <= 0 ){
                System.out.println("Id phải là số dương, vui lòng nhập lại");
            }
        }while(ID<=0);
        System.out.println("Id " + ID +" đã được lưu");
    }
}

