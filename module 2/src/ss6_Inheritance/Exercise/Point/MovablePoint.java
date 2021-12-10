package ss6_Inheritance.Exercise;

public class MovablePoint extends Point{
    public float xSpeed;
    public float ySpeed;

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(){

    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getSpeed(){
        return (float) Math.sqrt(xSpeed * xSpeed + ySpeed * ySpeed);

    }
    @Override
    public String toString() {
        return "("  + x + "," + y + "),speed=(" + xSpeed + "," + ySpeed + ")";
    }
    public MovablePoint move(){
        x += xSpeed;
        y += ySpeed;
        return this;
    }

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(2,5);
        System.out.println(movablePoint);
        System.out.println(movablePoint.getSpeed());
        System.out.println(movablePoint.move());

    }

}
