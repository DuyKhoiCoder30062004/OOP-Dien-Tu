package com.mycompany.dientuoop.HuuTien;
import com.mycompany.dientuoop.Hien.Product;
import com.mycompany.dientuoop.HuuTien.Order;
public class OrderDetail {
    private int soLuong;
    private double giaBan;
    private Product sanPham;
    private Order hopDong;

    public OrderDetail(int soLuong, double giaBan, Product sanPham, Order hopDong) {
        this.soLuong = soLuong;
        this.giaBan = giaBan;
        this.sanPham = sanPham;
        this.hopDong = hopDong;
    }

    public OrderDetail() {
    }

    public double thanhTien() {
        return soLuong * giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public Product getSanPham() {
        return sanPham;
    }

    public void setSanPham(Product sanPham) {
        this.sanPham = sanPham;
    }

    public Order getHopDong() {
        return hopDong;
    }

    public void setHopDong(Order hopDong) {
        this.hopDong = hopDong;
    }
}