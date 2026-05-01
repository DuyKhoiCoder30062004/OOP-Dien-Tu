/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dientuoop.Hien;

import java.util.Scanner;

public class Accessory {

    public String getLoaiKetnoi() {
        return loaiKetnoi;
    }

    public void setLoaiKetnoi(String loaiKetnoi) {
        this.loaiKetnoi = loaiKetnoi;
    }

    public String getLoaiPhukien() {
        return loaiPhukien;
    }

    public void setLoaiPhukien(String loaiPhukien) {
        this.loaiPhukien = loaiPhukien;
    }

    public int getThoigianBaoHanh() {
        return thoigianBaoHanh;
    }

    public void setThoigianBaoHanh(int thoigianBaoHanh) {
        this.thoigianBaoHanh = thoigianBaoHanh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    // Attributes
    private String loaiKetnoi;
    private String loaiPhukien;
    private int thoigianBaoHanh;
    private String mauSac;

    // Constructor
    public Accessory() {
    }

    // Methods
    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập loại kết nối: ");
        loaiKetnoi = sc.nextLine();

        System.out.print("Nhập loại phụ kiện: ");
        loaiPhukien = sc.nextLine();

        System.out.print("Nhập thời gian bảo hành (tháng): ");
        thoigianBaoHanh = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Nhập màu sắc: ");
        mauSac = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Phụ kiện:");
        System.out.println("  Loại kết nối: " + loaiKetnoi);
        System.out.println("  Loại phụ kiện: " + loaiPhukien);
        System.out.println("  Thời gian bảo hành: " + thoigianBaoHanh + " tháng");
        System.out.println("  Màu sắc: " + mauSac);
    }

    public boolean kiemtraBaoHanh() {
        // Ví dụ: còn bảo hành nếu thời gian > 0
        return thoigianBaoHanh > 0;
    }
}

