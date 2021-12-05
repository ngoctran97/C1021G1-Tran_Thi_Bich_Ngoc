package ss3_Array_To_Java.Exercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SumTheNumbersInASpecifiedCoiumn {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] array = {{1,2,3,4,5},{6,7,8,9,10}};
        System.out.println("nhap cot ban muon cong");
        int a = scanner.nextInt();

        int sum = 0;
        for(int i  = 0; i < array.length; i++  ){
            sum = sum + array[i][a];
        }
        System.out.println(sum);

    }

}
