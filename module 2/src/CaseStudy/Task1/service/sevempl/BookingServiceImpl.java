package CaseStudy.Task1.service.sevempl;

import CaseStudy.Task1.modell.Booking;
import CaseStudy.Task1.modell.Facility.Facility;
import CaseStudy.Task1.modell.Facility.House.House;
import CaseStudy.Task1.modell.Facility.Room.Room;
import CaseStudy.Task1.modell.Facility.Villa.Villa;
import CaseStudy.Task1.modell.Person.Customer.Customer;
import CaseStudy.Task1.service.BookingService;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    Scanner scanner = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    static {
        customerList.add(new Customer("ngoc","27/05/1997","nu","123123123",
                "098765432","ngoctran@gmail.com","VIP","GDAGFSZ"));
        customerList.add(new Customer("hien","27/05/1999","nu","123123456",
                "088865432","ngoctran@gmail.com","VIP","GDAGFSZ"));
        facilityIntegerMap.put(new Villa("SVVL-1234","Tran",35,50,
                12,"Asdf","Afh",35,12),0);
        facilityIntegerMap.put(new House("SVHO-1234","Thi",30,30,
                30,"Thuong","Tdvgwgd",12),0);
        facilityIntegerMap.put(new Room("SVRO-4444","Xiu",30,
                45,20,"uuiyioo","ewfaef"),0);
    }
    @Override
    public void displayBooking() {
        for (Customer customer: customerList){
            System.out.println(customer.toString());
        }


    }

    @Override
    public void addNewBooking() {
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }
        Customer customer = chooseCustomer();
        Facility facility = chooseCFacility();
        System.out.println("Nhập ngày bất đầu thuê: ");
        String starDate = scanner.nextLine();
        System.out.println("Nhập ngày trả phòng: ");
        String endDate = scanner.nextLine();
        Booking booking = new Booking(id, starDate, endDate, customer,facility,);

        bookingSet.add(booking);
        System.out.println("Đã booking thành công.");
    }

    public static Customer chooseCustomer(){
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
                    return customer;
                }
            }
            if (check) {
                System.out.println("Ban da nhap sai, vui long nhap lai");
                id = sc.nextInt();
            }
        }
        return null;

    }
    public static Facility chooseCFacility() {
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
