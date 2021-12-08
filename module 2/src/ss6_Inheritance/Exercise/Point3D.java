package ss6_Inheritance.Exercise;

import java.util.Scanner;

public class Point3D extends Point2D{
    public float z ;

    public Point3D (float z){
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {

        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y,float z){
        this.z = z;
    }
    public float[] xyz (){
       float[] xyz = {this.x,this.y,this.z};
       return xyz;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(2,3,4);
        System.out.println(point3D);
    }
}
