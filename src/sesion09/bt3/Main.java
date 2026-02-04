package sesion09.bt3;

public class Main {
    public static void main(String[] args) {
        class Employee{
            String name;
            double salary;

            public Employee(String name, double salary) {
                this.name = name;
                this.salary = salary;
            }
            public void display(){
                System.out.println("Tên: "+name);
                System.out.println("Lương cơ bản: "+salary);
            }
        }
        class Manager extends Employee{
            String phongBan;
            public Manager(String name,double salary,String phongBan){
                super(name,salary);
                this.phongBan = phongBan;
            }
            @Override
            public void display(){
                super.display();
                System.out.printf("Phòng ban: "+ phongBan);
            }
        }
        Manager m = new Manager("Khanh", 2000000, "Phòng bảo vệ");
        m.display();
    }
}
