package sesion13.bt5;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Patient> patientList = new ArrayList<>();
        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tiếp nhận bệnh nhân");
            System.out.println("2. Cập nhật chẩn đoán");
            System.out.println("3. Xuất viện");
            System.out.println("4. Sắp xếp danh sách theo tuổi");
            System.out.println("5. Hiển thị danh sách");
            System.out.println("6. Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Nhập ID: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập họ tên: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập chẩn đoán: ");
                    String diagnosis = sc.nextLine();
                    patientList.add(new Patient(id, name, age, diagnosis));
                    System.out.println("Đã thêm bệnh nhân.");
                    break;
                case 2:
                    System.out.print("Nhập ID cần cập nhật: ");
                    String updateId = sc.nextLine();

                    boolean found = false;
                    for (Patient patient : patientList) {
                        if (patient.getId().equalsIgnoreCase(updateId)) {
                            System.out.print("Nhập chẩn đoán mới: ");
                            String newDiagnosis = sc.nextLine();
                            patient.setDiagnosis(newDiagnosis);
                            System.out.println("Cập nhật thành công.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Không tìm thấy bệnh nhân.");
                    }
                    break;
                case 3:
                    System.out.print("Nhập ID bệnh nhân xuất viện: ");
                    String removeId = sc.nextLine();
                    boolean removed = patientList.removeIf(patient -> patient.getId().equalsIgnoreCase(removeId));
                    if (removed) {
                        System.out.println("Đã xuất viện bệnh nhân.");
                    } else {
                        System.out.println("Không tìm thấy bệnh nhân.");
                    }
                    break;
                case 4:
                    if (patientList.isEmpty()) {
                        System.out.println("Danh sách trống.");
                        break;
                    }
                    patientList.sort(Comparator.comparingInt(Patient::getAge).reversed().thenComparing(Comparator.comparing(Patient::getFullName)));
                    System.out.println("Đã sắp xếp theo tuổi giảm dần, nếu bằng tuổi thì theo tên A-Z.");
                    break;
                case 5:
                    if (patientList.isEmpty()) {
                        System.out.println("Danh sách trống.");
                    } else {
                        System.out.println("ID\tTên\tTuổi\tChẩn đoán");
                        for (Patient patient : patientList) {
                            System.out.println(patient);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 6);
    }
}