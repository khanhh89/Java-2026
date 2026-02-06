package sesion10.bt1;


import java.awt.*;

public class Circle extends Shapa {
    private double radius;
    public Circle (double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

}
