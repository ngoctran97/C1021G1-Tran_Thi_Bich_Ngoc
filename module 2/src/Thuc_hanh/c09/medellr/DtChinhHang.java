package Thuc_hanh.c09.medellr;

public class DtChinhHang extends Phone{
    private int thoiGiangBH;
    private String phamViBH;

    public DtChinhHang(int thoiGiangBH, String phamViBH) {
        this.thoiGiangBH = thoiGiangBH;
        this.phamViBH = phamViBH;
    }

    public DtChinhHang(String name, double giaban, int soLuong, String nhaSanXuat, int thoiGiangBH, String phamViBH) {
        super(name, giaban, soLuong, nhaSanXuat);
        this.thoiGiangBH = thoiGiangBH;
        this.phamViBH = phamViBH;
    }

    public int getThoiGiangBH() {
        return thoiGiangBH;
    }

    public void setThoiGiangBH(int thoiGiangBH) {
        this.thoiGiangBH = thoiGiangBH;
    }

    public String getPhamViBH() {
        return phamViBH;
    }

    public void setPhamViBH(String phamViBH) {
        this.phamViBH = phamViBH;
    }

    @Override
    public String toString() {
        return "DtChinhHang{" +
                super.toString()+
                "thoiGiangBH='" + thoiGiangBH + '\'' +
                ", phamViBH='" + phamViBH + '\'' +
                '}';
    }
}
