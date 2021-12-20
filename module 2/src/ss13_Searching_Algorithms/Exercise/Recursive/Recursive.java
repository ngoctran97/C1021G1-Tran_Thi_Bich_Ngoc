package ss13_Searching_Algorithms.Exercise.Recursive;

import java.util.Arrays;
import java.util.Scanner;

public class Recursive {

    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap do dai chuoi : ");
        size = scanner.nextInt();

        array = new int[size];
        for (int i = 0; i< array.length; i++){
            System.out.print(" nhap phan thu"+ (i + 1)+ ":");
            array[i] = scanner.nextInt();
        }
        System.out.printf("%-20s%s", "cac phan tu trong array la : ", "");
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }
        System.out.print("\nmang sau khi sawp xep la : ");
        Arrays.sort(array);
        for (int x : array){
            System.out.print(x + "\t");
        }
        System.out.print("\nnhap so muon tim kiem : ");
        int value = scanner.nextInt();

        int index = binarySearch(array, 0, array.length-1,value);
        if( index == -1){
            System.out.println(" khong tim thay gia tri");
        }else{
            System.out.println(value+ " o vi tri " + index);
        }

    }
    static int binarySearch(int[] array, int left, int right, int value){
        left = 0;
        right = array.length -1;
        while (right >= left){
            int middle = (left + right)/2;
            if (value < array[middle]){
                right = middle - 1;
            }else if(value == array[middle]){
                return middle;
            }else {
                left = middle + 1;
            }
        }
        return -1;
    }


}
