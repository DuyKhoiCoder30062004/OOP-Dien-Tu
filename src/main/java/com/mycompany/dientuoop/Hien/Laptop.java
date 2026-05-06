package com.mycompany.dientuoop.Hien;

import com.mycompany.dientuoop.Hien.Product;
import com.mycompany.dientuoop.Khoi.Supplier;
import java.util.Scanner;

public class Laptop extends Product {
    private String cpu;
    private String ram;


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
    
    //cho 1 class tên A
    //A: thuộc tính: String cat, dog , B: thuộc tính: String rắn, thỏ, sư tử
    //B kế thừa từ A
    
    
    public void hienThiChiTiet() {
        System.out.println("Laptop: " + tenSP +
                           ", CPU: " + cpu +
                           ", RAM: " + ram + ", Mã IMEI: " + imei + ", Tổng số lượng: " + soLuong + ", Phần trăm giảm giá: " + phanTramGiam +
                           ", Price: " + giaBan + ", Năm sản xuất: " + namSanXuat + ", Status: " + trangThai);
    }

    
    public void nhap() {
    Scanner s = new Scanner(System.in);


    System.out.print("Nhập tên sản phẩm: ");
    tenSP = s.nextLine();

    System.out.print("Nhập giá bán: ");
    giaBan = Double.parseDouble(s.nextLine());

    System.out.print("Nhập trạng thái (0: hết hàng, 1: còn hàng): ");
    trangThai = Integer.parseInt(s.nextLine());

    System.out.print("Nhập năm sản xuất: ");
    namSanXuat = Integer.parseInt(s.nextLine());

    System.out.print("Nhập IMEI: ");
    imei = s.nextLine();

    System.out.print("Nhập số lượng: ");
    soLuong = Integer.parseInt(s.nextLine());

    System.out.print("Nhập phần trăm giảm giá: ");
    phanTramGiam = Double.parseDouble(s.nextLine());

    System.out.print("Nhập CPU: ");
    cpu = s.nextLine();

    System.out.print("Nhập RAM: ");
    ram = s.nextLine();
    
    //làm thông tin chi tiết hơn thì laptop cho phép hiển thị tên nhà sản xuất, quốc gia
}

    public void xuat() { hienThiChiTiet(); }

    // Getters/Setters for cpu, ram
    public String getCpu() { return cpu; }
    public void setCpu(String cpu) { this.cpu = cpu; }

    public String getRam() { return ram; }
    public void setRam(String ram) { this.ram = ram; }
    
    public static void main(String[] args){
        ///String,String,double,int,Supplier,Supplier,int,String,int,double,String,String
   Laptop a = new Laptop("a","b");
   System.out.print(a.cpu + a.ram);
   System.out.print(a.getRam());
   System.out.print(a.getCpu());
   a.setRam("c");
   a.setCpu("d");
   System.out.print(a.cpu + a.ram + a.getRam() + a.getCpu());
   
    }
//   a.nhap();
//   a.xuat();
//}
}


//    public void xuat() {
//        hienThiChiTiet();
//    }
