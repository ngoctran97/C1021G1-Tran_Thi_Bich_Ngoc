package Thuc_hanh.c10.model;

public class HocVien extends Student{
    private String lop;
    private Double diem;

    public HocVien(String id, String name, String birthday, String gender, String lop, Double diem) {
        super(id, name, birthday, gender);
        this.lop = lop;
        this.diem = diem;
    }

    public HocVien(String lop, Double diem) {
        this.lop = lop;
        this.diem = diem;
    }

    public HocVien() {
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
        return super.toString() + "," + lop + "," + diem;
    }
}
