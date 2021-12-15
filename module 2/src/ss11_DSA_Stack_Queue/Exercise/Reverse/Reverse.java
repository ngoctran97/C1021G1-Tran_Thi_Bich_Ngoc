package ss11_DSA_Stack_Queue.Exercise.Reverse;

import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        int count, i = 0, j = 0, temp;
        int number[] = new int[100];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu trong mang : ");
        count = scanner.nextInt();
        for (i = 0; i < count; i++){
            System.out.println("phan tu" + (i+1) + ": ");
            number[i] = scanner.nextInt();
        }
        j = i - 1;
        i = 0;
        scanner.close();
        Stack<Integer> stack = new Stack<>();
        for (i = 0; i < count; i++){
            stack.push(number[i]);
        }
        for (i = 0; i < count; i++){
            number[i] = stack.pop();
        }
        System.out.println("mangr sau khi dao nguoc");
        for (i = 0; i < count; i++){
            System.out.println(number[i] + " ");
        }
    }
}
