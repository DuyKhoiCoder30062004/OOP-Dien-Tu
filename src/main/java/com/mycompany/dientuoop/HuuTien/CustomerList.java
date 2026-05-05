/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dientuoop.HuuTien;
import java.util.Scanner;
import com.mycompany.dientuoop.Khoi.IQuanLy;
import com.mycompany.dientuoop.Khoi.FileHandler;
/**
 *`/
 * @author HELLO
 */
////dependency FileHandler
public class CustomerList implements IQuanLy<Customer> {
    private  Customer[] customers;
        private int soluongKH;
        private FileHandler fileHandler;

        public CustomerList() {
            this.customers = new Customer[100]; // Giả sử tối đa 100 khách hàng
            this.soluongKH = 0;
            this.fileHandler = fileHandler;
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
        if(soluongKH == 0) {
            System.out.println("Danh sách khách hàng trống.");
        } else {
            System.out.println("Danh sách khách hàng:");
            for(int i = 0; i < soluongKH; i++) {
                customers[i].xuat(); // Gọi phương thức xuất thông tin khách hàng
                System.out.println("-----------------------");
            }
        }
    }

    @Override
    public void them(Customer kh) {
        if(soluongKH <= customers.length) {
            customers[soluongKH] = kh; // Thêm khách hàng vào mảng
            soluongKH++; // Tăng số lượng khách hàng
        } else {
            System.out.println("Danh sách khách hàng đã đầy.");
        }
    }

    @Override
    public void xoa(String id) {
        for(int i =0; i < soluongKH; i++) {
            if(customers[i].getMaKH().equals(id)) {
                for(int j = i; j < soluongKH - 1; j++) {
                    customers[j] = customers[j + 1]; // Dịch chuyển các phần tử sau vị trí xóa lên trước
                }
                customers[soluongKH - 1] = null; // Xóa phần tử cuối cùng sau khi dịch chuyển
                soluongKH--; // Giảm số lượng khách hàng
                System.out.println("Đã xóa khách hàng có mã: " + id);
                return;
            }
        }
        System.out.println("Không tìm thấy khách hàng có mã: " + id);
    }

    @Override
    public void sua(String id) {
        for(int i = 0; i < soluongKH; i++) {
            if(customers[i].getMaKH().equals(id)) {
                System.out.println("Nhập thông tin mới cho khách hàng có mã: " + id);
                customers[i].nhap(); // Gọi phương thức nhập thông tin khách hàng để cập nhật
                System.out.println("Đã cập nhật thông tin khách hàng có mã: " + id);
                return;
            }
        }
        System.out.println("Không tìm thấy khách hàng có mã: " + id);
    }

    @Override
    public Customer timKiem(String maKH) {
    for (int i = 0; i < soluongKH; i++) {
        if (customers[i].getMaKH().equalsIgnoreCase(maKH)) {
            return customers[i];
        }
    }
    return null; // Trả về null nếu không tìm thấy khách hàng
    }

    //Hàm getAll
    public Customer[] getAll() {
        Customer[] result = new Customer[soluongKH];
        System.arraycopy(customers, 0, result, 0, soluongKH); // Sao chép khách hàng vào mảng kết quả
        return result;
    }
    //implement FileHandler dependency
    
}
