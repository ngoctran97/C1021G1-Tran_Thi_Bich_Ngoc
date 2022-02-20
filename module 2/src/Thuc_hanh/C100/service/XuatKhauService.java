package Thuc_hanh.C100.service;

import Thuc_hanh.C100.modelr.NhapKhau;
import Thuc_hanh.C100.modelr.XuatKhau;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class XuatKhauService implements IXuatKhau{
    private static ArrayList<XuatKhau> xuatKhauArrayList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public void write(){
        try {
            FileWriter fileWriter = new FileWriter("src/Thuc_hanh/C100/data/xuatKhau.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (XuatKhau xuatKhau : xuatKhauArrayList){
                bufferedWriter.write(xuatKhau.getId()+","+xuatKhau.getMaSP()+","+xuatKhau.getName()+","+xuatKhau.getGiaBan()+","+xuatKhau.getSoLuong()+","+xuatKhau.getGiaXK()+xuatKhau.getQuocGiaXK());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void aadNewXuatKhau() {
        System.out.println("Nhap ma san pham");
        String maSP = scanner.nextLine();
        while (!(maSP.matches("[S][P][0-9]{5}"))){
            System.out.println("hay nhap lai ma san pham");
            maSP = scanner.nextLine();
        }

        System.out.println("nhap ten san pham");
        String name = scanner.nextLine();

        System.out.println("nhap gia ban");
        int giaBan = scanner.nextInt();
        while (giaBan < 0){
            System.out.println("nhap lai gia ban");
            giaBan = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("nhap so luong san pham");
        int soLuong = scanner.nextInt();
        while (soLuong < 0){
            System.out.println("nhap so luong san pham");
            soLuong = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("nhap nha san xuat");
        String nhaSX = scanner.nextLine();

        System.out.println("nhap gia xuat khau");
        int giaXK = scanner.nextInt();
        while (giaXK <0){
            System.out.println("nhap lai gia xuat khau");
            giaXK = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("nhap quoc gia xuat khau");
        String quocgiaSX = scanner.nextLine();

        XuatKhau xuatKhau = new XuatKhau(maSP,name,giaBan,soLuong,nhaSX,giaXK,quocgiaSX);
        xuatKhauArrayList.add(xuatKhau);
        write();

    }

    @Override
    public void removeXuatKhau() {
        System.out.println("nhap ma san pham can xoa");
        String maXP = scanner.nextLine();
        try {

            for (int i = 0; i < xuatKhauArrayList.size(); i++) {
                if (xuatKhauArrayList.get(i).getMaSP().equals(maXP)) {
                    System.out.println("ban co muon xoa khong?(1 yes 2 no)");
                    int op = scanner.nextInt();
                    if (op == 1) {
                        xuatKhauArrayList.remove(i);
                        System.out.println("ban da xoa thanh cong");
                    } else {
                        return;
                    }
                } else {
                    System.out.println("khong co san pham ban muon xoa");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + "quay lai menu chinh");
            scanner.nextLine();
        }
        write();
    }

    @Override
    public void searchXuatKhau() {
        System.out.println("nhap ten san pham nhap khau can tim kiem");
        String str = scanner.nextLine();

        ArrayList<XuatKhau> arrayList = new ArrayList<>();
        for (int i = 0; i < xuatKhauArrayList.size();i++){
            if(xuatKhauArrayList.get(i).getName().toLowerCase().contains(str.toLowerCase())){
                arrayList.add(xuatKhauArrayList.get(i));
            }
        }
        if(arrayList.size()== 0){
            System.out.println("khong co ten can tim");
        }else{
            for (XuatKhau xuatKhau : arrayList){
                System.out.println(xuatKhau);
            }
        }

    }

    @Override
    public void displayXuatKhau() {
        for (XuatKhau xuatKhau : xuatKhauArrayList){
            System.out.println(xuatKhau);
        }

    }
}
