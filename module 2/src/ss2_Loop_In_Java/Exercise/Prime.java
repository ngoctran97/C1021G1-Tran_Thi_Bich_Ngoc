package ss2_Loop_In_Java.Exercise;

import java.util.Scanner;

public class Prime {

    private static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
        System.out.print("Nhap n = ");
        int n = scanner.nextInt();
        System.out.printf(" tat cac so nguyen to nho hon %d la: \n", n);
        if (n >= 2){
            System.out.print(2);
        }
        for (int i = 3; i < n; i+=2){
            if (isPrimeNumber(i)){
                System.out.print(" " + i);
            }
        }
    }
    public static boolean isPrimeNumber(int n){
        if( n < 2 ){
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
