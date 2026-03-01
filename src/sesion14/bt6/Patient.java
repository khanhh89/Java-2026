package sesion14.bt6;

public class Patient {
    private String name;
    private int age;
    private String treatmentDepartment;
    public Patient(String name, int age, String treatmentDepartment) {
        this.name = name;
        this.age = age;
        this.treatmentDepartment = treatmentDepartment;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getTreatmentDepartment() {
        return treatmentDepartment;
    }

    public void setTreatmentDepartment(String treatmentDepartment) {
        this.treatmentDepartment = treatmentDepartment;
    }
    @Override
    public String toString() {
        return "Patient [name=" + name + ", age=" + age + ", treatmentDepartment=" + treatmentDepartment + "]";
    }

}
