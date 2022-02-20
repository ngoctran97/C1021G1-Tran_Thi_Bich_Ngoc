package Thuc_hanh.C100.modelr;

public class NhapKhau extends SanPham{
    private int giaNK;
    private String tinhNK;
    private double thueNK;

    public NhapKhau( String maSP, String name, int giaBan, int soLuong, String nhaSX, int giaNK, String tinhNK, double thueNK) {
        super( maSP, name, giaBan, soLuong, nhaSX);
        this.giaNK = giaNK;
        this.tinhNK = tinhNK;
        this.thueNK = thueNK;
    }

    public NhapKhau(int giaNK, String tinhNK, double thueNK) {
        this.giaNK = giaNK;
        this.tinhNK = tinhNK;
        this.thueNK = thueNK;
    }

    public int getGiaNK() {
        return giaNK;
    }

    public void setGiaNK(int giaNK) {
        this.giaNK = giaNK;
    }

    public String getTinhNK() {
        return tinhNK;
    }

    public void setTinhNK(String tinhNK) {
        this.tinhNK = tinhNK;
    }

    public double getThueNK() {
        return thueNK;
    }

    public void setThueNK(double thueNK) {
        this.thueNK = thueNK;
    }

    @Override
    public String toString() {
        return "NhapKhau{" +
                super.toString()+
                "giaNK=" + giaNK +
                ", tinhNK='" + tinhNK + '\'' +
                ", thueNK=" + thueNK +
                '}';
    }
}
