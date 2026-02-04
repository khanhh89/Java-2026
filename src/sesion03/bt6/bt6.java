package sesion03.bt6;

import java.util.Arrays;
import java.util.Scanner;

public class bt6 {
    public static int [] merge(int [] a, int [] b) {
        int [] temp = new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                temp[k++] = a[i++];
            } else if (a[i]>b[i]) {
                temp[k++] = b[j++];
            }else  {
                temp[k++] = a[i++];
                i++;
                j++;
            }
        }
        while(i<a.length){
            temp[k++] = a[i++];
        }
        while(j<b.length){
            temp[k++] = b[j++];
        }
        return Arrays.copyOf(temp,k);
    }
    public  static void main(String args[]) {
        int [] First = {1,3,5,7,8};
        int [] Second = {2,3,5,6,8,9,10};
        int [] arr = merge(First,Second);
        System.out.println("Gộp thanh công");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
