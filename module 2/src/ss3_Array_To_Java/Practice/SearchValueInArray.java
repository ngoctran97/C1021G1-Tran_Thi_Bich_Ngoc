package ss3_Array_To_Java.Practice;

import java.util.Scanner;

public class SearchValueInArray {

    public static void main(String[] args){
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name’s student:");
        String input_name = scanner.nextLine();
        Boolean inExist = false;
        for (int i = 0; i < students.length; i++){
            if (students[i].equals(input_name)){
                System.out.print("Position of the students in the list" + input_name + " is :" + (i+1));
                inExist = true;
                break;
            }
        }
        if (!inExist){
            System.out.println("Not fount " + input_name + " in the list.");
        }
    }



}
