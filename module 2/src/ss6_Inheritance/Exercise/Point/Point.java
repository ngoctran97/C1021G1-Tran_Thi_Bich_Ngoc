package ss6_Inheritance.Exercise.Point;

public class Point {
    public float x;
    public float y;

    public Point(){

    }
    public Point (float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] xy = {this.x,this.y};
        return xy;

    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public static void main(String[] args){
        Point point = new Point(3,5);
        System.out.println(point);
    }
}
