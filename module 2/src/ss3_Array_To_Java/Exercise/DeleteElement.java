package ss3_Array_To_Java.Exercise;

import java.util.Scanner;

public class DeleteElement {

    public static void main(String[] args){
        int i, n, c;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Nhap vao so phan tu mang : ");
            n = scanner.nextInt();
        }while (n <= 0);

        int A[] = new int[n];
        System.out.println("Nhap cac phan tu cho mang : ");
        for (i = 0; i < n; i++){
            System.out.print("Hhap phan tu thu " + i + " : ");
            A[i] = scanner.nextInt();
        }
        System.out.println("Nhap so nguyen k : ");
        int k = scanner.nextInt();
        for (c = i = 0; i < n ; i++){
            if(A[i] != k){
                A[c] = A[i];
                c++;
            }
        }
        n = c;
        System.out.println("Mang con lai sau khi xao phan tu " + k + " la : ");
        for (i = 0; i < n; i++){
            System.out.print(A[i] + "\t");
        }

    }

}
