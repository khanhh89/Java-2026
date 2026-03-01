package sesion14.bt2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class BHYT {
    public static void main(String[] args) {
        Map<String, String> medicineMap = new HashMap<>();
        medicineMap.put("T001", "Paracetamol");
        medicineMap.put("T002", "Ibuprofen");
        medicineMap.put("T003", "Amoxicillin");
        medicineMap.put("T004", "Metformin");
        medicineMap.put("T005", "Atorvastatin");
        System.out.print("Nhập mã thuốc: ");
        Scanner scanner = new Scanner(System.in);
        String medicineCode = scanner.nextLine();
        String medicineName = medicineMap.get(medicineCode);
        if (medicineName != null) {
            System.out.println("Tên thuốc: " + medicineName);
        } else {
            System.out.println("Mã thuốc không tồn tại trong danh mục.");
        }
        scanner.close();
    }
}
