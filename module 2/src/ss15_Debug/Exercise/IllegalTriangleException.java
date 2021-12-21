package ss15_Debug.Exercise;
import java.util.Scanner;

public class IllegalTriangleException {
    public static int test() {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0, c= 0;
        try {
            System.out.println("nhap a ");
            a = Integer.parseInt(scanner.nextLine());
            System.out.println("nhap b ");
            b = Integer.parseInt(scanner.nextLine());
            System.out.println("nhap c ");
            c = Integer.parseInt(scanner.nextLine());

            if( a<0|| b<0 ||c <0|| a< b+c||b< a+c|| c< a+b){
                    throw IllegalTriangleException()
            }
        }
   }


}
