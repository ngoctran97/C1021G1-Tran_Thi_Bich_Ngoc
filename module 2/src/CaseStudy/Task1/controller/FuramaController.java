package CaseStudy.Task1.controller;

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
                    System.exit(0);
                    break;

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
                case 1:
                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
        }
    }

    public static void displaylistcustomers(){
        boolean cheeck = true;
        while (cheeck){
            System.out.println("---Display list customers---");
            System.out.println("1.Display list customers");
            System.out.println("2.Add new customers");
            System.out.println("3.Edit customers");
            System.out.println("4.Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:
                    displaylistcustomers();
                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
        }
    }

    public static void displaylistfacility() {
        boolean cheeck = true;
        while (cheeck) {
            System.out.println("----displaylistfacility----");
            System.out.println("1.Display list facility");
            System.out.println("2.Add new facility");
            System.out.println("3.Edit facility");
            System.out.println("4.Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                case 4:
                    displayMainMenu();
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
            switch (scanner.nextInt()){
                case 1:
                case 6:
                    displayMainMenu();
                    break;

            }
        }
    }

    public static void displayListCustomers() {
        boolean cheeck = true;
        while (cheeck) {
            System.out.println("---displayListCustomers---");
            System.out.println("1.Display list customers use service");
            System.out.println("2.Display list customers get voucher");
            System.out.println("3.Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:
                case 3:
                    displayMainMenu();
                    break;

            }
        }
    }


}



