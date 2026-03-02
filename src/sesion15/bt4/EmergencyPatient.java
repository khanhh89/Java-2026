package sesion15.bt4;

public class EmergencyPatient implements Comparable<EmergencyPatient> {
    private String id;
    private String name;
    private int priority; // 1: Cấp cứu, 2: Thường

    public EmergencyPatient(String id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(EmergencyPatient other) {
        // So sánh mức độ ưu tiên (1 đứng trước 2)
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        String level = (priority == 1) ? "CẤP CỨU" : "Thường";
        return "[" + level + "] ID: " + id + " - Tên: " + name;
    }
}