package ss2_Loop_In_Java.Exercise;

import java.util.Scanner;

public class First20Primes {

    private static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){

        System.out.print("Nhap n = ");
        int n = scanner.nextInt();
        System.out.printf("%d so nguyen to dau tien la: \n", n);
        int count = 0;
        int i = 2;
        while (count < n){
            if(isPrimeNumber(i)){
                System.out.print(i + " ");
                count++;
            }
            i++;
        }

    }
    public static boolean isPrimeNumber(int n){
        if( n < 2){
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++){
            if( n % i == 0){
                return false;
            }
        }
        return true;
    }
}
