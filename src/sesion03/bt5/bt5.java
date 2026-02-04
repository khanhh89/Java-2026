package sesion03.bt5;

import java.util.Scanner;

public class bt5 {
    //xóa theo mã
    public static int delete (int [] arr, int n, int id){
        int index = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] == id){
                index = i;
                break;
            }
        }
        // không tìm thấy
        if(index == -1){
            System.out.println("Không tìm thấy");
            return n;
        }
        //dồn lên
        for(int j = index; j < n-1; j++){
            arr[j] = arr[j+1];
        }
        System.out.println("Đã xóa "+ id);
        return n-1;
    }
    //in mảng
    public static void print(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        while(n>0){
            print(arr);
            System.out.println("Nhap số cần xóa: ");
            int x = sc.nextInt();
            n = delete (arr,n,x);
        }
    }
}
