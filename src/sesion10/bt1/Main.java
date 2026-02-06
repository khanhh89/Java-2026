package sesion10.bt1;
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.printf("Hình tròn: \n  + Diện tích: %.2f\n  + Chu vi: %.2f\n", circle.getArea(), circle.getPerimeter());
        System.out.printf("Hình chữ nhật: \n  + Diện tích: %.2f\n  + Chu vi: %.2f\n", rectangle.getArea(), rectangle.getPerimeter());
    }
}