package sesion16.ktth;

public class Product {
    private String id;
    private String name;
    protected double price;

    public Product(String id2, String name, double price) {
        this.id = id2;
        this.name = name;
        this.price = price;
    }

    //phương thức abstract
    public double calculateFinalPrice() {
        return price;
    }
    public String getId() {
        return id;
    }

    public void displayInfo() {
        System.out.println("Mã: " + id);
        System.out.println("Ten: " + name);
        System.out.println("Giá gốc: " + price);
    }

    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}
