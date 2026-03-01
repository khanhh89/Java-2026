package sesion14.bt3;
import java.util.Set;
import java.util.HashSet;
public class DrugAllergyAnalysis {
    public static void main(String[] args) {
        Set<String> drugComponents = Set.of("Aspirin", "Caffeine", "Paracetamol");
        Set<String> patientAllergies = Set.of("Penicillin", "Aspirin", "Pollen");
        Set<String> commonComponents = new HashSet<>(drugComponents);
        commonComponents.retainAll(patientAllergies);
        if (commonComponents.isEmpty()) {
            System.out.println("Thuốc mới an toàn.");
        } else {
            System.out.println("Cảnh báo dị ứng: " + commonComponents);
        }
        Set<String> safeComponents = new HashSet<>(drugComponents);
        safeComponents.removeAll(patientAllergies);
        System.out.println("Thành phần an toàn: " + safeComponents);
    }

}
