/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dientuoop.Khoi;

/**
 *
 * @author HELLO
 */
import com.mycompany.dientuoop.Hien.Product;
import java.util.Date;

public class Warranty {
    private String maBH;
    private String maHD;
    private Product maSPham; // Relationship with Product
    private String ngayBatDau;
    private String ngayKetThuc;
    private String ngayNhan;
    private String moTaLoi;

    public String getMaBH() {
        return maBH;
    }

    public void setMaBH(String maBH) {
        this.maBH = maBH;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public Product getMaSPham() {
        return maSPham;
    }

    public void setMaSPham(Product maSPham) {
        this.maSPham = maSPham;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(String ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public String getMoTaLoi() {
        return moTaLoi;
    }

    public void setMoTaLoi(String moTaLoi) {
        this.moTaLoi = moTaLoi;
    }

    public int getTrangThaiBH() {
        return trangThaiBH;
    }

    public void setTrangThaiBH(int trangThaiBH) {
        this.trangThaiBH = trangThaiBH;
    }
    private int trangThaiBH;

    public Warranty() {}

    public void nhap() { /* Implementation */ }
    public void xuat() { /* Implementation */ }
    public void capNhatTrangThai(int trangThaiMoi) { this.trangThaiBH = trangThaiMoi; }
}
