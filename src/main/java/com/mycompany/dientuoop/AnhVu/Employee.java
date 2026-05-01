/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dientuoop.AnhVu;

/**
 *
 * @author HELLO
 */
import java.util.ArrayList;
import java.util.List;

// Employee Class
class Employee {
    protected String maNV;
    protected String hoTen;
    protected double luongCoBan;
    protected int tinhTrang;

    public Employee() {}

    public Employee(String maNV, String hoTen, double luongCoBan, int tinhTrang) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.tinhTrang = tinhTrang;
    }

    public double tinhLuong() {
        return luongCoBan;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getHoTen() {
        return hoTen;
    }
}




// Main class to test
//public class EmployeeManagementSystem {
//    public static void main(String[] args) {
//        EmployeeList list = new EmployeeList();
//
//        Employee emp1 = new Employee("E001", "Nguyen Van A", 5000, 1);
//        Manager mgr1 = new Manager("M001", "Tran Thi B", 7000, 1, 2000);
//
//        list.them(emp1);
//        list.them(mgr1);
//
//        System.out.println("Total salary: " + list.thongKeLuong());
//
//        mgr1.quanLyNhanVien();
//    }
//}

