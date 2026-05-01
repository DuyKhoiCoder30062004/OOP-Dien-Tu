/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dientuoop.AnhVu;

/**
 *
 * @author HELLO
 */
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//dependency FileHandler

// EmployeeList Class
class EmployeeList {
    private List<Employee> dsNhanVien;
    private int soLuongNV;

    public EmployeeList() {
        dsNhanVien = new ArrayList<>();
        soLuongNV = 0;
    }

    public Employee timKiem(String ma) {
        for (Employee e : dsNhanVien) {
            if (e.getMaNV().equals(ma)) {
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

    public void them(Employee e) {
        dsNhanVien.add(e);
        soLuongNV++;
    }

    public void sua(String maNV) {
        Employee e = timKiem(maNV);
        if (e != null) {
            // Example: update status
            e.setTinhTrang(1);
            System.out.println("Updated employee: " + e.getHoTen());
        }
    }

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
}

