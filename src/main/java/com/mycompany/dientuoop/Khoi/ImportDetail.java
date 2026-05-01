/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dientuoop.Khoi;

import com.mycompany.dientuoop.AnhVu.ImportReceipt;
import com.mycompany.dientuoop.Hien.Product;

/**
 *
 * @author HELLO
 */
//composition detail - receipt
public class ImportDetail {
    private Product maSP;
    private int soLuong;
    private double donGiaNhap;
    //ip dua vao` 1 class bat ky, no' dua tham so' vao trong method do' luon => Composition
//    private ImportReceipt ip;

    public double thanhTien() {
        return soLuong * donGiaNhap;
    }
}
