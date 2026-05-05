/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dientuoop.AnhVu;

/**
 *
 * @author HELLO
 */
import com.mycompany.dientuoop.Khoi.FileHandler;
import com.mycompany.dientuoop.Khoi.IQuanLy;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//dependency FileHandler

// EmployeeList Class
public class EmployeeList implements IQuanLy<Employee>{
    private List<Employee> dsNhanVien;
    private int soLuongNV;
    private FileHandler fileHandler; 
    public EmployeeList(FileHandler fileHandler) {
        dsNhanVien = new ArrayList<>();
        this.fileHandler = fileHandler;
        soLuongNV = 0;
    }
    
    @Override
    public Employee timKiem(String ma) {
        for (Employee e : dsNhanVien) {
            if (e.getMaNv().equals(ma)) {
                return e;
            }
        }
        return null;
    }

    public double thongKeLuong() {
        double tongLuong = 0;
        for (Employee e : dsNhanVien) {
            tongLuong += e.tinhLuong();
        }
        return tongLuong;
    }
   
    @Override
    public void them(Employee e) {
        dsNhanVien.add(e);
        soLuongNV++;
    }

    @Override
    public void sua(String maNV) {
        Employee e = timKiem(maNV);
        if (e != null) {
            // Example: update status
            e.setTinhTrang(1);
            System.out.println("Updated employee: " + e.getHoTen());
        }
    }

    @Override
    public void xoa(String maNV) {
        Employee e = timKiem(maNV);
        if (e != null) {
            dsNhanVien.remove(e);
            soLuongNV--;
            System.out.println("Removed employee: " + e.getHoTen());
        }
    }

    public List<Employee> getAll() {
        return dsNhanVien;
    }

    @Override
    public void nhap() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void xuat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //implement utils and filehandler
    public void save(String fileName) {
        fileHandler.saveToFile(dsNhanVien, fileName);
    }

    public void load(String fileName) {
        dsNhanVien = fileHandler.readFromFile(fileName);
        soLuongNV = dsNhanVien.size();
    }
}

