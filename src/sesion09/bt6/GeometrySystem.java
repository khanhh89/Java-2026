package sesion09.bt6;
public class GeometrySystem {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(10),
                new Circle(20),
                new Rectangle(5, 10),
                new Rectangle(7)
        };
        double totalArea = 0;
        for (Shape s : shapes) {
            double a = s.area();
            System.out.println(s.getClass().getSimpleName() + " có diện tích: " + a);
            totalArea += a;
        }
        System.out.println("Tổng diện tích: " + totalArea);
        Circle c = new Circle(5);
        System.out.println("Diện tích Circle với scale=2: " + c.area(2));
        Rectangle r = new Rectangle(4, 6);
        System.out.println("Diện tích Rectangle doubleSize=true: " + r.area(true));
    }
}