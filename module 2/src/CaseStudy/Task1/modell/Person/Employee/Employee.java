package CaseStudy.Task1.modell.Person.Employee;

import CaseStudy.Task1.modell.Person.Person;

public class Employee extends Person {
    private String mnv; // ma nhan vien
    private String lever; // trinh do
    private String position; // vi tri
    private String wage; // luong

    public Employee() {
    }

    public Employee(String mnv, String lever, String position, String wage) {
        this.mnv = mnv;
        this.lever = lever;
        this.position = position;
        this.wage = wage;
    }

    public Employee(String name, String birth, String gender, String cmnn, String phone, String email, String mnv, String lever, String position, String wage) {
        super(name, birth, gender, cmnn, phone, email);
        this.mnv = mnv;
        this.lever = lever;
        this.position = position;
        this.wage = wage;
    }

    public String getMnv() {
        return mnv;
    }

    public void setMnv(String mnv) {
        this.mnv = mnv;
    }

    public String getLever() {
        return lever;
    }

    public void setLever(String lever) {
        this.lever = lever;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {

        return "Employee{" +
                 super.toString()+
                "mnv='" + mnv + '\'' +
                ", lever='" + lever + '\'' +
                ", position='" + position + '\'' +
                ", wage='" + wage + '\'' +
                '}';
    }
}