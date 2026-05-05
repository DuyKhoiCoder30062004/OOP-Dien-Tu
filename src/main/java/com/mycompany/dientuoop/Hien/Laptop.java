package com.mycompany.dientuoop.Hien;

import com.mycompany.dientuoop.Hien.Product;
import com.mycompany.dientuoop.Khoi.Supplier;

public class Laptop extends Product {
    private String cpu;
    private String ram;

    public Laptop() {
    }

    public Laptop(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    // Constructor matching MainApp usage
    //maSp,tenSp,giaban,trangthai,nsx,nuocSanXuat,namSanXuat,imei,soLuong,phanTramGiam
    ////int,Supplier,Supplier,int,String,int,double
    public Laptop(String maSP, String tenSP, double giaBan, int trangThai, Supplier nsx, Supplier nuocSanXuat,int namSanXuat,String imei, int soLuong,double phanTramGiam, String cpu, String ram) {
        super(maSP,tenSP,giaBan,trangThai,nsx,nuocSanXuat,namSanXuat,imei,soLuong,phanTramGiam);
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
        this.cpu = cpu;
        this.ram = ram;
    }
    @Override
    public void hienThiChiTiet() {
        System.out.println("Laptop: " + tenSP +
                           ", CPU: " + cpu +
                           ", RAM: " + ram +
                           ", Price: " + giaBan);
    }

    public void nhap() { /* stub */ }
    public void xuat() { hienThiChiTiet(); }

    // Getters/Setters for cpu, ram
    public String getCpu() { return cpu; }
    public void setCpu(String cpu) { this.cpu = cpu; }

    public String getRam() { return ram; }
    public void setRam(String ram) { this.ram = ram; }
}

//    public void xuat() {
//        hienThiChiTiet();
//    }
