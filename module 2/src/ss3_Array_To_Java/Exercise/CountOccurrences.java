package ss3_Array_To_Java.Exercise;

import java.util.Scanner;

public class CountOccurrences {
    public static void main (String[] args){
        String chuoi;
        char kytu;
        int count;
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap chuoi bat ky : ");
        chuoi = scanner.nextLine();

        System.out.println("nhap ky tu muon kiem tra");
        kytu = scanner.next().charAt(0);
        count = 0;
        for (int i = 0; i < chuoi.length(); i++){
            if( chuoi.charAt(i) == kytu){
                count++;
            }
        }
        System.out.println("so lan ky tu " + kytu + " xuat hien trong cuoi " + chuoi + " la : " + count);

    }
}

//public class CountOccurrences {
//
//    public static void main (String[] args){
//        String chuoi = new String(" xiu  koi xinh dep");
//        System.out.println(chuoi);
//
//       char kytu = 'x';
//        int count = 0;
//        for ( int i = 0; i < chuoi.length(); i ++){
//            if( chuoi.charAt(i) == kytu ){
//                count++;
//            }
//        }
//        System.out.println("so la xuat hien cua ky tu " + kytu + " trong cuoi" + chuoi + "la : " + count);
//
//    }
//}
