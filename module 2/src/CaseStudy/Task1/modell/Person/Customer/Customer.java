package CaseStudy.Task1.modell.Person.Customer;

import CaseStudy.Task1.modell.Person.Person;

public class Customer extends Person {
    private String mkh; // ma khach Hang
    private String typeOfGuest; // loai khach
    private String address; // dia chi

    public Customer() {
    }

    public Customer(String mkh, String typeOfGuest, String address) {
        this.mkh = mkh;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public Customer(String name, String birth, String gender, String cmnn, String phone, String email, String mkh, String typeOfGuest, String address) {
        super(name, birth, gender, cmnn, phone, email);
        this.mkh = mkh;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getMkh() {
        return mkh;
    }

    public void setMkh(String mkh) {
        this.mkh = mkh;
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
                "mkh='" + mkh + '\'' +
                ", typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
