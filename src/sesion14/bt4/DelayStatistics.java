package sesion14.bt4;
import java.util.Map;
public class DelayStatistics {
    public static void main(String[] args) {
        String[] diseases = { "Cúm A", "Sốt xuất huyết", "Cúm A", "Covid-19", "Cúm A", "Sốt xuất huyết" };
        Map<String, Integer> diseaseCount = new java.util.TreeMap<>();
        for (String disease : diseases) {
            diseaseCount.put(disease, diseaseCount.getOrDefault(disease, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : diseaseCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
