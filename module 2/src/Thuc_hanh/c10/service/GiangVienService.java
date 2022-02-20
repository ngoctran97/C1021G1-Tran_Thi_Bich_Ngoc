package Thuc_hanh.c10.service;

import Thuc_hanh.c10.model.GiangVien;
import Thuc_hanh.c10.model.HocVien;
import Thuc_hanh.c10.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class GiangVienService implements IGiangVien{
    private static ArrayList<GiangVien> giangVienArrayList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    {
        reader();
    }
    public void write(){
        try {
            FileWriter fileWriter = new FileWriter("src/Thuc_hanh/c10/data/giangVien.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (GiangVien giangVien: giangVienArrayList){
                bufferedWriter.write(giangVien.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void reader(){
        try {
            FileReader fileReader = new FileReader("src/Thuc_hanh/c10/data/giangVien.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String[] data;
            String line;
            GiangVien giangVien;
            while ((line = bufferedReader.readLine())!= null){
                data = line.split(",");
                giangVien = new GiangVien(data[0],data[1],data[2],data[3],data[4]);
                giangVienArrayList.add(giangVien);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void aadNewGiangViien() {
        System.out.println("Nhap id giang sinh");
        String id=scanner.nextLine();
        while (!(id.matches("[G][V][-][0-9]{4}"))){
            System.out.println("hay nhap lai");
            System.out.println("Nhap id hoc sinh");
            id=scanner.nextLine();
        }

        System.out.println("nhap ten giang vien");
        String name = scanner.nextLine();

        String birthday;
        do {
            System.out.println("input birth");
            birthday = scanner.nextLine();
        } while (!Pattern.matches("(((0[1-9]|[12][0-9]|30)[-\\/](0[13-9]|1[012])|31[-\\/](0[13578]|1[02])|(0[1-9]|1[0-9]|2[0-8])[-\\/]02)" +
                "[-\\/](19[0-9]{2}|200[012])|29[-\\/]02[-\\/]" +
                "([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$", birthday));

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

        System.out.println("chuyen mon cua giang vien");
        String chuyenMon = scanner.nextLine();

        GiangVien giangVien = new GiangVien(id,name,birthday,gender,chuyenMon);
        giangVienArrayList.add(giangVien);
        write();
        //reader();
    }

    @Override
    public void removeGiangVien() {
        System.out.println("nhap id giang vien muon xoa");
        String id = scanner.nextLine();
        try {
            for (int i = 0; i <giangVienArrayList.size();i++){
                if (giangVienArrayList.get(i).getId().equals(id)){
                    System.out.println("ban co muon xoa khong?(1 yes 2 no)");
                    int op = scanner.nextInt();
                    if(op == 1){
                        giangVienArrayList.remove(i);
                        System.out.println("ban da xoa thanh cong");
                        break;
                    }else{
                        break;
                    }
                }else{
                    System.out.println("khong co giang vien muon xoa");
                }
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage()+"quay lai menu chinh");
            scanner.nextLine();
        }

    }

    @Override
    public void searchGiangVien() {
        System.out.println("nhap ten can tim kiem");
        String strStudent = scanner.nextLine();

        ArrayList<GiangVien> arrayList = new ArrayList<>();
        for (int i = 0; i < giangVienArrayList.size();i++){
            if(giangVienArrayList.get(i).getName().toLowerCase().contains(strStudent.toLowerCase())){
                arrayList.add(giangVienArrayList.get(i));
            }
        }
        if (arrayList.size()== 0){
            System.out.println("khong co ten can tim");

        }else{
            for (GiangVien giangVien :arrayList){
                System.out.println(giangVien);
            }
        }

    }

    @Override
    public void displayGiangVien() {
        for (GiangVien giangVien: giangVienArrayList){
            System.out.println(giangVien);
        }
    }
}
