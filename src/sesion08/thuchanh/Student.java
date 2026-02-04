package sesion08.thuchanh;
public class Student {
    private String id;
    private String name;
    private double score;
    public Student() {
    }
    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public String getRank() {
        if (score >= 8.0) {
            return "Gioi";
        } else if (score >= 6.5) {
            return "Kha";
        } else { // điểm < 6.5
            return "Trung Binh";
        }
    }
    public String toString() {
        return String.format("Mã SV: %s | Tên: %s | Điểm: %.1f | Học lực: %s",
                id, name, score, getRank());
    }
    public int getRankValue() {
        String rank = getRank();
        if ("Gioi".equals(rank)) return 3;
        if ("Kha".equals(rank)) return 2;
        if ("Trung Binh".equals(rank)) return 1;
        return 0;
    }
}