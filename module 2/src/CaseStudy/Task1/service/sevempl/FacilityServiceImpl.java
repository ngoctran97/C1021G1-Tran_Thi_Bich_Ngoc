package CaseStudy.Task1.service.sevempl;

import CaseStudy.Task1.modell.Facility.Facility;
import CaseStudy.Task1.modell.Facility.House.House;
import CaseStudy.Task1.modell.Facility.Room.Room;
import CaseStudy.Task1.modell.Facility.Villa.Villa;
import CaseStudy.Task1.service.FacilityService;
import ss19_String.Exercise.ValidateExample.ValidateExample;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()){
            System.out.println("Service " + element.getKey()+ "So lan da thue " + element.getValue());
        }

    }

    @Override
    public void displayMaintain() {

    }

    public void addNewVilla() {
        System.out.println("input id");
        String id=scanner.nextLine();

        while (!(id.matches("[S][V][V][L][-][0-9]{4}"))) {
            System.out.println("Input is invalid!");
            System.out.println("Enter the ID:");
            id = scanner.nextLine();
        }

        System.out.println("Nhập tên dịch vụ");
        String name = scanner.nextLine();
        while (!(name.matches("^[A-Z]{1,1}[a-z]+$"))){
            System.out.println("Nhập tên dịch vụ");
            name = scanner.nextLine();
        }

        System.out.println("Nhập diện tích sữ dụng");
        int usableArea = scanner.nextInt();
        while (usableArea < 30){
            System.out.println(" Hay Nhập diện tích sữ dụng");
             usableArea = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("Nhập chi phí thuê");
        int rentalCosts = scanner.nextInt();
        while (rentalCosts <0){
            System.out.println("chi phi thue phai lon hon 0");
            System.out.println("Nhập chi phí thuê");
            rentalCosts = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("nhập số lượng người tối đa");
        int maxPeople = scanner.nextInt();
        while (maxPeople >20 || maxPeople < 0){
            System.out.println("nhập số lượng người tối đa");
            maxPeople = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("Nhập kiểu thuê");
        String rentalType = scanner.nextLine();

        System.out.println("Nhập tiêu chuẩn phòng");
        String roomStandard = scanner.nextLine();

        System.out.println("Nhập diện tích hồ bơi");
        int poolArea = scanner.nextInt();
        while (poolArea< 30){
            System.out.println("Nhập diện tích hồ bơi");
            poolArea = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("Nhập số tầng");
        int numberOfloors = scanner.nextInt();
        while (numberOfloors < 0){
            System.out.println("Nhập lai số tầng");
            numberOfloors = scanner.nextInt();
        }
        scanner.nextLine();

        Villa villa = new Villa(id, name, usableArea, rentalCosts, maxPeople, rentalType, roomStandard, poolArea, numberOfloors);
        facilityIntegerMap.put(villa,0);
        System.out.println("Đã thêm mới villa thành công");
    }

    @Override
    public void addNewHouse() {

        System.out.println("input id");
        String id=scanner.nextLine();
        while (!(id.matches("[S][V][H][O][-][0-9]{4}"))) {
            System.out.println("Input is invalid!");
            System.out.println("Enter the ID:");
            id = scanner.nextLine();
        }

        System.out.println("Nhập tên dịch vụ");
        String name = scanner.nextLine();
        while (!(name.matches("^[A-Z]{1,1}[a-z]+$"))){
            System.out.println("Nhập tên dịch vụ");
            name = scanner.nextLine();
        }

        System.out.println("Nhập diện tích sữ dụng");
        int usableArea = scanner.nextInt();
        while (usableArea < 30){
            System.out.println(" Hay Nhập diện tích sữ dụng");
            usableArea = scanner.nextInt();
        }
        scanner.nextLine();

        while (usableArea < 20){
            System.out.println(" Hay Nhập diện tích sữ dụng");
            usableArea = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("Nhập chi phí thuê");
        int rentalCosts = scanner.nextInt();
        while (rentalCosts <0){
            System.out.println("chi phi thue phai lon hon 0");
            System.out.println("Nhập chi phí thuê");
            rentalCosts = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("nhập số lượng người tối đa");
        int maxPeople = scanner.nextInt();
        while (maxPeople >20 || maxPeople < 0){
            System.out.println("nhập số lượng người tối đa");
            maxPeople = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("Nhập kiểu thuê");
        String rentalType = scanner.nextLine();

        System.out.println("Nhập tiêu chuẩn phòng");
        String roomStandard = scanner.nextLine();

        System.out.println("Nhập số tầng");
        int numberOfloors = scanner.nextInt();
        while (numberOfloors < 0){
            System.out.println("Nhập lai số tầng");
            numberOfloors = scanner.nextInt();
        }
        scanner.nextLine();
        House house = new House(id,name,usableArea,rentalCosts, maxPeople, rentalType, roomStandard, numberOfloors);
        facilityIntegerMap.put(house, 0);
        System.out.println("Đã thêm mới villa thành công");

    }

    @Override
    public void addNewRoom() {
        System.out.println("input id");
        String id=scanner.nextLine();

        while (!(id.matches("[S][V][R][O][-][0-9]{4}"))) {
            System.out.println("Input is invalid!");
            System.out.println("Enter the ID:");
            id = scanner.nextLine();
        }
        System.out.println("Nhập tên dịch vụ");
        String name = scanner.nextLine();
        while (!(name.matches("^[A-Z]{1,1}[a-z]+$"))){
            System.out.println("Nhập tên dịch vụ");
            name = scanner.nextLine();
        }

        System.out.println("Nhập diện tích sữ dụng");
        int usableArea = scanner.nextInt();
        while (usableArea < 30){
            System.out.println(" Hay Nhập diện tích sữ dụng");
            usableArea = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("Nhập chi phí thuê");
        int rentalCosts = scanner.nextInt();
        while (rentalCosts <0){
            System.out.println("chi phi thue phai lon hon 0");
            System.out.println("Nhập chi phí thuê");
            rentalCosts = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("nhập số lượng người tối đa");
        int maxPeople = scanner.nextInt();
        while (maxPeople >20 || maxPeople < 0){
            System.out.println("nhập số lượng người tối đa");
            maxPeople = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("Nhập kiểu thuê");
        String rentalType = scanner.nextLine();

        System.out.println("Dịch vụ miễn phí đi kèm");
        String freeServiceIncluded = scanner.nextLine();

        Room room = new Room(id, name, usableArea, rentalCosts, maxPeople, rentalType, freeServiceIncluded);
        facilityIntegerMap.put(room, 0);
        System.out.println("Đã thêm mới villa thành công");

    }
}
