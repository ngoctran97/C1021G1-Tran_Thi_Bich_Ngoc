package CaseStudy.Task1.modell.Person.Employee;

import CaseStudy.Task1.modell.Person.Person;

public class Employee extends Person {
    private String lever; // trinh do
    private String position; // vi tri
    private String wage; // luong

    public Employee(String lever, String position, String wage) {
        this.lever = lever;
        this.position = position;
        this.wage = wage;
    }

    public Employee(int id, String name, String birth, String gender, String cmnn, String phone, String email, String lever, String position, String wage) {
        super(id, name, birth, gender, cmnn, phone, email);
        this.lever = lever;
        this.position = position;
        this.wage = wage;
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
                "lever='" + lever + '\'' +
                ", position='" + position + '\'' +
                ", wage='" + wage + '\'' +
                '}';
    }
}