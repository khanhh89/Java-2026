package sesion08.thuchanh;

public class Student {
    // Thuộc tính private (Encapsulation)
    private String id;
    private String name;
    private double score;

    // 01 Constructor không tham số
    public Student() {
    }

    // 01 Constructor đầy đủ tham số
    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    // Getters & Setters đầy đủ
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

    /**
     * Phương thức getRank(): Trả về xếp loại học lực theo quy tắc:
     * - "Gioi": Nếu điểm >= 8.0
     * - "Kha": Nếu 6.5 <= điểm < 8.0
     * - "Trung Binh": Nếu điểm < 6.5
     */
    public String getRank() {
        if (score >= 8.0) {
            return "Gioi";
        } else if (score >= 6.5) {
            return "Kha";
        } else { // điểm < 6.5
            return "Trung Binh";
        }
    }

    // Phương thức toString(): Trả về chuỗi thông tin gồm: Mã, Tên, Điểm và Học lực
    @Override
    public String toString() {
        // Định dạng chuỗi theo yêu cầu
        return String.format("Mã SV: %s | Tên: %s | Điểm: %.1f | Học lực: %s",
                id, name, score, getRank());
    }

    // Phương thức phụ trợ để xác định thứ hạng cho sắp xếp (Chức năng 4)
    public int getRankValue() {
        String rank = getRank();
        if ("Gioi".equals(rank)) return 3;
        if ("Kha".equals(rank)) return 2;
        if ("Trung Binh".equals(rank)) return 1;
        return 0; // Giả sử yếu hoặc không xác định là 0
    }
}