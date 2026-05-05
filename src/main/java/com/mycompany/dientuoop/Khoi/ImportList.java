///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.dientuoop.Khoi;
//

import com.mycompany.dientuoop.AnhVu.ImportReceipt;
import java.util.List;
import java.util.ArrayList;
import com.mycompany.dientuoop.Khoi.FileHandler;
import com.mycompany.dientuoop.Khoi.IQuanLy;
public class ImportList implements IQuanLy<ImportReceipt> {
    private List<ImportReceipt> danhSachPN;   // Aggregation: holds ImportReceipt objects
    private int soLuongPN;
    private FileHandler fileHandler;          // Dependency: uses FileHandler

    public ImportList(FileHandler fileHandler) {
        this.danhSachPN = new ArrayList<>();
        this.fileHandler = fileHandler;
        this.soLuongPN = 0;
    }
    
    @Override
    public void them(ImportReceipt obj) {
        danhSachPN.add(obj);
        soLuongPN++;
    }
    //nhap,xuat,them,sua,xoa,timkiem
    //thongKeTheoKhoangThoiGian, tinhTongVonNhapHang, timKiemTheoNhanVien
    @Override
    public ImportReceipt timKiem(String id) {
        return danhSachPN.stream()
                .filter(pn -> pn.getMaPN().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void thongKeTheoKhoangThoiGian(String tuNgay, String denNgay) {
        System.out.println("Listing receipts between " + tuNgay + " and " + denNgay);
        // You’d parse dates and filter receipts here
    }

    public double tinhTongVonNhapHang() {
        return danhSachPN.stream()
                .mapToDouble(ImportReceipt::getTongTien)
                .sum();
    }

    public ImportReceipt timKiemTheoNhanVien(String maNV) {
        return danhSachPN.stream()
                .filter(pn -> pn.getNv().getMaNV().equals(maNV))
                .findFirst()
                .orElse(null);
    }
    @Override
    public void xoa(String id) {
        danhSachPN.removeIf(pn -> pn.getMaPN().equals(id));
        soLuongPN = danhSachPN.size();
    }
    @Override
    public void sua(String id) {
        System.out.println("Editing ImportReceipt with id: " + id);
        // Logic to update receipt info
    }

    public List<ImportReceipt> getAll() {
        return danhSachPN;
    }
    
    //Dependency with FileHandler
    public void saveToFile() {
    fileHandler.saveToFile(danhSachPN, "C:\\Users\\HELLO\\Downloads\\fileSave");
}

public void loadFromFile() {
    danhSachPN = fileHandler.readFromFile("C:\\Users\\HELLO\\Downloads\\fileSave");
    soLuongPN = danhSachPN.size();
}

    @Override
    public void nhap() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void xuat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

