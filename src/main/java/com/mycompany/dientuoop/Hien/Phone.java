package com.mycompany.dientuoop.Hien;

import com.mycompany.dientuoop.Hien.Product;

public class Phone extends Product {
    private int pin;
    private String OS;
    private double kichthuocMan;

    public Phone() {
    }

    public Phone(int pin, String OS, double kichthuocMan) {
        this.pin = pin;
        this.OS = OS;
        this.kichthuocMan = kichthuocMan;
    }

    // Constructor matching MainApp usage
    //ở đây định nghĩa sẵn kế thừa, đúc khuôn
    //có sẵn phiên bản của Phone có đầy đủ tham số và bản constructor khác để sử dụng
    public Phone(String maSP, String tenSP, double giaBan, String imei) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.imei = imei;
    }

    @Override
    public void hienThiChiTiet() {
        System.out.println("Phone: " + tenSP +
                           ", IMEI: " + imei +
                           ", OS: " + OS +
                           ", Pin: " + pin +
                           ", Screen: " + kichthuocMan +
                           ", Price: " + giaBan);
    }

    public void nhap() { /* stub */ }
    public void xuat() { hienThiChiTiet(); }

    // Getters/Setters for pin, OS, kichthuocMan
    public int getPin() { return pin; }
    public void setPin(int pin) { this.pin = pin; }

    public String getOS() { return OS; }
    public void setOS(String OS) { this.OS = OS; }

    public double getKichthuocMan() { return kichthuocMan; }
    public void setKichthuocMan(double kichthuocMan) { this.kichthuocMan = kichthuocMan; }
}
