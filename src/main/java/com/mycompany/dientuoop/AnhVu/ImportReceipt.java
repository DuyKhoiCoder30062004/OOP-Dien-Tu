package com.mycompany.dientuoop.AnhVu;

import java.util.ArrayList;

import com.mycompany.dientuoop.Khoi.ImportDetail;

public class ImportReceipt {
    private String maPN;
    private String maNSX;
    private Employee nv; // Employee Name/ID
    private String ngayNhap;

    public ImportReceipt() {
    }
//da co getter setter 
    public ImportReceipt(String maPN, String maNSX, Employee nv, String ngayNhap, double tongTien, ArrayList<ImportDetail> dsChiTiet) {
        this.maPN = maPN;
        this.maNSX = maNSX;
        this.nv = nv;
        this.ngayNhap = ngayNhap;
        this.tongTien = tongTien;
        this.dsChiTiet = dsChiTiet;
    }

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
