package ss3_Array_To_Java.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {

    public static void main (String[] arga){
        int a, b, sum;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("nhap do dai mang a");
            a = scanner.nextInt();
        }while (a <= 0);

        int A[] = new int[a];
        System.out.println("nhap cac phan tu trong mang : ");
        for (int i = 0; i < a; i++ ){
            System.out.print("nhap phan tu thu " + i + " : ");
            A[i] = scanner.nextInt();
        }
        do{
            System.out.println("nhap do dai mang b");
            b = scanner.nextInt();
        }while (b <= 0);

        int B[] = new int[b];
        System.out.println("nhap cac phan tu trong mang : ");
        for (int j = 0; j < b; j++ ){
            System.out.print("nhap phan tu thu " + j + " : ");
            B[j] = scanner.nextInt();
        }
        sum = A.length + B.length;
        int C[] = new int[sum];
        int pos = 0;
        for (int element : A){
            C[pos] = element;
            pos++;
        }
        for (int element : B){
            C[pos] = element;
            pos++;
        }
        System.out.println("Do dai mang c sau khi noi mang la " + sum);
        System.out.print(Arrays.toString(C));

    }
}
