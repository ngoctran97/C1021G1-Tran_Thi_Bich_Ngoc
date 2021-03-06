package CaseStudy.Task1.service.sevempl;

import CaseStudy.Task1.modell.Person.Employee.Employee;
import CaseStudy.Task1.service.EmployeeService;
import CaseStudy.Task1.service.Service;
import ss15_Debug.Exercise.IllegalTriangleException;


import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    static  int id = 1;

    public void createEmloyeeFormFile(String path) {
        try {
        // Mo file
        FileInputStream fstream = new FileInputStream(path);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;
        boolean readheader = true;

        //doc tung dong mot tu file

        while ((strLine = br.readLine()) != null)   {
            //bo qua, khong doc cac ten code (header)
            if(readheader) {
                readheader = false;
                continue;
            }
            // in du lieu ra man hinh
            System.out.println (strLine);

            //Chuyen du lieu thanh mot mang
            String data[] = strLine.split(",");
            // tao employee tu mang
            Employee employee = new Employee( data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8], Integer.parseInt(data[9]));
            id++;
            //them employee vao danh dach
            employeeList.add(employee);
        }
        //dong file
        fstream.close();
        }
        catch  (IOException e) {
        }
    }

    public void write(){
        try {
            FileWriter fileWriter = new FileWriter("/Users/tranvantrong/Documents/C1021G1-Tran_Thi_Bich_Ngoc/module 2/src/CaseStudy/Task1/data/employee.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Employee employee: employeeList){
                bufferedWriter.write(employee.getId()+ ","+employee.getName()+"," + employee.getBirth()+","+employee.getGender()+","+employee.getCmnn()+","
                        +employee.getPhone()+","+employee.getEmail()+","+employee.getLever()+","+employee.getPosition()+","+employee.getWage()+"\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void displayListEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }


    }

    @Override
    public void addNewEmployee() {
//        System.out.println("input id");
//        int id = scanner.nextInt();
//        scanner.nextLine();

        System.out.println("input name");
        String name = scanner.nextLine();

        String birth;
        do {
            System.out.println("input birth");
            birth = scanner.nextLine();
        } while (!Pattern.matches("(((0[1-9]|[12][0-9]|30)[-\\/](0[13-9]|1[012])|31[-\\/](0[13578]|1[02])|(0[1-9]|1[0-9]|2[0-8])[-\\/]02)" +
                "[-\\/](19[0-9]{2}|200[012])|29[-\\/]02[-\\/]" +
                "([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$", birth));


        System.out.println("1.Nam");
        System.out.println("2.N???");
        System.out.println("3.Khac");
        String gender = " ";
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                gender = "Nam";
                break;
            case 2:
                gender = "N???";
                break;
            case 3:
                gender = "Khac";
                break;
        }

        String cmnn;
        do {
            System.out.println("input numberID");
            cmnn = scanner.nextLine();
        } while (!Pattern.matches("^[0-9]{9}$", cmnn));

        String sdt;
        do {
            System.out.println("input phone");
            sdt = scanner.nextLine();
        } while (!Pattern.matches("^0[0-9]{9}", sdt));
        String emaile;
        do {
            System.out.println("input Emaile");
            emaile = scanner.nextLine();
        } while (!Pattern.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$", emaile));


        System.out.println("trinh do nhan vien");
        System.out.println("1. Trung cap");
        System.out.println("2. Cao Dang");
        System.out.println("3. Dai hoc");
        System.out.println("3. Sau dai hoc");
        String level = "";
        int choose1 = Integer.parseInt(scanner.nextLine());
        switch (choose1) {
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
        switch (choose) {
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
        int wage;
        do {
            try {
                wage = scanner.nextInt();
                if(wage < 0)
                    System.out.println("nhap lai luong");
            } catch (Exception e) {
                System.out.println("nhap khong dung "+e.getMessage());
                scanner.nextLine();
                wage = -1 ;
            }
        }while (wage < 0);




        Employee employee = new Employee(name, birth, gender, cmnn, sdt, emaile, level, position, wage);
        employeeList.add(employee);
        write();

    }

    @Override
    public void editEmployee() {
        System.out.println("input id");
        int iedit = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < employeeList.size();i++){
            if(employeeList.get(i).getId()== iedit){
                System.out.println(employeeList.get(i).toString());
                int choose;
                do {
                    System.out.println("---Edit employee information---");
                    System.out.println("1. input new name");
                    System.out.println("2. input new birth");
                    System.out.println("3. input new gender");
                    System.out.println("4. input new numberID");
                    System.out.println("5. input new phone number");
                    System.out.println("6. input new email");
                    System.out.println("7. input new lever");
                    System.out.println("8. input new position");
                    System.out.println("9. input new salary");
                    System.out.println("10. Exit");
                    choose = Integer.parseInt(scanner.nextLine());
                    switch (choose){
                        case 1:
                            System.out.println("input new name");
                            String editname = scanner.nextLine();
                            employeeList.get(i).setName(editname);
                            break;
                        case 2:
                            System.out.println("input new birthday");
                            String editbirth = scanner.nextLine();
                            employeeList.get(i).setName(editbirth);
                            break;
                        case 3:
                            System.out.println("input new gender");
                            String editgender = scanner.nextLine();
                            employeeList.get(i).setGender(editgender);
                            break;
                        case 4:
                            String cmnn;
                            do {
                                System.out.println("input numberID");
                                cmnn = scanner.nextLine();
                            } while (!Pattern.matches("^[0-9]{9}$", cmnn));
                            break;
                        case 5:
                            String sdt;
                            do {
                                System.out.println("input phone");
                                sdt = scanner.nextLine();
                            } while (!Pattern.matches("^0[0-9]{9}", sdt));
                            break;
                        case 6:
                            String emaile;
                            do {
                                System.out.println("input Emaile");
                                emaile = scanner.nextLine();
                            } while (!Pattern.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$", emaile));
                            break;
                        case 7:
                            System.out.println("input new lever");
                            String editlever = scanner.nextLine();
                            employeeList.get(i).setLever(editlever);
                            break;
                        case 8:
                            System.out.println("input new position");
                            String editposition = scanner.nextLine();
                            employeeList.get(i).setPosition(editposition);
                            break;
                        case 9:
                            System.out.println("input new wage");
                            int editwage = scanner.nextInt();
                            employeeList.get(i).setWage(editwage);
                            break;
                        case 10:
                            break;
                    }

                }while (choose != 10);

            }
        }
    }

    @Override
    public void returnMainMenu() {

    }


}
