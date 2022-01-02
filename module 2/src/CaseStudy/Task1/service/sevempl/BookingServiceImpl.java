package CaseStudy.Task1.service.sevempl;

import CaseStudy.Task1.modell.Booking;
import CaseStudy.Task1.modell.Facility.Facility;
import CaseStudy.Task1.modell.Facility.House.House;
import CaseStudy.Task1.modell.Facility.Room.Room;
import CaseStudy.Task1.modell.Facility.Villa.Villa;
import CaseStudy.Task1.modell.Person.Customer.Customer;
import CaseStudy.Task1.service.BookingService;

import java.io.*;
import java.util.*;

public class BookingServiceImpl implements BookingService {
    static  int id = 1;
    Scanner scanner = new Scanner(System.in);
    static TreeSet<Booking> bookingSet = new TreeSet<>() ;
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static {
        //ReaderCustomer();
        facilityIntegerMap.put(new Villa("SVVL-1234","Villa",35,50,
                12,"Asdf","Afh",35,12),0);
        facilityIntegerMap.put(new House("SVHO-1234","House",30,30,
                30,"Thuong","Tdvgwgd",12),0);
        facilityIntegerMap.put(new Room("SVRO-4444","Room",30,
                45,20,"uuiyioo","ewfaef"),0);
    }

    public static void ReaderCustomer(){
        try {
            FileReader fileReader = new FileReader(new File("/Users/tranvantrong/Documents/C1021G1-Tran_Thi_Bich_Ngoc/module 2/src/CaseStudy/Task1/data/customer.csv"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String Data = null;
            while ((Data = bufferedReader.readLine()) != null){
                String[] dataArray = Data.split(",");
                //System.out.println(Data);

                //System.out.println(dataArray[3]);
               Customer customer = new Customer(dataArray[1],dataArray[2],dataArray[3],dataArray[4],dataArray[5],dataArray[6],dataArray[7],dataArray[8]);
                //Customer customer = new Customer("viu","12/12/2000","nu","123123123","09753458","dfwgg@hd","fwqhdghw","gfwaedj");
                System.out.println(customer);
                customerList.add(customer);

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void displayBooking() {
        for (Booking booking: bookingSet){
            System.out.println(booking.toString());
        }


    }

    @Override
    public void addNewBooking() {
        this.ReaderCustomer();
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
            id++;
        }
        System.out.println(customerList.size());
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();

        System.out.println("Nhập ngày bất đầu thuê: ");
        String starDate = scanner.nextLine();
        System.out.println("Nhập ngày trả phòng: ");
        String endDate = scanner.nextLine();
        Booking booking = new Booking(id, starDate, endDate,customer.getId(),facility.getServiceName());//customer.toString(),facility.toString());

        bookingSet.add(booking);
        System.out.println("Đã booking thành công.");
        id++;
    }

    public static Customer chooseCustomer(){
        Customer customerNew = new Customer();
        System.out.println("Danh sach khach hang");
        for (Customer customer : customerList){
            System.out.println(customer);
        }
        System.out.println("Nhap id khach hang");
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();

        while (check) {
            for (Customer customer : customerList) {
                if (id == customer.getId()) {
                    check = false;
                    customerNew = customer;
                }
            }
            if (check) {
                System.out.println("Ban da nhap sai, vui long nhap lai");
                id = sc.nextInt();
            }
        }
         return customerNew;

    }
    public static Facility chooseFacility() {
        System.out.println("Danh sach dich vu: ");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey().toString());
        }
        System.out.println("Nhap id dich vu");
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();

        while (check) {
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (id.equals(entry.getKey().getId())){
                    check = false;
                    return entry.getKey();
                }
            }
            if (check) {
                System.out.println("Ban da nhap sai, vui long nhap lai");
                id = sc.nextLine();
            }
        }
        return null;
    }
}
