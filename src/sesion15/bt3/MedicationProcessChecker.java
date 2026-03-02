package sesion15.bt3;
import java.util.Stack;
public class MedicationProcessChecker {
    private Stack<Medication> medicationStack = new Stack<>();
    public boolean checkProcess(String[] actions) {
        for (String action : actions) {
            if (action.equals("Push")) {
                medicationStack.push(new Medication("Paracetamol", 10));
            } else if (action.equals("Pop")) {
                if (medicationStack.isEmpty()) {
                    return false;
                }
                medicationStack.pop();
            }
        }
        return medicationStack.isEmpty();
    }
    public void reset() {
        medicationStack.clear();
    }
    public static void main(String[] args) {
        MedicationProcessChecker checker = new MedicationProcessChecker();
        String[] actions = { "Push", "Pop", "Push", "Pop", "Pop" };
        boolean isValid = checker.checkProcess(actions);
        System.out.println("Is valid: " + isValid);
        checker.reset();
        String[] validActions = { "Push", "Pop", "Push", "Pop" };
        isValid = checker.checkProcess(validActions);
        System.out.println("Is valid (new case): " + isValid);
    }
}