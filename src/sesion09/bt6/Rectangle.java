package sesion09.bt6;
class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double side) {
        this.width = side;
        this.height = side;
    }
    public double area(boolean doubleSize) {
        if (doubleSize) {
            return 2 * (width * height);
        }
        return width * height;
    }
    @Override
    public double area() {
        return width * height;
    }
}