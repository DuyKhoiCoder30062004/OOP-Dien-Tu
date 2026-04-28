package com.mycompany.dientuoop.Hien;

import com.mycompany.dientuoop.Hien.Product;

public class Laptop extends Product {
    private String cpu;
    private String ram;

    // Constructor matching MainApp usage
    public Laptop(String maSP, String tenSP, double giaBan, String cpu) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.cpu = cpu;
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
