package sesion11.ktth;

public class Coffee extends Drink implements IMixable {
    boolean hasMilk;

    public Coffee(int id, String name, double price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }
    @Override
    double calculatePrice() {
        if (hasMilk == true) {
            return super.price + 5000;
        } else {
            return super.price;
        }

    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Có sữa: " + hasMilk);
        System.out.println("Giá bán: " + calculatePrice());
    }
    @Override
    public void mix() {
        if (hasMilk == true) {
            System.out.println("Có sữa");
        } else {
            System.out.println("Đen đá");
        }
    }

}
