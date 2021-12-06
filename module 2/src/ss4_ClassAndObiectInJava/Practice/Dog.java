package ss4_ClassAndObiectInJava.Practice;

public class Dog extends Animal{
    public Dog() {
        super("Cho");
    }

    @Override
    public void keu() {
        super.keu();
        System.out.println("Gau Gau");
    }

    @Override
    public String toString() {
        return "Toi la Cho";
    }
}
