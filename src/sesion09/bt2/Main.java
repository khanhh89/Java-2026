package sesion09.bt2;

public class Main {
    public static void main(String[] args) {
        class Animal {
            public void sound() {
                System.out.println("Kêu");
            }
        }
        class Dog extends Animal {
            @Override
            public void sound() {
                System.out.println("Gâu gâu");
            }
        }
        class Cat extends Animal {
            @Override
            public void sound() {
                System.out.println("Meo meo");
            }
        }
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        animal1.sound();
        animal2.sound();
    }
}
