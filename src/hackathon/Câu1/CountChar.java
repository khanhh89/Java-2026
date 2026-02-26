package hackathon.Câu1;

import java.util.Scanner;
public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi hỗn hợp:");
        if (!sc.hasNextLine()) {
            System.out.println("Chuỗi không được để trống");
            return;
        }
        String input = sc.nextLine();
        int letter = 0;
        int digit = 0;
        int special = 0;
        String str = input;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                letter++;
            }
            else if (Character.isDigit(c)) {
                digit++;
            }
            else {
                special++;
            }
        }
        int max = Math.max(letter, Math.max(digit, special));
        System.out.println(max);
    }
}