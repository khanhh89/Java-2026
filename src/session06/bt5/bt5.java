package session06.bt5;

public class bt5 {
    public String nameBook;
    public String author;
    public double price;

    public bt5(String nameBook, String author, double price) {
        this.nameBook = nameBook;
        this.author = author;
        this.price = price;
    }
    public void display() {
        System.out.println("Tên sách: "+this.nameBook);
        System.out.println("Tác dả: "+this.author);
        System.out.println("Zá: "+this.price);
    }

    public static void main(String[] args) {
        bt5 book = new bt5("Hay", "quá", 12000);
        book.display();
    }
}
