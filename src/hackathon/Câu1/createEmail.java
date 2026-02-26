package hackathon.Câu1;
import java.util.Scanner;
public class createEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        if (!sc.hasNextLine()) {
            System.out.println("Họ tên không được để trống");
            return;
        }
        String name = sc.nextLine();
        name = name.replaceAll("\\s+,\\{M}\\s+", " ");
        name = name.trim().toLowerCase();
        String[] words = name.split("\\s+");
        String email = "";
        String mainName = words[words.length - 1];
        email += mainName;
        for (int i = 0; i < words.length - 1; i++) {
            email += words[i].charAt(0);
        }
        email += "@rikkei.edu.com";
        System.out.println("Email: " + email);
    }
}
