package sesion09.bt5;

public class Office extends Employee {
    private double baseSalary;
    private double bonus;

    public Office(String name, double baseSalary, double bonus) {
        super(name);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}
