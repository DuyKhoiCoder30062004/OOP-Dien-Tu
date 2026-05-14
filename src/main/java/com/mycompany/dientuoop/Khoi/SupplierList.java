
package com.mycompany.dientuoop.Khoi;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
public class SupplierList implements IQuanLy<Supplier>{
    private List<Supplier> danhSachNSX;   // Aggregation: holds Supplier objects
    private int soLuongNSX;
    private FileHandler fileHandler;      // Dependency: uses FileHandler

    public SupplierList() {
    }

    public SupplierList(FileHandler fileHandler) {
        this.danhSachNSX = new ArrayList<>();
        this.fileHandler = fileHandler;  // injected dependency
        this.soLuongNSX = 0;
    }

    public void them(Supplier obj) {
        danhSachNSX.add(obj);
        soLuongNSX++;
    }

    public void xoa(String id) {
        danhSachNSX.removeIf(s -> s.getMaNSX().equals(id));
        soLuongNSX = danhSachNSX.size();
    }

    public void sua(String id) {
        // find supplier by id and update its info
        System.out.println("Editing supplier with id: " + id);
    }

    public Supplier timKiem(String id) {
        return danhSachNSX.stream()
                .filter(s -> s.getMaNSX().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Supplier timKiemTheoTen(String ten) {
        return danhSachNSX.stream()
                .filter(s -> s.getTenNSX().equalsIgnoreCase(ten))
                .findFirst()
                .orElse(null);
    }

    public void thongKeQuocGia() {
        danhSachNSX.stream()
                .map(Supplier::getQuocGia)
                .distinct()
                .forEach(c -> System.out.println("Country: " + c));
    }

    public List<Supplier> getAll() {
        return danhSachNSX;
    }

    public void saveToFile() {
    fileHandler.saveToFile(danhSachNSX, "C:\\Users\\HELLO\\Downloads\\fileSave");
}

public void loadFromFile() throws IOException {
    danhSachNSX = (List<Supplier>) fileHandler.readFromFile("C:\\Users\\HELLO\\Downloads\\fileSave");
    soLuongNSX = danhSachNSX.size();
}

    @Override
    public void nhap() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void xuat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

