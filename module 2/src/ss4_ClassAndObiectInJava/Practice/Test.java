package ss4_ClassAndObiectInJava.Practice;

public class Test {
    public static void main(String[] agv) {
//        Animal animal = new Animal("Dong vat");
//        Cat cat = new Cat();
//        cat.batChuot();
//        Dog dog = new Dog();
//        Snake ran = new Snake();
//overloading
// Nap chong, ghi de
//        animal.keu();
//        dog.keu();
//        cat.keu();
//        ran.keu();
//        System.out.println( animal.toString());
//        System.out.println( dog.toString());
//        System.out.println( cat.toString());
//tinh da hinh
//        Animal cat = new Cat();
//        Animal dog = new Dog();
//        dog.keu();
//        System.out.println( dog.toString());
//
//        cat.keu();
//        System.out.println( cat.toString());

        Animal animal1;

        animal1 = new Cat();
        animal1.keu();
        System.out.println( animal1.toString());

        animal1 = new Dog();
        animal1.keu();
        System.out.println( animal1.toString());


    }
}
