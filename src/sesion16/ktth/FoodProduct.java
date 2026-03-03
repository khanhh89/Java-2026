package sesion16.ktth;

import java.util.ArrayList;
import java.util.List;

public class FoodProduct extends Product {
    public FoodProduct(String id, String name, double price) {
        super(id, name, price);
    }
    // thuộc tính riêng Thuộc tính riêng:int discountPercent–Phần trăm giảm giá
    private int discountPercent;

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
    @Override 
    public double calculateFinalPrice() {
        return price * (price * discountPercent / 100.0);
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Phần trăm giảm giá: " + discountPercent + "%");
    }

    
}
