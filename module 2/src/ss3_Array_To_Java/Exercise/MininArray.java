package ss3_Array_To_Java.Exercise;

import java.util.Scanner;

public class MininArray {

    public static void main (String[] args){
        int[] Array1 = {10,2,-3};
        int[] Array2 = {6,7,8};
        int sum = Array1.length + Array2.length;
        int[] Array3 = new int[sum];
        int pos = 0;
        for (int element : Array1){
            Array3[pos] = element;
            pos++;
        }
        for (int element : Array2){
            Array3[pos] = element;
            pos++;
        }
        int min = Array3[0];
        int index = 0;
        for (int e = 0; e < Array3.length; e++){
            if(Array3[e] < min){
                min = Array3[e];
                index = e;
            }
        }

        System.out.println("So nho nhat trong mang la " + min + " ,o vi tri la " + index);
    }
}
