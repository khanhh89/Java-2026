package sesion13.bt5;

public class Patient {
    private String id;
    private String fullName;
    private int age;
    private String diagnosis;

    public Patient(String id, String fullName, int age, String diagnosis) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String getId() {
        return id;
    }
    public String getFullName() {
        return fullName;
    }
    public int getAge() {
        return age;
    }
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    @Override
    public String toString() {
        return String.format("%-10s %-20s %-10d %-10s",
                id, fullName, age, diagnosis);
    }
}