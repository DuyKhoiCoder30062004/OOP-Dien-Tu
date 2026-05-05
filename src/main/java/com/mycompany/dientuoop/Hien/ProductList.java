/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dientuoop.Hien;

import com.mycompany.dientuoop.Hien.Product;
import com.mycompany.dientuoop.Khoi.FileHandler;
import com.mycompany.dientuoop.Khoi.IQuanLy;

/**
 *
 * @author HELLO
 */

////dependency FileHandler
public class ProductList implements IQuanLy<Product> {
    // Attributes
    private Product[] listSP;
    private int soLuongSP;
    private FileHandler fileHandler;

    public ProductList(Product[] listSP, int soLuongSP, FileHandler fileHandler) {
        this.listSP = listSP;
        this.soLuongSP = soLuongSP;
        this.fileHandler = fileHandler;
    }

    public Product[] getListSP() {
        return listSP;
    }

    public void setListSP(Product[] listSP) {
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

    // Constructor with fixed capacity
    public ProductList(int capacity) {
        listSP = new Product[capacity];
        soLuongSP = 0;
        this.fileHandler = fileHandler;
    }

    // Methods
    @Override
    public void them(Product p) {
        if (soLuongSP < listSP.length) {
            listSP[soLuongSP] = p;
            soLuongSP++;
        } else {
            System.out.println("Danh sách sản phẩm đã đầy!");
        }
    }
    @Override
    public void xoa(String maSP) {
        for (int i = 0; i < soLuongSP; i++) {
            if (listSP[i].getMaSP().equals(maSP)) {
                // Shift elements left
                for (int j = i; j < soLuongSP - 1; j++) {
                    listSP[j] = listSP[j + 1];
                }
                listSP[soLuongSP - 1] = null;
                soLuongSP--;
            }
        }
    }
    @Override
    public Product timKiem(String ten) {
        for (int i = 0; i < soLuongSP; i++) {
            if (listSP[i].getTenSP().equalsIgnoreCase(ten)) {
                return listSP[i];
            }
        }
        return null;
    }

    @Override
    public void sua(String maSP) {
        for (int i = 0; i < soLuongSP; i++) {
            if (listSP[i].getMaSP().equals(maSP)) {
                // Implement edit logic here
                break;
            }
        }
    }
    
    @Override
    public void nhap() {
        // Implement input logic (e.g., from console or file)
    }

    @Override
    public void xuat() {
        for (int i = 0; i < soLuongSP; i++) {
            System.out.println(listSP[i]);
        }
    }

    public Product[] getAll() {
        return listSP;
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
        listSP = fileHandler.readFromFile(fileName);
        soLuongSP = listSP.size();
    }
}

