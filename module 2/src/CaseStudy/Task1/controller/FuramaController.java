package CaseStudy.Task1.controller;

import CaseStudy.Task1.service.FacilityService;
import CaseStudy.Task1.service.FuramaService;
import CaseStudy.Task1.service.IFuramaService;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        boolean cheeck = true;
        while (cheeck) {
            System.out.println("---DisplayMainMenu---");
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    displayListEmployees();
                    break;
                }
            }
        }
    }

    public static void displayListEmployees() {
        boolean cheeck = true;
        while (cheeck) {
            System.out.println("----DisplayListEmployees----");
            System.out.println("1.Display list employees");
            System.out.println("2.Add new employee");
            System.out.println("3.Edit employee");
            System.out.println("4.Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {

                    break;
                }
            }
        }
    }
}
//                        int choose1 = Integer.parseInt(scanner.nextLine());
////                        switch (choose1){
////                            case 1:
////                                iFuramaService.displayListEmployees();
////                                break;
////                            case 2:
////                                iFuramaService.addNewEmployee();
////                                break;
////                            case 3:
////                                iFuramaService.editEmployee();
////                                break;
////                            case 4:
////                                iFuramaService.returnMainMenu();
////                                break;
////                        }
//                   }while (true);
//                case 2:
//                    do {
//                        System.out.println("1.Display list customers");
//                        System.out.println("2.Add new customers");
//                        System.out.println("3.Edit customers");
//                        System.out.println("4.Return main menu");
//                        int choose2 = Integer.parseInt(scanner.nextLine());
////                        switch (choose2){
////                            case 1:
////                                IFuramaService.displayListCustomers();
////                                break;
////                            case 2:
////                                IFuramaService.addNewCustomers();
////                                break;
////                            case 3:
////                                IFuramaService.editCustomers();
////                                break;
////                            case 4:
////                                IFuramaService.returnMainMenu();
////                                break;
////                        }
//                   }while (true);
//
//                case 3:
//                    do {
//                        System.out.println("1.Display list facility");
//                        System.out.println("2.Add new facility");
//                        System.out.println("3.Edit facility");
//                        System.out.println("4.Return main menu");
//                        int choose3 = Integer.parseInt(scanner.nextLine());
////                        switch (choose3){
////                            case 1:
////                                IFuramaService.displayListFacility();
////                                break;
////                            case 2:
////                                IFuramaService.addNewFacility();
////                                break;
////                            case 3:
////                                IFuramaService.editFacility();
////                                break;
////                            case 4:
////                                IFuramaService.returnMainMenu();
////                                break;
////                        }
//                    }while (true);
//                case 4:
//                    do {
//                        System.out.println("1.Add new booking");
//                        System.out.println("2.Display list booking");
//                        System.out.println("3.Create new constracts");
//                        System.out.println("4.Display list contracts");
//                        System.out.println("5.Edit contracts");
//                        System.out.println("6.Return main menu");
//                        int choose4 = Integer.parseInt(scanner.nextLine());
// //                       switch (choose4){
////                            case 1:
////                                IFuramaService.addNewBooking();
////                                break;
////                            case 2:
////                                IFuramaService.displayListBooking();
////                                break;
////                            case 3:
////                                Service.createNewConstracts();
////                                break;
////                            case 4:
////                                Service.displayListContracts();
////                                break;
////                            case 5:
////                                Service.editContracts();
////                                break;
////                            case 6:
////                                Service.returnMainMenu();
////                                break;
////                        }
//                    }while (true);
//                case 5:
//                    do {
//                        System.out.println("1.Display list customers use service");
//                        System.out.println("2.Display list customers get voucher");
//                        System.out.println("3.Return main menu");
//                        int choose5 = Integer.parseInt(scanner.nextLine());
////                        switch (choose5){
////                            case 1:
////                                Service.displayListCustomersUseService();
////                                break;
////                            case 2:
////                                Service.displayListCustomersGetService();
////                                break;
////                            case 3:
////                                Service.returnMainMenu();
////                                break;
////                        }
//
//                    }while (true);
//            }
//        }while (true);
//    }


