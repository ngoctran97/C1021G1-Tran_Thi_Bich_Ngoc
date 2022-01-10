package Thuc_hanh.c08.model;

public class tietKiem {
    private double tienTietKiem;
    private String ngayGuiTietKiem;
    private double laiXuat;
    private int kiHan;

    public tietKiem() {
    }

    public tietKiem(double tienTietKiem, String ngayGuiTietKiem, double laiXuat, int kiHan) {
        this.tienTietKiem = tienTietKiem;
        this.ngayGuiTietKiem = ngayGuiTietKiem;
        this.laiXuat = laiXuat;
        this.kiHan = kiHan;
    }

    public double getTienTietKiem() {
        return tienTietKiem;
    }

    public void setTienTietKiem(double tienTietKiem) {
        this.tienTietKiem = tienTietKiem;
    }

    public String getNgayGuiTietKiem() {
        return ngayGuiTietKiem;
    }

    public void setNgayGuiTietKiem(String ngayGuiTietKiem) {
        this.ngayGuiTietKiem = ngayGuiTietKiem;
    }

    public double getLaiXuat() {
        return laiXuat;
    }

    public void setLaiXuat(double laiXuat) {
        this.laiXuat = laiXuat;
    }

    public int getKiHan() {
        return kiHan;
    }

    public void setKiHan(int kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String toString() {
        return "tietKiem{" +
                super.toString()+
                "tienTietKiem=" + tienTietKiem +
                ", ngayGuiTietKiem='" + ngayGuiTietKiem + '\'' +
                ", laiXuat=" + laiXuat +
                ", kiHan=" + kiHan +
                '}';
    }
}
