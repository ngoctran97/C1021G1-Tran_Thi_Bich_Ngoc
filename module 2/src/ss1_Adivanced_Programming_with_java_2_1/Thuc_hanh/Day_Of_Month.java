package ss1_Adivanced_Programming_with_java_2_1.Thuc_hanh;

import java.util.Scanner;

public class Day_Of_Month {

    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which month that you want to count days? ");
        int month = scanner.nextInt();
        String Day_Of_Month;
        switch (month) {
            case 2:
                Day_Of_Month = "28 or 29";
                break;
            case 1:
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                Day_Of_Month = "31";
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                Day_Of_Month = "30";
                break;
            default:
                Day_Of_Month = "";
        }
        if (!Day_Of_Month.equals("")) System.out.printf("The month '%d' has %s day !", month, Day_Of_Month);
        else System.out.print("Invalid input");
    }
}
