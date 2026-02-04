package sesion09.bt4;

public class Main {
    public static void main(String[] args) {
        class Animal {
            public void sound() {
                System.out.println("Kêu gào");
            }
        }
        class Dog extends Animal {
            public void sound() {
                System.out.println("Gâu gâu");
            }
            public void view(){
                System.out.println("2 con chó đang nhìn nhau");
            }
        }
        Animal animal = new Dog();
        animal.sound();
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.view();
        }
    }
}
