package sesion03;

import java.sql.SQLOutput;
import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        //Mảng 1 chiều trong java
        int [] arr = new int[5];
        // mảng chuỗi
        String [] arrStr = new String[3];
        System.out.println("Độ dài mảng arr: " + arr.length);
        System.out.println("Độ dài mảng arrStr: " + arrStr.length);
        //giá trị các phần tử trong mảng: 
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrStr));
        //khai báo và khởi tạo mảng
        int [] arr2 = {1,2,3,4,5};
        String [] arrStr2 = {"Java", "Python", "C++"};
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arrStr2));
        //truy xuất
        // lay ra
        System.out.println("Phan tu o vị trí index = 3 là: "+arr2[3]);
        //thay đổi giá trị
        arr2 [3] = 3;
        System.out.println(Arrays.toString(arr2));
        //thao tác truywwnf qua các phần tử của mảng 1 chiều
        for (int i = 0; i < arr2.length; i++) {
            //thực hiện các thao tác làm việc với phần tử thứ i
            System.out.println("arr2 = "+arr2[i]);
        }

    }
}
