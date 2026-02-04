package session07.bt4;
class ClassRoom {
    private String tenSinhVien;
    private static int classFund = 0;
    public ClassRoom(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }
    public void dongTien(int soTien) {
        classFund += soTien;
        System.out.println(tenSinhVien + " đóng vào quỹ: " + soTien);
    }
    public static int getClassFund() {
        return classFund;
    }
}
