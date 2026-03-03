package sesion16.ktth;

public class ElectronicProduct extends Product {
    public ElectronicProduct(String id, String name, double price) {
        super(id, name, price);
    }

    private int warrantyMonths;
    @Override
    public double calculateFinalPrice() {
        if (warrantyMonths > 12) {
            // Giá = price + 1.000.000
            return price + 1000000;
        } else {
            return price;
        }
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Thời gian bảo hành: " + warrantyMonths + " tháng");
    }
}
