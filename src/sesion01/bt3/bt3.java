package sesion01.bt3;

public class bt3 {
    public static void main(String args[]) {
        String book1 = "Java Basic";
        String book2 = "Python Intro";
        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
        String temp = book1;
        book1 = book2;
        book2 = temp;
        System.out.println("Sau khi hoán đổi:");
        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
    }
}
