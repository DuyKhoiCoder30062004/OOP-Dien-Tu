


package com.mycompany.dientuoop.Khoi;

import com.mycompany.dientuoop.Hien.Laptop;
import com.mycompany.dientuoop.Hien.Phone;
import com.mycompany.dientuoop.Hien.Product;
import com.mycompany.dientuoop.Hien.ProductList;
import com.mycompany.dientuoop.HuuTien.OrderList;
import com.mycompany.dientuoop.AnhVu.EmployeeList;
import com.mycompany.dientuoop.HuuTien.CustomerList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MainApp {
    // Managers
    //product, order,employee,customer,warranty
    private ProductList productManager;
    private OrderList orderManager;
    private EmployeeList employeeManager;
    private CustomerList customerManager;
    private WarrantyList warrantyManager;
    private FileHandler fileHandler;

    // Constructor
    public MainApp() {
        //productManager và orderManager require chỉnh sửa để chèn thêm parameter fileHandler vô trong
        this.productManager = new ProductList();
        this.orderManager = new OrderList();
        this.employeeManager = new EmployeeList(fileHandler);
        this.customerManager = new CustomerList(fileHandler);
        this.warrantyManager = new WarrantyList(fileHandler);
    }

    // Menus
    public void mainMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("=== Main Menu ===");
            System.out.println("1. Product Menu");
            System.out.println("2. Order Menu");
            System.out.println("3. Employee Menu");
            System.out.println("4. Customer Menu");
            System.out.println("5. Warranty Menu");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    productMenu();
                    break;
                case 2:
                    orderMenu();
                    break;
                case 3:
                    employeeMenu();
                    break;
                case 4:
                    customerMenu();
                    break;
                case 5:
                    warrantyMenu();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 0);
        sc.close();
    }

    public void productMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
        System.out.println("=== Bảng sản phẩm ===");
            System.out.println("1. Xem danh sách sản phẩm tồn kho");
            System.out.println("2. Xem chi tiết sản phẩm");
            System.out.println("3. Thêm sản phẩm mới");
            System.out.println("4. Sửa sản phẩm");
            System.out.println("5. Xóa sản phẩm");
            System.out.println("6. Tìm kiếm sản phẩm");
            System.out.println("7. Nhập sản phẩm mới");
            System.out.println("0. Quay lại");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    productMenuInsight();
                    break;
                case 2:
                    productDetailMenu();
                    break;
                case 7:
                    productNhap();
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 0);
    }
    public void productNhap(){
        ProductList pl = new ProductList(fileHandler);
        p1.nhap();
    }
    
    public void orderMenu() {
        
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("=== Bảng đơn hàng ===");
            System.out.println("1. Xem danh sách đơn hàng");
            System.out.println("2. Xem chi tiết đơn hàng");
            System.out.println("3. Sửa đơn hàng");
            System.out.println("4. Xóa đơn hàng");
            System.out.println("5. Tìm kiếm đơn hàng");
            System.out.println("6. Nhập đơn hàng mới");
            System.out.println("7. Xuất đơn hàng");
            System.out.println("8. Xem thống kê doanh thu");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    orderMenuInsight();
                    break;
                case 2:
                    orderDetailMenu();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 0);
    }

    public void employeeMenu() {
       
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
         System.out.println("=== Employee Menu ===");
            System.out.println("1. Xem danh sách nhân viên");
            System.out.println("2. Xem chi tiết nhân viên");
            System.out.println("3. Xem thống kê lương nhân viên");
            System.out.println("4. Thêm nhân viên mới");
            System.out.println("5. Sửa nhân viên");
            System.out.println("6. Xóa nhân viên");
            System.out.println("7. Tìm kiếm nhân viên");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    employeeMenuInsight();
                    break;
                case 2:
                    employeeDetailMenu();
                    break;
                case 3:
                    employeeStatisticsMenu();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 0);
    }
    public void employeeStatisticsMenu(){
        EmployeeList el = new EmployeeList(fileHandler);
        System.out.print(el.thongKeLuong());
    }
    public void customerMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
        System.out.println("=== Bảng khách hàng ===");
        //lấy data từ file mà ra
        //1. xem danh sach sp ton kho => danh mục (laptop,phone,accessory) => list sp
            System.out.println("1. Xem danh sách khách hàng");
            System.out.println("2. Xem chi tiết khách hàng");
            System.out.println("3. Thêm khách hàng mới");
            System.out.println("4. Sửa khách hàng");
            System.out.println("5. Xóa khách hàng");
            System.out.println("6. Tìm kiếm khách hàng");
            System.out.println("7. Xuất khách hàng");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    customerMenuInsight();
                    break;
                case 2:
                    customerDetailMenu();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 0);
        // Add product-related options and logic here
        // Add customer-related options and logic here
    }
    public void warrantyMenu(){
    Scanner sc = new Scanner(System.in);
        int choice;
        do {
        System.out.println("=== Bảng phiếu bảo hành ===");
        //lấy data từ file mà ra
        //1. xem danh sach sp ton kho => danh mục (laptop,phone,accessory) => list sp
            System.out.println("1. Xem danh sách phiếu bảo hành");
            System.out.println("2. Xem chi tiết phiếu bảo hành");
            System.out.println("3. Thêm phiếu bảo hành mới");
            System.out.println("4. Sửa phiếu bảo hành");
            System.out.println("5. Xóa phiếu bảo hành");
            System.out.println("6. Tìm kiếm phiếu bảo hành");
            System.out.println("7. Xuất danh sách phiếu đang sửa");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    warrantyMenuInsight();
                    break;
                case 2:
                    warrantyDetailMenu();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 0);
        // Add product-related options and logic here
    }
    public void productMenuInsight(){
        System.out.println("=== Danh sách sản phẩm ===");
        ProductList pl = new ProductList();
        pl.getListSP();
    }
    public void productDetailMenu(){
        System.out.println("=== Bảng chi tiết sản phẩm ===");
    } 
    //order,warranty,employee,product, customer, supplier,import
public void warrantyMenuInsight(){
   WarrantyList wl = new WarrantyList(fileHandler);
   wl.getAll();
}
public void warrantyDetailMenu(){
    
    
}
public void customerMenuInsight(){
    CustomerList cl = new CustomerList(fileHandler);
    cl.getAll();
} 
public void customerDetailMenu(){
    
}
public void employeeMenuInsight(){
    EmployeeList el = new EmployeeList(fileHandler);
    el.getAll();
}
public void employeeDetailMenu(){
    
}
public void orderMenuInsight(){
    OrderList ol = new OrderList(fileHandler);
    ol.getAll();
}
public void orderDetailMenu(){
    
}
    // Main method to run the application
    public static void main(String[] args) {
        MainApp app = new MainApp();
        app.mainMenu();
    }
}

