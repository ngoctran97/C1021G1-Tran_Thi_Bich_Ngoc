package ss3_Array_To_Java.Exercise;

import java.util.Scanner;

public class AddElementToArray {

    public static void main(String[] args){

       int n, i;
       Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nha vao so phan tu : ");
            n = scanner.nextInt();
        }while (n<= 0);

        int Arr[] = new int[n];
        System.out.println("Nhap cac phan tu cho mang : ");
        for (i = 0; i < n; i++){
            System.out.print("Hhap phan tu thu " + i + " : ");
            Arr[i] = scanner.nextInt();
        }
        System.out.println("Nhap so nguyen x : ");
        int x = scanner.nextInt();
        System.out.println("Nhap vi tri muon chen vao index ");
        int index = scanner.nextInt();

       // for (index <= - 1 && index >= Arr.length - 1){

    }
}
