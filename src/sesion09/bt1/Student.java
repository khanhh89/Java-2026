package sesion09.bt1;

public class Student extends Person {
    String maSinhVien;
    double diemTrungBinh;

    public Student(String name, int age, String maSinhVien, double diemTrungBinh) {
        super(name, age);
        this.maSinhVien = maSinhVien;
        this.diemTrungBinh = diemTrungBinh;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Ma sinh vien: "+maSinhVien);
        System.out.println("Diem trung binh: "+diemTrungBinh);
    }
}
