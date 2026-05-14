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
import com.mycompany.dientuoop.Khoi.Utils;
import java.io.IOException;
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
    private Utils utils;
    public EmployeeList(FileHandler fileHandler) {
        dsNhanVien = new ArrayList<>();
        this.fileHandler = fileHandler;
        soLuongNV = 0;
    }
    public EmployeeList(Utils utils){
        this.utils = utils;
    }
    @Override
    public Employee timKiem(String maNv) {
        for (Employee e : dsNhanVien) {
            if (e.getMaNv().equals(maNv)) {
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
        fileHandler.saveToFile(dsNhanVien, "C:\\Users\\HELLO\\Downloads\\nhanvien.txt"); // lưu ngay sau khi thêm
    }

    @Override
    public void sua(String maNV) {
        for (Employee nv : dsNhanVien ) {
            if (nv.getMaNv().equals(maNV)) {
                nv.nhap(); // cho phép nhập lại thông tin
                fileHandler.saveToFile(dsNhanVien, "C:\\Users\\HELLO\\Downloads\\nhanvien.txt");
            }
        }
        System.out.println("Không tìm thấy Nhân viên với mã: " + maNV); 
    }

    @Override
    public void xoa(String maNV) {
        dsNhanVien.removeIf(l -> l.getMaNv().equals(maNV));
        fileHandler.saveToFile(dsNhanVien, "C:\\Users\\HELLO\\Downloads\\nhanvien.txt"); // lưu ngay sau khi thêm
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

    public void load(String fileName) throws IOException {
        dsNhanVien = (List<Employee>) fileHandler.readFromFile(fileName);
        soLuongNV = dsNhanVien.size();
    }
}

