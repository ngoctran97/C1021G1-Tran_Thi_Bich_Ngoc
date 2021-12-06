package ss4_ClassAndObiectInJava.Practice;

public class Animal {
    private String type;
    Animal(String type) {
        this.type = type;
    }
    public void keu() {
        System.out.print(type + " keu : ");
    }

    @Override
    public String toString() {
        return "I am " + type;
    }
}
