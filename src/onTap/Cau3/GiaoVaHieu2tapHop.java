package onTap.Cau3;
import java.util.Scanner;
public class GiaoVaHieu2tapHop {
    public static void main(String[] args) {
        //nhập vào 2 tập hợp A và B (có thể trùng nhau), tìm giao và hiệu của 2 tập hợp đó
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử của tập hợp A: ");
        int nA = sc.nextInt();
        int[] A = new int[nA];
        System.out.println("Nhập vào các phần tử của tập hợp A: ");
        for (int i = 0; i < nA; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            A[i] = sc.nextInt();
        }
        System.out.print("Nhập vào số lượng phần tử của tập hợp B: ");
        int nB = sc.nextInt();
        int[] B = new int[nB];
        System.out.println("Nhập vào các phần tử của tập hợp B: ");
        for (int i = 0; i < nB; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            B[i] = sc.nextInt();
        }
        System.out.println("Tập hợp A là: ");
        for (int i = 0; i < nA; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("\nTập hợp B là: ");
        for (int i = 0; i < nB; i++) {
            System.out.print(B[i] + " ");
        }
        //tìm giao của 2 tập hợp
        System.out.println("\nGiao của 2 tập hợp A và B là: ");
        for (int i = 0; i < nA; i++) {
            for (int j = 0; j < nB; j++) {
                if (A[i] == B[j]) {
                    System.out.print(A[i] + " ");
                    break;
                }
            }
        }
        //tìm hiệu của 2 tập hợp
        System.out.println("\nHiệu của tập hợp A và B là: ");
        for (int i = 0; i < nA; i++) {
            boolean isInB = false;
            for (int j = 0; j < nB; j++) {
                if (A[i] == B[j]) {
                    isInB = true;
                    break;
                }
            }
            if (!isInB) {
                System.out.print(A[i] + " ");
            }
        }
        System.out.println("\nHiệu của tập hợp B và A là: ");
        for (int i = 0; i < nB; i++) {
            boolean isInA = false;
            for (int j = 0; j < nA; j++) {
                if (B[i] == A[j]) {
                    isInA = true;
                    break;
                }
            }
            if (!isInA) {
                System.out.print(B[i] + " ");
            }
        }
    }
}
