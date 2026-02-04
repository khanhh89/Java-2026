package sesion04.bt5;

import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        { String[] logs = { "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345", "2024-05-21 | User: LeThiB | Action: RETURN | BookID: BK12345", "2024-05-22 | User: TranC | Action: BORROW | BookID: BK67890" };
        int borrow = 0;
        int ret = 0;
       for(int i = 0; i < logs.length; i++) {
           String[] parts = logs[i].split(" \\| ");
            String date = parts[0];
            String user = parts[1].replace("User: ", "");
            String action = parts[2].replace("Action: ", "");
            String bookID = parts[3].replace("BookID: ", "");
            System.out.println("Ngày: " + date);
            System.out.println("Người dùng: " + user);
            System.out.println("Hành động: " + action);
            System.out.println("Mã sách: " + bookID);
            System.out.println("------------------");
            if (action.equals("BORROW")){
                borrow++;
            }
            if (action.equals("RETURN")){
                ret++;
            }
        }
        System.out.println("Tổng số lượt mượn: " + borrow);
        System.out.println("Tổng số lượt trả: " + ret); }
    }
}
