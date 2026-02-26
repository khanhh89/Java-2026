package hackathon.Câu2;
import java.util.*;
public class ArrayProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng (n>2): ");
        int n = sc.nextInt();
        if (n <= 2) {
            System.out.println("Vui lòng nhập n lớn hơn 2.");
            return;
        }
        int arr[] = new int[n];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int maxSum = arr[0] + arr[1];
        int a = arr[0];
        int b = arr[1];
        for (int i = 0; i < n - 1; i++) {
            int sum = arr[i] + arr[i + 1];
            if (sum > maxSum) {
                maxSum = sum;
                a = arr[i];
                b = arr[i + 1];
            }
        }
        System.out.println("Cặp liền kề có tổng lớn nhất là: " + a + " và " + b + " với tổng là: " + maxSum);
        System.out.println("Mảng trước khi sắp xếp: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        int odd[] = new int[n];
        int even[] = new int[n];
        int nOdd = 0, nEven = 0;
        for (int x : arr) {
            if (x % 2 != 0)
                odd[nOdd++] = x;
            else
                even[nEven++] = x;
        }
        for (int i = 0; i < nOdd - 1; i++)
            for (int j = i + 1; j < nOdd; j++)
                if (odd[i] < odd[j]) {
                    int t = odd[i];
                    odd[i] = odd[j];
                    odd[j] = t;
                }
        for (int i = 0; i < nEven - 1; i++)
            for (int j = i + 1; j < nEven; j++)
                if (even[i] > even[j]) {
                    int t = even[i];
                    even[i] = even[j];
                    even[j] = t;
                }
        for (int i = 0; i < nOdd; i++)
            arr[i] = odd[i];
        for (int i = nOdd; i < nOdd + nEven; i++)
            arr[i] = even[i - nOdd];
        System.out.println("Mảng sau khi sắp xếp: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}