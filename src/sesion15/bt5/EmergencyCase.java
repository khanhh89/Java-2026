package sesion15.bt5;
import java.util.Stack;
import sesion13.bt5.Patient;
public class EmergencyCase {
    private Patient patient;
    private Stack<TreatmentStep> steps = new Stack<>();
    public EmergencyCase(Patient patient) {
        this.patient = patient;
    }
    public void addStep(TreatmentStep step) {
        steps.push(step);
    }
    public TreatmentStep undoStep() {
        if (!steps.isEmpty()) {
            return steps.pop();
        }
        return null;
    }
    public void displaySteps() {
        System.out.println("Lịch sử điều trị của bệnh nhân: " + patient.getFullName());
        if (steps.isEmpty()) {
            System.out.println("- Chưa có bước xử lý nào.");
            return;
        }
        for (int i = steps.size() - 1; i >= 0; i--) {
            System.out.println(steps.get(i));
        }
    }
    public Patient getPatient() {
        return patient;
    }
}