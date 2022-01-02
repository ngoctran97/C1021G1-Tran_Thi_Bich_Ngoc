package Thuc_hanh.c09.medellr;

import java.util.Comparator;

public class Phone implements Comparable<Phone>, Comparator<Phone> {
    private int id;
    static int phoneid = 1;
    private String name;
    private double giaban;
    private int soLuong;
    private String nhaSanXuat;

    public Phone() {
    }

    public Phone( String name, double giaban, int soLuong, String nhaSanXuat) {
        this.id = phoneid++;
        this.name = name;
        this.giaban = giaban;
        this.soLuong = soLuong;
        this.nhaSanXuat = nhaSanXuat;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getPhoneid() {
        return phoneid;
    }

    public static void setPhoneid(int phoneid) {
        Phone.phoneid = phoneid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giaban=" + giaban +
                ", soLuong=" + soLuong +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                '}';
    }

    @Override
    public int compareTo(Phone o) {
        if(this.giaban > o.getGiaban()){
            return 1;
        }else if(this.giaban == o.getGiaban()){
            return 0;
        }else
        return -1;
    }

    @Override
    public int compare(Phone o1, Phone o2) {
        if(o1.giaban > o2.getGiaban()){
            return 1;
        }else if(o1.giaban == o2.getGiaban()){
            return 0;
        }else
        return 0;
    }
}
