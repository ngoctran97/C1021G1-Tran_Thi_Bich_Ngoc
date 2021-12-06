package ss4_ClassAndObiectInJava.Exercise;

import java.util.Scanner;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUD = 2;
    private final int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private String color = "blue";
    private double radius = 5;

    public int getSLOW(){
        return SLOW;
    }
    public int getMEDIUD(){
        return MEDIUD;
    }
    public int getFAST(){
        return FAST;
    }
    public int getSpeed(){
        return speed;
    }
    public boolean isOn() {
        return on;
    }
    public String getColor(){
        return color;
    }
    public double getRadius(){
        return radius;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Fan(){

    }
    public Fan (int speed, boolean on, String color, double radius){
        this.speed = speed;
        this.on = on;
        this.color = color;
        this.radius = radius;
    }
    public String toString(){
        String state = "";
        if(this.isOn()){
            state += ("Fan is off\n");
            state += ("Speed: " + this.speed + "\n");
        } else {
            state += ("Fan is off");
        }
        state += ("Color: " + this.color + "\n");
        state += ("Radius: " + this.radius + "\n");
        return state;

    }
    public static void main(String[] args) {
        Fan fan_1 = new Fan(3, true, "yellow", 10);
        System.out.println(fan_1.toString());
        Fan fan_2 = new Fan(5, false, "blue", 5);
        System.out.println(fan_2.toString());
    }
}
