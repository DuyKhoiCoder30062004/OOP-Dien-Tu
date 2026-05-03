///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.dientuoop;
//
///**
// *
// * @author HELLO
// */
//
////MainApp - IQuanly - FIleHandler - Utils
//
//public class MainApp {
//    private ProductList productManager;
//    private OrderList orderManager;
//    private EmployeeList employeeManager;
//    private CustomerList customerManager;
//    private WarrantyList warrantyManager;
//    public void mainMenu(){}
//    public void productMenu(){}
//    public void orderMenu(){}
//    public void employeeMenu(){}
//    public void customerMenu(){}
//}


package com.mycompany.dientuoop.Khoi;

import com.mycompany.dientuoop.Hien.Laptop;
import com.mycompany.dientuoop.Hien.Phone;
import com.mycompany.dientuoop.Hien.Product;
import com.mycompany.dientuoop.Hien.ProductList;

public class MainApp {
    public static void main(String[] args) {
        // Create some sample products (using a concrete subclass of Product)
        Phone p1 = new Phone("SP01", "iPhone 15", 1000, "123456789");
        Laptop p2 = new Laptop("SP02", "Dell XPS", 1500, "Intel i7");

        // Create ProductList with capacity 5
        ProductList productList = new ProductList(5);

        // Test adding products
        productList.them(p1);
        productList.them(p2);

        // Test displaying all products
        System.out.println("Danh sách sản phẩm:");
        productList.xuat();

        // Test searching
        //ReGex - Regular Expression
        Product found = productList.timkiem("iPhone 15");
        System.out.println("Kết quả tìm kiếm: " + (found != null ? found : "Không tìm thấy"));

        // Test removing
        boolean removed = productList.xoa("SP01");
        System.out.println("Xóa SP01: " + (removed ? "Thành công" : "Thất bại"));

        // Show list after removal
        System.out.println("Danh sách sau khi xóa:");
        productList.xuat();

        // Test discount
        double discountedPrice = p2.applyDiscount(p2.getGiaBan());
        System.out.println("Giá sau giảm của Dell XPS: " + discountedPrice);

        // Test hienThiChiTiet (polymorphism)
        System.out.println("Chi tiết sản phẩm:");
        p2.hienThiChiTiet();
    }
}
