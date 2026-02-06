package sesion10.bt3;

public class Main {
    public static void main(String[] args) {
        Duck donald = new Duck("Vịt Donald");
        Fish nemo = new Fish("Cá Nemo");
        System.out.println("--- Khả năng của Vịt ---");
        donald.swim();
        donald.fly();
        System.out.println("\n--- Khả năng của Cá ---");
        nemo.swim();
    }
}
