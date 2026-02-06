package sesion10.bt2;

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota");
        Vehicle myBike = new Bicycle("Moto");
        System.out.println(" ");
        System.out.print(myCar.getBrand() + " - Cách di chuyển: ");
        myCar.move();
        System.out.print(myBike.getBrand() + " - Cách di chuyển: ");
        myBike.move();
    }
}
