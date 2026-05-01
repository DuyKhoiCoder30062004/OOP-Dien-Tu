///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.dientuoop.Khoi;
//
//import com.mycompany.dientuoop.Khoi.FileHandler;
//import com.mycompany.dientuoop.Khoi.IQuanLy;
//
///**
// *
// * @author HELLO
// */
//public class ImportList implements IQuanLy {
//    private ImportReceipt[] danhSachPN;
//    private int soLuongPN;
//    private FileHandler fileHandler;
//
////    @Override
////    public void them() { /* Implementation */ }
////    @Override
////    public void xoa() { /* Implementation */ }
////    @Override
////    public void sua() { /* Implementation */ }
////    @Override
////    public void timKiem() { /* Implementation */ }
//    
//    public void timKiemTheoKhoangThoiGian(String tuNgay, String denNgay) { /* Implementation */ }
//    public double tinhTongVonNhapHang() { return 0.0; }
//
//    @Override
//    public void nhap() { /* Implementation */ }
//    @Override
//    public void xuat() { /* Implementation */ }
//}
////dependency FileHandler
///
///
import com.mycompany.dientuoop.AnhVu.ImportReceipt;
import java.util.List;
import java.util.ArrayList;
import com.mycompany.dientuoop.Khoi.FileHandler;
public class ImportList {
    private List<ImportReceipt> danhSachPN;   // Aggregation: holds ImportReceipt objects
    private int soLuongPN;
    private FileHandler fileHandler;          // Dependency: uses FileHandler

    public ImportList(FileHandler fileHandler) {
        this.danhSachPN = new ArrayList<>();
        this.fileHandler = fileHandler;
        this.soLuongPN = 0;
    }

    public void them(ImportReceipt obj) {
        danhSachPN.add(obj);
        soLuongPN++;
    }

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

    public void xoa(String id) {
        danhSachPN.removeIf(pn -> pn.getMaPN().equals(id));
        soLuongPN = danhSachPN.size();
    }

    public void sua(String id) {
        System.out.println("Editing ImportReceipt with id: " + id);
        // Logic to update receipt info
    }

    public List<ImportReceipt> getAll() {
        return danhSachPN;
    }

//    public void save(String fileName) {
//        fileHandler.saveToFile(danhSachPN, fileName);
//    }
//
//    public void loadFromFile(String fileName) {
//        danhSachPN = fileHandler.readFromFile(fileName);
//        soLuongPN = danhSachPN.size();
//    }
    public void saveToFile() {
    fileHandler.saveToFile(danhSachPN, "C:\\Users\\HELLO\\Downloads\\fileSave");
}

public void loadFromFile() {
    danhSachPN = fileHandler.readFromFile("C:\\Users\\HELLO\\Downloads\\fileSave");
    soLuongPN = danhSachPN.size();
}
}

