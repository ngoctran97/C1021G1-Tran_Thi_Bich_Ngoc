package CaseStudy.Task1.service.sevempl;

import CaseStudy.Task1.modell.Facility.Facility;
import CaseStudy.Task1.modell.Facility.House.House;
import CaseStudy.Task1.modell.Facility.Room.Room;
import CaseStudy.Task1.modell.Facility.Villa.Villa;
import CaseStudy.Task1.modell.Person.Employee.Employee;
import CaseStudy.Task1.service.FacilityService;
import ss19_String.Exercise.ValidateExample.ValidateExample;

import java.io.*;
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
    public void write(){
        try {
            FileWriter fileWriterVilla = new FileWriter("/Users/tranvantrong/Documents/C1021G1-Tran_Thi_Bich_Ngoc/module 2/src/CaseStudy/Task1/data/villa.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriterVilla);

            FileWriter fileWriterHouse = new FileWriter("/Users/tranvantrong/Documents/C1021G1-Tran_Thi_Bich_Ngoc/module 2/src/CaseStudy/Task1/data/house.csv");
            BufferedWriter bufferedWriterHouse = new BufferedWriter(fileWriterHouse);

            FileWriter fileWriterRoom = new FileWriter("/Users/tranvantrong/Documents/C1021G1-Tran_Thi_Bich_Ngoc/module 2/src/CaseStudy/Task1/data/room.csv");
            BufferedWriter bufferedWriterRoom = new BufferedWriter(fileWriterRoom);

            for (Map.Entry<Facility,Integer> element: facilityIntegerMap.entrySet()){
                if(element.getKey() instanceof Villa){
                   Villa villa = (Villa) element.getKey();
                    bufferedWriter.write(villa.getId()+","+villa.getServiceName()+","+villa.getUsableArea()+","+villa.getRentalType()+","+villa.getMaxPeople()+","+
                            +villa.getRentalCosts()+","+villa.getRoomStandard()+","+villa.getPoolArea()+","+villa.getServiceName());
                    bufferedWriter.close();
                }else if(element.getKey() instanceof House){
                    House house = (House) element.getKey();
                    bufferedWriterHouse.write(house.getId()+","+house.getServiceName()+","+house.getUsableArea()+","
                            +house.getRentalCosts()+","+house.getMaxPeople()+","+house.getRentalType()+","+house.getRoomStandard()+","
                            +house.getNumberOfFloors());
                    bufferedWriterHouse.close();
                }else if (element.getKey() instanceof Room){
                    Room room = (Room) element.getKey();
                    bufferedWriterRoom.write(room.getId()+","+room.getServiceName()+","+room.getUsableArea()+","
                            +room.getRentalCosts()+","+room.getMaxPeople()+","+room.getRentalType()+","+room.getFreeServiceIncluded());
                    bufferedWriterRoom.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readVilla(String path){
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/tranvantrong/Documents/C1021G1-Tran_Thi_Bich_Ngoc/module 2/src/CaseStudy/Task1/data/villa.csv");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

            String strLine;
            boolean readVilla = true;

            while ((strLine = bufferedReader.readLine())!= null){
                if(readVilla){
                    readVilla = false;
                    continue;
                }
            }
            String data[] = strLine.split(",");
            Villa villa = new Villa(data[0],data[1],Integer.parseInt(data[2]),Integer.parseInt(data[3]),
                    Integer.parseInt(data[4]),data[5],data[6],Integer.parseInt(data[7]),Integer.parseInt(data[8]) );
            facilityIntegerMap.put(villa,0);
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readHouse(String path){
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/tranvantrong/Documents/C1021G1-Tran_Thi_Bich_Ngoc/module 2/src/CaseStudy/Task1/data/house.csv");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

            String strLine;
            boolean readHouse = true;

            while ((strLine = bufferedReader.readLine())!= null){
                if(readHouse){
                    readHouse = false;
                    continue;
                }
                String data[] = strLine.split(",");
                House house = new House(data[0],data[1],Integer.parseInt(data[2]),Integer.parseInt(data[3]),
                        Integer.parseInt(data[4]),data[5],data[6],Integer.parseInt(data[7]) );
            }
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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

        System.out.println("Nh???p t??n d???ch v???");
        String name = scanner.nextLine();
        while (!(name.matches("^[A-Z]{1,1}[a-z]+$"))){
            System.out.println("Nh???p lai t??n d???ch v???");
            name = scanner.nextLine();
        }

        System.out.println("Nh???p di???n t??ch s??? d???ng");
        int usableArea = scanner.nextInt();
        while (usableArea < 30){
            System.out.println("dien tich su dung phai lon hon 30");
             usableArea = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("Nh???p chi ph?? thu??");
        int rentalCosts = scanner.nextInt();
        while (rentalCosts <0){
            System.out.println("chi phi thue phai lon hon 0");
            System.out.println("Nh???p chi ph?? thu??");
            rentalCosts = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("nh???p s??? l?????ng ng?????i t???i ??a");
        int maxPeople = scanner.nextInt();
        while (maxPeople >20 || maxPeople < 0){
            System.out.println("nh???p s??? l?????ng ng?????i t???i ??a");
            maxPeople = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("Nh???p ki???u thu??");
        String rentalType = scanner.nextLine();
        while (!(rentalType.matches("^[A-Z]{1,1}[a-z]+$"))){
            System.out.println("Nh???p lai ki???u thu??");
            name = scanner.nextLine();
        }
        System.out.println("Nh???p ti??u chu???n ph??ng");
        String roomStandard = scanner.nextLine();
        while (!(roomStandard.matches("^[A-Z]{1,1}[a-z]+$"))){
            System.out.println("Nh???p lai ti??u chu???n ph??ng");
            name = scanner.nextLine();
        }

        System.out.println("Nh???p di???n t??ch h??? b??i");
        int poolArea = scanner.nextInt();
        while (poolArea< 30){
            System.out.println("Nh???p di???n t??ch h??? b??i");
            poolArea = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("Nh???p s??? t???ng");
        int numberOfloors = scanner.nextInt();
        while (numberOfloors < 0){
            System.out.println("Nh???p lai s??? t???ng");
            numberOfloors = scanner.nextInt();
        }
        scanner.nextLine();

        Villa villa = new Villa(id, name, usableArea, rentalCosts, maxPeople, rentalType, roomStandard, poolArea, numberOfloors);
        facilityIntegerMap.put(villa,0);
        write();
        System.out.println("???? th??m m???i villa th??nh c??ng");
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

        System.out.println("Nh???p t??n d???ch v???");
        String name = scanner.nextLine();
        while (!(name.matches("^[A-Z]{1,1}[a-z]+$"))){
            System.out.println("Nh???p t??n d???ch v???");
            name = scanner.nextLine();
        }

        System.out.println("Nh???p di???n t??ch s??? d???ng");
        int usableArea = scanner.nextInt();
        while (usableArea < 30){
            System.out.println(" Hay Nh???p di???n t??ch s??? d???ng");
            usableArea = scanner.nextInt();
        }
        scanner.nextLine();

        while (usableArea < 20){
            System.out.println(" Hay Nh???p di???n t??ch s??? d???ng");
            usableArea = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("Nh???p chi ph?? thu??");
        int rentalCosts = scanner.nextInt();
        while (rentalCosts <0){
            System.out.println("chi phi thue phai lon hon 0");
            System.out.println("Nh???p chi ph?? thu??");
            rentalCosts = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("nh???p s??? l?????ng ng?????i t???i ??a");
        int maxPeople = scanner.nextInt();
        while (maxPeople >20 || maxPeople < 0){
            System.out.println("nh???p s??? l?????ng ng?????i t???i ??a");
            maxPeople = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("Nh???p ki???u thu??");
        String rentalType = scanner.nextLine();
        while (!(rentalType.matches("^[A-Z]{1,1}[a-z]+$"))){
            System.out.println("Nh???p lai ki???u thu??");
            name = scanner.nextLine();
        }

        System.out.println("Nh???p ti??u chu???n ph??ng");
        String roomStandard = scanner.nextLine();
        while (!(roomStandard.matches("^[A-Z]{1,1}[a-z]+$"))){
            System.out.println("Nh???p lai ti??u chu???n ph??ng");
            name = scanner.nextLine();
        }

        System.out.println("Nh???p s??? t???ng");
        int numberOfloors = scanner.nextInt();
        while (numberOfloors < 0){
            System.out.println("Nh???p lai s??? t???ng");
            numberOfloors = scanner.nextInt();
        }
        scanner.nextLine();
        House house = new House(id,name,usableArea,rentalCosts, maxPeople, rentalType, roomStandard, numberOfloors);
        facilityIntegerMap.put(house, 0);
        write();
        System.out.println("???? th??m m???i villa th??nh c??ng");

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

        System.out.println("Nh???p t??n d???ch v???");
        String name = scanner.nextLine();
        while (!(name.matches("^[A-Z]{1,1}[a-z]+$"))){
            System.out.println("Nh???p t??n d???ch v???");
            name = scanner.nextLine();
        }

        System.out.println("Nh???p di???n t??ch s??? d???ng");
        int usableArea = scanner.nextInt();
        while (usableArea < 30){
            System.out.println(" Hay Nh???p di???n t??ch s??? d???ng");
            usableArea = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("Nh???p chi ph?? thu??");
        int rentalCosts = scanner.nextInt();
        while (rentalCosts <0){
            System.out.println("chi phi thue phai lon hon 0");
            System.out.println("Nh???p chi ph?? thu??");
            rentalCosts = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("nh???p s??? l?????ng ng?????i t???i ??a");
        int maxPeople = scanner.nextInt();
        while (maxPeople >20 || maxPeople < 0){
            System.out.println("nh???p s??? l?????ng ng?????i t???i ??a");
            maxPeople = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("Nh???p ki???u thu??");
        String rentalType = scanner.nextLine();
        while (!(rentalType.matches("^[A-Z]{1,1}[a-z]+$"))){
            System.out.println("Nh???p lai ki???u thu??");
            name = scanner.nextLine();
        }

        System.out.println("D???ch v??? mi???n ph?? ??i k??m");
        String freeServiceIncluded = scanner.nextLine();

        Room room = new Room(id, name, usableArea, rentalCosts, maxPeople, rentalType, freeServiceIncluded);
        facilityIntegerMap.put(room, 0);
        write();

        System.out.println("???? th??m m???i villa th??nh c??ng");

    }
}
