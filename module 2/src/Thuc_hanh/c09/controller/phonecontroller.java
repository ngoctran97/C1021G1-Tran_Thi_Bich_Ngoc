package Thuc_hanh.c09.controller;

import Thuc_hanh.c09.service.PhoneService;

import java.util.Scanner;

public class phonecontroller {
        static PhoneService iPhoneService;
        public static void main(String[] args) {
                iPhoneService = new PhoneService();
                displayMainMenu();
        }

        public static void displayMainMenu() {
                int choose = 0;
                boolean check = true;
                while (check) {
                        System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI---");
                        System.out.println("1. Thêm mới");
                        System.out.println("2. Xoá");
                        System.out.println("3. Xem danh sách điện thoại");
                        System.out.println("4. Tìm kiếm");
                        System.out.println("5. Thoát");
                        Scanner scanner = new Scanner(System.in);
                        try {
                                choose = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                                System.out.println("Nhập sai vui lòng nhập lại");
                        }
                        switch (choose) {
                                case 1:
                                        aadNewPhone();
                                        break;
                                case 2:
                                        iPhoneService.xoa();
                                        break;
                                case 3:
                                        iPhoneService.xemDanhSach();
                                        break;
                                case 4:
                                        iPhoneService.timKiem();
                                        break;
                                case 5:
                                        check = false;
                                        break;

                        }
                }
        }

        public static void aadNewPhone() {
                int choose = 0;
                Scanner scanner = new Scanner(System.in);
                boolean check = true;
                while (check) {
                        System.out.println("-----Menu-----");
                        System.out.println("1. Thêm mới điện thoại chính hảng");
                        System.out.println("2. Thêm mới điện thoại xách tay");
                        System.out.println("3. Thoát");
                        try {
                                choose = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                                System.out.println("Nhap sai, vui long nhap lai");
                        }
                        switch (choose) {
                                case 1:
                                        iPhoneService.addNewChinhHang();
                                        break;
                                case 2:
                                        iPhoneService.addnewXachTay();
                                        break;
                                case 3:
                                        check = false;
                                        break;
                        }

                }
        }

}