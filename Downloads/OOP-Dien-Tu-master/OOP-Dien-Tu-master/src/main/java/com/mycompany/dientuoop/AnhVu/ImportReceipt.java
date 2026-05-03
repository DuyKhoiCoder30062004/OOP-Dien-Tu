package com.mycompany.dientuoop.AnhVu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//import com.mycompany.dientuoop.;
//package com.mycompany.dientuoop.Khoi;
/**
 *
 * @author HELLO
 */
//import java.util.ArrayList;

//import java.util.ArrayList;

import java.util.ArrayList;

import com.mycompany.dientuoop.Khoi.ImportDetail;

public class ImportReceipt {
    private String maPN;
    private String maNSX;
    private Employee nv; // Employee Name/ID
    private String ngayNhap;

    public String getMaPN() {
        return maPN;
    }

    public void setMaPN(String maPN) {
        this.maPN = maPN;
    }

    public String getMaNSX() {
        return maNSX;
    }

    public void setMaNSX(String maNSX) {
        this.maNSX = maNSX;
    }

    public Employee getNv() {
        return nv;
    }

    public void setNv(Employee nv) {
        this.nv = nv;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public ArrayList<ImportDetail> getDsChiTiet() {
        return dsChiTiet;
    }

    public void setDsChiTiet(ArrayList<ImportDetail> dsChiTiet) {
        this.dsChiTiet = dsChiTiet;
    }
    private double tongTien;
    private ArrayList<ImportDetail> dsChiTiet;

    public void nhap() { /* Implementation */ }
    public void xuat() { /* Implementation */ }
}
