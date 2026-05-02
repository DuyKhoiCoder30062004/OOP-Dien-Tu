/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dientuoop.HuuTien;

import com.mycompany.dientuoop.Khoi.FileHandler;
import java.util.Scanner;
import com.mycompany.dientuoop.Khoi.IQuanLy;
/**
 *
 * @author HELLO
 */
//dependency FileHandler

class OrderList implements IQuanLy<Order> {
    // Khai báo mảng chứa các hóa đơn và số lượng hiện tại
    private Order[] dsHoaDon;
    private int soLuongHD;
     private FileHandler fileHandler; // Tạm chờ lớp FileHandler

    public OrderList(FileHandler fileHandler) {
        // Khởi tạo mảng tĩnh chứa tối đa 100 hóa đơn
        this.dsHoaDon = new Order[100];
        this.fileHandler = fileHandler;
        this.soLuongHD = 0;
        
    }

//    public ImportList(FileHandler fileHandler) {
//        this.danhSachPN = new ArrayList<>();
//        this.fileHandler = fileHandler;
//        this.soLuongPN = 0;
//    }
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng hóa đơn muốn tạo mới: ");
        int n = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < n; i++) {
            System.out.println("--- Nhập thông tin hóa đơn thứ " + (i + 1) + " ---");
            Order hd = new Order();
            hd.nhap(); // Gọi hàm nhap() của lớp Order (đã bao gồm nhập OrderDetail)
            them(hd);
        }
    }

    @Override
    public void xuat() {
        System.out.println("\n=== DANH SÁCH HÓA ĐƠN ===");
        if (soLuongHD == 0) {
            System.out.println("Chưa có hóa đơn nào trong danh sách!");
            return;
        }
        for (int i = 0; i < soLuongHD; i++) {
            dsHoaDon[i].xuat(); // Gọi hàm xuat() của lớp Order
        }
        System.out.println("==========================\n");
    }

    @Override
    public void them(Order hd) {
        if (soLuongHD < dsHoaDon.length) {
            dsHoaDon[soLuongHD] = hd;
            soLuongHD++;
            System.out.println("-> Thêm hóa đơn thành công!");
        } else {
            System.out.println("-> Lỗi: Danh sách hóa đơn đã đầy!");
        }
    }

    @Override
    public Order timKiem(String maHD) {
        for (int i = 0; i < soLuongHD; i++) {
            if (dsHoaDon[i].getMaHD().equalsIgnoreCase(maHD)) {
                return dsHoaDon[i];
            }
        }
        return null; // Trả về null nếu không tìm thấy
    }

    @Override
    public void sua(String maHD) {
        Order hd = timKiem(maHD);
        if (hd != null) {
            System.out.println("Đã tìm thấy hóa đơn " + maHD + "! Vui lòng nhập thông tin cập nhật:");
            // Trong thực tế, hóa đơn ít khi bị nhập lại từ đầu, 
            // nhưng để đúng chuẩn interface thì ta gọi lại hàm nhap() hoặc tạo menu sửa riêng.
            hd.nhap(); 
            System.out.println("-> Cập nhật hóa đơn thành công!");
        } else {
            System.out.println("-> Lỗi: Không tìm thấy hóa đơn có mã " + maHD);
        }
    }

    @Override
    public void xoa(String maHD) {
        for (int i = 0; i < soLuongHD; i++) {
            if (dsHoaDon[i].getMaHD().equalsIgnoreCase(maHD)) {
                // Thuật toán dồn mảng để xóa phần tử
                for (int j = i; j < soLuongHD - 1; j++) {
                    dsHoaDon[j] = dsHoaDon[j + 1];
                }
                dsHoaDon[soLuongHD - 1] = null; // Xóa rác ở phần tử cuối
                soLuongHD--;
                System.out.println("-> Đã xóa hóa đơn có mã " + maHD);
                return;
            }
        }
        System.out.println("-> Lỗi: Không tìm thấy hóa đơn để xóa!");
    }

    // --- Phương thức nghiệp vụ đặc thù của OrderList ---
    
    // Hàm thống kê tổng doanh thu
    public void thongKeDoanhThu() {
        double tongDoanhThu = 0;
        int soDonThanhToan = 0;

        for (int i = 0; i < soLuongHD; i++) {
            // Giả sử chỉ cộng tiền những đơn đã thanh toán (tinhTrangDon == 1)
            if (dsHoaDon[i].getTinhTrangDon() == 1) {
                tongDoanhThu += dsHoaDon[i].getTongTien();
                soDonThanhToan++;
            }
        }

        System.out.println("\n=== BÁO CÁO DOANH THU ===");
        System.out.println("Số đơn hàng đã thanh toán: " + soDonThanhToan);
        System.out.printf("Tổng doanh thu thực tế: %.2f\n", tongDoanhThu);
        System.out.println("=========================\n");
    }

    // Hàm lấy toàn bộ danh sách hóa đơn hiện có
    public Order[] getAll() {
        Order[] danhSachThucTe = new Order[soLuongHD];
        for (int i = 0; i < soLuongHD; i++) {
            danhSachThucTe[i] = dsHoaDon[i];
        }
        return danhSachThucTe;
    }
    public void saveToFile() {
    fileHandler.saveToFile(dsHoaDon, "C:\\Users\\HELLO\\Downloads\\fileSave");
}

public void loadFromFile() {
    danhSachThucTe = fileHandler.readFromFile("C:\\Users\\HELLO\\Downloads\\fileSave");
    soLuongDonHang = danhSachThucTe.size();
}
}
