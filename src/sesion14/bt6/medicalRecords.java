package sesion14.bt6;
import java.util.Map;
import java.util.List;
import java.util.TreeMap;
public class medicalRecords {
    public static void main(String[] args) {
        List<Patient> patients = List.of(
                new Patient("Nguyễn Văn A", 30, "Tim mạch"),
                new Patient("Trần Thị B", 25, "Nội tiết"),
                new Patient("Lê Văn C", 40, "Tim mạch"),
                new Patient("Phạm Thị D", 35, "Nội tiết"));
        Map<String, List<Patient>> departmentPatients = new TreeMap<>();
        for (Patient patient : patients) {
            String department = patient.getTreatmentDepartment();
            departmentPatients.computeIfAbsent(department, k -> new java.util.ArrayList<>()).add(patient);
        }
        for (Map.Entry<String, List<Patient>> entry : departmentPatients.entrySet()) {
            System.out.println("Khoa: " + entry.getKey());
            for (Patient patient : entry.getValue()) {
                System.out.println("  " + patient);
            }
        }
        String busiestDepartment = null;
        int maxPatients = 0;
        for (Map.Entry<String, List<Patient>> entry : departmentPatients.entrySet()) {
            if (entry.getValue().size() > maxPatients) {
                maxPatients = entry.getValue().size();
                busiestDepartment = entry.getKey();
            }
        }
        System.out.println("Khoa quá tải nhất: " + busiestDepartment + " với " + maxPatients + " bệnh nhân.");
    }
}
