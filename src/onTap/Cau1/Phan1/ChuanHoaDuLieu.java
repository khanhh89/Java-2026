package onTap.Cau1.Phan1;

import java.util.Scanner;

public class ChuanHoaDuLieu {
    public static void main(String[] args) {
        //Nhập vào 1 chuỗi hỗn hợp
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi hỗn hợp: ");
        String input = sc.nextLine();
        //trích xuất các "từ" (chỉ gồm chữ cái) và nối lại thành 1 chuỗi mới, mỗi từ cách nhau 1 dấu cách, chữ cái đầu tiên của mỗi từ viết hoa, các chữ cái còn lại viết thường
        String[] words = input.split("[^a-zA-Z]+");
        StringBuilder result = new StringBuilder();
        System.out.println("Chuỗi nhập vào: "+input);
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                String word = words[i].toLowerCase();
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
                result.append(word).append(" ");
            }
        }
        System.out.println("Chuỗi sau khi chuẩn hóa: " + result.toString().trim());
        System.out.println("\n");
    }
}
