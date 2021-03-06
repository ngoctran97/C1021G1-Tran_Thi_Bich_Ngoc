package Thuc_hanh.c09.medellr;

public class DtXachTay extends Phone{
    private String quocGiaXT;
    private String trangThai;

    public DtXachTay(String quocGiaXT, String trangThai) {
        this.quocGiaXT = quocGiaXT;
        this.trangThai = trangThai;
    }

    public DtXachTay(String name, double giaban, int soLuong, String nhaSanXuat, String quocGiaXT, String trangThai) {
        super(name, giaban, soLuong, nhaSanXuat);
        this.quocGiaXT = quocGiaXT;
        this.trangThai = trangThai;
    }

    public String getQuocGiaXT() {
        return quocGiaXT;
    }

    public void setQuocGiaXT(String quocGiaXT) {
        this.quocGiaXT = quocGiaXT;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return super.toString() + "," + quocGiaXT + "," + trangThai;
    }
}
