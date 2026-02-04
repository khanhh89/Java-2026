package sesion09.bt5;

public abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    // Sửa lại tên phương thức cho đúng
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return name;
    }
}
