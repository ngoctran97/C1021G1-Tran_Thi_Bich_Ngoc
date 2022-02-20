package Thuc_hanh.c10.model;

public class GiangVien extends Student {
    private String chuyenMon;

    public GiangVien(String id, String name, String birthday, String gender, String chuyenMon) {
        super(id, name, birthday, gender);
        this.chuyenMon = chuyenMon;
    }

    public GiangVien(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    public GiangVien() {
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    @Override
    public String toString() {
        return super.toString()+"," + chuyenMon ;
    }
}
