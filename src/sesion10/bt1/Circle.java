package sesion10.bt1;

public class Circle extends  Shapa{
    private final double radius;

    public Circle(final double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
