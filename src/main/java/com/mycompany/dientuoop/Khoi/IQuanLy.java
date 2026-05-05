/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.dientuoop.Khoi;

/**
 *
 * @author HELLO
 */
public interface IQuanLy<T> {
    //giong abstract
    
    public void nhap();
    public void xuat();
    public void them(T obj);
    public void sua(String id);
    public void xoa(String id);
    public T timKiem(String id);
}
