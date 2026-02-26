package sesion13.bt2;
import java.util.ArrayList;
public class DrugCatalogManagement {
    public static void main(String[] args) {
        ArrayList<String> drugCatalog = new ArrayList<>();
        drugCatalog.add("Paracetamol");
        drugCatalog.add("Ibuprofen");
        drugCatalog.add("Amoxicillin");
        drugCatalog.add("Aspirin");
        drugCatalog.add("Metformin");
        drugCatalog.add("Paracetamol");
        System.out.println("Danh sách thuốc: " + drugCatalog);
        ArrayList<String> uniqueDrugs = new ArrayList<>();
        for (String drug : drugCatalog) {
            if (!uniqueDrugs.contains(drug)) {
                uniqueDrugs.add(drug);
            }
        }
        uniqueDrugs.sort(String::compareTo);
        System.out.println("Danh sách thuốc duy nhất: " + uniqueDrugs);
    }
}
