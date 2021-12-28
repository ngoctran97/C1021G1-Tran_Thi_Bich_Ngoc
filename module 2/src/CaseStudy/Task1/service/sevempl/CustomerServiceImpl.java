package CaseStudy.Task1.service.sevempl;

import CaseStudy.Task1.modell.Person.Customer.Customer;
import CaseStudy.Task1.service.CustomerService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public  void write(){
        try {
            FileWriter fileWriter = new FileWriter("/Users/tranvantrong/Documents/C1021G1-Tran_Thi_Bich_Ngoc/module 2/src/CaseStudy/Task1/data/customer.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer : customerList){
                bufferedWriter.write(customer.getId()+","+customer.getName()+","+customer.getGender()+","+customer.getCmnn()+","+customer.getPhone()
                        +","+customer.getEmail()+","+customer.getTypeOfGuest()+","+customer.getAddress()+"\n");

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void displayListCustomer() {
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }

    }

    @Override
    public void addNewCustomer() {

        System.out.println("input name");
        String name = scanner.nextLine();

        String birth;
        do {
            System.out.println("input birth");
            birth = scanner.nextLine();
        }while (!Pattern.matches("(((0[1-9]|[12][0-9]|30)[-\\/](0[13-9]|1[012])|31[-\\/]" +
                "(0[13578]|1[02])|(0[1-9]|1[0-9]|2[0-8])[-\\/]02)" +
                "[-\\/](19[0-9]{2}|200[012])|29[-\\/]02[-\\/]" +
                "([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$",birth));

        System.out.println("1.Nam");
        System.out.println("2.Nữ");
        System.out.println("3.Khac");
        String gender = " ";
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                gender = "Nam";
                break;
            case 2:
                gender = "Nữ";
                break;
            case 3:
                gender = "Khac";
                break;
        }

        String numberID;
        do {
            System.out.println("input numberID");
            numberID = scanner.nextLine();
        } while (!Pattern.matches("^[0-9]{9}$", numberID));

        String phone;
        do {
            System.out.println("input phone");
            phone = scanner.nextLine();
        } while (!Pattern.matches("^0[0-9]{9}", phone));
        String emaile;
        do {
            System.out.println("input Emaile");
            emaile = scanner.nextLine();
        } while (!Pattern.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$", emaile));

        System.out.println("-----Customer-----");
        System.out.println("1. Diamond");
        System.out.println("2. Platinium");
        System.out.println("3. Gold");
        System.out.println("4. Silver");
        System.out.println("5. Member");
        String typeOfGuest = " ";
        int choose1 = Integer.parseInt(scanner.nextLine());
        switch (choose1) {
            case 1:
                typeOfGuest = "Diamond";
                break;
            case 2:
                typeOfGuest = "Platinium";
                break;
            case 3:
                typeOfGuest = "Gold";
                break;
            case 4:
                typeOfGuest = "Silver";
                break;
            case 5:
                typeOfGuest = "Member";
                break;
        }

        System.out.println("input address");
        String address = scanner.nextLine();

        Customer customer = new Customer( name, birth, gender, numberID, phone, emaile, typeOfGuest, address);
        customerList.add(customer);
        write();
    }

    @Override
    public void editCustomer() {
        System.out.println("input id");
        int iedit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == iedit) {
                System.out.println(customerList.get(i).toString());
                int choose;
                do {
                    System.out.println("---Edit customer information---");
                    System.out.println("1. input new name");
                    System.out.println("2. input new birth");
                    System.out.println("3. input new gender");
                    System.out.println("4. input new numberID");
                    System.out.println("5. input new phone number");
                    System.out.println("6. input new email");
                    System.out.println("7. input new typeOfGuest");
                    System.out.println("8. input new address");
                    System.out.println("9. Exit");
                    choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            System.out.println("input new name");
                            String editname = scanner.nextLine();
                            customerList.get(i).setName(editname);
                            break;
                        case 2:
                            String birth;
                            do {
                                System.out.println("input birth");
                                birth = scanner.nextLine();
                            }while (!Pattern.matches("(((0[1-9]|[12][0-9]|30)[-\\/](0[13-9]|1[012])|31[-\\/]" +
                                    "(0[13578]|1[02])|(0[1-9]|1[0-9]|2[0-8])[-\\/]02)" +
                                    "[-\\/](19[0-9]{2}|200[012])|29[-\\/]02[-\\/]" +
                                    "([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$",birth));
                            break;
                        case 3:
                            System.out.println("1.Nam");
                            System.out.println("2.Nữ");
                            System.out.println("3.Khac");
                            String gender = " ";
                            choose = Integer.parseInt(scanner.nextLine());
                            switch (choose) {
                                case 1:
                                    gender = "Nam";
                                    break;
                                case 2:
                                    gender = "Nữ";
                                    break;
                                case 3:
                                    gender = "Khac";
                                    break;
                            }
                            break;
                        case 4:
                            String numberID;
                            do {
                                System.out.println("input numberID");
                                numberID = scanner.nextLine();
                            } while (!Pattern.matches("^[0-9]{9}$", numberID));
                            break;
                        case 5:
                            String phone;
                            do {
                                System.out.println("input phone");
                                phone = scanner.nextLine();
                            } while (!Pattern.matches("^0[0-9]{9}", phone));
                            break;
                        case 6:
                            String emaile;
                            do {
                                System.out.println("input Emaile");
                                emaile = scanner.nextLine();
                            } while (!Pattern.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$", emaile));
                            break;
                        case 7:
                            System.out.println("-----Customer-----");
                            System.out.println("1. Diamond");
                            System.out.println("2. Platinium");
                            System.out.println("3. Gold");
                            System.out.println("4. Silver");
                            System.out.println("5. Member");
                            String typeOfGuest = " ";
                            int choose1 = Integer.parseInt(scanner.nextLine());
                            switch (choose1) {
                                case 1:
                                    typeOfGuest = "Diamond";
                                    break;
                                case 2:
                                    typeOfGuest = "Platinium";
                                    break;
                                case 3:
                                    typeOfGuest = "Gold";
                                    break;
                                case 4:
                                    typeOfGuest = "Silver";
                                    break;
                                case 5:
                                    typeOfGuest = "Member";
                                    break;
                            }
                            break;
                        case 8:
                            System.out.println("input new position");
                            String editaddress = scanner.nextLine();
                            customerList.get(i).setAddress(editaddress);
                            break;
                        case 9:
                            break;
                    }
                } while (choose != 9);
            }
        }
    }

    @Override
    public void returnMainMenu() {


    }
}

