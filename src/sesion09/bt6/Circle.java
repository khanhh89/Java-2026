package sesion09.bt6;
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(int diameter) { // nạp chồng constructor
        this.radius = diameter / 2.0;
    }
    public double area(double scale) {
        return Math.PI * radius * radius * scale;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
