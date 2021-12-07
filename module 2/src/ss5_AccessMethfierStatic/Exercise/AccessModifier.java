package ss5_AccessMethfierStatic.Exercise;

import java.util.Scanner;

public class AccessModifier {
    public double radius = 1.0;
    public String color = "red";
    public double area;

    public AccessModifier(){

    }
    public AccessModifier(double radius, double area){
        this.area = area;
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getArea(){
        return Math.pow(this.radius, 2)* Math.PI;
    }
    public static void main(String[] args){
        AccessModifier circle = new AccessModifier();
        System.out.println("Radius:" + circle.getRadius());
        System.out.println("AreaP: " + circle.getArea());
        System.out.println("color : " + circle.getColor());

    }

}
