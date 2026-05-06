/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dientuoop.HuuTien;
import java.util.Scanner;
import com.mycompany.dientuoop.Khoi.IQuanLy;
import com.mycompany.dientuoop.Khoi.FileHandler;
import com.mycompany.dientuoop.Khoi.Utils;
import java.util.Arrays;
import java.util.List;
/**
 *`/
 * @author HELLO
 */
////dependency FileHandler
public class CustomerList implements IQuanLy<Customer> {
    private  List<Customer> customers;
        private int soLuongKH;
        private FileHandler fileHandler;
        private Utils utils;

        public CustomerList(FileHandler fileHandler) {
            this.fileHandler = fileHandler;
        }
        public CustomerList(Utils utils){
            this.utils = utils;
        }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng khách hàng: ");
        int n = sc.nextInt(); // Đọc số lượng khách hàng từ người dùng
        sc.nextLine(); // Tiêu thụ ký tự newline còn lại
        for(int i = 0; i < n; i++) {
            System.out.print("Nhập thông tin khách hàng thứ " + (i + 1) + ":\n");
            Customer customer = new Customer();
            customer.nhap(); // Gọi phương thức nhập thông tin khách hàng
            them(customer); // Thêm khách hàng vào danh sách
        }
    }

    @Override
    public void xuat() {
        
    }

    @Override
    public void them(Customer kh) {
//        if(soLuongKH <= customers.length) {
//            customers[soLuongKH] = kh; // Thêm khách hàng vào mảng
//            soLuongKH++; // Tăng số lượng khách hàng
//        } else {
//            System.out.println("Danh sách khách hàng đã đầy.");
//        }
            customers.add(kh);
        fileHandler.saveToFile(customers, "C:\\Users\\HELLO\\Downloads\\khachhang.txt"); // lưu ngay sau khi thêm

    }

    @Override
    public void xoa(String id) {
        customers.removeIf(l -> l.getMaKH().equals(id));
        fileHandler.saveToFile(customers, "C:\\Users\\HELLO\\Downloads\\khachhang.txt"); // lưu ngay sau khi thêm
    }

    @Override
    public void sua(String id) {
//        for(int i = 0; i < soLuongKH; i++) {
//            if(customers[i].getMaKH().equals(id)) {
//                System.out.println("Nhập thông tin mới cho khách hàng có mã: " + id);
//                customers[i].nhap(); // Gọi phương thức nhập thông tin khách hàng để cập nhật
//                System.out.println("Đã cập nhật thông tin khách hàng có mã: " + id);
//                return;
//            }
//        }
//        System.out.println("Không tìm thấy khách hàng có mã: " + id);
        for (Customer c : customers ) {
            if (c.getMaKH().equals(id)) {
                c.nhap(); // cho phép nhập lại thông tin
                fileHandler.saveToFile(customers, "C:\\Users\\HELLO\\Downloads\\khachhang.txt");
            }
        }
        System.out.println("Không tìm thấy khách hàng với mã: " + id);
    }

    @Override
    public Customer timKiem(String tenKH) {
    customers = fileHandler.readFromFile("C:\\Users\\HELLO\\Downloads\\khachhang.txt");
        for (Customer c : customers) {
            if (c.getTenKH().equals(tenKH)) {
                return c;
            }
        }
        return null;
    }

    //Hàm getAll
    public Customer[] getAll() {
        Customer[] result = new Customer[soLuongKH];
        System.arraycopy(customers, 0, result, 0, soLuongKH); // Sao chép khách hàng vào mảng kết quả
        return result;
    }
    //implement FileHandler dependency
    public void save(String fileName) {
        fileHandler.saveToFile(customers, fileName);
    }

    public void load(String fileName) {
         List<Customer> temp = fileHandler.readFromFile(fileName);
        customers = temp; 
        soLuongKH = customers.size();
//        listSP = temp.toArray(new Product[0]);
//    soLuongSP = listSP.length;
    }
}
