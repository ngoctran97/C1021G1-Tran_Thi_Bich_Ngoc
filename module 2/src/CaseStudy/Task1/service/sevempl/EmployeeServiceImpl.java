package CaseStudy.Task1.service.sevempl;

import CaseStudy.Task1.modell.Person.Employee.Employee;
import CaseStudy.Task1.service.EmployeeService;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void displayListEmployees() {

    }

    @Override
    public void addNewEmployee() {
        System.out.println("nhap id");
        String mnv = scanner.nextLine();

        System.out.println("nhap ten khach hang");
        String name = scanner.nextLine();

        System.out.println("nhap ngay thang nam sinh");
        String birth = scanner.nextLine();

        System.out.println("nhap gioi tinh");
        String gender = scanner.nextLine();

        System.out.println("nhap CMNN");
        String cmnn = scanner.nextLine();

        System.out.println("nhap SDT");
        String sdt = scanner.nextLine();

        System.out.println("nhap Emaile");
        String emaile = scanner.nextLine();

        System.out.println("trinh do nhan vien");
        System.out.println("1. Trung cap");
        System.out.println("2. Cao Dang");
        System.out.println("3. Dai hoc");
        System.out.println("3. Sau dai hoc");
        String level = "";
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                level = "Trung cap";
                break;
            case 2:
                level = " Cao Dang";
                break;
            case 3:
                level = " Dai Hoc";
                break;
            case 4:
                level = "Sau Dai Hoc";
                break;
        }

        System.out.println("vi tri nhan vien");
        System.out.println("1. Le tan");
        System.out.println("2. Phuc vu");
        System.out.println("3. Chuyen vien");
        System.out.println("4. Giam sat");
        System.out.println("5. Quan ly");
        System.out.println("6. Giam doc");
        String position = " ";
        choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                position = "Le Tan";
                break;
            case 2:
                position = "Phuc vu";
                break;
            case 3:
                position = "Chuyen vien";
                break;
            case 4:
                position = "Giam sat";
                break;
            case 5:
                position = "Quan ly";
                break;
            case 6:
                position = "Giam do";
                break;
        }

        System.out.println("nhap luong");
        String wage = scanner.nextLine();

    }

    @Override
    public void editEmployee() {

    }

    @Override
    public void returnMainMenu() {

    }
}
