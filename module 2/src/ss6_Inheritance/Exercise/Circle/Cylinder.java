package ss6_Inheritance.Exercise;

public class Cylinder extends Circle {
    public double height;

    public Cylinder(){

    }
    public Cylinder(double height){
        this.height = height;
    }

    public Cylinder(String color, double radius, double height){
        super(color,radius);
        this.height = height;
    }

    public double getHeight() {

        return height;
    }
    public void setHeight(double height) {

        this.height = height;
    }
    public double getArea(){
        return super.getRadius() * super.getRadius() * Math.PI;
    }
    public double getVolume(){
        return (super.getRadius() * super.getRadius() * Math.PI)*height;
    }

//    @Override
//    public String toString() {
//        return "Cylinder{" +
//                "color='" +  + '\'' +
//                ", radius=" + radius +
//                ", height=" + height +
//                '}';
//    }


    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }

    public static void main(String[] args){
        Cylinder cylinder = new Cylinder("red", 1,5);
        System.out.println(cylinder);
        System.out.println("Volume "+cylinder.getVolume());

    }

}
