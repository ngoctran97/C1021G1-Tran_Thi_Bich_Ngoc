package ss3_Array_To_Java.Exercise;

import java.util.Scanner;

public class CountingStudents {

    public static void main(String[] args){
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Enter a size : ");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("do dai to da cua mang la 30");
        }while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("nhap diem cua hoc sinh thu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("List of mart : ");
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
            if(array[j] >= 5 && array[j] <= 100)
                count++;
        }
        System.out.print("so luong sinh vien thi do la " + count);
    }
}
