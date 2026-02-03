package sesion08.thuchanh;
import java.util.Scanner;
public class Main {
    private static final int MAX_STUDENTS = 100;
    private static Student[] studentArray = new Student[MAX_STUDENTS];
    private static int studentCount = 0;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice = -1;
        do{
            System.out.println("\n QUẢN LÝ ĐIỂM SINH VIÊN");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo Học lực");
            System.out.println("4. Sắp xếp theo học lực giảm dần");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            try {
                String input = scanner.nextLine();
                choice = Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                choice = -1;
                System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập số.");
            }
            switch(choice){
                case 1:
                    inputStudentList();
                    break;
                case 2:
                    displayStudentList();
                    break;
                case 3:
                    searchByRank();
                    break;
                case 4:
                    sortByRankDescending();
                    break;
                case 5:
                    System.out.println("Hẹn gặp lại");
                    break;
                default:
                    if (choice != -1) {
                        System.out.println("Lựa chọn không hợp lệ");
                    }
                    break;
            }
        } while (choice != 5);
    }
    private static void inputStudentList() {
        System.out.print("Nhập số lượng sinh viên cần thêm: ");
        int count = 0;
        try {
            count = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Dữ liệu nhập không hợp lệ.");
            return;
        }
        if (studentCount + count > MAX_STUDENTS) {
            System.out.println("Cảnh báo: Danh sách chỉ còn đủ chỗ cho " + (MAX_STUDENTS - studentCount) + " sinh viên.");
            count = MAX_STUDENTS - studentCount;
            if (count == 0) {
                System.out.println("Danh sách đã đầy.");
                return;
            }
        }
        int addedCount = 0;
        for (int i = 0; i < count; i++) {
            System.out.println("--- Nhập thông tin sinh viên thứ " + (studentCount + 1) + " ---");
            String id;
            do {
                System.out.print("Mã SV: ");
                id = scanner.nextLine();
                if (id.toUpperCase().startsWith("SV") && id.length() == 5) {
                    try {
                        Integer.parseInt(id.substring(2));
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Mã SV không hợp lệ. 3 ký tự cuối phải là số.");
                    }
                } else {
                    System.out.println("Mã SV không hợp lệ. Phải bắt đầu bằng 'SV' và có tổng 5 ký tự.");
                }
            } while (true);
            System.out.print("Họ và tên: ");
            String name = scanner.nextLine();
            double score = -1;
            while (score < 0 || score > 10) {
                System.out.print("Điểm trung bình (0.0 - 10.0): ");
                try {
                    score = Double.parseDouble(scanner.nextLine().trim());
                    if (score < 0 || score > 10) {
                        System.out.println("Điểm không hợp lệ. Vui lòng nhập điểm từ 0.0 đến 10.0.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Dữ liệu điểm không hợp lệ.");
                    score = -1;
                }
            }
            Student student = new Student(id.toUpperCase(), name, score);
            studentArray[studentCount] = student;
            studentCount++;
            addedCount++;
        }
        System.out.println("Đã nhập thành công " + addedCount + " sinh viên.");
    }
    private static void displayStudentList() {
        if (studentCount == 0) {
            System.out.println("Danh sách sinh viên trống.");
            return;
        }
        System.out.println("DANH SÁCH SINH VIÊN ");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(studentArray[i].toString());
        }
    }
    private static void searchByRank() {
        if (studentCount == 0) {
            System.out.println("Danh sách sinh viên trống, không thể tìm kiếm.");
            return;
        }
        System.out.print("Nhập loại học lực cần tìm (Gioi/Kha/Trung Binh): ");
        String searchRank = scanner.nextLine().trim();
        boolean found = false;
        System.out.println("--- KẾT QUẢ TÌM KIẾM SINH VIÊN HỌC LỰC '" + searchRank + "' ---");
        for (int i = 0; i < studentCount; i++) {
            if (studentArray[i].getRank().equalsIgnoreCase(searchRank)) {
                System.out.println(studentArray[i].toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên nào có học lực '" + searchRank + "'.");
        }
    }
    private static void sortByRankDescending() {
        if (studentCount == 0) {
            System.out.println("Danh sách sinh viên trống, không thể sắp xếp.");
            return;
        }
        for (int i = 0; i < studentCount - 1; i++) {
            for (int j = 0; j < studentCount - 1 - i; j++) {
                boolean shouldSwap = false;
                if (studentArray[j].getRankValue() < studentArray[j + 1].getRankValue()) {
                    shouldSwap = true;
                }
                else if (studentArray[j].getRankValue() == studentArray[j + 1].getRankValue()) {
                    if (studentArray[j].getScore() < studentArray[j + 1].getScore()) {
                        shouldSwap = true;
                    }
                }
                if (shouldSwap) {
                    Student temp = studentArray[j];
                    studentArray[j] = studentArray[j + 1];
                    studentArray[j + 1] = temp;
                }
            }
        }
        displayStudentList();
    }
}