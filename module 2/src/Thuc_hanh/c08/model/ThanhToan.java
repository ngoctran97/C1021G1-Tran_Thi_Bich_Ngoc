package Thuc_hanh.c08.model;

public class ThanhToan {
    private String soThe;
    private String tienTrongTK;

    public ThanhToan() {
    }

    public ThanhToan(String soThe, String tienTrongTK) {
        this.soThe = soThe;
        this.tienTrongTK = tienTrongTK;
    }

    public String getSoThe() {
        return soThe;
    }

    public void setSoThe(String soThe) {
        this.soThe = soThe;
    }

    public String getTienTrongTK() {
        return tienTrongTK;
    }

    public void setTienTrongTK(String tienTrongTK) {
        this.tienTrongTK = tienTrongTK;
    }

    @Override
    public String toString() {
        return "thanhToan{" +
                super.toString()+
                "soThe='" + soThe + '\'' +
                ", tienTrongTK='" + tienTrongTK + '\'' +
                '}';
    }
}
