package ss4_ClassAndObiectInJava.Practice;

import java.util.Scanner;

public class Rectangular {
    private double width, height;

    public Rectangular(){
        this.width = 0;
        this.height = 0;
    }
    public Rectangular (double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.height * this.height;
    }
    public double getPerimeter(){
        return (this.height + this.width) * 2;
    }
    public void display(){
        System.out.println("chieu dai " + height + " chieu rong " + width);
    }

    public static void main (String[] args){
        Rectangular rectangular = new Rectangular(10, 5);
        rectangular.display();
        System.out.println(rectangular.getArea());
        System.out.println(rectangular.getPerimeter());

    }


}
