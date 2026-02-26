

// public class Cau3_AdvancedArray {


//     // Tính tổng chữ số
//     public static int digitSum(int x) {

//         int sum=0;

//         while(x>0) {

//             sum+=x%10;
//             x/=10;
//         }

//         return sum;
//     }



//     public static void filterAndSort(int arr[], int n) {

//         int temp[]=new int[n];

//         int m=0;


//         // lọc >100

//         for(int x:arr) {

//             if(x>100)
//                 temp[m++]=x;
//         }


//         if(m==0) {

//             System.out.println("Khong co phan tu hop le");

//             return;
//         }



//         // sort theo tổng chữ số

//         for(int i=0;i<m-1;i++)
//             for(int j=i+1;j<m;j++) {

//                 int sum1=digitSum(temp[i]);
//                 int sum2=digitSum(temp[j]);

//                 if(sum1>sum2 ||
//                         (sum1==sum2 && temp[i]>temp[j])) {

//                     int t=temp[i];
//                     temp[i]=temp[j];
//                     temp[j]=t;
//                 }
//             }


//         for(int i=0;i<m;i++)
//             System.out.print(temp[i]+" ");
//     }



//     public static void main(String[] args) {

//         Scanner sc=new Scanner(System.in);

//         System.out.print("Nhap n: ");
//         int n=sc.nextInt();

//         int arr[]=new int[n];

//         for(int i=0;i<n;i++)
//             arr[i]=sc.nextInt();


//         filterAndSort(arr,n);

//     }
// }
