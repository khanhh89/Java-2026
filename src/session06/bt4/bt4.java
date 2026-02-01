package session06.bt4;
public class bt4 {
    private String id;
    private String name;
    private double salary;
    public bt4() {
        this.id = "n/a";
        this.name = "Chưa có";
        this.salary = 0.0;
    }
    public bt4(String id, String name) {
        this.id = id;
        this.name = name;
        this.salary = 0.0;
    }
    public bt4(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        bt4 emp1 = new bt4();
        bt4 emp2 = new bt4("02", "A");
        bt4 emp3 = new bt4("3", "B", 15000000);
        emp1.display();
        emp2.display();
        emp3.display();
    }
}
