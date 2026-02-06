package sesion10.bt6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Product[] products = {
                new Product("Xe đạp", 120000),
                new Product("Xe máy", 140000),
                new Product("Máy bay", 1200000)
        };

        // Sắp xếp theo GIÁ (tăng dần)
        Arrays.sort(products, (p1, p2) ->
                Double.compare(p1.getPrice(), p2.getPrice())
        );

        System.out.println("Danh sách sản phẩm sắp xếp theo giá:");
        for (Product p : products) {
            System.out.println(p);
        }

        // Sắp xếp theo TÊN (A → Z, không phân biệt hoa thường)
        Arrays.sort(products, (p1, p2) ->
                p1.getName().compareToIgnoreCase(p2.getName())
        );

        System.out.println("\nDanh sách sản phẩm sắp xếp theo tên:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
