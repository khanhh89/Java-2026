package session07.bt2;

public class bt2 {
    static class Student {
        int age;
        public Student(int age) {
            this.age = age;
        }
    }
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        Student s1 = new Student(20);
        Student s2 = s1;
        a = 30;
        s1.age = 40;
        System.out.println("Biến nguyên thủy:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Biến tham chiếu:");
        System.out.println("s1.age = " + s1.age);
        System.out.println("s2.age = " + s2.age);
    }
}