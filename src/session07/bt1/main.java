package session07.bt1;
public class main {
    public static void main(String[] args) {
        Student s1 = new Student("1", "A");
        Student s2 = new Student("2", "B");
        Student s3 = new Student("3", "C");
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        Student.displayTotalStudent();
    }
}
