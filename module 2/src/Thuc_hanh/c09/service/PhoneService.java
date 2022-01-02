package Thuc_hanh.c09.service;

import CaseStudy.Task1.modell.Person.Employee.Employee;
import Thuc_hanh.c09.medellr.DtChinhHang;
import Thuc_hanh.c09.medellr.Phone;
import Thuc_hanh.c09.medellr.dtXachTay;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class PhoneService implements IPhoneService {
    ArrayList<Phone> phoneList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

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

        Phone phone = new dtXachTay(name,giaBan, soLuong, nhasx, quocGia, trangThai);
        phoneList.add(phone);


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
    }
}
