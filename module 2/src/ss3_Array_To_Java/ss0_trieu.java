package ss3_Array_To_Java;

import java.util.Scanner;

public class ss0_trieu {
    public void xoaPhatTuKhoiMang()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phan tu muon xoa: ");
        int so = sc.nextInt();
        int a[] = {10,4,6,7,8,6,0,0,0,0};
        int i;
        for (i = 0; i < a.length; i++) {
            if(a[i] == so)
            {
                break;
            }
        }
        if(i == a.length -1 ) {
            a[i] = 0;
        }
        else {
            for(; i < a.length - 1; i++) {
                a[i] = a[i+1];
            }
        }
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public void themPhatTuKhoiMang()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phan tu muon them: ");
        int so = sc.nextInt();
        System.out.print("Nhap vi tri muon them: ");
        int index = sc.nextInt();
        int a[] = {10,4,6,7,8,6,0,0,0,0};
        for(int i = a.length - 2; i >= index; i--) {
            a[i+1] = a[i];
        }
        a[index] = so;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        ss0_trieu test = new ss0_trieu();
        test.themPhatTuKhoiMang();
    }
}
