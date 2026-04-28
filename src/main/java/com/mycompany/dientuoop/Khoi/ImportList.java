/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dientuoop.Khoi;

import com.mycompany.dientuoop.Khoi.FileHandler;
import com.mycompany.dientuoop.Khoi.IQuanLy;

/**
 *
 * @author HELLO
 */
public class ImportList implements IQuanLy {
    private ImportReceipt[] danhSachPN;
    private int soLuongPN;
    private FileHandler fileHandler;

    @Override
    public void them() { /* Implementation */ }
    @Override
    public void xoa() { /* Implementation */ }
    @Override
    public void sua() { /* Implementation */ }
    @Override
    public void timKiem() { /* Implementation */ }
    
    public void timKiemTheoKhoangThoiGian(String tuNgay, String denNgay) { /* Implementation */ }
    public double tinhTongVonNhapHang() { return 0.0; }

    @Override
    public void nhap() { /* Implementation */ }
    @Override
    public void xuat() { /* Implementation */ }
}
