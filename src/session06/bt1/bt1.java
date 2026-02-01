package session06.bt1;

public class bt1 {
    public String MSV;
    public String name;
    public int namSinh;
    public int diemTb;

    public bt1(String MSV, String name, int namSinh, int diemTb) {
        this.MSV = MSV;
        this.name = name;
        this.namSinh = namSinh;
        this.diemTb = diemTb;
    }
    public void display(){
        System.out.println("MSV: "+this.MSV);
        System.out.println("name: "+this.name);
        System.out.println("namSinh: "+this.namSinh);
        System.out.println("diemTb: "+this.diemTb);
    }
    public static void main(String[] args) {
        bt1 bt1 = new bt1("B123", "Khanh", 10, 10);
        bt1.display();
    }
}
