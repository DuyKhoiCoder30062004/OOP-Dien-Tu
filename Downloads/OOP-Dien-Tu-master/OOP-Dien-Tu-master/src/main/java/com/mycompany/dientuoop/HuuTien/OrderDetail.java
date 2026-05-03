package com.mycompany.dientuoop.HuuTien;
import java.util.Scanner;
import com.mycompany.dientuoop.Hien.Product;
public class OrderDetail {
    private int soLuong;
    private double donGia;
    private Product maSP;
    private Order maHD;

    public OrderDetail() {
    }

    public OrderDetail(int soLuong, double donGia, Order maHD) {
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.maHD = maHD;
    }
    
    //getter và setter
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public Product getMaSP() {
        return maSP;
    }
    public void setMaSP(Product maSP) {
        this.maSP = maSP;
    }

    public Order getMaHD() {
        return maHD;
    }
    public void setMaHD(Order maHD) {
        this.maHD = maHD;
    }

    public double tinhThanhTien() {
        return this.soLuong * this.donGia;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng: ");
        this.soLuong = sc.nextInt();
        System.out.print("Nhập đơn giá: ");
        this.donGia = sc.nextDouble();
    }

    public void xuat() {
        // Giả sử lớp Product có hàm getTenSP()
        String tenSP = (maSP != null) ? maSP.getTenSP() : "Chưa xác định"; 
        System.out.printf("Sản phẩm: %-20s | Số lượng: %-5d | Giá bán: %-10.2f | Thành tiền: %-10.2f\n", 
                          tenSP, soLuong, donGia, tinhThanhTien());
    }
}
