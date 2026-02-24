package onTap.Cau2;
import java.util.Scanner;
public class ChenVaDichChuyen {
    public static void main(String[] args) {
        //tạo mảng arr có n phần tử, nhập vào x một giá trị k (0<=k<=n), chèn x vào k, các phần tử từ k trở đi phải dịch sang phải
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập vào các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        //vị trí cần chèn phải nhập thêm 1

        System.out.print("Nhập vào vị trí cần chèn (0 <= k <= n): ");
        int k = sc.nextInt();
        System.out.print("Nhập vào giá trị cần chèn: ");
        int x = sc.nextInt();
        System.out.println("Mảng ban đầu là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" \n");
        int[] newArr = new int[n + 1];
        for (int i = 0; i < k; i++) {
            newArr[i] = arr[i];
        }
        newArr[k] = x;
        for (int i = k; i < n; i++) {
            newArr[i + 1] = arr[i];
        }
        System.out.println("Mảng sau khi được chèn là: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
