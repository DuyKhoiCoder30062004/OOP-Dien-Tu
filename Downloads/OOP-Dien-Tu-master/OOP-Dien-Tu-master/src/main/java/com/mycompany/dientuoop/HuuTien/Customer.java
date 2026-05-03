package com.mycompany.dientuoop.HuuTien;

import java.util.Scanner;
import com.mycompany.dientuoop.Khoi.Discountable;
import java.io.Serializable;

public class Customer implements Discountable, Serializable {
    private String maKH;
    private String tenKH;
    private String loaiKH;
    private int tinhTrang;
    private int diemTichLuy;

    // Constructor mặc định
    public Customer() {
    }

    public Customer(String maKH, String tenKH, String loaiKH) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.loaiKH = loaiKH;
        this.tinhTrang = 0; // Giá trị mặc định cho tình trạng
        this.diemTichLuy = 0; // Giá trị mặc định cho điểm tích lũy
    }

    // Getter và Setter
    public String getMaKH() {
        return maKH;
    }
    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    
    }
    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getLoaiKH() {
        return loaiKH;
    }
    public void setLoaiKH(String loaiKH) {
        this.loaiKH = loaiKH;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }
    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int getDiemTichLuy() {
        return diemTichLuy;
    }
    public void setDiemTichLuy(int diemTichLuy) {
        this.diemTichLuy = diemTichLuy;
    }

    @Override
    public double applyDiscount(double totalAmount) {
        if(this.diemTichLuy >= 1000) {
            System.out.print(totalAmount*0.1);
            return totalAmount * 0.1; // Giảm giá 10% nếu điểm tích lũy >= 1000
        } else if(this.diemTichLuy >= 500) {
            System.out.print(totalAmount*0.05);
            return totalAmount * 0.05; // Giảm giá 5% nếu điểm tích lũy >= 500
            
        } else {
            return 0; // Không giảm giá nếu điểm tích lũy < 500
        }
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã khách hàng: ");
        this.maKH = sc.nextLine();
        System.out.print("Nhập tên khách hàng: ");
        this.tenKH = sc.nextLine();
        System.out.print("Nhập loại khách hàng: ");
        this.loaiKH = sc.nextLine();
        System.out.print("Nhập điểm tích lũy: ");
        this.diemTichLuy = Integer.parseInt(sc.next());
        System.out.print("Nhập tình trạng (0: Không hoạt động, 1: Hoạt động): ");
        this.tinhTrang = Integer.parseInt(sc.next());
    }

    public void xuat() {
        System.out.printf("Mã KH: %s | Tên KH: %s | Loại KH: %s | Điểm tích lũy: %d | Tình trạng: %d\n", 
                maKH, tenKH, loaiKH, diemTichLuy, tinhTrang);
    }
    public static void main(String[] args){
        Customer m = new Customer();
        m.nhap();
        m.xuat();
        m.applyDiscount(10000);
        
    }
}
