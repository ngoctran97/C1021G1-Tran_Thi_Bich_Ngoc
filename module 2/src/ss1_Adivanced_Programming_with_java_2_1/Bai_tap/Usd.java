package ss1_Adivanced_Programming_with_java_2_1.Bai_tap;

import java.util.Scanner;

public class Usd {

    public static void main(String[] args){
       double vnd = 23000 ;
       double usd;
       Scanner scanner = new Scanner(System.in);
       System.out.println("nhap so tien usd");
       usd = scanner.nextDouble();
       double quydoi = usd * 23000;
       System.out.println("Gia tri VND " + quydoi);
    }

}
