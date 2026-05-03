/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dientuoop.AnhVu;

/**
 *
 * @author HELLO
 */
// Manager Class (inherits Employee)
class Manager extends Employee {
    private double phuCapTrachNhiem;
//    private int maNV; //làm this.maNV = maNV;

    //constructor
    //constructor có tham số vs ko tham số
//    public Manager(){}
//    
    
    //logic tức là: suy nghĩ có cần thêm gì vào properties or methods tương ứng class đó ko
    //rồi deduce cách làm của logic (tức là trong method đó có luồng đi thế nào)
    //cái này nháp thôi, chủ yếu liệt kê ra, rồi viết nháp cái flow của nó(có thể vẽ, nhưng thật ra trình bày lời cũng dc)
    
    //final step: integration github , stuff,..
    
    //Relationship giữa Employee - EmployeeList: Aggregation 
    //giữa Manager - Employee : Inheritence 
    //giữa SalesStaff - Employee: Inheritence
    //Khi đưa prompt thì kèm logic + relationship giữa 2 class cần làm logic luôn.
    //ko co interface đâu
//    => Inheritence + Aggregation là chủ yếu phần ông
    // brainstorm xong xuôi cái class hết rồi thì đưa tui fact check, rồi tui commit từ máy ông lên github lun là xong hôm 
    public Manager(String maNV, String hoTen, double luongCoBan, int tinhTrang, double phuCapTrachNhiem) {
        super(maNV, hoTen, luongCoBan, tinhTrang);
        //super này là lấy của properties có sẵn từ class nó inherits lun
        //còn mà this.maNV ở trong manager lun thì manager nó có maNV của riêng nó chứ ko phải của inherited class
        this.phuCapTrachNhiem = phuCapTrachNhiem;
    }

    public Manager() {
    }
    
    //luu y: Constructor 2 loại: co va ko tham so, rồi khai báo super trong constructor để inherits từ cái có sẵn
    //thứ tự declare inheritence trong Constructor tương ứng (chứa all parameters trong class nó inherits tu` va` nhan them
    //tham số của chính class đó luôn
    //this.(tham số class này) = (thuộc tính của class này)
    
   
    //trước mắt thì đã có sẵn code cho Manager , SalesStaff, Employee,EmployeeList
    //Giờ nếu làm tiếp thì khả năng ông có thể bàn Logic miệng trước, rồi về sau để tui thêm vô cho ô
    
    
    //o day la tái sử dụng lại cái hàm đã có sẵn ở class Employee (kế thừa từ đâu thì dùng @Override ghi đè lên
    //Còn khi gọi hàm mà liên quan của Manager đã dc overriden hay của chính Employee của hàm tinhLuong
    //thì còn liên quan vde import package, và gọi hàm phải đúng tên của file/class là dc
    @Override
    public double tinhLuong() {
        return luongCoBan + phuCapTrachNhiem;
    }

    public void quanLyNhanVien() {
        System.out.println("Manager " + hoTen + " is managing employees.");
    }
}
