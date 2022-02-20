package demo.medol;

public class SanPham {
    private int id;
    static int sanPhamid = 1;
    private String maSP;
    private String name;
    private int giaBan;
    private int soLuong;
    private String nhaSX;

    public SanPham(int id, String maSP, String name, int giaBan, int soLuong, String nhaSX) {
        this.id = id;
        this.maSP = maSP;
        this.name = name;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nhaSX = nhaSX;
    }

    public SanPham() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getSanPhamid() {
        return sanPhamid;
    }

    public static void setSanPhamid(int sanPhamid) {
        SanPham.sanPhamid = sanPhamid;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "id=" + id +
                ", maSP='" + maSP + '\'' +
                ", name='" + name + '\'' +
                ", giaBan=" + giaBan +
                ", soLuong=" + soLuong +
                ", nhaSX='" + nhaSX + '\'' +
                '}';
    }
}
