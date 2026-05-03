/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dientuoop.Hien;

import com.mycompany.dientuoop.Hien.Product;
import com.mycompany.dientuoop.Khoi.FileHandler;

/**
 *
 * @author HELLO
 */

////dependency FileHandler
public class ProductList {
    // Attributes
    private Product[] listSP;
    private int soLuongSP;
    private FileHandler fileHandler;

    // Constructor with fixed capacity
    public ProductList(int capacity) {
        listSP = new Product[capacity];
        soLuongSP = 0;
        this.fileHandler = fileHandler;
    }

    // Methods
    public void them(Product p) {
        if (soLuongSP < listSP.length) {
            listSP[soLuongSP] = p;
            soLuongSP++;
        } else {
            System.out.println("Danh sách sản phẩm đã đầy!");
        }
    }

    public boolean xoa(String maSP) {
        for (int i = 0; i < soLuongSP; i++) {
            if (listSP[i].getMaSP().equals(maSP)) {
                // Shift elements left
                for (int j = i; j < soLuongSP - 1; j++) {
                    listSP[j] = listSP[j + 1];
                }
                listSP[soLuongSP - 1] = null;
                soLuongSP--;
                return true;
            }
        }
        return false;
    }

    public Product timkiem(String ten) {
        for (int i = 0; i < soLuongSP; i++) {
            if (listSP[i].getTenSP().equalsIgnoreCase(ten)) {
                return listSP[i];
            }
        }
        return null;
    }

    public void sua(String maSP) {
        for (int i = 0; i < soLuongSP; i++) {
            if (listSP[i].getMaSP().equals(maSP)) {
                // Implement edit logic here
                break;
            }
        }
    }

    public void nhap() {
        // Implement input logic (e.g., from console or file)
    }

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
}

