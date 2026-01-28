//package sesion04.bt6;
//
//public class bt6 {
//    public static void main(String[] args) {
//        String review = "Cuốn sách này rất tệ";
//        String[] blackList = {"Tệ", "du mút"};
//        for (int i = 0; i < blackList.length; i++) {
//            String word = blackList[i];
//            review = review.replaceAll(word, " ");
//        }
//        if(review.length()>200){
//            int cut = 200;
//             while (cut < review.length()&&review.charAt(cut)!=' ') {
//                 cut++;
//             }
//             review = review.substring(0, cut);
//        }
//        System.out.println("Review: " + review);
//    }
//}
