/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dientuoop.Khoi;

/**
 *
 * @author HELLO
 */
public class Supplier {
    private String maNSX;
    private String tenNSX;
    private String quocGia;
    private String soDienThoai;

    public String getMaNSX() {
        return maNSX;
    }

    public void setMaNSX(String maNSX) {
        this.maNSX = maNSX;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    private String diaChi;
    private int tinhTrang;

    public Supplier() {}

    public Supplier(String maNSX, String tenNSX, String quocGia, String soDienThoai, String diaChi, int tinhTrang) {
        this.maNSX = maNSX;
        this.tenNSX = tenNSX;
        this.quocGia = quocGia;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.tinhTrang = tinhTrang;
    }

    // Getters and Setters
    public int getTinhTrang() { return tinhTrang; }
    public void setTinhTrang(int tinhTrang) { this.tinhTrang = tinhTrang; }
    
    public void nhap() { /* Implementation */ }
    public void xuat() { /* Implementation */ }
}
