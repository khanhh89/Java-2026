package sesion11.ktth;

public class Main {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[3];
        drinks[0] = new Coffee(1, "Bạc sỉu", 20000, true);
        drinks[1] = new FruitJuice(2, "Nước ép cam", 30000, 10);
        drinks[2] = new Coffee(3, "Cà phê đen", 15000, false);
        for (int i = 0; i < drinks.length; i++) {
            if (drinks[i] != null) {
                drinks[i].displayInfo();
                drinks[i].mix();
            }
        }
    }
}
