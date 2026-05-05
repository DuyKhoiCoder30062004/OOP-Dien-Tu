/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dientuoop.Hien;

import com.mycompany.dientuoop.Khoi.Supplier;
import com.mycompany.dientuoop.Khoi.Discountable;

/**
 *
 * @author HELLO
 */
public abstract class Product implements Discountable {
    protected String maSP; 
    protected String tenSP;
    protected double giaBan;
    protected int trangThai; 
    protected Supplier nsx; // Relationship with Supplier
    protected Supplier nuocSanXuat;
    protected int namSanXuat;
    protected String imei;
    protected int soLuong;
    protected double phanTramGiam;

    public Product() {
    }

    public Product(String maSP, String tenSP, double giaBan, int trangThai, Supplier nsx, Supplier nuocSanXuat, int namSanXuat, String imei, int soLuong, double phanTramGiam) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.trangThai = trangThai;
        this.nsx = nsx;
        this.nuocSanXuat = nuocSanXuat;
        this.namSanXuat = namSanXuat;
        this.imei = imei;
        this.soLuong = soLuong;
        this.phanTramGiam = phanTramGiam;
    }

    public abstract void hienThiChiTiet();

    @Override
    public double applyDiscount(double amount) {
        return amount - (amount * phanTramGiam / 100);
    }

    public void displayInfo() {
        System.out.println("ID: " + maSP + ", Name: " + tenSP + ", Price: " + giaBan);
    }

    @Override
    public String toString() {
        return maSP + " - " + tenSP;
    }

    // Getters and Setters
    public int getTrangThai() { return trangThai; }
    public void setTrangThai(int trangThai) { this.trangThai = trangThai; }
    // Getters and Setters
public String getMaSP() {
    return maSP;
}

public void setMaSP(String maSP) {
    this.maSP = maSP;
}

public String getTenSP() {
    return tenSP;
}

public void setTenSP(String tenSP) {
    this.tenSP = tenSP;
}

public double getGiaBan() {
    return giaBan;
}

public void setGiaBan(double giaBan) {
    this.giaBan = giaBan;
}

public Supplier getNsx() {
    return nsx;
}

public void setNsx(Supplier nsx) {
    this.nsx = nsx;
}

public Supplier getNuocSanXuat() {
    return nuocSanXuat;
}

public void setNuocSanXuat(Supplier nuocSanXuat) {
    this.nuocSanXuat = nuocSanXuat;
}

public int getNamSanXuat() {
    return namSanXuat;
}

public void setNamSanXuat(int namSanXuat) {
    this.namSanXuat = namSanXuat;
}

public String getImei() {
    return imei;
}

public void setImei(String imei) {
    this.imei = imei;
}

public int getSoLuong() {
    return soLuong;
}

public void setSoLuong(int soLuong) {
    this.soLuong = soLuong;
}

public double getPhanTramGiam() {
    return phanTramGiam;
}

public void setPhanTramGiam(double phanTramGiam) {
    this.phanTramGiam = phanTramGiam;
}

}
