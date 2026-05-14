/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dientuoop.Hien;

import com.mycompany.dientuoop.Hien.Product;
import com.mycompany.dientuoop.Khoi.FileHandler;
import com.mycompany.dientuoop.Khoi.IQuanLy;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
         this.listSP = new ArrayList<>();
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
        listSP.add(p); // (add instance p đã có sẵn các properties và methods truyền vào
        fileHandler.saveToFile(listSP, "C:\\Users\\HELLO\\Downloads\\sanpham.txt"); // lưu ngay sau khi thêm
    //Nên làm thêm #2: thuật toán thêm 1 cách manually (như trong 1000 bt thầy Khang đưa)
    }
    public void xoa(String maSP) {
        boolean removed = listSP.removeIf(l -> l.getMaSP().equals(maSP));
        if(removed){
        fileHandler.saveToFileDelete(listSP, "C:\\Users\\HELLO\\Downloads\\sanpham.txt");
        System.out.println("Đã xóa sản phẩm có mã: " + maSP);// lưu ngay sau khi thêm
    }else{
            System.out.println("Không tìm thấy sản phẩm với mã: " + maSP);
        }
    }
    public Product timKiem(String ten) throws IOException {
//        listSP = (List<Product>) fileHandler.readFromFile("C:\\Users\\HELLO\\Downloads\\sanpham.txt");
        for (Product p : listSP) {
            if (p.getTenSP().equalsIgnoreCase(ten)) {
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
    boolean found = false;
    for (Product pl : listSP) {
        if (pl.getMaSP().equals(id)) {
            System.out.println("Nhập lại thông tin cho sản phẩm có mã: " + id);
            pl.nhap(); // cho phép nhập lại thông tin
            fileHandler.saveToFileEdit(listSP, "C:\\Users\\HELLO\\Downloads\\sanpham.txt");
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("Không tìm thấy Sản phẩm với mã: " + id);
    }
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

//    public void load(String fileName) throws IOException {
//        listSP = (List<Product>) fileHandler.readFromFile(fileName); 
//        soLuongSP = listSP.size();
//    }
    public void load(String fileName) throws IOException {
    listSP = new ArrayList<>();

    
    // Call your existing readFromFile (prints lines, returns null)
    fileHandler.readFromFile(fileName);

    // After printing, re-open the file to actually parse into Product objects
    try (BufferedReader reader = new BufferedReader(
            new InputStreamReader(new FileInputStream(fileName), "UTF-8"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("\\|");
            if (parts.length == 8) {
                Product p = new Product();
                p.setMaSP(parts[0].trim());
                p.setTenSP(parts[1].trim());
                p.setGiaBan(Double.parseDouble(parts[2].trim()));
                p.setTrangThai(Integer.parseInt(parts[3].trim()));
                p.setNamSanXuat(Integer.parseInt(parts[4].trim()));
                p.setImei(parts[5].trim());
                p.setSoLuong(Integer.parseInt(parts[6].trim()));
                p.setPhanTramGiam(Double.parseDouble(parts[7].trim()));
                listSP.add(p);
            }
        }
    }

    soLuongSP = listSP.size();
    System.out.println("Đã tải " + soLuongSP + " sản phẩm từ file " + fileName);
}

    
}

