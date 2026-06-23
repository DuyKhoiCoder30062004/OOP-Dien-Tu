/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dientuoop.Khoi;

/**
 *
 * @author HELLO
 */
import com.mycompany.dientuoop.AnhVu.Employee;
import java.util.ArrayList;
import java.util.List;

public class ImportReceipt {
    private String maPN;          // Mã phiếu nhập
    private String maNSX;         // Mã nhà sản xuất
    private Employee nv;          // Nhân viên nhập
    private String ngayNhap;      // Ngày nhập
    private double tongTien;      // Tổng tiền
    private List<ImportDetail> dsChiTiet; // Danh sách chi tiết nhập

    // Constructor
    public ImportReceipt() {
        dsChiTiet = new ArrayList<>();
    }

    // Method nhập (input)
    public void nhap() {
        System.out.println("Nhập phiếu nhập với mã: " + maPN);
        // Logic nhập dữ liệu từ bàn phím hoặc file có thể thêm ở đây
    }

    // Method xuất (output)
    public void xuat() {
//        System.out.println("===== Phiếu nhập =====");
//        System.out.println("Mã PN: " + maPN);
//        System.out.println("Mã NSX: " + maNSX);
//        System.out.println("Nhân viên: " + (nv != null ? nv.getHoTen() : "N/A"));
//        System.out.println("Ngày nhập: " + ngayNhap);
//        System.out.println("Tổng tiền: " + tongTien);
//        System.out.println("Chi tiết nhập:");
//        for (ImportDetail detail : dsChiTiet) {
//            detail.xuat();
//        }
    }

    // Getter & Setter
    public String getMaPN() {
        return maPN;
    }

    public void setMaPN(String maPN) {
        this.maPN = maPN;
    }

    public String getMaNSX() {
        return maNSX;
    }

    public void setMaNSX(String maNSX) {
        this.maNSX = maNSX;
    }

    public Employee getNv() {
        return nv;
    }

    public void setNv(Employee nv) {
        this.nv = nv;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public List<ImportDetail> getDsChiTiet() {
        return dsChiTiet;
    }

    public void setDsChiTiet(List<ImportDetail> dsChiTiet) {
        this.dsChiTiet = dsChiTiet;
    }
}

