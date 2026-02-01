package session06.bt3;

public class bt3 {
    private String maSanPham;
    private String tenSanPham;
    private double giaBan;
    public bt3(String maSanPham, String tenSanPham, double giaBan) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        setGiaBan(giaBan); // dùng setter để kiểm tra
    }
    public String getMaSanPham() {
        return maSanPham;
    }
    public String getTenSanPham() {
        return tenSanPham;
    }
    public double getGiaBan() {
        return giaBan;
    }
    // Setter
    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setGiaBan(double giaBan) {
        if (giaBan > 0) {
            this.giaBan = giaBan;
        } else {
            System.out.println("Giá bán không hợp lệ! Phải > 0.");
        }
    }
    public void hienThiThongTin() {
        System.out.println("Mã SP: " + maSanPham);
        System.out.println("Tên SP: " + tenSanPham);
        System.out.println("Giá bán: " + giaBan);
    }
    public static void main(String[] args) {
        bt3 sp1 = new bt3("SP1", "Laptop", 15000);
        sp1.hienThiThongTin();
        sp1.setGiaBan(20000);
        sp1.hienThiThongTin();
        sp1.setGiaBan(-5000);
        sp1.hienThiThongTin();
    }
}
