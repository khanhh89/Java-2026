package sesion04.bt3;

public class bt3 {
    public static void main(String[] args) {
        String[] transactions = {"BK001–20/01", "BK005–21/01", "BK099–22/01"};
        long start1 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        sb.append("BÁO CÁO\n");
       for (int i=0; i<transactions.length; i++) {
           sb.append(transactions[i]);
       }
        long end1 = System.nanoTime();
        System.out.println(sb.toString());
        System.out.println("Thời gian StringBuilder: " + (end1 - start1));
        long start2 = System.nanoTime();
        String report = "BÁO CÁO\n";
        for (int i=0; i<transactions.length; i++) {
            sb.append(transactions[i]);
        }
        long end2 = System.nanoTime();
        System.out.println(report);
        System.out.println("Thời gian String: " + (end2 - start2));
    }
}
