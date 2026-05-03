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

// vi du trường hợp của dsNhanVien nó mang kiểu vừa Arrays, vừa Employee
// trường hợp mà mang data type: Employee thì nó gọi là Generic , Object là bao hàm cả Generic lẫn Employee và bất kỳ kiểu
//Data type nào khác nó liên quan tới tên file hay bất kỳ data type nào mình tự định nghĩa
//khá rắc rối.
// Employee Class
public class Employee {
    protected String maNV;
    protected double luongCoBan;
    protected String hoTen;
    protected double tinhTrang;
    
    public Employee() {}

    public Employee(String maNV, String hoTen, double luongCoBan, int tinhTrang) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.tinhTrang = tinhTrang;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    

    public double tinhLuong() {
        return luongCoBan;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
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

