package session07.bt6;

import java.util.ArrayList;




public class main {
    public static void main(String[] args) {
        User u1 = new User(1, "_a", "123456");
        User u2 = new User(2, "_b", "123456");
        User u3 = new User(3, "_c", "123456");
        UserManager.addUser(u1);
        UserManager.addUser(u2);
        UserManager.addUser(u3);
        System.out.println("Đã thêm 3 user vào hệ thống.");
        System.out.println("Danh sách hiện tại:");
        for (int i = 0; i < UserManager.users.size(); i++) {
            System.out.println((i + 1) + ". " + UserManager.users.get(i));
        }
        System.out.println("\nKiểm tra đăng nhập:");
        System.out.println("- Login (\"dev_a\", \"123456\"): " + (UserManager.checkLogin("_a", "123456") ? "Thành công!" : "Thất bại!"));
        System.out.println("- Login (\"dev_b\", \"sai_pass\"): " + (UserManager.checkLogin("_b", "sai_pass") ? "Thành công!" : "Thất bại!"));
    }
}
