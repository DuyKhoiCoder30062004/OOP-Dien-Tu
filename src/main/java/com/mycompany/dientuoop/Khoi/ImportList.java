///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.dientuoop.Khoi;
//
package com.mycompany.dientuoop.Khoi;
import com.mycompany.dientuoop.AnhVu.ImportReceipt;
import java.util.List;
import java.util.ArrayList;
import com.mycompany.dientuoop.Khoi.FileHandler;
import com.mycompany.dientuoop.Khoi.IQuanLy;
import java.io.IOException;
public class ImportList implements IQuanLy<ImportReceipt> {
    private List<ImportReceipt> dsPN;   // Aggregation: holds ImportReceipt objects
    private int soLuongPN;
    private FileHandler fileHandler;          // Dependency: uses FileHandler

    public ImportList(FileHandler fileHandler) {
        this.dsPN = new ArrayList<>();
        this.fileHandler = fileHandler;
        this.soLuongPN = 0;
    }
    
    @Override
    public void them(ImportReceipt obj) {
        dsPN.add(obj);
        soLuongPN++;
    }
    //nhap,xuat,them,sua,xoa,timkiem
    //thongKeTheoKhoangThoiGian, tinhTongVonNhapHang, timKiemTheoNhanVien
    @Override
    public ImportReceipt timKiem(String id) {
        return dsPN.stream()
                .filter(pn -> pn.getMaPN().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void thongKeTheoKhoangThoiGian(String tuNgay, String denNgay) {
        System.out.println("Listing receipts between " + tuNgay + " and " + denNgay);
        // You’d parse dates and filter receipts here
    }

    public double tinhTongVonNhapHang() {
        return dsPN.stream()
                .mapToDouble(ImportReceipt::getTongTien)
                .sum();
    }

    public ImportReceipt timKiemTheoNhanVien(String maNV) {
        return dsPN.stream()
                .filter(pn -> pn.getNv().getMaNv().equals(maNV))
                .findFirst()
                .orElse(null);
    }
    @Override
    public void xoa(String id) {
        dsPN.removeIf(pn -> pn.getMaPN().equals(id));
        soLuongPN = dsPN.size();
    }
    @Override
    public void sua(String id) {
        System.out.println("Editing ImportReceipt with id: " + id);
        // Logic to update receipt info
    }

    public List<ImportReceipt> getAll() {
        return dsPN;
    }
    
    //Dependency with FileHandler
    public void saveToFile() {
    fileHandler.saveToFile(dsPN, "C:\\Users\\HELLO\\Downloads\\fileSave");
}

public void loadFromFile() throws IOException {
    dsPN = (List<ImportReceipt>) fileHandler.readFromFile("C:\\Users\\HELLO\\Downloads\\fileSave");
    soLuongPN = dsPN.size();
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

