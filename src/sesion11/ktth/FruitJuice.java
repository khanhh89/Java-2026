package sesion11.ktth;

public class FruitJuice extends Drink {
    int discountPercent;
    public FruitJuice(int id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }
    @Override
    double calculatePrice() {
        return super.price - (super.price * discountPercent / 100);
    }
    @Override protected void mix() {
        System.out.println("Trộn nước ép trái cây");
    }
}
