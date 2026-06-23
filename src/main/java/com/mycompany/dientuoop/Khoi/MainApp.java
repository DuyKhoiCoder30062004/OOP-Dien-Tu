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
import java.util.LinkedList;
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
    private ImportList importManager;
    private SupplierList supplierManager;
    private Product product;
    private Order order;
    private Employee employee;
    private Customer customer;
    private Warranty warranty;
    private ImportReceipt importReceipt;
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
            System.out.println("6. Import Menu");
            System.out.println("7. Supplier Menu");
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
                case 6:
                    importMenu();
                    break;
                case 7:
                    supplierMenu();
                    break;
                case 0:
                    System.out.println("Thoat khoi chuong trinh...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long thu lai.");
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
            //implement 2nd version của Linkedlist luôn
        System.out.println("=== Bang san pham ===");
            System.out.println("1. Xem danh sach san pham ton kho");
            System.out.println("2. Xem chi tiet san pham");
            System.out.println("3. Them san pham moi");
            System.out.println("4. Sua san pham");
            System.out.println("5. Xoa san pham");
            System.out.println("6. Tim kiem san pham");
            System.out.println("0. Quay lai");
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
                System.out.println("Quay lai menu chinh...");
                break;
            default:
                System.out.println("Invalid choice, please try again.");
        }
        } while (choice != 0);
    }
    //1. Danh sách sản phẩm
//    l
    public void productMenuInsight() throws IOException{
        System.out.println("=== Danh sách san pham ===");
//        ProductList pl = new ProductList();
        productManager.load("C:\\Users\\HELLO\\Downloads\\sanpham.txt");
    }
    //2. Danh sách chi tiết sản phẩm
    public void productDetailMenu(){
        System.out.println("=== Bang chi tiet san pham ===");
        System.out.println("=== Chon xem 1 trong 3 loai san pham ===");
        //gọi hàm chi tiết sản phẩm ntn?
    } 
    //3.thêm sản phẩm
    public void addProduct(){
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
    System.out.println("San pham da duoc thm!");
    }
    //4.sửa sản phẩm sửa SP cũng tương tự như thêm, phải thao tác với list trước,rồi lấy từ File
    public void editProduct(){
        Scanner sc = new Scanner(System.in);
    System.out.print("Nhap ma san pham can sua: ");
    String id = sc.nextLine();
    productManager.sua(id);
    }
    //5.xóa sản phẩm
    public void deleteProduct(){
         Scanner sc = new Scanner(System.in);
    System.out.print("Nhap ma san pham can xoa: ");
    String id = sc.nextLine();
    productManager.xoa(id);
    System.out.println("San pham da duoc xoa!");
    }
    //6.Tìm kiếm sản phẩm
    public void searchProduct() throws IOException{
        Scanner sc = new Scanner(System.in);
    System.out.print("Nhap ten san pham can tim: ");
    String name = sc.nextLine();
//    ProductList pl = new ProductList(fileHandler);
    productManager.load("C:\\Users\\HELLO\\Downloads\\sanpham.txt");
    Product found = productManager.timKiem(name);
    if (found != null) {
//        found.displayInfo();
        System.out.println("Tim thay san pham");
        System.out.println(found.toString());
    } else {
        System.out.println("Khong tim thay san pham voi ten: " + name);
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
            System.out.println("=== Bang don hang ===");
            System.out.println("1. Xem danh sach don hang");
            System.out.println("2. Sua don hang");
            System.out.println("3. Xoa don hang");
            System.out.println("4. Tim kiem don hang");
            System.out.println("5. Nhap don hang moi");
            System.out.println("6. Xem thong ke doanh thu");
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
                    System.out.println("Quay lai menu chinh...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long nhap lai.");
            }
        } while (choice != 0);
    }
public void orderMenuInsight() throws IOException, ParseException{
//    OrderList ol = new OrderList(fileHandler);
System.out.println("=== Danh sach don hang ===");
//        ProductList pl = new ProductList();
        orderManager.load("C:\\Users\\HELLO\\Downloads\\hoadon.txt");
}
//editOrder, deleteOrder,searchOrder,addOrder,exportOrder
public void editOrder(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap ma san pham can sua: ");
    String id = sc.nextLine();
//    ProductList pl = new ProductList(fileHandler);
    orderManager.sua(id);
}
public void deleteOrder(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap ma don hang can xoa: ");
    String id = sc.nextLine();
    orderManager.xoa(id);
    System.out.println("Don hang da duoc xoa!");
}
public void searchOrder() throws IOException, ParseException{
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap ten don hang can tim: ");
    String name = sc.nextLine();
//    ProductList pl = new ProductList(fileHandler);
    orderManager.load("C:\\Users\\HELLO\\Downloads\\hoadon.txt");
    Product found = productManager.timKiem(name);
    if (found != null) {
//        found.displayInfo();
        System.out.println("Tim thay don hang");
        System.out.println(found.toString());
    } else {
        System.out.println("Khong tim thay don hang voi ten: " + name);
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
            System.out.println("1. Xem danh sach nhan vien");
            System.out.println("2. Xem chi tiet nhan vien");
            System.out.println("3. Xem thong ke luong nhan vien");
            System.out.println("4. Them nhan vien moi");
            System.out.println("5. Sua nhan vien");
            System.out.println("6. Xoa nhan vien");
            System.out.println("7. Tim kiem nhan vien");
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
                    System.out.println("Quay lai menu chinh...");
                    break;
                default:
                    System.out.println("Lua chon khong phu hop, vui long chon lai.");
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
        System.out.println("=== Bang khach hang ===");
        //lấy data từ file mà ra
        //1. xem danh sach sp ton kho => danh mục (laptop,phone,accessory) => list sp
            System.out.println("1. Xem danh sach khach hang");
            System.out.println("2. Xem chi tiet khach hang");
            System.out.println("3. Them khach hang moi");
            System.out.println("4. Sua khach hang");
            System.out.println("5. Xoa khach hang");
            System.out.println("6. Tim kiem khach hang");
            System.out.println("7. Xuat khach hang");
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
                    System.out.println("Quay lai menu chinh...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long nhap lai.");
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
        System.out.println("=== Bang phieu bao hanh ===");
        //lấy data từ file mà ra
        //1. xem danh sach sp ton kho => danh mục (laptop,phone,accessory) => list sp
            System.out.println("1. Xem danh sach phieu bao hanh");
            System.out.println("2. Xem chi tiet phieu bao hanh");
            System.out.println("3. Them phieu bao hanh moi");
            System.out.println("4. Sua phieu bao hanh");
            System.out.println("5. Xoa phieu bao hanh");
            System.out.println("6. Tim kiem phieu bao hanh");
            System.out.println("7. Xuat danh sach phieu bao hanh");
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
                    System.out.println("Quay lai menu chinh...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long nhap lai.");
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
public void importMenu() throws IOException, ParseException{
    Scanner sc = new Scanner(System.in);
        int choice;
        do {
        System.out.println("=== Bang phieu nhap ===");
        //lấy data từ file mà ra
        //1. xem danh sach sp ton kho => danh mục (laptop,phone,accessory) => list sp
            System.out.println("1. Xem danh sach phieu nhap");
            System.out.println("2. Xem chi tiet phieu nhap");
            System.out.println("3. Them phieu nhap moi");
            System.out.println("4. Sua phieu nhap");
            System.out.println("5. Xoa phieu nhap");
            System.out.println("6. Tim kiem phieu nhap");
            System.out.println("7. Xuat danh sach phieu nhap");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    importMenuInsight();
                    break;
                case 2:
                    importDetailMenu();
                    break;
                case 3:
                    addImport(); 
                    break;
                case 4:
                    editImport();
                    break;
                case 5:
                    deleteImport();
                    break;
                case 6:
                    searchImport();
                    break;
                case 7:
                    exportImport();
                    break;
                case 0:
                    System.out.println("Quay lai menu chinh...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long nhap lai.");
            }
        } while (choice != 0);
}
public void importMenuInsight() throws IOException, ParseException{
        System.out.println("=== Danh sach phieu nhap ===");
        orderManager.load("C:\\Users\\HELLO\\Downloads\\phieunhap.txt");
}
private void importDetailMenu(){}
//editOrder, deleteOrder,searchOrder,addOrder,exportOrder
public void addImport() throws ParseException{
    order.nhap(); 
    orderManager.them(order);
    System.out.println("Đơn hàng đã được thêm!");
}
public void editImport(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap ma phieu nhap can sua: ");
    String id = sc.nextLine();
//    ProductList pl = new ProductList(fileHandler);
    orderManager.sua(id);
}
public void deleteImport(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap ma don hang can xoa: ");
    String id = sc.nextLine();
    orderManager.xoa(id);
    System.out.println("Don hang da duoc xoa!");
}
public void searchImport() throws IOException, ParseException{
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap ten don hang can tim: ");
    String name = sc.nextLine();
//    ProductList pl = new ProductList(fileHandler);
    orderManager.load("C:\\Users\\HELLO\\Downloads\\hoadon.txt");
    Product found = productManager.timKiem(name);
    if (found != null) {
//        found.displayInfo();
        System.out.println("Tim thay don hang");
        System.out.println(found.toString());
    } else {
        System.out.println("Khong tim thay don hang voi ten: " + name);
    }
}
private void exportImport(){}
public void supplierMenu() throws IOException, ParseException{
 Scanner sc = new Scanner(System.in);
        int choice;
        do {
        System.out.println("=== Bang nha cung cap ===");
        //lấy data từ file mà ra
        //1. xem danh sach sp ton kho => danh mục (laptop,phone,accessory) => list sp
            System.out.println("1. Xem danh sach nha cung cap");
            System.out.println("2. Them nha cung cap");
            System.out.println("3. Sua nha cung cap");
            System.out.println("4. Xoa nha cung cap");
            System.out.println("5. Tim kiem nha cung cap");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    supplierMenuInsight();
                    break;
                case 2:
                    addSupplier(); 
                    break;
                case 3:
                    editSupplier();
                    break;
                case 4:
                    deleteSupplier();
                    break;
                case 5:
                    searchSupplier();
                    break;
                case 0:
                    System.out.println("Quay lai menu chinh...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long nhap lai.");
            }
        } while (choice != 0);
}
public void supplierMenuInsight() throws IOException, ParseException{
        System.out.println("=== Danh sach nha cung cap ===");
        orderManager.load("C:\\Users\\HELLO\\Downloads\\phieunhap.txt");
}
public void addSupplier() throws ParseException{
    order.nhap(); 
    orderManager.them(order);
    System.out.println("Nha cung cap da duoc them!");
}
public void editSupplier(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap ma nha cung cap can sua: ");
    String id = sc.nextLine();
//    ProductList pl = new ProductList(fileHandler);
    orderManager.sua(id);
}
public void deleteSupplier(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap ma nha cung cap can xoa: ");
    String id = sc.nextLine();
    orderManager.xoa(id);
    System.out.println("Nha cung cap da duoc xoa!");
}
public void searchSupplier() throws IOException, ParseException{
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap ten nha cung cap can tim: ");
    String name = sc.nextLine();
//    ProductList pl = new ProductList(fileHandler);
    orderManager.load("C:\\Users\\HELLO\\Downloads\\nhacungcap.txt");
    Product found = productManager.timKiem(name);
    if (found != null) {
//        found.displayInfo();
        System.out.println("Tim thay nha cung cap");
        System.out.println(found.toString());
    } else {
        System.out.println("Khong tim thay nha cung cap voi ten: " + name);
    }
}
 public void baiTap(){
     /*
   Hãy khai báo cấu trúc dữ liệu cho danh sách liên kết đơn các thí sinh. 
Giả sử thí sinh gồm những thành phần thông tin như sau:
- Mã thí sinh: tối đa 5 ký tự.
- Họ tên: tối đa 30 ký tự. 
- Điểm toán: kiểu số thực.
- Điểm lý: kiểu số thực. 
- Điểm hóa: kiểu số thực.
- Điểm tổng cộng: kiểu số thực. 
*/
     //Thêm sửa xóa thí sinh?
     //Process: 
     //1. Khai báo linked list singly?! (singly linked list trong Java)
     //2. SWTICH CASE(1. Thêm thí sinh, 2. Sửa thí sinh, 3. Xóa thí sinh, 4. Xem danh sách thí sinh)
     //3. Thuật toán, thêm sửa xóa xem danh sách dựa vào linked list
     
     /*
     class ThiSinh {
    String maThiSinh;   // tối đa 5 ký tự
    String hoTen;       // tối đa 30 ký tự
    double diemToan;
    double diemLy;
    double diemHoa;
    double diemTongCong;

    ThiSinh(String ma, String ten, double toan, double ly, double hoa) {
        this.maThiSinh = ma;
        this.hoTen = ten;
        this.diemToan = toan;
        this.diemLy = ly;
        this.diemHoa = hoa;
        this.diemTongCong = toan + ly + hoa;
    }
}

class Node {
    ThiSinh data;
    Node next;

    Node(ThiSinh ts) {
        this.data = ts;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    // thêm thí sinh vào đầu danh sách
    void addFirst(ThiSinh ts) {
        Node newNode = new Node(ts);
        newNode.next = head;
        head = newNode;
    }

    // xóa thí sinh đầu tiên
    void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    // tìm thí sinh theo mã
    ThiSinh findByMa(String ma) {
        Node current = head;
        while (current != null) {
            if (current.data.maThiSinh.equals(ma)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }
}

     class SinglyLinkedList {
    Node head;

    // thêm thí sinh vào đầu danh sách
    void addFirst(ThiSinh ts) {
        Node newNode = new Node(ts);
        newNode.next = head;
        head = newNode;
    }

    // xóa thí sinh đầu tiên
    void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    // tìm thí sinh theo mã
    ThiSinh findByMa(String ma) {
        Node current = head;
        while (current != null) {
            if (current.data.maThiSinh.equals(ma)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    // sửa điểm của thí sinh theo mã
    boolean updateDiem(String ma, double toan, double ly, double hoa) {
        Node current = head;
        while (current != null) {
            if (current.data.maThiSinh.equals(ma)) {
                current.data.diemToan = toan;
                current.data.diemLy = ly;
                current.data.diemHoa = hoa;
                current.data.diemTongCong = toan + ly + hoa;
                return true; // sửa thành công
            }
            current = current.next;
        }
        return false; // không tìm thấy
    }

    // xóa thí sinh theo mã
    boolean removeByMa(String ma) {
        if (head == null) return false;

        // nếu thí sinh cần xóa nằm ở đầu
        if (head.data.maThiSinh.equals(ma)) {
            head = head.next;
            return true;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data.maThiSinh.equals(ma)) {
                current.next = current.next.next; // bỏ qua node cần xóa
                return true;
            }
            current = current.next;
        }
        return false; // không tìm thấy
    }
}

     */
 }
    // Main method to run the application
    public static void main(String[] args) throws IOException, ParseException {
        MainApp app = new MainApp();
//        app.mainMenu();
        app.baiTap();
    }
}

