package com.mycompany.dientuoop.HuuTien;

import com.mycompany.dientuoop.AnhVu.SalesStaff;
import java.util.Scanner;
import java.sql.Date;

public class Order {
    private String maHD;
    private Date ngayLap;
    private double tongTien;
    private int tinhTrangDon;
    private Customer khachHang;
    private SalesStaff nhanVien;
    private OrderDetail[] dsChiTiet;




    
    //tinh tong, addDetail, inHoaDon, Order() Constructor, getter&setter

    public double tinhTong() {
        double tong = 0;
        for(int i = 0; i < soLuongChiTiet; i++) {
            tong += dsChiTiet[i].tinhThanhTien(); // Cộng dồn thành tiền của từng chi tiết đơn hàng
        }
        return tong;
    }

    public void themChiTiet(OrderDetail chiTiet) {
        if(soLuongChiTiet < dsChiTiet.length) {
            dsChiTiet[soLuongChiTiet] = chiTiet; // Thêm chi tiết đơn hàng vào mảng
            soLuongChiTiet++; // Tăng số lượng chi tiết đơn hàng
        } else {
            System.out.println("Không thể thêm chi tiết đơn hàng, đã đạt giới hạn.");
        }
    }

//    public void nhap() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập mã hóa đơn: ");
//        this.maHD = sc.nextLine();
//        System.out.print("Nhập ngày tạo (dd/MM/yyyy): ");
//        this.ngayLap = Date.valueOf(sc.nextLine()); // Chuyển đổi chuỗi ngày thành đối tượng Date
//        System.out.print("Nhập tình trạng đơn (1 - Đã thanh toán, 0 - Chưa thanh toán): ");
//        this.tinhTrangDon = Integer.parseInt(sc.nextLine());
//
//        System.out.print("Nhập số lượng mặt hàng muốn mua: ");
//        int n = Integer.parseInt(sc.nextLine());
//        for (int i = 0; i < n; i++) {
//            System.out.println("--- Chi tiết mặt hàng thứ " + (i + 1) + " ---");
//            OrderDetail detail = new OrderDetail();
//            detail.nhap();
//            themChiTiet(detail);
//        }
//    }
//
//    public void xuat() {
//        System.out.println("\n=============================================");
//        System.out.println("Mã Hóa Đơn: " + maHD + " | Ngày tạo: " + ngayLap);
//        String tenKhachHang = (khachHang != null) ? khachHang.getTenKH() : "Khách vãng lai";
//        System.out.println("Khách hàng: " + tenKhachHang);
//        System.out.println("Tình trạng: " + (tinhTrangDon == 1 ? "Đã thanh toán" : "Chưa thanh toán"));
//        System.out.println("---------------------------------------------");
//        System.out.println("DANH SÁCH SẢN PHẨM MUA:");
//        for (int i = 0; i < soLuongChiTiet; i++) {
//            System.out.print((i + 1) + ". ");
//            dsChiTiet[i].xuat(); // Gọi phương thức xuất thông tin chi tiết đơn hàng
//        }
//        System.out.println("---------------------------------------------");
//        System.out.printf("TỔNG TIỀN HÓA ĐƠN: %.2f\n", tongTien);
//        System.out.println("=============================================\n");
//    }
}
