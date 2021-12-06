package ss4_ClassAndObiectInJava.Practice;

public class Cat extends Animal {
    public Cat() {
        super("Meo");
    }

    @Override
    public void keu() {
        super.keu();
        System.out.println("Meo meo");
    }

    public void batChuot() {
        System.out.println("Toi la Meo, toi dang di bat chuot");
    }
}
