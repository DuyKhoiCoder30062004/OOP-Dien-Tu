package com.mycompany.dientuoop.HuuTien;
import com.mycompany.dientuoop.HuuTien.Customer;
import com.mycompany.dientuoop.AnhVu.SalesStaff;
import com.mycompany.dientuoop.Khoi.FileHandler;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Scanner;
public class Order {
    private String MaHD;
    private Date ngayLap;
    private double tongTien;
    private int tinhTrangDon;
    private List<OrderDetail> dsChiTiet = new ArrayList<>();
    private Customer khachHang;
    private SalesStaff nhanVien;
    private FileHandler fileHandler;
    
    public Order(FileHandler fileHandler){
        this.fileHandler = fileHandler;
    }

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
    public void nhap() throws ParseException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã đơn hàng: ");
        this.MaHD = sc.nextLine();
        String input = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nhập ngày lập: ");
        Date ngayLap = sdf.parse(input);
        System.out.println("Nhập tổng tiền đơn hàng: ");
        this.tongTien = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập trạng thái Đơn hàng(0:còn tồn, 1: đã chuyển): ");
        this.tinhTrangDon = Integer.parseInt(sc.nextLine());
        if(tinhTrangDon < 0 || tinhTrangDon >1){
            System.out.println("Nhập lại trạng thái đơn hàng(0:còn tồn, 1: đã chuyển): ");
            System.exit(0);
        }
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public int getTinhTrangDon() {
        return tinhTrangDon;
    }

    public void setTinhTrangDon(int tinhTrangDon) {
        this.tinhTrangDon = tinhTrangDon;
    }

    // MaHD, ngayLap, tongTien, tinhTrangDon
    // //String,Date,double,int
    @Override
    public String toString() {
        return "Order{" + "MaHD=" + MaHD + ", ngayLap=" + ngayLap + ", tongTien=" + tongTien + ", tinhTrangDon=" + tinhTrangDon + ", dsChiTiet=" + dsChiTiet + ", khachHang=" + khachHang + ", nhanVien=" + nhanVien + ", fileHandler=" + fileHandler + '}';
    }
    
}