package Thuc_hanh.c08.model;

public class TaiKhoan {
    private int id = 1;
    private String maTaiKhoan;
    private String ten;
    private String ngayTaoTK;

    public TaiKhoan() {
    }

    public TaiKhoan(int id, String maTaiKhoan, String ten, String ngay) {
        this.id = id++;
        this.maTaiKhoan = maTaiKhoan;
        this.ten = ten;
        this.ngayTaoTK = ngay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgay() {
        return ngayTaoTK;
    }

    public void setNgay(String ngay) {
        this.ngayTaoTK = ngay;
    }

    @Override
    public String toString() {
        return "taiKhoan{" +
                "id=" + id +
                ", maTaiKhoan='" + maTaiKhoan + '\'' +
                ", ten='" + ten + '\'' +
                ", ngay='" + ngayTaoTK + '\'' +
                '}';
    }
}
