/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dientuoop.Khoi;

//EmployeeList,CustomerList,OrderList,WarrantyList
/**
 *
 * @author HELLO
 */
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Utils {

    // Kiểm tra chuỗi rỗng
    public static boolean kiemTraChuoiRong(String chuoi) {
        return chuoi == null || chuoi.trim().isEmpty();
    }

    // Định dạng tiền tệ
    public static String dinhDangTien(double soTien) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
        return nf.format(soTien);
    }

    // Chuẩn hóa tên (viết hoa chữ cái đầu mỗi từ)
    public static String chuanHoaTen(String ten) {
        if (kiemTraChuoiRong(ten)) return "";
        String[] words = ten.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            sb.append(Character.toUpperCase(w.charAt(0)))
              .append(w.substring(1))
              .append(" ");
        }
        return sb.toString().trim();
    }

    // Nhập số nguyên từ bàn phím
    public static int nhapSoNguyen(String thongBao) {
        Scanner sc = new Scanner(System.in);
        System.out.print(thongBao);
        while (!sc.hasNextInt()) {
            System.out.println("Vui lòng nhập số nguyên hợp lệ!");
            sc.next(); // bỏ qua giá trị sai
            System.out.print(thongBao);
        }
        return sc.nextInt();
    }
}

