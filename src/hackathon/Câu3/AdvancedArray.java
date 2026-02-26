package hackathon.Câu3;
import java.util.Scanner;;
public class AdvancedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int temp[] = new int[n];
        int m = 0;
        for (int x : arr) {
            if (x > 100)
                temp[m++] = x;
        }
        if (m == 0) {
            System.out.println("Không có phần tử hợp lệ");
            return;
        }
        for (int i = 0; i < m - 1; i++)
            for (int j = i + 1; j < m; j++) {
                int sum1 = digitSum(temp[i]);
                int sum2 = digitSum(temp[j]);
                if (sum1 > sum2 || (sum1 == sum2 && temp[i] > temp[j])) {
                    int t = temp[i];
                    temp[i] = temp[j];
                    temp[j] = t;
                }
            }
        System.out.println("Các phần tử hợp lệ sau khi sắp xếp:");
        for (int i = 0; i < m; i++)
            System.out.print(temp[i] + " ");
    }
    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
