package sesion10.bt5;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new OfficeStaff("A", 8000000),
                new Manager("B", 15000000, 3000000),
                new OfficeStaff("C", 9000000),
                new Manager("D", 20000000, 5000000)
        };
        System.out.println("BẢNG LƯƠNG NHÂN SỰ");
        for (Employee e : employees) {
            System.out.println("Tên: " + e.getName());
            System.out.println("Lương cơ bản: " + e.baseSalary);
            if (e instanceof BonusCalculator) {
                BonusCalculator b = (BonusCalculator) e;
                System.out.println("Thưởng KPI: " + b.getBonus());
            } else {
                System.out.println("Thưởng KPI: Không có");
            }
            System.out.println("Lương thực nhận: " + e.calculateSalary());
            System.out.println("-------------------------");
        }
    }
}

