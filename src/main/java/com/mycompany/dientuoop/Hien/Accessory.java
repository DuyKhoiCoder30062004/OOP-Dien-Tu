/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dientuoop.Hien;

import java.util.Scanner;

public class Accessory {
    
        // Attributes
    private String loaiKetnoi;
    private String loaiPhukien;
    private int thoiGianBaoHanh;
    private String mauSac;
     // Constructor
    public Accessory(String loaiKetnoi, String loaiPhukien, int thoiGianBaoHanh, String mauSac) {
        this.loaiKetnoi = loaiKetnoi;
        this.loaiPhukien = loaiPhukien;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.mauSac = mauSac;
    }

    public Accessory() {
        super();
    }
    
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

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
   

    // Methods
    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập loại kết nối: ");
        loaiKetnoi = sc.nextLine();

        System.out.print("Nhập loại phụ kiện: ");
        loaiPhukien = sc.nextLine();

        System.out.print("Nhập thời gian bảo hành (tháng): ");
        thoiGianBaoHanh = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Nhập màu sắc: ");
        mauSac = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Phụ kiện:");
        System.out.println("  Loại kết nối: " + loaiKetnoi);
        System.out.println("  Loại phụ kiện: " + loaiPhukien);
        System.out.println("  Thời gian bảo hành: " + thoiGianBaoHanh + " tháng");
        System.out.println("  Màu sắc: " + mauSac);
    }

    public boolean kiemTraBaoHanh() {
        // Ví dụ: còn bảo hành nếu thời gian > 0
        return thoiGianBaoHanh > 0;
    }
}

