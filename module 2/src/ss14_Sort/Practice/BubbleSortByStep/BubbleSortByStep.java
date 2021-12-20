package ss14_Sort.Practice.BubbleSortByStep;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước danh sách:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.print("nhap vao " + list.length+ " values: ");
        for (int i = 0; i < list.length; i++){
            list[i] = scanner.nextInt();
        }
        System.out.print("Bạn nhập danh sách: ");
        for (int i = 0; i < list.length; i++){
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBắt đầu xử lý sắp xếp...");
        bubbleSortByStep(list);

    }
    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++){
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++){
                if(list[i] > list[i + 1]){
                    System.out.println(" trao doi " + list[i] + " voi " + list[i +1]);
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;

                    needNextPass = true;
                }
            }
            if(needNextPass == false){
                System.out.println("Mảng có thể được sắp xếp và không cần chuyển tiếp theo");
                break;
            }
            System.out.print("Liệt kê sau " + k + " xap sep: ");
            for (int j = 0; j < list.length; j++){
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }

    }


}
