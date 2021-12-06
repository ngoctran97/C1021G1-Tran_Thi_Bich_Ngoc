package ss4_ClassAndObiectInJava.Practice;

import java.util.Scanner;

public class RectangularLayer {
     double width, height;

     public RectangularLayer(){

     }

    public RectangularLayer(double width, double height ){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }

    public String display(){
        return "Rectangle{"+ "width = " + width + ", height = " + height +"}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height :");
        double height = scanner.nextDouble();
        RectangularLayer rectangularLayer = new RectangularLayer(width, height);
        System.out.println("your Rectangle \n" + rectangularLayer.display());
        System.out.println("Perimeter of the Rectangle: " + rectangularLayer.getPerimeter());
        System.out.println("Area of the Rectangle : "+ rectangularLayer.getArea());

    }
}


