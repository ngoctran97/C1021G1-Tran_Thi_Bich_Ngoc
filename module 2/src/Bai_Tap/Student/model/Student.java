package Bai_Tap.Student.model;

public class Student {
    public String MSSV;
    public String name;
    public String birth;
    public String gender;
    public String classes;
    public String course;

    public Student(String MSSV, String name,
                   String birth, String gender, String classes, String course) {
        this.MSSV = MSSV;
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.classes = classes;
        this.course = course;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
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

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "MSSV=" + MSSV +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", gender='" + gender + '\'' +
                ", classes='" + classes + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
