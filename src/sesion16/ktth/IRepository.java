package sesion16.ktth;

import java.util.ArrayList;
import java.util.List;

public abstract class IRepository<T extends Product> {
    protected List<T> list = new ArrayList<>();

    public boolean add(T obj) {
        return list.add(obj);
    }

    public void remove(T obj) {
        list.remove(obj);
    }

    public T findById(String id) {
        for (T obj : list) {
            if (obj.getId().equalsIgnoreCase(id)) {
                return obj;
            }
        }
        return null;
    }

    public List<T> findAll() {
        return list;
    }
}