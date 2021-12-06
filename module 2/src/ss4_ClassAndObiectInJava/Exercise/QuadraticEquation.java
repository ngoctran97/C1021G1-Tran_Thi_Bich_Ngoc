package ss4_ClassAndObiectInJava.Exercise;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;

    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public double getDiscriminant(){
        return (this.b * this.b)-(4 * this.a * this.c);
    }
    public double getRoot1(){
        return ((-this.b)+(Math.sqrt(this.b * this.b - 4 * this.a * this.c)))/2*this.a;
    }
    public double getRoot2(){
        return ((-this.b)-(Math.sqrt(this.b * this.b - 4 * this.a * this.c)))/2*this.a;
    }
    public  void kiemTra(){
        if (a == 0){
            if(b == 0){
              System.out.println("Phuong trinh voo nghiem");
            }else{
                System.out.println("phuong trinh co mot nghiem :  " + "x = " + (-c/b));
            }
            return;
        }
        double delta = getDiscriminant();
        double x1 ;
        double x2;
        if (delta > 0){
            x1 = getRoot1();
            x2 = getRoot2();
            System.out.println("Phuong trinh co 2 nghiem la : " + "x1 = " + x1 + "x2 = " + x2);
        }else if(delta == 0){
            x1 = -b/2*a;
            System.out.println("Phuong trinh co nghiem kep la : "+ "x1 = x2 " + x1);
        }else{
            System.out.println("Phuong trinh vo nghiem");
        }
    }


    public static void main (String[] args){
        QuadraticEquation quadraticEquation = new QuadraticEquation(0,10,4);
        quadraticEquation.kiemTra();
    }
}
