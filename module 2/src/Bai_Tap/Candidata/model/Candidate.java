package Bai_Tap.Candidata.model;

public class Candidate {
    public int id ;
    public String name;
    public String birth;
    public int math;
    public int literature;
    public int english;

    public Candidate() {
        id = 0;
        name = "";
        birth = "";
        math = 0;
        literature = 0;
        english = 0;
    }

    public Candidate(int id, String name, String birth, int math, int literature, int english) {
        System.out.println("111111111111");
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.math = math;
        this.literature = literature;
        this.english = english;
    }

    public void setInfo(int id, String name, String birth, int math, int literature, int english) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.math = math;
        this.literature = literature;
        this.english = english;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getLiterature() {
        return literature;
    }

    public void setLiterature(int literature) {
        this.literature = literature;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getsum(){
        return this.english+ this.math + this.literature;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", math=" + math +
                ", literature=" + literature +
                ", english=" + english +
                '}';
    }
}
