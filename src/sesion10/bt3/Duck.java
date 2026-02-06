package sesion10.bt3;

public class Duck extends Animal implements Swimmable, Flyable {
    public Duck(String name) {
        super(name);
    }
    @Override
    public void swim() {
        System.out.println(name + " đang bơi trên mặt hồ.");
    }
    @Override
    public void fly() {
        System.out.println(name + " đang cất cánh bay lên.");
    }
}
