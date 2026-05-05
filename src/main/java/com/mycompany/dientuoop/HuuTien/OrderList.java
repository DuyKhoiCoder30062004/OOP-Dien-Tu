package com.mycompany.dientuoop.HuuTien;
import java.util.*;
import com.mycompany.dientuoop.Khoi.FileHandler;
import com.mycompany.dientuoop.Khoi.IQuanLy;
public class OrderList implements IQuanLy<Order> {
    private Order[] dsHoaDon;
    private int soLuongHD;
    private FileHandler fileHandler;

    public OrderList(FileHandler fileHandler) {
        this.fileHandler = fileHandler;
    }

   

//    public void setDsHoaDon(List<Order> dsHoaDon) {
//        this.dsHoaDon = dsHoaDon;
//    }
//
//    public int getSoLuongHD() {
//        return soLuongHD;
//    }
//
//    public void setSoLuongHD(int soLuongHD) {
//        this.soLuongHD = soLuongHD;
//    }
//
//    public FileHandler getFileHandler() {
//        return fileHandler;
//    }

//    public void setFileHandler(FileHandler fileHandler) {
//        this.fileHandler = fileHandler;
//    }

    public OrderList(int soLuongHD, FileHandler fileHandler) {
        this.soLuongHD = soLuongHD;
        this.fileHandler = fileHandler;
    }

    public OrderList() {
    }

    public void thongKeDoanhThu() {
        double total = 0;
        for (Order o : dsHoaDon) {
            total += o.tinhTong();
        }
        System.out.println("Tổng doanh thu: " + total);
    }
    @Override
    public Order timKiem(String maDonHang) {
        for (Order o : dsHoaDon) {
            if (o.getMaHD().equals(maDonHang)) {
                return o;
            }
        }
        return null;
    }
    @Override
    public void them(Order o) {
        
    }
    
    
//    @Override
//    public void sua(String id) {
//        for(int i = 0; i < dsHoaDon; i++) {
//            if(dsHoaDon[i].getMaHD().equals(id)) {
//                System.out.println("Nhập thông tin mới cho khách hàng có mã: " + id);
//                dsHoaDon[i].nhap(); // Gọi phương thức nhập thông tin khách hàng để cập nhật
//                System.out.println("Đã cập nhật thông tin khách hàng có mã: " + id);
//            }
//        }
//        System.out.println("Không tìm thấy khách hàng có mã: " + id);
//    }

    @Override
    public void xoa(String maDonHang) {
        dsHoaDon.removeIf(o -> o.getMaHD().equals(maDonHang));
        soLuongHD = dsHoaDon.size();
    }

    @Override
    public void nhap() {
        // nhập dữ liệu từ bàn phím hoặc file
    }

    @Override
    public void xuat() {
        for (Order o : dsHoaDon) {
            o.inHoaDon();
        }
    }

    public Order[] getAll() {
        return dsHoaDon;
    }

    // Persistence methods using FileHandler
    public void save(String fileName) {
        fileHandler.saveToFile(dsHoaDon, fileName);
    }

    public void load(String fileName) {
        dsHoaDon = fileHandler.readFromFile(fileName);
        soLuongHD = dsHoaDon.size();
    }
}