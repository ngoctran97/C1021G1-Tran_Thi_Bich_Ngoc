package CaseStudy.Task1.controller;

import CaseStudy.Task1.service.CustomerService;
import CaseStudy.Task1.service.sevempl.CustomerServiceImpl;
import CaseStudy.Task1.service.sevempl.EmployeeServiceImpl;
import CaseStudy.Task1.service.sevempl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        int choose = 0;
        boolean check = true;
        while (check) {
            System.out.println("---DisplayMainMenu---");
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            Scanner scanner = new Scanner(System.in);
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai, vui long nhap lai");
            }
            switch (choose) {
                case 1:
                    displayListEmployees();
                    break;
                case 2:
                    displaylistcustomers();
                    break;
                case 3:
                    displaylistfacility();
                    break;
                case 4:
                    Displaylistbooking();
                    break;
                case 5:
                    displayListCustomers();
                    break;
                case 6:
                    check = false;
                    break;

            }
        }
    }

    public static void displayListEmployees() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        int choose = 0;
        boolean check = true;
        while (check) {
            System.out.println("----DisplayListEmployees----");
            System.out.println("1.Display list employees");
            System.out.println("2.Add new employee");
            System.out.println("3.Edit employee");
            System.out.println("4.create employee from file emloyee.csv");
            System.out.println("5.Return main menu");
            Scanner scanner = new Scanner(System.in);
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai, vui long nhap lai");
            }
            switch (choose) {
                case 1:
                    employeeService.displayListEmployees();
                    break;
                case 2:
                    employeeService.addNewEmployee();
                    break;
                case 3:
                    employeeService.editEmployee();
                    break;
                case 4:
                    employeeService.createEmloyeeFormFile("/Users/tranvantrong/Documents/C1021G1-Tran_Thi_Bich_Ngoc/module 2/src/CaseStudy/Task1/data/employee.csv");
                    break;
                case 5:
                    check = false;
                    break;
            }
        }
    }

    public static void displaylistcustomers() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        int choose = 0;
        boolean check = true;
        while (check) {
            System.out.println("---Display list customers---");
            System.out.println("1.Display list customers");
            System.out.println("2.Add new customers");
            System.out.println("3.Edit customers");
            System.out.println("4.Return main menu");
            Scanner scanner = new Scanner(System.in);
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai, vui long nhap lai");
            }
            switch (choose) {
                case 1:
                    customerService.displayListCustomer();
                    break;
                case 2:
                    customerService.addNewCustomer();
                    break;
                case 3:
                    customerService.editCustomer();
                    break;
                case 4:
                    check = false;
                    break;
            }
        }
    }

    public static void displaylistfacility() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        int choose = 0;
        boolean check = true;
        while (check) {
            System.out.println("----displaylistfacility----");
            System.out.println("1.Display list facility");
            System.out.println("2.Add new facility");
            System.out.println("3.Edit facility");
            System.out.println("4.Return main menu");
            Scanner scanner = new Scanner(System.in);
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai, vui long nhap lai");
            }
            switch (choose) {
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    addNewFacilityMenu();
                    break;
                case 3:
                    facilityService.displayMaintain();
                    break;
                case 4:
                    check = false;
                    break;
            }
        }
    }

    public static void addNewFacilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        int choose = 0;
        boolean check = true;
        while (check) {
            System.out.println("1.Add new villa");
            System.out.println("2.Add new house");
            System.out.println("2.Add new room");
            System.out.println("4.Return main menu");
            Scanner scanner = new Scanner(System.in);
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai, vui long nhap lai");
            }
            switch (choose) {
                case 1:
                    facilityService.addNewVilla();
                    break;
                case 2:
                    facilityService.addNewHouse();
                    break;
                case 3:
                    facilityService.addNewRoom();
                    break;
                case 4:
                    check = false;
                    break;
            }
        }
    }

    public static void Displaylistbooking() {
        boolean cheeck = true;
        while (cheeck) {
            System.out.println("---Display list booking---");
            System.out.println("1.Add new booking");
            System.out.println("2.Display list booking");
            System.out.println("3.Create new constracts");
            System.out.println("4.Display list contracts");
            System.out.println("5.Edit contracts");
            System.out.println("6.Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                case 6:
                    displayMainMenu();
                    break;

            }
        }
    }

    public static void displayListCustomers() {
        int choose = 0;
        boolean check = true;
        while (check) {
            System.out.println("---displayListCustomers---");
            System.out.println("1.Display list customers use service");
            System.out.println("2.Display list customers get voucher");
            System.out.println("3.Return main menu");
            Scanner scanner = new Scanner(System.in);
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai, vui long nhap lai");
            }
            switch (choose) {
                case 1:
                    displayMainMenu();
                    break;
                case 3:
                    check = false;
                    break;

            }
        }
    }
}



