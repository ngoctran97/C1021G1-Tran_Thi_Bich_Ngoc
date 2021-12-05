package ss3_Array_To_Java.Exercise;

import java.util.Scanner;

public class SumTheNumbersOnTheDiagonal {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai ma nhan");
        n = scanner.nextInt();
        int array[][] = new int[n][n];
        System.out.println("nhap cac phan tu trong ma tran");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("array [" + i + "] [" + j + "] = ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma tran vua nhap la:");
        for (int i = 0; i < n ; i++){
            for (int j = 0; j < n; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int sum = 0;
            for (int i = 0; i < n; i++){
                sum = sum + array[i][i];
            }
            System.out.println("tong cac duong cheo chinh cua ma tran hinh vuong la:"+sum);
        }

//
//        int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        int sum = 0;
//        for (int i = 0; i < array.length; i++){
//            sum = sum + array[i][i];
//        }
//        System.out.println("tong cac duong cheo chinh cua ma tran hinh vuong la:"+sum);
//    }

}
