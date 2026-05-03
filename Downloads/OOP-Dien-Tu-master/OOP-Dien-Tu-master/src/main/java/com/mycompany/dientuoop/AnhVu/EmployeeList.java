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
//Encapsulation
//dependency FileHandler

// EmployeeList Class
class EmployeeList {
    //Employee là dạng Generic, ở dây lấy data type Employee, nhưng dsNhanVien 
    //Mối quan hệ aggregation giua 2 cái nào trên class diagram thì lấy ra dùng tương ứng thôi á.
    //this case: Employee - EmployeeList: Aggregates
    private List<Employee> dsNhanVien;
//    private List<Manager> quanLy;
//    private List<SalesStaff> saleStaff;
    //cục fileHandler thuộc tính để sau tui làm.
    private int soLuongNV;

    //hồi xưa code theo kiểu ko phải oop thì ông code theo kiểu này có phải là cần khai báo biến cho = 0 ko
    
    /*
    
    int sum=0;
    for(int i=0;i<=10;i++){ // i: 0 1 2 ... 10
      sum+=i; //0 1 2 3 4 .. 10   0 1 3 6 10 ..
    }
    */
    
    public EmployeeList() {
        dsNhanVien = new ArrayList<>();
        soLuongNV = 0;
        //khả năng soLuongNV xài phép + -, liên quan phép toán sơ cấp lập trình thì chương trình cần thao tác logic
        // nên khả năng cao nó cần dụng lại biến soLuongNV, mà soLuongNV để chưa khai báo = 0 thì nó báo lỗi vì biến chưa dc 
        //khởi tạo.
        
        
        //liên quan tới instantiation variable kiểu kiểu v, khó nói lắm kk, phải theo dõi từ đầu series bài của thầy nên hơn
        //giờ giải thích khó hiểu lắm
    }

    //cứ khai báo tương ứng thuộc tính - kiểu data type - methods dựa vô class diagram.
    //có getter setter là ok 5đ đầu tay.
    //cô kêu code lại logic thì khó, khả năng ô học thuộc or phải hiểu
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
//1 cách nữa là dể tui code xong xuôi logic, rồi ông lấy ô gắng học hiểu là dc 
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

    //khả năng xài phép cộng
    //còn mà phép toán mà liên quan List hay kiểu dữ liệu Reference Data type thì nó khác nữa, phức tạp lắm :)))
    public List<Employee> getAll() {
        return dsNhanVien;
    }
    //mo hinh 3 lop that ra ko can thiet, vi OOP chi can` the hien code ra dua theo tung` entity cua Class Diagram ra thoi
    //Khi ong vibe code, thi` canh vo so do` roi vibe code ra theo tuong ung thoi
    // Cai' dau' mui ten relationship giua~ Employee - EmployeeList no' the hien Aggregation
    //Nhung ma Aggregation co the~ ong tim hieu them tu` Vibe code AI, hoặc là phần này để tui vs Tiến thêm vào do nó khá chuyên biệt
    //Giờ phần ô chỉ cần vibe code đúng mẫu của Class diagram của Module mình là dc
    //Employee - EmployeeList - SalesStaff - Manager
    
}

