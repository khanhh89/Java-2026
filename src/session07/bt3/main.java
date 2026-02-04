package session07.bt3;
import java.util.Arrays;
public class main {
    public static void main(String[] args) {
        double[] scores = {6.5, 8.0, 4.5};
        double average = ScoreUtils.calculateAverage(scores);
        System.out.println("Danh sách điểm: " + Arrays.toString(scores));
        System.out.println(" Kết quả xử lý:");
        System.out.println("- Điểm trung bình cả lớp: " + String.format("%.2f", average));
        for (double score : scores) {
            System.out.println("- Điểm " + score + ": " + (ScoreUtils.checkPass(score) ? "Đạt" : "Trượt"));
        }
    }
}