package ss2_Loop_In_Java.Exercise;

import java.util.Scanner;

public class Show_Types {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chie dai");
        int length = scanner.nextInt();
        System.out.println("nhap chie dai");
        int width = scanner.nextInt();


        for (int i = 1; i <= width; i++){
            for(int j = 1; j <= length; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 1 ; i <= length; i++){
            for( int j = 1; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 1 ; i <= length ; i++){
            for( int j = 1; j <= length + 1 - i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i <= length; i++){
            for (int j = 1; j <= length - i ; j++){
                System.out.print(" ");
            }
           for(int k = 1; k <= 2*i-1; k++){
               System.out.print("*");
           }
            System.out.println("");
        }

    }
}


