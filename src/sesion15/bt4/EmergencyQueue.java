package sesion15.bt4;
import java.util.PriorityQueue;
public class EmergencyQueue {
    private PriorityQueue<EmergencyPatient> queue = new PriorityQueue<>();
    public void addPatient(EmergencyPatient p) {
        queue.add(p);
        System.out.println("Đã tiếp nhận: " + p.getName() + " (Mức: " + p.getPriority() + ")");
    }
    public EmergencyPatient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Hàng đợi trống.");
            return null;
        }
        return queue.poll();
    }
    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Không có bệnh nhân chờ.");
            return;
        }
        PriorityQueue<EmergencyPatient> temp = new PriorityQueue<>(queue);
        while (!temp.isEmpty()) {
            System.out.println(temp.poll());
        }
        System.out.println("------------------------------------\n");
    }

    public static void main(String[] args) {
        EmergencyQueue clinic = new EmergencyQueue();

        clinic.addPatient(new EmergencyPatient("BN01", "Nguyễn Thường", 2));
        clinic.addPatient(new EmergencyPatient("BN02", "Trần Cấp Cứu", 1));
        clinic.addPatient(new EmergencyPatient("BN03", "Lê Thường", 2));
        clinic.addPatient(new EmergencyPatient("BN04", "Phạm Cấp Cứu", 1));

        clinic.displayQueue();
        System.out.println(">>> Bác sĩ gọi: " + clinic.callNextPatient());
        System.out.println(">>> Bác sĩ gọi: " + clinic.callNextPatient());
        clinic.displayQueue();
    }
}