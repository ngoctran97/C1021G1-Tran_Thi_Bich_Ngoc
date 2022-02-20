package Thuc_hanh.c09.service;

import Thuc_hanh.c09.medellr.DtChinhHang;
import Thuc_hanh.c09.medellr.Phone;
import Thuc_hanh.c09.medellr.DtXachTay;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class PhoneService implements IPhoneService {
    ArrayList<Phone> phoneList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    static  int id = 1;

    public PhoneService(){
        readerfile();
    }

    public void readerfile(){
        try{
            FileInputStream filetream = new FileInputStream("src/Thuc_hanh/c09/data/phone.csv");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(filetream));

            String strLine;

            while ((strLine = bufferedReader.readLine())!= null){
                System.out.println(strLine);
                String data[] = strLine.split(",");
                int hanbaohanh;
                try {
                    hanbaohanh = Integer.parseInt(data[5]);
                }
                catch (Exception e) {
                    hanbaohanh = -1;
                }
                Phone newphone;
                if( hanbaohanh == -1) {
                    newphone = new DtXachTay(data[1], Double.parseDouble(data[2]), Integer.parseInt(data[3]), data[4], data[5], data[6]);
                }
                else
                    newphone = new DtChinhHang(data[1], Double.parseDouble(data[2]), Integer.parseInt(data[3]),data[4],hanbaohanh,data[6] );
                id++;
                phoneList.add(newphone);
            }
            filetream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writefile(){
        try {
            FileWriter fileWriterDtChinhHang = new FileWriter("src/Thuc_hanh/c09/data/phone.csv", false);
            BufferedWriter bufferedWriterDtChinhHang = new BufferedWriter(fileWriterDtChinhHang);

            for (Phone phone :phoneList){
                bufferedWriterDtChinhHang.write(phone.toString()+"\n");
            }
            bufferedWriterDtChinhHang.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void xoa() {
        System.out.println("Nhập ID muốn xoá");
        int id = scanner.nextInt();
        int pos = -1;
        try {
            for (int i = 0; i < phoneList.size(); i++) {
                if (phoneList.get(i).getId() == id) {
                    pos = i;
                }
            }
            if(id == -1){
                Exception NotFoundProductException = new Exception("ID điện thoại không tồn tại.");
                throw NotFoundProductException;
            }
            System.out.print("Bạn có muốn xoá không? (1 Yes - 2 No):");
            int op = scanner.nextInt();
            if (op == 1) {
                phoneList.remove(pos);
            }else {
                return;
            }
        }
        catch (Exception x) {
            System.out.print(x.getMessage() + " Nhan Enter de quay lai mmen chinh.");
            scanner.nextLine();
        }
        writefile();
        xemDanhSach();
    }


    @Override
    public void xemDanhSach() {
        for (Phone phone: phoneList){
            System.out.println(phone.toString());
        }

    }

    @Override
    public void timKiem() {
        System.out.println("Nhập tên điện thoại cần tìm");
        String strPhone = scanner.nextLine();

        ArrayList<Phone> arrayList= new ArrayList<>();
        for (int i = 0; i < phoneList.size();i++){
            if(phoneList.get(i).getName().toLowerCase().contains(strPhone.toLowerCase())){
                arrayList.add(phoneList.get(i));
            }
        }
        if (arrayList.size()== 0){
            System.out.println("Không có sản phẩm");

        }else {
            for (Phone phone : arrayList){
                System.out.println(phone);
            }
        }
    }

    @Override
    public void addnewXachTay() {
        System.out.println("Nhập tên điện thoại");
        String name = scanner.nextLine();

        System.out.println("Nhập giá bán");
        double giaBan = scanner.nextDouble();
        while (giaBan < 0){
            System.out.println("Nhập lại giá bán");
            giaBan = scanner.nextDouble();
        }
        scanner.nextLine();

        System.out.println("Nhập số lượng");
        int soLuong = scanner.nextInt();
        while (soLuong < 0){
            System.out.println("NHập lại số lương");
            soLuong = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("Nhà sản xuất");
        String nhasx = scanner.nextLine();

        System.out.println("Nhập quôcs gia sách tay");
        String quocGia = scanner.nextLine();
        while (quocGia.toLowerCase().contains("viet nam")){
            System.out.println("quốc gia xách tay không được là Việt Nam. Hãy nhập lại");
            quocGia = scanner.nextLine();
        }

        System.out.println("Trạng thái điện thoại");
        String trangThai = scanner.nextLine();

        Phone phone = new DtXachTay(name,giaBan, soLuong, nhasx, quocGia, trangThai);
        phoneList.add(phone);
        writefile();

    }

    @Override
    public void addNewChinhHang() {
        System.out.println("Nhập tên điện thoại");
        String name = scanner.nextLine();

        System.out.println("Nhập gía bán");
        double giaBan = scanner.nextDouble();
        while (giaBan < 0){
            System.out.println("Nhập lại giá bán");
            giaBan = scanner.nextDouble();
        }
        scanner.nextLine();

        System.out.println("Nhập số lượng");
        int soLuong = scanner.nextInt();
        while (soLuong < 0){
            System.out.println("NHập lại số lượng điệ thoại");
            soLuong = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("Nhà sản xuất");
        String nhasx = scanner.nextLine();

        System.out.println("Thời gian bảo hành");
        int thoiGian = scanner.nextInt();
        while (thoiGian < 0 || thoiGian > 730){
            System.out.println("thời gian bao hành chỉ trong vòng 2 năm");
            thoiGian = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("Phạm vì bảo hành trong nước hoặc quốc tế");
        String baoHanh = scanner.nextLine();

        Phone phone = new DtChinhHang(name, giaBan, soLuong, nhasx, thoiGian, baoHanh);
        phoneList.add(phone);
        writefile();
    }
}
