package sesion09.bt1;

public class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
   public void display() {
       System.out.println("Họ tên: "+name);
       System.out.println("Tuổi: "+ age);
   }
}
