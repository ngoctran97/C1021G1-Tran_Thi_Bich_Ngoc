package ss3_Array_To_Java.Exercise;

import java.util.Scanner;

public class MaxInJava {

    public  static void main(String[] args){
        int[] A = {10,2,-3};
        int[] B = {6,7,8};
        int sum = A.length + B.length;
        int C[] = new int[sum];
        int pos = 0;
        for (int element : A){
            C[pos] = element;
            pos++;
        }
        for (int element : B){
            C[pos] = element;
            pos++;
        }

        int max = C[0];
        int index = 0;
        for (int k = 0; k < C.length; k++){
            if(C[k] > max){
                max = C[k];
                index = k ;
            }
        }
        System.out.println("So lon nhat trong mang la " + max + " ,o vi tri la " + index);
    }
}
