package sesion15.bt1;

import java.util.Stack;

public class MedicalRecordHistory {
    private Stack<EditAction> history = new Stack<>();
    public void addEdit(EditAction action) {
        history.push(action);
    }
    public EditAction undoEdit() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
    public EditAction getLatestEdit() {
        if (!history.isEmpty()) {
            return history.peek();
        }
        return null;
    }
    public boolean isEmpty() {
        return history.isEmpty();
    }
    public void displayHistory() {
        if (history.isEmpty()) {
            System.out.println("Lịch sử trống.");
            return;
        }
        System.out.println("--- Lịch sử chỉnh sửa ---");
        // Duyệt từ trên xuống (Mới nhất hiện lên trước)
        for (int i = history.size() - 1; i >= 0; i--) {
            System.out.println(history.get(i));
        }
        System.out.println("-------------------------");
    }
    public static void main(String[] args) {
        MedicalRecordHistory manager = new MedicalRecordHistory();
        manager.addEdit(new EditAction("Sửa tên bệnh nhân", "14:00"));
        manager.addEdit(new EditAction("Thêm chẩn đoán: Sốt xuất huyết", "14:05"));
        manager.addEdit(new EditAction("Cập nhật đơn thuốc", "14:10"));
        manager.displayHistory();
        System.out.println("Đang thực hiện Undo...");
        manager.undoEdit();
        manager.displayHistory();
        System.out.println("Chỉnh sửa mới nhất hiện tại: " + manager.getLatestEdit());
    }
}