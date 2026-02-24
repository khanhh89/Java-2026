package onTap.Cau2;
import java.util.Scanner;
public class XuLyLapVaThuGon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập vào các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("mảng ban đầu là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" \n");
        int newIndex = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr[newIndex] = arr[i];
                newIndex++;
            }
        }
        System.out.println("Mảng sau khi được thu gọn là: ");
        for (int i = 0; i < newIndex; i++) {
            System.out.print(arr[i] + " ");
        }

        // int[] newArr = new int[n];
        // int newIndex = 0;
        // for (int i = 0; i < n; i++) {
        //     boolean isDuplicate = false;
        //     for (int j = 0; j < newIndex; j++) {
        //         if (arr[i] == newArr[j]) {
        //             isDuplicate = true;
        //             break;
        //         }
        //     }
        //     if (!isDuplicate) {
        //         newArr[newIndex] = arr[i];
        //         newIndex++;
        //     }
        // }
        // System.out.println("");
    }
}
