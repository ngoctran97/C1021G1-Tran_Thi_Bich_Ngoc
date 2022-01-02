package Thuc_hanh.c09.service;

public interface IPhoneService  {
    public void xoa();
    public void xemDanhSach();
    public void timKiem();
    public void addnewXachTay();

    public default void addNewChinhHang() {

    }


}
