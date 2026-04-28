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
    private int trangThaiBH;

    public Warranty() {}

    public void nhap() { /* Implementation */ }
    public void xuat() { /* Implementation */ }
    public void capNhatTrangThai(int trangThaiMoi) { this.trangThaiBH = trangThaiMoi; }
}
