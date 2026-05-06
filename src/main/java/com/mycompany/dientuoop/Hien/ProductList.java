/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dientuoop.Hien;

import com.mycompany.dientuoop.Hien.Product;
import com.mycompany.dientuoop.Khoi.FileHandler;
import com.mycompany.dientuoop.Khoi.IQuanLy;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author HELLO
 */

////dependency FileHandler
public class ProductList {
    // Attributes
    private List<Product> listSP;
    private int soLuongSP;
    private FileHandler fileHandler;

    public ProductList(FileHandler fileHandler){
        this.fileHandler = fileHandler;
    }
    public ProductList(List<Product> listSP, int soLuongSP, FileHandler fileHandler) {
        this.listSP = listSP;
        this.soLuongSP = soLuongSP;
        this.fileHandler = fileHandler;
    }

    public List<Product> getListSP() {
        return listSP;
    }

    public void setListSP(List<Product> listSP) {
        this.listSP = listSP;
    }

    public int getSoLuongSP() {
        return soLuongSP;
    }

    public void setSoLuongSP(int soLuongSP) {
        this.soLuongSP = soLuongSP;
    }

    public FileHandler getFileHandler() {
        return fileHandler;
    }

    public void setFileHandler(FileHandler fileHandler) {
        this.fileHandler = fileHandler;
    }

    public ProductList() {
    }

    // Methods
    public void them(Product p) {
        listSP.add(p);
        fileHandler.saveToFile(listSP, "C:\\Users\\HELLO\\Downloads\\sanpham.txt"); // lưu ngay sau khi thêm
    }
    public void xoa(String maSP) {
        listSP.removeIf(l -> l.getMaSP().equals(maSP));
        fileHandler.saveToFile(listSP, "C:\\Users\\HELLO\\Downloads\\sanpham.txt"); // lưu ngay sau khi thêm
    }
    public Product timKiem(String ten) {
        listSP = fileHandler.readFromFile("C:\\Users\\HELLO\\Downloads\\sanpham.txt");
        for (Product p : listSP) {
            if (p.getTenSP().equals(ten)) {
                return p;
            }
        }
        return null;
    }
        public void nhap() {
            Product p = new Product();
            p.nhap();
        }

        
        public void xuat() {
            
        }

        public void sua(String id) {
            for (Product pl : listSP ) {
            if (pl.getMaSP().equals(id)) {
                pl.nhap(); // cho phép nhập lại thông tin
                fileHandler.saveToFile(listSP, "C:\\Users\\HELLO\\Downloads\\sanpham.txt");
            }
        }
        System.out.println("Không tìm thấy Sản phẩm với mã: " + id);       
        }


    public int getSoLuong() {
        return soLuongSP;
    }

    public void setSoLuong(int sl) {
        this.soLuongSP = sl;
    }
    public void save(String fileName) {
        fileHandler.saveToFile(listSP, fileName);
    }

    public void load(String fileName) {
        List<Product> temp = fileHandler.readFromFile(fileName);
        listSP = temp; 
        soLuongSP = listSP.size();
    }
    
}

