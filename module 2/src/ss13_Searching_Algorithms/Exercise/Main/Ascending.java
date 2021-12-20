package ss13_Searching_Algorithms.Exercise.Main;

import java.util.LinkedList;
import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap chuoi");
        String str = scanner.nextLine();

        int code = (int) str.charAt(0);
        for (int i = 0; i < str.length();i++){
            int code2 = (int) str.charAt(i);
            if(code <= code2){
                code = code2;
                System.out.print(str.charAt(i));
            }
        }
    }

}
