package Thuc_hanh.c10.model;

public class HocSinh extends Student{
    private String lop;
    private Double diem;

    public HocSinh(int id, String name, String birthday, String gender, String lop, Double diem) {
        super(id, name, birthday, gender);
        this.lop = lop;
        this.diem = diem;
    }

    public HocSinh(String lop, Double diem) {
        this.lop = lop;
        this.diem = diem;
    }

    public HocSinh() {
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public Double getDiem() {
        return diem;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                super.toString()+
                "lop='" + lop + '\'' +
                ", diem=" + diem +
                '}';
    }
}
