package ss5_AccessMethfierStatic.Exercise;

import java.util.Scanner;

public class Student {
    public String name;
    public String classes;

    public Student(String name, String classes) {
        this.name = "John";
        this.classes = "CO2";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public static void main(String[] args) {
        Student student = new Student("xiu","C10" );
        System.out.println("name : "+ student.getName());
        System.out.println("classes : " + student.getClasses());

    }
}
