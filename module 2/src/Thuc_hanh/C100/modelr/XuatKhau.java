package Thuc_hanh.C100.modelr;

public class XuatKhau extends SanPham{
    private int giaXK;
    private String quocGiaXK;

    public XuatKhau( String maSP, String name, int giaBan, int soLuong, String nhaSX, int giaXK, String quocGiaXK) {
        super( maSP, name, giaBan, soLuong, nhaSX);
        this.giaXK = giaXK;
        this.quocGiaXK = quocGiaXK;
    }

    public XuatKhau(int giaXK, String quocGiaXK) {
        this.giaXK = giaXK;
        this.quocGiaXK = quocGiaXK;
    }

    public int getGiaXK() {
        return giaXK;
    }

    public void setGiaXK(int giaXK) {
        this.giaXK = giaXK;
    }

    public String getQuocGiaXK() {
        return quocGiaXK;
    }

    public void setQuocGiaXK(String quocGiaXK) {
        this.quocGiaXK = quocGiaXK;
    }

    @Override
    public String toString() {
        return "XuatKhau{" +
                super.toString()+
                "giaXK=" + giaXK +
                ", quocGiaXK='" + quocGiaXK + '\'' +
                '}';
    }
}
