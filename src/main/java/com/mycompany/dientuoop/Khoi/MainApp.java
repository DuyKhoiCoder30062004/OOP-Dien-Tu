


package com.mycompany.dientuoop.Khoi;

import com.mycompany.dientuoop.AnhVu.Employee;
import com.mycompany.dientuoop.Hien.Laptop;
import com.mycompany.dientuoop.Hien.Phone;
import com.mycompany.dientuoop.Hien.Product;
import com.mycompany.dientuoop.Hien.ProductList;
import com.mycompany.dientuoop.HuuTien.OrderList;
import com.mycompany.dientuoop.AnhVu.EmployeeList;
import com.mycompany.dientuoop.HuuTien.Customer;
import com.mycompany.dientuoop.HuuTien.CustomerList;
import com.mycompany.dientuoop.HuuTien.Order;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MainApp {
    // Managers
    //product, order,employee,customer,warranty
     //xong menu,utils, filehandler, code di code lai nhieu lan, xong moi qua cac phan khac trc 12h
            //gio`lam` logic cho các hàm bên trong
            //store, ví dụ employee list thì lưu vào biến list xong lưu vào file, lần sau xài
    //load file đó lên lun
            
    
    //Hàm sản phẩm in progress...
    //xog MainApp menu sang Dependency các List (rồi sử dụng tới Utils)
            //Xog MainApp chuyển qua suy nghĩ cách cấu trúc nội dung trong các file ra sao
            //ví dụ có dữ liệu và kèm theo cấu trúc ------ (vẽ ra)
            //Xong thì mới chuyển qua xem các List dần dần
    
    
    private ProductList productManager;
    private OrderList orderManager;
    private EmployeeList employeeManager;
    private CustomerList customerManager;
    private WarrantyList warrantyManager;
    private Product product;
    private Order order;
    private Employee employee;
    private Customer customer;
    private Warranty warranty;
    private String productListFile = "C:\\Users\\HELLO\\Documents\\NetBeansProjects\\DienTuOOP\\src\\main\\java\\com.mycompany.dientuoop.file\\sanpham.txt";
    private String orderListFile = "C:\\\\Users\\\\HELLO\\\\Downloads\\\\C:\\Users\\HELLO\\Documents\\NetBeansProjects\\DienTuOOP\\src\\main\\java\\com.mycompany.dientuoop.file\\hoadon.txt";
    private String employeeListFile = "C:\\\\Users\\\\HELLO\\\\Downloads\\\\C:\\Users\\HELLO\\Documents\\NetBeansProjects\\DienTuOOP\\src\\main\\java\\com.mycompany.dientuoop.file\\nhanvien.txt";
    private String customerListFile = "C:\\\\Users\\\\HELLO\\\\Downloads\\\\C:\\Users\\HELLO\\Documents\\NetBeansProjects\\DienTuOOP\\src\\main\\java\\com.mycompany.dientuoop.file\\khachhang.txt";
    private String warrantyListFile = "C:\\\\Users\\\\HELLO\\\\Downloads\\\\C:\\Users\\HELLO\\Documents\\NetBeansProjects\\DienTuOOP\\src\\main\\java\\com.mycompany.dientuoop.file\\baohiem.txt";
    private String productFile = "C:\\\\Users\\\\HELLO\\\\Downloads\\\\C:\\Users\\HELLO\\Documents\\NetBeansProjects\\DienTuOOP\\src\\main\\java\\com.mycompany.dientuoop.file\\sanpham_constructor.txt";
    private String orderFile = "C:\\\\Users\\\\HELLO\\\\Downloads\\\\C:\\Users\\HELLO\\Documents\\NetBeansProjects\\DienTuOOP\\src\\main\\java\\com.mycompany.dientuoop.file\\hoadon_constructor.txt";
    private String employeeFile = "C:\\\\Users\\\\HELLO\\\\Downloads\\\\C:\\Users\\HELLO\\Documents\\NetBeansProjects\\DienTuOOP\\src\\main\\java\\com.mycompany.dientuoop.file\\nhanvien_constructor.txt";
    private String customerFile = "C:\\\\Users\\\\HELLO\\\\Downloads\\\\C:\\Users\\HELLO\\Documents\\NetBeansProjects\\DienTuOOP\\src\\main\\java\\com.mycompany.dientuoop.file\\khachhang_constructor.txt";
    private String warrantyFile = "C:\\\\Users\\\\HELLO\\\\Downloads\\\\C:\\Users\\HELLO\\Documents\\NetBeansProjects\\DienTuOOP\\src\\main\\java\\com.mycompany.dientuoop.file\\baohiem_constructor.txt";
    // Constructor
    public MainApp() {
        //productManager và orderManager require chỉnh sửa để chèn thêm parameter fileHandler vô trong
        this.productManager = new ProductList(new FileHandler(productListFile));
        this.orderManager = new OrderList(new FileHandler(orderListFile));
        this.employeeManager = new EmployeeList(new FileHandler(employeeListFile));
        this.customerManager = new CustomerList(new FileHandler(customerListFile));
        this.warrantyManager = new WarrantyList(new FileHandler(warrantyListFile));
        this.product = new Product(new FileHandler(productFile));
        this.order = new Order(new FileHandler(orderFile));
        this.employee = new Employee(new FileHandler(employeeFile));
        this.customer = new Customer(new FileHandler(customerFile));
        this.warranty = new Warranty(new FileHandler(warrantyFile));
    }

    // Menus
    public void mainMenu() throws IOException, ParseException {
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
                    System.out.println("Thoát khỏi chương trình...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            }
        } while (choice != 0);
        sc.close();
    }
// include fileHandler method vào các hàm con aggregated list
// nhap them cac' thuoc tinh cua 1 thưc the va luu vao list, cac ham nhap xuat cua con aggregate de tuong trung 1 mình tui no
// con cai' chinh' la` interface method cua List
//1 van de nua~ la, Product lam sao de categorize thành 3 loại? để display?
    
    public void productMenu() throws IOException {
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
            System.out.println("0. Quay lại");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
            case 1:
                productMenuInsight();
                break;
            case 2: //Mới cần xem chi tiết các hạng mục như laptop, accessory, phone => phân ra category
                productDetailMenu();
                break;
            case 3:
                addProduct();
                break;
            case 4:
                editProduct();
                break;
            case 5:
                deleteProduct();
                break;
            case 6:
                searchProduct();
                break;
            case 0:
                System.out.println("Quay lại menu chính...");
                break;
            default:
                System.out.println("Invalid choice, please try again.");
        }
        } while (choice != 0);
    }
    //1. Danh sách sản phẩm
//    l
    public void productMenuInsight() throws IOException{
        System.out.println("=== Danh sách sản phẩm ===");
//        ProductList pl = new ProductList();
        productManager.load("C:\\Users\\HELLO\\Downloads\\sanpham.txt");
    }
    //2. Danh sách chi tiết sản phẩm
    public void productDetailMenu(){
        System.out.println("=== Bảng chi tiết sản phẩm ===");
        System.out.println("=== Chọn xem 1 trong 3 loại sản phẩm ===");
        //gọi hàm chi tiết sản phẩm ntn?
    } 
    //3.thêm sản phẩm
    public void addProduct(){
//        ProductList pl = new ProductList(fileHandler);
    product.nhap(); // Dựa vào hàm này nhap() để nhét tham số (thuộc tính vào, rồi nó lưu vào list)
    //do cái nhap này là để lưu các properties vào constructor trước
    // có cần lưu vào file luôn, rồi mới có filled data để cho vô list
    //rồi từ list mới lưu vào file
    //có khả năng phần Product nên gọi 1 hàm lưu vào file ở trong Constructor
    // vậy nên tạo 5 files nữa liên quan kèm theo yếu tố (constructors)
    //ví dụ: baohiem.txt -> baohiem_constructor.txt tương ứng cho các file còn lại.
    //áp dụng logic của như new FileHandler như trên cho các Product,Employee,...,Warranty tương ứng
    
//Bằng cách nào đó trong ProductList của nó phải chứa
//đối tượng Product có các tham số trong lòng của Product?!
    productManager.them(product);
    System.out.println("Sản phẩm đã được thêm!");
    }
    //4.sửa sản phẩm sửa SP cũng tương tự như thêm, phải thao tác với list trước,rồi lấy từ File
    public void editProduct(){
        Scanner sc = new Scanner(System.in);
    System.out.print("Nhập mã sản phẩm cần sửa: ");
    String id = sc.nextLine();
//    ProductList pl = new ProductList(fileHandler);
    productManager.sua(id);
//    System.out.print("Sản phẩm Đã được chỉnh sửa thành công: ");
    }
    //5.xóa sản phẩm
    public void deleteProduct(){
         Scanner sc = new Scanner(System.in);
    System.out.print("Nhập mã sản phẩm cần xóa: ");
    String id = sc.nextLine();
    productManager.xoa(id);
    System.out.println("Sản phẩm đã được xóa!");
    }
    //6.Tìm kiếm sản phẩm
    public void searchProduct() throws IOException{
        Scanner sc = new Scanner(System.in);
    System.out.print("Nhập tên sản phẩm cần tìm: ");
    String name = sc.nextLine();
//    ProductList pl = new ProductList(fileHandler);
    productManager.load("C:\\Users\\HELLO\\Downloads\\sanpham.txt");
    Product found = productManager.timKiem(name);
    if (found != null) {
//        found.displayInfo();
        System.out.println("Tìm thấy sản phẩm");
        System.out.println(found.toString());
    } else {
        System.out.println("Không tìm thấy sản phẩm với tên: " + name);
    }
    }
    //7.nhập sản phẩm mới
    public void productNhap(){
//        ProductList pl = new ProductList(fileHandler);
        productManager.nhap();
    }
    
    public void orderMenu() throws IOException, ParseException {
        
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("=== Bảng đơn hàng ===");
            System.out.println("1. Xem danh sách đơn hàng");
            System.out.println("2. Sửa đơn hàng");
            System.out.println("3. Xóa đơn hàng");
            System.out.println("4. Tìm kiếm đơn hàng");
            System.out.println("5. Nhập đơn hàng mới");
            System.out.println("6. Xem thống kê doanh thu");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    orderMenuInsight();
                    break;
                case 2: 
                    editOrder();
                    break;
                case 3:
                    deleteOrder();
                    break;
                case 4:
                    searchOrder();
                    break;
                case 5:
                    addOrder();
                    break;
                case 6:
                    orderStatistics();
                    break;
                case 0:
                    System.out.println("Quay lại menu chính...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại.");
            }
        } while (choice != 0);
    }
public void orderMenuInsight() throws IOException, ParseException{
//    OrderList ol = new OrderList(fileHandler);
System.out.println("=== Danh sách đơn hàng ===");
//        ProductList pl = new ProductList();
        orderManager.load("C:\\Users\\HELLO\\Downloads\\hoadon.txt");
}
//editOrder, deleteOrder,searchOrder,addOrder,exportOrder
public void editOrder(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập mã sản phẩm cần sửa: ");
    String id = sc.nextLine();
//    ProductList pl = new ProductList(fileHandler);
    orderManager.sua(id);
}
public void deleteOrder(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập mã đơn hàng cần xóa: ");
    String id = sc.nextLine();
    orderManager.xoa(id);
    System.out.println("Đơn hàng đã được xóa!");
}
public void searchOrder() throws IOException, ParseException{
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập tên đơn hàng cần tìm: ");
    String name = sc.nextLine();
//    ProductList pl = new ProductList(fileHandler);
    orderManager.load("C:\\Users\\HELLO\\Downloads\\hoadon.txt");
    Product found = productManager.timKiem(name);
    if (found != null) {
//        found.displayInfo();
        System.out.println("Tìm thấy đơn hàng");
        System.out.println(found.toString());
    } else {
        System.out.println("Không tìm thấy đơn hàng với tên: " + name);
    }
}
public void addOrder() throws ParseException{
    order.nhap(); 
    orderManager.them(order);
    System.out.println("Đơn hàng đã được thêm!");
}
public void orderStatistics(){
    
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
                case 4:
                    addEmployee(); 
                    break;
                case 5:
                    editEmployee();
                    break;
                case 6:
                    deleteEmployee();
                    break;
                case 7:
                    searchEmployee();
                    break;
                case 0:
                    System.out.println("Thoát khỏi chương trình...");
                    break;
                default:
                    System.out.println("Lựa chọn không phù hợp, vui lòng chọn lại.");
            }
        } while (choice != 0);
    }
    public void employeeMenuInsight(){
//    EmployeeList el = new EmployeeList(fileHandler);
    employeeManager.getAll();
}
public void employeeDetailMenu(){
    
}
    public void employeeStatisticsMenu(){
//        EmployeeList el = new EmployeeList(fileHandler);
        System.out.print(employeeManager.thongKeLuong());
    }
       //addEmployee, editEmployee, deleteEmployee, searchEmployee
    public void addEmployee(){
        
    }
    public void editEmployee(){
        
    }
    public void deleteEmployee(){
        
    }
    public void searchEmployee(){
        
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
                case 3:
                    addCustomer(); 
                    break;
                case 4:
                    editCustomer();
                    break;
                case 5:
                    deleteCustomer();
                    break;
                case 6:
                    searchCustomer();
                    break;
                case 7:
                    exportCustomer();
                    break;
                case 0:
                    System.out.println("Thoát khỏi chương trình...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại.");
            }
        } while (choice != 0);
        // Add product-related options and logic here
        // Add customer-related options and logic here
    }
    public void customerMenuInsight(){
//    CustomerList cl = new CustomerList(fileHandler);
    customerManager.getAll();
} 
public void customerDetailMenu(){
    
}
//addCustomer,editCustomer,deleteCustomer, searchCustomer, exportCustomer
public void addCustomer(){
    
}
public void editCustomer(){
    
}
public void deleteCustomer(){
    
}
public void searchCustomer(){
    
}
public void exportCustomer(){
    
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
            System.out.println("7. Xuất danh sách phiếu bảo hành");
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
                case 3:
                    addWarranty(); 
                    break;
                case 4:
                    editWarranty();
                    break;
                case 5:
                    deleteWarranty();
                    break;
                case 6:
                    searchWarranty();
                    break;
                case 7:
                    exportWarranty();
                    break;
                case 0:
                    System.out.println("Thoát khỏi chương trình...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại.");
            }
        } while (choice != 0);
        // Add product-related options and logic here
    }
    //order,warranty,employee,product, customer, supplier,import
public void warrantyMenuInsight(){
//   WarrantyList wl = new WarrantyList(fileHandler);
   warrantyManager.getAll();
}
public void warrantyDetailMenu(){
    
    
}
//addWarranty, editWarranty, deleteWarranty,searchWarranty,exportWarranty
public void addWarranty(){
    
}
public void editWarranty(){
    
}
public void deleteWarranty(){
    
}
public void searchWarranty(){
    
}
public void exportWarranty(){
    
}
    // Main method to run the application
    public static void main(String[] args) throws IOException, ParseException {
        MainApp app = new MainApp();
        app.mainMenu();
    }
}

