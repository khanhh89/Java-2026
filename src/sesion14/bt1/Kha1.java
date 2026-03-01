package sesion14.bt1;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
public class Kha1 {
    public static void main(String[] args) {
        List<String> inputNames = Arrays.asList("Nguyễn Văn A – Yên Bái", "Trần Thị B – Thái Bình","Nguyễn Văn A – Yên Bái", "Lê Văn C – Hưng Yên");
        Set<String> patientNames = new LinkedHashSet<>(inputNames);
        System.out.println(patientNames);
    }
}
