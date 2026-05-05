///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.dientuoop.Khoi;
//
import com.mycompany.dientuoop.Khoi.Warranty;
import com.mycompany.dientuoop.Khoi.FileHandler;
import com.mycompany.dientuoop.Khoi.IQuanLy;
import java.util.List;

/**
 *
 * @author HELLO
 */
public class WarrantyList implements IQuanLy<Warranty> {
    private List<Warranty> danhSachBH;
    private int soLuongBH;
    private FileHandler fileHandler;
    
    @Override
    public void nhap() {  }
    @Override
    public void xuat() { }

    public void xuatDanhSachDangSua() { 
        System.out.println("=== Danh sách bảo hành đang sửa ===");
        for (Warranty w : danhSachBH) {
            if (w.getTrangThaiBH() == 1) { // giả sử 1 = đang sửa
                w.xuat();
            }
        }
    }

    @Override
    public void them(Warranty obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sua(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void xoa(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Warranty timKiem(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public List<Warranty> getAll() {
        return danhSachBH;
    }
    
}
//timKiem, xoa, sua, them, 
////dependency FileHandler
