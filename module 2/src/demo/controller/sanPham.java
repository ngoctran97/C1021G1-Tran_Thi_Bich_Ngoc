package demo.controller;

import Thuc_hanh.C100.service.NhapKhauService;
import Thuc_hanh.C100.service.XuatKhauService;

import java.util.Scanner;

public class sanPham {
    public static void main(String[] args) {
        SanPham();
    }
    public static void SanPham(){
        int choose = 0;
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check){
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM");
            System.out.println("1. CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM NHẬP KHẨU");
            System.out.println("2. CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM XUẤT KHẨU");
            System.out.println("3. THOÁT");
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai, vui long nhap lai");
            }
            switch (choose) {
                case 1:
                    displayNhapKhauMenu();
                    break;
                case 2:
                    displayXuatKhauMenu();
                    break;
                case 3:
                    check = false;
                    break;
            }
        }
    }
    public static void displayNhapKhauMenu() {
        NhapKhauService nhapKhauService = new NhapKhauService();
        int choose = 0;
        boolean check = true;
        while (check) {
            System.out.println("-CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM NHẬP KHẨU–");
            System.out.println("1. Thêm mới sản phẩm nhập khẩu");
            System.out.println("2. Xóa sản phẩm nhập khẩu");
            System.out.println("3. Tìm kiếm sản phẩm nhập khẩu");
            System.out.println("4. Xem sản phẩm nhập khẩu");
            System.out.println("5. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai vui lòng nhập lại");
            }
            switch (choose) {
                case 1:
                    nhapKhauService.aadNewNhapKhau();
                    break;
                case 2:
                    nhapKhauService.removeNhapKhau();
                    break;
                case 3:
                    nhapKhauService.searchNhapKhau();
                    break;
                case 4:
                    nhapKhauService.displayNhapKhau();
                    break;
                case 5:
                    check = false;
                    break;

            }
        }
    }

    public static void displayXuatKhauMenu() {
        XuatKhauService xuatKhauService = new XuatKhauService();
        int choose = 0;
        boolean check = true;
        while (check) {
            System.out.println("-CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM XUẤT KHẨU–");
            System.out.println("1. Thêm mới sản phẩm xuất khẩu");
            System.out.println("2. Xóa sản phẩm xuất khẩu");
            System.out.println("3. Tìm kiếm sản phẩm xuất khẩu");
            System.out.println("4. Xem sản phẩm xuất khẩu");
            System.out.println("5. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai vui lòng nhập lại");
            }
            switch (choose) {
                case 1:
                    xuatKhauService.aadNewXuatKhau();
                    break;
                case 2:
                    xuatKhauService.displayXuatKhau();
                    break;
                case 3:
                    xuatKhauService.searchXuatKhau();
                    break;
                case 4:
                    xuatKhauService.displayXuatKhau();
                    break;
                case 5:
                    check = false;
                    break;

            }
        }
    }
}
