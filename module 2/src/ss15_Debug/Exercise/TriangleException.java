package ss15_Debug.Exercise;

import java.util.Scanner;

public class TriangleException {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A, B, C;

        System.out.println("nhap a ");
        A = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap b ");
        B = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap c ");
        C = Integer.parseInt(scanner.nextLine());
        TriangleException illegalTriangleException = new TriangleException();
        illegalTriangleException.check(A, B, C);
    }

    public void check(int a, int b, int c) {
        try {
            if (a <= 0 || b <= 0 || c <= 0) {
                throw new IllegalTriangleException("ban k dc nhap so am");
            } else if (a + b < c || a + c < b || b + c < a) {
                throw new IllegalTriangleException("cac so vua nhap vao k phai la 3 canh cua tam giac");
            } else {
                System.out.println("3 canh cua tam giac la a = " + a + ", b = " + b + ", c = " + c);

            }

        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
//        if (a <= 0 || b <= 0 || c <= 0) {
//            try {
//                throw new IllegalTriangleException("ban k dc nhap so am");
//            }catch (IllegalTriangleException e){
//                System.out.println(e.getMessage());
//            }
//
//        }else if(a+b <c|| a+c< b|| b+ c< a){
//            try {
//                throw new IllegalTriangleException("cac so vua nhap vao k phai la 3 canh cua tam giac");
//            }catch (IllegalTriangleException e){
//                System.out.println(e.getMessage());
//            }
//        }else {
//            System.out.println("3 canh cua tam giac la a = "+a+", b = "+ b + ", c = "+ c);
//        }
//   }



