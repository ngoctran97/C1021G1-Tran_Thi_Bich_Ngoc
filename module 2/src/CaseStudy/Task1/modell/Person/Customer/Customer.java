package CaseStudy.Task1.modell.Person.Customer;

import CaseStudy.Task1.modell.Person.Person;

public class Customer extends Person {
    private String typeOfGuest; // loai khach
    private String address; // dia chi

    public Customer(String typeOfGuest, String address) {
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public Customer() {
    }

    public Customer(String name, String birth, String gender, String cmnn, String phone, String email, String typeOfGuest, String address) {
        super( name, birth, gender, cmnn, phone, email);
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public Customer(String s, String s1, String s2, String s3, String s4, String s5, String s6) {
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString()+
                "typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    @Override
    public int compare(Person o1, Person o2) {
        return 0;
    }
}
