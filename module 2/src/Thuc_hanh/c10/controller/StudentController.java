package Thuc_hanh.c10.controller;

import Thuc_hanh.c10.service.GiangVienService;
import Thuc_hanh.c10.service.HocVienservice;

import java.util.Scanner;

public class StudentController {
    public static void main(String[] args) {
        Codegym();
    }
    public static void Codegym(){
        int choose = 0;
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("-----Menu-----");
            System.out.println("1. CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN");
            System.out.println("2. CHƯƠNG TRÌNH QUẢN LÝ GIANG VIÊN");
            System.out.println("3. Thoát");
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai, vui long nhap lai");
            }
            switch (choose) {
                case 1:
                    displayStudentMenu();
                    break;
                case 2:
                    displayTeacherMenu();
                    break;
                case 3:
                    check = false;
                    break;
            }

        }
    }

    public static void displayStudentMenu() {
        HocVienservice hocVienservice = new HocVienservice();
        int choose = 0;
        boolean check = true;
        while (check) {
            System.out.println("-CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN –");
            System.out.println("1. Thêm mới học sinh");
            System.out.println("2. Xóa  học sinh");
            System.out.println("3. Xem danh sách học sinh ");
            System.out.println("4. Tìm kiếm  học sinh");
            System.out.println("5. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai vui lòng nhập lại");
            }
            switch (choose) {
                case 1:
                    hocVienservice.aadNewHocViien();
                    break;
                case 2:
                    hocVienservice.removeHocVien();
                    break;
                case 3:
                    hocVienservice.displayHocVien();
                    break;
                case 4:
                    hocVienservice.searchHocVien();
                    break;
                case 5:
                    check = false;
                    break;

            }
        }
    }

    public static void displayTeacherMenu() {
        GiangVienService giangVienService = new GiangVienService();
        int choose = 0;
        boolean check = true;
        while (check) {
            System.out.println("-CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN –");
            System.out.println("1. Thêm mới giang viên");
            System.out.println("2. Xóa  giang viên");
            System.out.println("3. Xem danh sách giang viên ");
            System.out.println("4. Tìm kiếm  giang viên");
            System.out.println("5. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai vui lòng nhập lại");
            }
            switch (choose) {
                case 1:
                    giangVienService.aadNewGiangViien();
                    break;
                case 2:
                    giangVienService.removeGiangVien();
                    break;
                case 3:
                    giangVienService.displayGiangVien();
                    break;
                case 4:
                    giangVienService.searchGiangVien();
                    break;
                case 5:
                    check = false;
                    break;

            }
        }
    }

}
