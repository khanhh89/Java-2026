package sesion04.bt2;

public class bt2 {
    public static void main(String[] args) {
        String description = "Sách giáo khoa Toán lớp 12, Kệ: A1-102, tình trạng mới";
        if (description.contains("Kệ:")) {
            int start = description.indexOf("Kệ:") + 4;
            int end = description.indexOf(",", start);
            String shelf = (end != -1) ? description.substring(start, end) : description.substring(start);
            String newDescription = description.replace("Kệ:", "Vị trí lưu trữ:");
            System.out.println("Mã vị trí: " + shelf.trim());
            System.out.println("Mô tả mới: " + newDescription);
        } else {
            System.out.println("Không có thông tin kệ.");
        }
    }
}
