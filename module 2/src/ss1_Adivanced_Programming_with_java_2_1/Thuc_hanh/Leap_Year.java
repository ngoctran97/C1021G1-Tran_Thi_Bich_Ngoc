package ss1_Adivanced_Programming_with_java_2_1.Thuc_hanh;

import java.util.Scanner;

public class Leap_Year {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year : ");
        year = scanner.nextInt();
        boolean isLeapYear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if( isDivisibleBy4){
            boolean isDivisibleby100 = year % 100 == 0;
            if(isDivisibleby100){
                boolean isDivisibleby400 = year % 400 == 0;
                if(isDivisibleby400){
                    isLeapYear = true;
                }
            }else{
                isLeapYear = true;
            }
        }

        if(isLeapYear){
            System.out.printf("%d is a leap year", year);
        }else{
            System.out.printf("%d is Not a leap year", year);
        }


    }

}
