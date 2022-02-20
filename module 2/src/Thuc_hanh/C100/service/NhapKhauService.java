package Thuc_hanh.C100.service;

import Thuc_hanh.C100.modelr.NhapKhau;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NhapKhauService implements INhapKhau{
    private  static ArrayList<NhapKhau> nhapKhauArrayList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public void write(){
        try {
            FileWriter fileWriter = new FileWriter("src/Thuc_hanh/C100/data/nhapKhau.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (NhapKhau nhapKhau : nhapKhauArrayList){
                bufferedWriter.write(nhapKhau.getId()+","+nhapKhau.getMaSP()+","+nhapKhau.getName()+","+nhapKhau.getGiaBan()+","+nhapKhau.getSoLuong()+","+nhapKhau.getNhaSX()+","+nhapKhau.getGiaNK()+","+nhapKhau.getThueNK());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void aadNewNhapKhau() {
        System.out.println("nhập mã sản phẩm");
        String maSP = scanner.nextLine();
        while (!(maSP.matches("[S][P][0-9]{5}"))){
            System.out.println("hãy nhap lại mã sản phẩm");
            maSP = scanner.nextLine();
        }

        System.out.println("nhập tên sản phẩm");
        String name = scanner.nextLine();

        System.out.println("nhập giá bán");
        int giaBan = scanner.nextInt();
        while (giaBan < 0){
            System.out.println("nhập lại giá bán");
            giaBan = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("nhập số lượng sản phẩm");
        int soLuong = scanner.nextInt();
        while (soLuong < 0){
            System.out.println("nhập lại số lượng sản phẩm");
            soLuong = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("nhập nhà sản xuất");
        String nhaSX = scanner.nextLine();

        System.out.println("nhập giá nhập khẩu");
        int giaNK = scanner.nextInt();
        while (giaNK < 0){
            System.out.println("nhập lại giá nhập khẩu");
            giaNK = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("nhập tỉnh nhập khẩu sản phẩm");
        String tinhNK = scanner.nextLine();

        System.out.println("nhập thuế nhập khẩu");
        Double thueNK = scanner.nextDouble();
        while (thueNK < 0){
            System.out.println("nhập lại thuế nhập khẩu");
            thueNK = scanner.nextDouble();
        }
        scanner.nextLine();

        NhapKhau nhapKhau = new NhapKhau(maSP,name,giaBan,soLuong,nhaSX,giaNK,tinhNK,thueNK);
        nhapKhauArrayList.add(nhapKhau);
        write();


    }

    @Override
    public void removeNhapKhau() {
        System.out.println("nhập mã sản phẩm cần xoá");
        String maXP = scanner.nextLine();
        try {
            for (int i = 0; i < nhapKhauArrayList.size(); i++) {
                if (nhapKhauArrayList.get(i).getMaSP().equals(maXP)) {
                    System.out.println("bạn có muốn xoá không?(1 yes 2 no)");
                    int op = scanner.nextInt();
                    if (op == 1) {
                        nhapKhauArrayList.remove(i);
                        System.out.println("bạn đã xoá thành công");
                    } else {
                        return;
                    }
                } else {
                    System.out.println("không có sản phẩm muốn xoá");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + "quay lại menu chính");
            scanner.nextLine();
        }
        write();
    }
    @Override
    public void searchNhapKhau() {
        System.out.println("nhap ten san pham nhap khau can tim kiem");
        String str = scanner.nextLine();

        ArrayList<NhapKhau> arrayList = new ArrayList<>();
        for (int i = 0; i < nhapKhauArrayList.size();i++){
            if(nhapKhauArrayList.get(i).getName().toLowerCase().contains(str.toLowerCase())){
                arrayList.add(nhapKhauArrayList.get(i));
            }
        }
        if(arrayList.size()== 0){
            System.out.println("khong co ten can tim");
        }else{
            for (NhapKhau nhapKhau : arrayList){
                System.out.println(nhapKhau);
            }
        }

    }

    @Override
    public void displayNhapKhau() {
        for (NhapKhau nhapKhau:nhapKhauArrayList){
            System.out.println(nhapKhau);
        }
    }
}
