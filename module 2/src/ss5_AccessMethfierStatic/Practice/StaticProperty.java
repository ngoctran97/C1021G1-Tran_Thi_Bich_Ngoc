package ss5_AccessMethfierStatic.Practice;

import java.util.Scanner;

public class StaticProperty {
    private String name;
    private String engine;

    public static int numberOfCars;

    public StaticProperty(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

        public static void main(String[] args){
            StaticProperty car1 = new StaticProperty("Mazda 3","Skyactiv 3");
            System.out.println(StaticProperty.numberOfCars);
            System.out.println(car1.name + car1.engine);
            StaticProperty car2 = new StaticProperty("Mazada 6", "Skyactiv 6");
            System.out.println(StaticProperty.numberOfCars);
            System.out.println(car2.name + car2.engine);
        }

}
