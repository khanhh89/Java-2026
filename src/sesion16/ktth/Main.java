package sesion16.ktth;

public class Main {
    public static void main(String[] args) {
        //khởi tạo danh sách sản phẩm
        ProductRepository productRepository = new ProductRepository();
        // thêm 2 Electronic
        productRepository.add(new ElectronicProduct("1", "Máy tính", 20000000));
        productRepository.add(new ElectronicProduct("2", "Điện thoại", 10000000));
        // thêm 2 Food
        productRepository.add(new FoodProduct("3", "Bánh", 10000));
        productRepository.add(new FoodProduct("4", "Kẹo", 5000));
        // hiển thị toàn bộ danh sách sản phẩm
        for (Product product : productRepository.findAll()) {
            product.displayInfo();
            System.out.println("Giá bán: " + product.calculateFinalPrice());
            System.out.println();
        }
        //tìm sản phẩm theo id
        Product product = productRepository.findById("1");
        if (product != null) {
            product.displayInfo();
            System.out.println("Giá bán: " + product.calculateFinalPrice());
        } else {
            System.out.println("Không tìm thấy sản phẩm");
        }
        //sắp sếp danh sách theo giá tăng dần  (dùng Collections.sort hoặc Comparator)
        System.out.println("Danh sách sản phẩm sau khi sắp xếp theo giá tăng dần:");
        productRepository.sortByPriceAscending();
        for (Product product1 : productRepository.findAll()) {
            product1.displayInfo();
            System.out.println("Giá bán: " + product1.calculateFinalPrice());
            System.out.println();
        }
        // Thống kê số lượng sản phẩm theo từng loại (Electronic, Food) Trả về kết quả dạng Map<String, Integer> 
        System.out.println("Thống kê số lượng sản phẩm theo từng loại:");
        char[] count = productRepository.countByType("Electronic");
        System.out.println("Số lượng sản phẩm Electronic: " + count[0]);
        count = productRepository.countByType("Food");
        System.out.println("Số lượng sản phẩm Food: " + count[0]);
    }
}
