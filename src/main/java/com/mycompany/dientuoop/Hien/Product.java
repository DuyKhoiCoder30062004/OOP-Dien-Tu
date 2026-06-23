    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dientuoop.Hien;
import com.mycompany.dientuoop.Khoi.Discountable;
import com.mycompany.dientuoop.Khoi.FileHandler;
import com.mycompany.dientuoop.Khoi.Supplier;
import java.util.Scanner;


/**
 *
 * @author HELLO
 */


public class Product implements Discountable {
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
    private FileHandler fileHandler;

    
    public Product() {
    }
    public Product(FileHandler fileHandler){
        this.fileHandler = fileHandler;
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

    public void hienThiChiTiet(){};

    @Override
    public double applyDiscount(double amount) {
        return amount - (amount * phanTramGiam / 100);
    }

    public void displayInfo() {
        System.out.println("ID: " + maSP + ", Name: " + tenSP + ", Price: " + giaBan);
    }

//    @Override
//    public String toString() {
//        return maSP + " - " + tenSP;
//    }

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
public void nhap(){
    //do cái nhap này là để lưu các properties vào constructor trước
    //  lưu vào file luôn, rồi mới có filled data để cho vô list
    //rồi từ list mới lưu vào file
 // cần làm giống bên Customer của Tiến   
 
 //maSP,tenSP,giaBan, trangThai,namSanXuat,imei,soLuong, phanTramGiam
 Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm: ");
        this.maSP = sc.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        this.tenSP = sc.nextLine();
        System.out.println("Nhập giá bán sản phẩm: ");
        this.giaBan = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập trạng thái sản phẩm(0:hết hàng, 1: còn bán): ");
        this.trangThai = Integer.parseInt(sc.nextLine());
        if(trangThai < 0 || trangThai >1){
            System.out.println("Nhập lại trạng thái sản phẩm(0:hết hàng, 1: còn bán): ");
            System.exit(0);
        }
        System.out.println("Nhập năm sản xuất: ");
        this.namSanXuat = Integer.parseInt(sc.nextLine());
        //Mã IMEI cho phép nhập bừa, chưa có căn cấu trúc
        System.out.println("Nhập mã IMEI: ");
        this.imei = sc.nextLine();
        System.out.println("Nhập số lượng: ");
        this.soLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập phần trăm giảm giá: ");
        this.phanTramGiam = sc.nextDouble();
        //
}
public void xuat() {
        System.out.printf("Mã SP: %s | Tên SP: %s | Giá bán SP: %f | Trạng thái SP: %d | Năm sản xuất: %d | Mã IMEI: %s | Số lượng: %d | Phần trăm giảm: %f\n", 
                maSP, tenSP, giaBan, trangThai, namSanXuat,imei,soLuong, phanTramGiam);
    }

    @Override
    public String toString() {
        return String.format("%s \t|%s|%.2f|%d|%d|%s|%d|%.2f",
        maSP, tenSP, giaBan, trangThai, namSanXuat, imei, soLuong, phanTramGiam);
    }
}
