package session06.bt6;

public class bt6 {
    private String id;
    private String name;
    private String email;
    private String password;
    public bt6(String id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if(email !=null && email.equals("A-Za-z0-9")){
            this.name = name;
        }else{
            System.out.println("Email không ợc để trống");
            this.name = name;
        }
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        if (password == null || password.trim().isEmpty()) {
            System.out.println("Không được đê MK trống");
        }else  {
            this.password = password;
        }
    }
    public void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Password: 123456");
    }
    public static void main(String[] args) {
        bt6 user1 = new bt6("1", "A", "a@gmail.com", "abc123");
        bt6 user2 = new bt6("2", "B", "b#gmail.com", "xyz456");
        bt6 user3 = new bt6("3", "C", "c@gmail.com", "");
        user1.display();
        user2.display();
        user3.display();
    }
}