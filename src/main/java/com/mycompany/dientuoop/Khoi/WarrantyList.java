///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
package com.mycompany.dientuoop.Khoi;
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
    private List<Warranty> dsBH;
    private int soLuongBH;
    private FileHandler fileHandler;
    private Utils utils;
    public WarrantyList(FileHandler fileHandler) {
//            this.customers = new Customer[100]; // Giả sử tối đa 100 khách hàng
//            this.soLuongKH = 0;
            this.fileHandler = fileHandler;
        }
    public WarrantyList(Utils utils){
        this.utils = utils;
    }
    @Override
    public void nhap() {  }
    @Override
    public void xuat() { }

    public void xuatDanhSachDangSua() { 
        System.out.println("=== Danh sách bảo hành đang sửa ===");
        for (Warranty w : dsBH) {
            if (w.getTrangThaiBH() == 1) { // giả sử 1 = đang sửa
                w.xuat();
            }
        }
    }

    @Override
    public void them(Warranty w) {
        dsBH.add(w);
        fileHandler.saveToFile(dsBH, "C:\\Users\\HELLO\\Downloads\\baohiem.txt"); // lưu ngay sau khi thêm
    }

    @Override
    public void sua(String id) {
        for (Warranty bh : dsBH ) {
            if (bh.getMaBH().equals(id)) {
                bh.nhap(); // cho phép nhập lại thông tin
                fileHandler.saveToFile(dsBH, "C:\\Users\\HELLO\\Downloads\\sanpham.txt");
            }
        }
        System.out.println("Không tìm thấy mục bảo hành với mã: " + id);    }

    @Override
    public void xoa(String id) {
        dsBH.removeIf(bh -> bh.getMaBH().equals(id));
        fileHandler.saveToFile(dsBH, "C:\\Users\\HELLO\\Downloads\\baohiem.txt"); // lưu ngay sau khi thêm
    }

    @Override
    public Warranty timKiem(String id) {
        dsBH = fileHandler.readFromFile("C:\\Users\\HELLO\\Downloads\\baohiem.txt");
        for (Warranty w : dsBH) {
            if (w.getMaBH().equals(id)) {
                return w;
            }
        }
        return null;   
    }
    public List<Warranty> getAll() {
        return dsBH;
    }
    public void save(String fileName) {
        fileHandler.saveToFile(dsBH, fileName);
    }

    public void load(String fileName) {
        dsBH = fileHandler.readFromFile(fileName);
        soLuongBH = dsBH.size();
    }
}
//timKiem, xoa, sua, them, 
////dependency FileHandler
