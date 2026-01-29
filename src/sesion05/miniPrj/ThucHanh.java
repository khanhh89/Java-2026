package sesion05.miniPrj;
import java.util.Scanner;
import java.util.regex.Pattern;
public class ThucHanh {
    static int count = 0;
    static Pattern mssvPattern = Pattern.compile("~\\d{7}");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        String[] students = new String[100];
        while (choice != 6) {
            System.out.println("------MENU------");
            System.out.println("1. In ra danh sách MSSV");
            System.out.println("2. Thêm mới (Có Regex)");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm (Regex)");
            System.out.println("6. Thoát chương trình");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    if (count == 0) {
                        System.out.println("Danh sách hiện vẫn trống");
                    } else {
                        System.out.println("Danh sách sinh viên hiện có:");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + students[i]);
                        }
                    }
                    break;
                case 2:
                    if (count == students.length) {
                        System.out.println("Danh sách đã đầy, không thể thêm");
                        break;
                    }
                    String newSv;
                    while (true) {
                        System.out.print("Nhập mã SV mới: ");
                        newSv = sc.nextLine();
                        if (mssvPattern.matcher(newSv).matches()) {
                            break;
                        } else {
                            System.out.println("Sai định dạng!");
                        }
                    }
                    students[count] = newSv;
                    count++;
                    System.out.println("Thêm sinh viên thành công");
                    break;
                case 3:
                    if (count == 0) {
                        System.out.println("Danh sách sinh viên rỗng");
                        break;
                    }
                    System.out.print("Nhập vị trí cần sửa (0 → " + (count - 1) + "): ");
                    int index = Integer.parseInt(sc.nextLine());
                    if (index < 0 || index >= count) {
                        System.out.println("Vị trí không hợp lệ");
                        break;
                    }
                    String newMssv;
                    while (true) {
                        System.out.print("Nhập MSSV mới: ");
                        newMssv = sc.nextLine();
                        if (mssvPattern.matcher(newMssv).matches()) {
                            break;
                        } else {
                            System.out.println("Sai định dạng MSSV");
                        }
                    }
                    students[index] = newMssv;
                    System.out.println("Cập nhật thành công");
                    break;
                case 4:
                    if (count == 0) {
                        System.out.println("Danh sách sinh viên rỗng");
                        break;
                    }
                    System.out.print("Nhập MSSV cần xóa: ");
                    String delete = sc.nextLine();
                    int deleteIndex = -1;
                    for (int i = 0; i < count; i++) {
                        if (students[i].equalsIgnoreCase(delete)) {
                            deleteIndex = i;
                            break;
                        }
                    }
                    if (deleteIndex == -1) {
                        System.out.println("Không tìm thấy sinh viên cần xóa");
                        break;
                    }
                    for (int i = deleteIndex; i < count - 1; i++) {
                        students[i] = students[i + 1];
                    }
                    students[count - 1] = null;
                    count--;
                    System.out.println("Xóa thành công");
                    break;
                case 5:
                    if (count == 0) {
                        System.out.println("Danh sách sinh viên rỗng");
                        break;
                    }
                    System.out.print("Nhập chuỗi cần tìm: ");
                    String keyword = sc.nextLine().toLowerCase();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (students[i].toLowerCase().contains(keyword)) {
                            System.out.println(students[i]);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy MSSV phù hợp");
                    }
                    break;
                case 6:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
