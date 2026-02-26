package sesion13.bt1;
import java.util.ArrayList;
public class manageBody {
    public static void main(String[] args) {
        ArrayList<Double> bodyTemperatures = new ArrayList<>();
        bodyTemperatures.add(36.5);
        bodyTemperatures.add(40.2);
        bodyTemperatures.add(37.0);
        bodyTemperatures.add(12.5);
        bodyTemperatures.add(39.8);
        bodyTemperatures.add(99.9);
        bodyTemperatures.add(36.8);
        System.out.println("Các thân nhiệt đã thêm: " + bodyTemperatures);
        bodyTemperatures.removeIf(temp -> temp < 35.0 || temp > 42.0);
        System.out.println("Các thân nhiệt hợp lệ sau khi xóa: " + bodyTemperatures);
        double sum = 0.0;
        for (double temp : bodyTemperatures) {
            sum += temp;
        }
        double average = sum / bodyTemperatures.size();
        System.out.println("Trung bình thân nhiệt: " + average);
    }
}
