package sesion15.bt5;

import sesion13.bt5.Patient;

public class Main {
    public static void main(String[] args) {
        EmergencyCaseQueue queue = new EmergencyCaseQueue();
        Patient p1 = new Patient("BN01", "Nguyễn Văn A", 30, null);
        EmergencyCase case1 = new EmergencyCase(p1);
        queue.addCase(case1);
        EmergencyCase currentCase = queue.getNextCase();
        if (currentCase != null) {
            // Thêm các bước điều trị vào Stack
            currentCase.addStep(new TreatmentStep("Tiếp nhận & Đo huyết áp", "08:00"));
            currentCase.addStep(new TreatmentStep("Chẩn đoán: Sốt cao", "08:15"));
            currentCase.addStep(new TreatmentStep("Tiêm thuốc giảm sốt", "08:20"));

            System.out.println("--- Trước khi Undo ---");
            currentCase.displaySteps();
            TreatmentStep undone = currentCase.undoStep();
            System.out.println("\n>>> Đã Undo bước: " + (undone != null ? undone.getDescription() : "Không có"));
            System.out.println("\n--- Sau khi Undo ---");
            currentCase.displaySteps();
        }
    }
}