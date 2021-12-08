package ss6_Inheritance.Exercise;

import java.util.Scanner;

public class Circle {
    public String color;
    public double radius;

    public Circle (){

    }
    public Circle (String color, double radius){
        this.radius = radius;
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){

        return radius * radius * Math.PI;
    }
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }
    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + " color "
                + getColor()
                + ", which is a subclass of "
                + super.toString();
    }
    public static void main(String[] args){
        Circle circle = new Circle("red", 5);
        System.out.println(circle);

    }

}
