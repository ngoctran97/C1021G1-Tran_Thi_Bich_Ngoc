package ss1_Adivanced_Programming_with_java_2_1.Thuc_hanh;

import java.util.Scanner;

public class Solving_First_Degree_Equations {
    public static void main(String[] args ) {
        System.out.println("Linear Equation resolver");
        System.out.println("Given a equation 'a * x + b = c', please enter constants:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        System.out.println("c: ");
        double c = scanner.nextDouble();

        if( a!= 0) {
            double answer = ( c - b )/ a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        }else{
            if( b == c){
                System.out.print("The solution is all x!");
            }else{
                System.out.print("No solution!");
            }
        }
    }
}
