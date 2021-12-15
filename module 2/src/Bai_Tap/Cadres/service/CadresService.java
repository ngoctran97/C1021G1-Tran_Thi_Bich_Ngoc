package Bai_Tap.Cadres.service;

import Bai_Tap.Cadres.modell.Cadres;

import java.util.Scanner;

public class CadresService implements ICadres{
    private Cadres cadres = new Cadres();
    private static Scanner scanner = new Scanner(System.in);
    private static int count = 0;
    private Object Cadres;

    @Override
    public void addNewCadres() {
        if(count < cadres.length){
            System.out.println("Nhap ma MCb");
            String mcb = scanner.nextLine();
            System.out.println("Nhap ma ho va ten");
            String ten = scanner.nextLine();
            System.out.println("Nhap gioi tinh");
            String gioitinh = scanner.nextLine();
            System.out.println("Nhap que quan");
            String quequan = scanner.nextLine();
            System.out.println("Nhap nam sinh");
            String namsinh = scanner.nextLine();
            System.out.println("Nhap chuyen mon");
            String chuyenmon = scanner.nextLine();
            System.out.println("Nhap trinh do");
            String trinhDo = scanner.nextLine();
            System.out.println("Nhap luong");
            String luong = scanner.nextLine();
            System.out.println("Nhap phu cap");
            String phuCap = scanner.nextLine();
            Cadres cadres = new Cadres(mcb,ten,gioitinh,quequan,namsinh,chuyenmon,trinhDo,luong,phuCap);
            //Cadres[count] = cadres;
            count++;

        }

    }

    @Override
    public void getAll() {

    }
}
