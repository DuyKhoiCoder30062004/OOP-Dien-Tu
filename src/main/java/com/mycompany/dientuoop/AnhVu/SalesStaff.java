/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dientuoop.AnhVu;
import com.mycompany.dientuoop.AnhVu.Employee;

/**
 *
 * @author HELLO
 */
public class SalesStaff extends Employee {
    private double doanhSo;
    private double tiLeHoaHong;

    public SalesStaff(String maNv, String hoTen, double luongCoBan, int tinhTrang,
                      double doanhSo, double tiLeHoaHong) {
//        this.maNV = maNv;
//        this.hoTen = hoTen;
//        this.luongCoBan = luongCoBan;
/*Approach #2

*/  
        super(maNv, hoTen, luongCoBan, tinhTrang);
        this.doanhSo = doanhSo;
        this.tiLeHoaHong = tiLeHoaHong;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }
    public SalesStaff(double doanhSo, double tiLeHoaHong) {
        this.doanhSo = doanhSo;
        this.tiLeHoaHong = tiLeHoaHong;
    }

    public SalesStaff() {
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNV(String maNv) {
        this.maNv = maNv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getTiLeHoaHong() {
        return tiLeHoaHong;
    }

    public void setTiLeHoaHong(double tiLeHoaHong) {
        this.tiLeHoaHong = tiLeHoaHong;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + (doanhSo * tiLeHoaHong);
    }

    public void lapHoaDon() {
        System.out.println("SalesStaff " + hoTen + " lập hóa đơn.");
    }
}
