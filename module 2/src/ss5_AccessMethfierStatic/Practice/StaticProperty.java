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
    
}
