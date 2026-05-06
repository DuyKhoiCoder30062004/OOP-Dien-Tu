package com.mycompany.dientuoop.Hien;

import com.mycompany.dientuoop.Hien.Product;
//import com.mycompany.dientuoop.Khoi.Supplier;

//Phone và Product mang mối quan hệ kế thừa - inheritence
//Phone kế thừa Product, kế thừa dc thể hiện bằng từ khóa "extends" trong code
public class Phone extends Product {
    private int pin;
    private String OS;
    private double kichthuocMan;

    
    //Constructor - có liên quan tham số? có bao nhiêeu loại hàm liên quan tham số 
    //=> Có 2 loại hàm đk: có tham số & ko tham số
    //Constructor ko trả về gì cả, chỉ níu giữ access modifier thôi - phạm vi truy cập
    
    
    public Phone() {
    }
//    public ABC(){
//        super();
//    }
    
    //xài super ntn, super trong class kế thừa cần mang hết các tham số từ class nó thừa kế hết qua class đây lun
    //Product: maSP, tenSP, giaban,trangthai,nsx,nuocsanxuat,namSanXuat,imei,soLuong,phanTramGiam
    //Constructor kế thừa từ Product => Phone kế thừa Product
//    public Phone(String maSP, String tenSP, double giaBan, int trangThai, Supplier nsx, Supplier nuocSanXuat, int namSanXuat, String imei, int soLuong, double phanTramGiam){
//        super(maSP, tenSP, giaBan, trangThai,nsx,nuocSanXuat,namSanXuat,imei,soLuong,phanTramGiam);
//    }
    //Constructor
    public Phone(int pin, String OS, double kichthuocMan) {
        this.pin = pin;
        this.OS = OS;
        this.kichthuocMan = kichthuocMan;
    }

    // Constructor matching MainApp usage
    //ở đây định nghĩa sẵn kế thừa, đúc khuôn
    //có sẵn phiên bản của Phone có đầy đủ tham số và bản constructor khác để sử dụng
    public Phone(String maSP, String tenSP, double giaBan, String imei) {
        //super() hay super có tham số gọi tuân theo thứ tự constructor của lớp cha kế thừa
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

    //hàm nhap - ham nhap ko co tham so' #1
    public void nhap() { /* stub */ }
    public void xuat() { hienThiChiTiet(); }

    // Getters/Setters for pin, OS, kichthuocMan
    public int getPin() { return pin; }
    //ham` setPin - nhưng mang tham số là: pin kiểu int #2
    public void setPin(int pin) { this.pin = pin; }

    public String getOS() { return OS; }
    public void setOS(String OS) { this.OS = OS; }

    public double getKichthuocMan() { return kichthuocMan; }
    public void setKichthuocMan(double kichthuocMan) { this.kichthuocMan = kichthuocMan; }
}
