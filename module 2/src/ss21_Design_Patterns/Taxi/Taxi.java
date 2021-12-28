package ss21_Design_Patterns.Taxi;

public class Taxi {
    private String name;

    public Taxi(String name) {
        this.name = name;
    }

    public Taxi() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "name='" + name + '\'' +
                '}';
    }
}
