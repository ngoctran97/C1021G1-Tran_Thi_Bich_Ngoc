package ss5_AccessMethfierStatic.Practice;

import java.util.Scanner;

public class StaticMethod {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    StaticMethod(int r, String n){
        rollno = r;
        name = n;
    }

    static void change(){
        college = "CODEGYM";
    }

    void display(){
        System.out.println(rollno + " " + name+" " + college);
    }
    public static void main(String args[]){
        StaticMethod.change();

        StaticMethod s1 = new StaticMethod(111,"Hoang");
        StaticMethod s2 = new StaticMethod(222, "khanh");
        StaticMethod s3 = new StaticMethod(333, "Nam");

        s1.display();
        s2.display();
        s3.display();
    }
}
