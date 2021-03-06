package CaseStudy.Task1.modell.Person;

import java.util.Comparator;

public abstract class Person implements Comparable<Person>, Comparator<Person> {
    private int id;
    private String name; // ho va ten
    private String birth; // ngay thang nam sinh
    private String gender; // goi tinh
    private String cmnn; // cmnn
    private String phone; // sdt
    private String email; // email
    static int personid;

    public Person() {
    }

    public Person(String name, String birth, String gender, String cmnn, String phone, String email) {
        personid++;
        this.id = personid;
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.cmnn = cmnn;
        this.phone = phone;
        this.email = email;
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCmnn() {
        return cmnn;
    }

    public void setCmnn(String cmnn) {
        this.cmnn = cmnn;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", gender='" + gender + '\'' +
                ", cmnn='" + cmnn + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'';
    }
}
