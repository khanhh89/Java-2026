package sesion03.bt3;

public class bt3 {
    public static void maxs(String[] name, int [] quantity){
        int max = quantity[0];
        for (int i = 1; i < quantity.length; i++) {
            if (quantity[i] > max) {
                max = quantity[i];
            }
        }
        System.out.println("Sách có so lượt nhiều nhất: "+ max +" cuốn");
        for (int i = 0; i <= name.length; i++) {
            if(quantity[i] == max){
                System.out.println(name[i]);
            }
        }
    }
    public static void mins(String[] name, int [] quantity){
        int min = quantity[0];
        for (int i = 1; i < quantity.length; i++) {
            if (quantity[i] < min) {
                min = quantity[i];
            }
        }
        System.out.println("Sách có lượt mượn ít nhất: "+ min +" cuốn");
        for (int i = 0; i <= name.length; i++) {
            if(quantity[i] == min){
                System.out.println(name[i]);
            }
        }
    }
    public static void main(String[] args) {
        String [] name = {"Python", "Wed Design", "Data Structures"};
        int [] quantity = {5,10,15};
        maxs(name, quantity);
        System.out.println(" ---------------------- ");
        mins(name, quantity);
    }
}
