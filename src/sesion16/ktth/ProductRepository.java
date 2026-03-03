package sesion16.ktth;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductRepository extends IRepository<Product> {
    // sử dụng collection
    ArrayList<Product> list = new ArrayList<>();
    HashMap<String, Product> map = new HashMap<>();
    // cài đặt đầy đủ các phương thức
    public boolean add(Product obj) {
        list.add(obj);
        map.put(obj.getId(), obj);
        return true;
    }

    public void remove(Product obj) {
        list.remove(obj);
        map.remove(obj.getId());
    }

    public Product findById(String id) {
        return map.get(id);
    }

    public ArrayList<Product> findAll() {
        return list;
    }

    public void sortByPriceAscending() {
        list.sort((o1, o2) -> Double.compare(o1.price, o2.price));
    }

    public char[] countByType(String string) {
        //trả về kết quả dạng Map<String, Integer>
        // đếm số lượng sản phẩm theo từng loại (Electronic, Food)
        int count = 0;
        for (Product product : list) {
            if (product.getClass().getSimpleName().equalsIgnoreCase(string)) {
                //tăng count lên 1
                count++;
            }
        }
        return new char[] { (char) count };
    }
}   
