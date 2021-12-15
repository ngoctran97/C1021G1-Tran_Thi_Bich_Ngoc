package Bai_Tap.Student.Controller;

import Bai_Tap.Student.model.Student;
import  Bai_Tap.Student.service.StudentService;
import Bai_Tap.Student.service.StudentServiceImpl;

import java.util.Scanner;

public class StudentCotroller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentServiceImpl();
        Student[] students = null;
        Student st = new Student("SV004", "Trieu", "01/01/1990", "male", "01", "10");
        studentService.add(st);
        int select = 0;
        do {
            System.out.println("1. List all");
            System.out.println("2. Add new");
            System.out.println("3. Delete MSSV");

            System.out.println("4 . Delete p");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                    students = studentService.findAll();
                    for (Student student : students){
                        System.out.println(student);
                    }
                    break;
                case 2 :
                    System.out.println("Input MSSV");
                    String mssv = scanner.nextLine();
                    System.out.println("Input name");
                    String name = scanner.nextLine();
                    System.out.println("Input birth");
                    String birth = scanner.nextLine();
                    System.out.println("Input gender");
                    String gender = scanner.nextLine();
                    System.out.println("Input classes");
                    String classes = scanner.nextLine();
                    System.out.println("Input course");
                    String course = scanner.nextLine();
                    Student studentNew = new Student(mssv,name,birth,gender,classes,course);
                    studentService.add(studentNew);

                    break;
                case 3:
                    System.out.println("input mssv");
                    String mssv1 = scanner.nextLine();
                    studentService.remove(mssv1);
                    break;
                case 4:
                    System.out.println("input p");
                    String p = scanner.nextLine();
                    studentService.remove(p);
                    break;

            }
        }while (select != 7);
    }

}
