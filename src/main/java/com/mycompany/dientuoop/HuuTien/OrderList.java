package com.mycompany.dientuoop.HuuTien;
//import com.mycompany.dientuoop.Hien.Product;
import java.util.*;
import com.mycompany.dientuoop.Khoi.FileHandler;
import com.mycompany.dientuoop.Khoi.IQuanLy;
import com.mycompany.dientuoop.Khoi.Utils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class OrderList implements IQuanLy<Order> {
    private List<Order> dsHoaDon;
    private int soLuongHD;
    private FileHandler fileHandler;
    private Utils utils;
    /*
    private FileHandler fileHandler;

    public ProductList(FileHandler fileHandler){
        this.fileHandler = fileHandler;
    }
    */
    public OrderList(FileHandler fileHandler) {
        this.fileHandler = fileHandler;
         this.dsHoaDon = new ArrayList<>();
    }
    public OrderList(Utils utils){
        this.utils = utils;
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
//        this.soLuongHD = soLuongHD;
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

    // Lưu vào file
    try (BufferedWriter writer = new BufferedWriter(
            new OutputStreamWriter(new FileOutputStream("C:\\Users\\HELLO\\Downloads\\hoadon.txt", false), "UTF-8"))) {
        writer.write("Tổng doanh thu: " + total);
        writer.newLine();
        System.out.println("Đã lưu doanh thu vào file");
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    @Override
    public Order timKiem(String maDonHang) {
        try {
            dsHoaDon = (List<Order>) fileHandler.readFromFile("C:\\Users\\HELLO\\Downloads\\hoadon.txt");
        } catch (IOException ex) {
            System.getLogger(OrderList.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        for (Order o : dsHoaDon) {
            if (o.getMaHD().equals(maDonHang)) {
                return o;
            }
        }
        return null;  
    }
    @Override
    public void them(Order o) {
        dsHoaDon.add(o);
        fileHandler.saveToFile(dsHoaDon, "C:\\Users\\HELLO\\Downloads\\hoadon.txt"); // lưu ngay sau khi thêm

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
//        dsHoaDon.removeIf(o -> o.getMaHD().equals(maDonHang));
//        soLuongHD = dsHoaDon.size();
 boolean removed = dsHoaDon.removeIf(l -> l.getMaHD().equals(maDonHang));
        if(removed){
        fileHandler.saveToFileDelete(dsHoaDon, "C:\\Users\\HELLO\\Downloads\\hoadon.txt");
        System.out.println("Đã xóa đơn hàng có mã: " + maDonHang);// lưu ngay sau khi thêm
    }else{
            System.out.println("Không tìm thấy đơn hàng với mã: " + maDonHang);
        }
    }

    @Override
    public void nhap() {
        // nhập dữ liệu từ bàn phím hoặc file
        Order o = new Order();
        try {
            o.nhap();
        } catch (ParseException ex) {
            System.getLogger(OrderList.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    @Override
    public void xuat() {
//        for (Order o : dsHoaDon) {
//            o.inHoaDon();
//        }
    }

    public List<Order> getAll() {
        return dsHoaDon;
    }

    // Persistence methods using FileHandler
    public void save(String fileName) {
        fileHandler.saveToFile(dsHoaDon, fileName);
    }

     public void load(String fileName) throws IOException, ParseException {
    dsHoaDon = new ArrayList<>();

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    // Call your existing readFromFile (prints lines, returns null)
    fileHandler.readFromFile(fileName);

    // After printing, re-open the file to actually parse into Product objects
    try (BufferedReader reader = new BufferedReader(
            new InputStreamReader(new FileInputStream(fileName), "UTF-8"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("\\|");
            if (parts.length == 8) { //MaHD, ngayLap, tongTien, tinhTrangDon
                Order o = new Order();
                o.setMaHD(parts[0].trim());
                Date d = sdf.parse(parts[1].trim());
                o.setNgayLap(d);
                o.setTongTien(Double.parseDouble(parts[2].trim()));
                o.setTinhTrangDon(Integer.parseInt(parts[3].trim()));
                dsHoaDon.add(o);
            }
        }
    }
    soLuongHD = dsHoaDon.size();
    System.out.println("Đã tải " + soLuongHD + " Đơn hàng từ file " + fileName);
     }

    @Override
    public void sua(String id) {
         boolean found = false;
    for (Order o : dsHoaDon) {
        if (o.getMaHD().equals(id)) {
            System.out.println("Nhập lại thông tin cho đơn hàng có mã: " + id);
            try {
                o.nhap(); // cho phép nhập lại thông tin
            } catch (ParseException ex) {
                System.getLogger(OrderList.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
            fileHandler.saveToFileEdit(dsHoaDon, "C:\\Users\\HELLO\\Downloads\\hoadon.txt");
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("Không tìm thấy đơn hàng với mã: " + id);
    }
}
}