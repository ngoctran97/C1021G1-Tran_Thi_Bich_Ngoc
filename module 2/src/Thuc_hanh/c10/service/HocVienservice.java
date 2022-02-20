package Thuc_hanh.c10.service;

import Thuc_hanh.c10.model.HocVien;
import Thuc_hanh.c10.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HocVienservice implements IHocVien{
    private static ArrayList<HocVien> hocVienArrayList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    static {
        reader();
    }

    public void write(){
        try {
            FileWriter fileWriter = new FileWriter("src/Thuc_hanh/c10/data/student.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (HocVien hocVien: hocVienArrayList){
                bufferedWriter.write(hocVien.getId()+","+hocVien.getName()+","+hocVien.getBirthday()+","+hocVien.getGender()+","+hocVien.getLop()+","+hocVien.getDiem());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void reader() {
        try {
            FileReader fileReader = new FileReader("src/Thuc_hanh/c10/data/student.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String[] data;
            String line;
            HocVien hocVien;
            while ((line = bufferedReader.readLine()) != null) {
                data = line.split(",");
                hocVien = new HocVien(data[0], data[1], data[2], data[3], data[4], Double.parseDouble(data[5]));
                hocVienArrayList.add(hocVien);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void aadNewHocViien() {
        System.out.println("Nhap id hoc sinh");
        String id=scanner.nextLine();
        while (!(id.matches("[S][V][-][0-9]{4}"))){
            System.out.println("hay nhap lai");
            System.out.println("Nhap id hoc sinh");
            id=scanner.nextLine();
        }

        System.out.println("nhap ten hoc vien");
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

        System.out.println("nhap ten lop");
        String lop = scanner.nextLine();

        System.out.println("nhap diem cua hoc vien");
        Double diem = scanner.nextDouble();
        while (diem < 0||diem > 100){
            System.out.println("hay nhap lai diem hoc vien");
            diem = scanner.nextDouble();
        }
        scanner.nextLine();

        HocVien hocVien = new HocVien(id,name,birthday,gender,lop,diem);
        hocVienArrayList.add(hocVien);
        write();
    }

    @Override
    public void removeHocVien() {
            System.out.println("nhap id hoc vien muon xoa");
            String id;
            do {
                id = scanner.nextLine();
            } while(id.compareTo("") == 0);
            try {
                for (int i = 0; i < hocVienArrayList.size(); i++) {
                    if (hocVienArrayList.get(i).getId().equals(id)) {
                        System.out.println("ban co muon xoa khong?(1 yes 2 no)");
                        int op = scanner.nextInt();
                        if (op == 1) {
                            hocVienArrayList.remove(i);
                            System.out.println("ban da xoa thanh cong");
                            break;
                        } else {
                            return;
                        }
                    }
                    if (!(hocVienArrayList.get(i).getId().equals(id))) {
                        System.out.println("khong co hoc vien muon xoa");
                    }
                }
//            for (HocVien hocVien:hocVienArrayList){
//                System.out.println(hocVien);
//            }
            } catch (Exception e) {
                System.out.println(e.getMessage() + "quay lai menu chinh");
                scanner.nextLine();
            }
            write();
    }

    @Override
    public void searchHocVien() {
        System.out.println("nhap ten can tim kiem");
        String strStudent = scanner.nextLine();

        ArrayList<HocVien> arrayList = new ArrayList<>();
        for (int i = 0; i < hocVienArrayList.size();i++){
            if(hocVienArrayList.get(i).getName().toLowerCase().contains(strStudent.toLowerCase())){
                arrayList.add(hocVienArrayList.get(i));
            }
        }
        if (arrayList.size()== 0) {
            System.out.println("khong co ten can tim");

        }else{
            for (HocVien hocVien: arrayList){
                System.out.println(hocVien);
            }
        }

    }

    @Override
    public void displayHocVien() {
        for (HocVien hocVien: hocVienArrayList){
            System.out.println(hocVien);
        }
    }
}
