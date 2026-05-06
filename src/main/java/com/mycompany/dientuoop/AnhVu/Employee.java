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
public class Employee {
    protected String maNv;
    protected String hoTen;
    protected double luongCoBan;
    protected int tinhTrang;

    public Employee() {}

    public Employee(String maNv, String hoTen, double luongCoBan, int tinhTrang) {
        this.maNv = maNv;
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

    public String getMaNv() {
        return maNv;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public String getHoTen() {
        return hoTen;
    }
    public void nhap(){
        
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

