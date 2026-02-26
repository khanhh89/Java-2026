package sesion13.bt6;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Medicine> medicineList = new ArrayList<>();
        int choice = 0;
        while (choice != 6) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm thuốc vào đơn");
            System.out.println("2. Điều chỉnh số lượng");
            System.out.println("3. Xóa thuốc");
            System.out.println("4. In hóa đơn");
            System.out.println("5. Tìm thuốc giá rẻ");
            System.out.println("6. Thoát chương trình");
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Nhập mã thuốc: ");
                    String drugId = sc.nextLine();
                    System.out.print("Nhập tên thuốc: ");
                    String drugName = sc.nextLine();
                    System.out.print("Nhập đơn giá: ");
                    double unitPrice = sc.nextDouble();
                    System.out.print("Nhập số lượng: ");
                    int quantity = sc.nextInt();
                    sc.nextLine();
                    medicineList.add(new Medicine(drugId, drugName, unitPrice, quantity));
                    System.out.println("Đã thêm thuốc vào đơn.");
                    break;
                case 2:
                    System.out.print("Nhập mã thuốc cần điều chỉnh: ");
                    String adjustDrugId = sc.nextLine();
                    boolean found = false;
                    for (Medicine med : medicineList) {
                        if (med.getDrugId().equals(adjustDrugId)) {
                            System.out.print("Nhập số lượng mới: ");
                            int newQuantity = sc.nextInt();
                            sc.nextLine();
                            med.setQuantity(newQuantity);
                            System.out.println("Đã điều chỉnh số lượng.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy thuốc.");
                    }
                    break;
                case 3:
                    System.out.print("Nhập mã thuốc cần xóa: ");
                    String deleteDrugId = sc.nextLine();
                    boolean deleted = medicineList.removeIf(med -> med.getDrugId().equals(deleteDrugId));
                    if (deleted) {
                        System.out.println("Đã xóa thuốc.");
                    } else {
                        System.out.println("Không tìm thấy thuốc.");
                    }
                    break;
                case 4:
                    if (medicineList.isEmpty()) {
                        System.out.println("Danh sách đang trống.");
                        break;
                    }
                    System.out.println("\n------ HÓA ĐƠN ------");
                    System.out.printf("%-10s %-20s %-10s %-10s %-10s\n","Mã", "Tên thuốc", "Đơn giá", "Số lượng", "Thành tiền");
                    double total = 0;
                    for (Medicine m : medicineList) {
                        System.out.println(m);
                        total += m.getTotalPrice();
                    }
                    System.out.println("TỔNG TIỀN: " + total + " VNĐ");
                    medicineList.clear();
                    break;
                case 5:
                    if (medicineList.isEmpty()) {
                        System.out.println("Danh sách thuốc đang trống.");
                    } else {
                        Medicine cheapest = medicineList.get(0);
                        for (Medicine m : medicineList) {
                            if (m.getUnitPrice() < cheapest.getUnitPrice()) {
                                cheapest = m;
                            }
                        }
                        System.out.println("Thuốc có giá rẻ nhất:");
                        System.out.println(cheapest);
                    }
                    break;
                case 6:
                    System.out.println("Thoát chương trình. Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}