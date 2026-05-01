/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dientuoop.Khoi;
import com.mycompany.dientuoop.AnhVu.Employee;

/**
 *
 * @author HELLO
 */
public class SalesStaff extends Employee {
    private double doanhSo;
    private double tiLeHoaHong;

    public SalesStaff(String maNV, String hoTen, double luongCoBan,
                      double doanhSo, double tiLeHoaHong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.doanhSo = doanhSo;
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
