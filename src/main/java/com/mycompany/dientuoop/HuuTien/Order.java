package com.mycompany.dientuoop.HuuTien;
import com.mycompany.dientuoop.HuuTien.Customer;
import com.mycompany.dientuoop.AnhVu.SalesStaff;
import java.util.*;
public class Order {
    private String MaHD;
    private Date ngayLap;
    private double tongTien;
    private int tinhTrangDon;
    private List<OrderDetail> dsChiTiet = new ArrayList<>();
    private Customer khachHang;
    private SalesStaff nhanVien;

    public Order(String MaHD, Date ngayLap, double tongTien, int tinhTrangDon, Customer khachHang, SalesStaff nhanVien) {
        this.MaHD = MaHD;
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
        this.tinhTrangDon = tinhTrangDon;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
    }

    public Order() {}

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String maHD) {
        this.MaHD = maHD;
    }

    public double tinhTong() {
        tongTien = 0;
        for (OrderDetail d : dsChiTiet) {
            tongTien += d.thanhTien();
        }
        return tongTien;
    }

    public void addDetail(OrderDetail detail) {
        dsChiTiet.add(detail);
    }

    public void inHoaDon() {
        System.out.println("Hóa đơn: " + MaHD);
        System.out.println("Ngày lập: " + ngayLap);
        System.out.println("Khách hàng: " + (khachHang != null ? khachHang.getTenKH() : "N/A"));
        System.out.println("Nhân viên: " + (nhanVien != null ? nhanVien.getHoTen() : "N/A"));
        System.out.println("Chi tiết:");
        for (OrderDetail d : dsChiTiet) {
            System.out.println("- " + d.getSanPham().getTenSP() + " x " + d.getSoLuong() + " = " + d.thanhTien());
        }
        System.out.println("Tổng tiền: " + tinhTong());
    }

    public int getTinhTrang() {
        return tinhTrangDon;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrangDon = tinhTrang;
    }
}