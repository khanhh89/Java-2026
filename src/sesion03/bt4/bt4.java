package sesion03.bt4;

import java.util.Scanner;

public class bt4 {
    //sắp sếp mảng
    public static void sort(int [] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void display(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print (arr[i] + " ");
            if(i!=arr.length-1){
                System.out.print (", ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử vào mảng: ");
        int n = input.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Nhập phần tử thu "+ (i+1)+" vào mảng: ");
            arr[i] = input.nextInt();
        }
        System.out.println("Mảng trước sắp sếp");
        display(arr);
        System.out.println(" ");
        System.out.println("Mảng sau khi sắp xếp: ");
        sort(arr);
        display(arr);
    }
}
