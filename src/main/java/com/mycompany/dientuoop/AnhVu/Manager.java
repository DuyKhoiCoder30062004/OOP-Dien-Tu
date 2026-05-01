/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dientuoop.AnhVu;

/**
 *
 * @author HELLO
 */
// Manager Class (inherits Employee)
class Manager extends Employee {
    private double phuCapTrachNhiem;

    public Manager(String maNV, String hoTen, double luongCoBan, int tinhTrang, double phuCapTrachNhiem) {
        super(maNV, hoTen, luongCoBan, tinhTrang);
        this.phuCapTrachNhiem = phuCapTrachNhiem;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + phuCapTrachNhiem;
    }

    public void quanLyNhanVien() {
        System.out.println("Manager " + hoTen + " is managing employees.");
    }
}
