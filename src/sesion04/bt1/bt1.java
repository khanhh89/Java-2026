package sesion04.bt1;

import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sách: ");
        String name = sc.nextLine();
        System.out.println("Nhập tên tác giả: ");
        String author = sc.nextLine();
        name = name.trim().replaceAll("\\s+", " ").toLowerCase();
        author = format(author.trim().replaceAll("\\s+" , " "));
        System.out.println("[" + name + "] " + " - "+ "Tác giả: "+author);
    }
     static String format (String author){
        String[] words = author.split(" ");
        StringBuilder formatted = new StringBuilder();
        for (String word : words) {
            formatted.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        return formatted.toString();
    }
}
