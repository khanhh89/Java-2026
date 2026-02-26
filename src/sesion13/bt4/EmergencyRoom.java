package sesion13.bt4;
import java.util.LinkedList;
public class EmergencyRoom {
    public static void main(String[] args) {
        LinkedList<Patient> patientQueue = new LinkedList<>();
        Patient patientA = new Patient("P001", "Khánh","Cúm");
        Patient patientB = new Patient("P002", "Búa", "Gãy xương");
        Patient patientC = new Patient("P003", "Lh", "Đau tim");
        patientCheckIn(patientQueue, patientA);
        patientCheckIn(patientQueue, patientB);
        emergencyPatientCheckIn(patientQueue, patientC);
        treatPatient(patientQueue);
        treatPatient(patientQueue);
        treatPatient(patientQueue);
    }
    private static void patientCheckIn(LinkedList<Patient> patientQueue, Patient patient) {
        patientQueue.addLast(patient);
        System.out.println("Bệnh nhân thường " + patient.getName() + " đã được thêm vào cuối danh sách.");
        System.out.println("Danh sách hiện tại: " + patientQueue);
    }
    private static void emergencyPatientCheckIn(LinkedList<Patient> patientQueue, Patient patient) {
        patientQueue.addFirst(patient);
        System.out.println("Bệnh nhân cấp cứu " + patient.getName() + " đã được thêm vào đầu danh sách.");
        System.out.println("Danh sách hiện tại: " + patientQueue);
    }
    private static void treatPatient(LinkedList<Patient> patientQueue) {
        if (!patientQueue.isEmpty()) {
            Patient treated = patientQueue.removeFirst();
            System.out
                    .println("Đang điều trị cho bệnh nhân: " + treated.getName() + " - Bệnh: " + treated.getDisease());
            System.out.println("Danh sách còn lại: " + patientQueue);
        } else {
            System.out.println("Không còn bệnh nhân trong danh sách.");
        }
    }
}
