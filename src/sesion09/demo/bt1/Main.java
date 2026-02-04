package sesion09.demo.bt1;

public class Main {
        public static void main(String[] args) {
            BirdAnimal bird = new BirdAnimal();
            MamalAnimal mamal = new MamalAnimal();
            System.out.println("Nhập thông tin: ");
            bird.input();
            System.out.println("THÔNG TIN BIRD:");
            bird.display();
            System.out.println("\nNHẬP THÔNG TIN MAMAL:");
            mamal.input();
            System.out.println("THÔNG TIN MAMAL:");
            mamal.display();
        }

}
