package session06.bt2;

public class bt2 {
    public String username;
    public String password;
    public String email;

    public bt2(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
    public void thayPass( String passwordOld, String passwordNew) {
        if(this.password.equals(passwordOld)) {
            this.password = passwordNew;
            System.out.println("Đổi MK thành công");
        }else {
            System.out.println("ĐỔi MK thất bại");
        }
    }
    public void display(){
        System.out.println("Tên đăng nhâp: "+ username);
        System.out.println("Email: "+ email);
        System.out.println("Password: "+ password);
    }
    public static void main (String[] args) {
        bt2 bt2 = new bt2("Khanh", "12345", "khanhdao@123.com");
        bt2.display();
        //đổi mk
        bt2.thayPass("12345", "khanh");
        bt2.display();
    }
}
