package sesion04.bt4;

import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã thẻ: ");
        String card =  sc.nextLine();
        if(!card.matches("^[A-Z]{2}.*")){
            System.out.println("Thiếu tiền tố TV");
        } else if (!card.matches("^[A-Z]{2}\\d{4}.*")) {
            System.out.println("Năm không hợp lệ");
        } else if (!card.matches("^[A-Z]{2}\\d{4}\\d{5}$")) {
            System.out.println("Mã số ngẫu nhiên không hợp lệ");
        } else {
            System.out.println("Mã thẻ hợp lệ");
        }
    }
}
