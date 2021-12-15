package Bai_Tap.Cadres.modell;

public class Cadres {
    public int length;
    private String MCB;
    private String fullname;
    private String gender;
    private String homeTown;
    private String birth;
    private String specialize;
    private String level;
    private double wage;
    private double allowance;

    public Cadres(String MCB, String fullname, String gender,
                  String homeTown, String birth, String specialize,
                  String level, double wage, double allowance) {
        this.MCB = MCB;
        this.fullname = fullname;
        this.gender = gender;
        this.homeTown = homeTown;
        this.birth = birth;
        this.specialize = specialize;
        this.level = level;
        this.wage = wage;
        this.allowance = allowance;
    }

    public Cadres() {
    }

    public Cadres(String mcb, String ten, String gioitinh, String quequan, String namsinh, String chuyenmon, String trinhDo, String luong, String phuCap) {
    }

    public String getMCB() {
        return MCB;
    }

    public void setMCB(String MCB) {
        this.MCB = MCB;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return "Cadres{" +
                "MCB='" + MCB + '\'' +
                ", fullname='" + fullname + '\'' +
                ", gender='" + gender + '\'' +
                ", homeTown='" + homeTown + '\'' +
                ", birth='" + birth + '\'' +
                ", specialize='" + specialize + '\'' +
                ", level='" + level + '\'' +
                ", wage='" + wage + '\'' +
                ", allowance='" + allowance + '\'' +
                '}';
    }
}
