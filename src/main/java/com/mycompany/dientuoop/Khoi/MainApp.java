///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.dientuoop;
//
///**
// *
// * @author HELLO
// */
//
////MainApp - IQuanly - FIleHandler - Utils
//
//public class MainApp {
//    private ProductList productManager;
//    private OrderList orderManager;
//    private EmployeeList employeeManager;
//    private CustomerList customerManager;
//    private WarrantyList warrantyManager;
//    public void mainMenu(){}
//    public void productMenu(){}
//    public void orderMenu(){}
//    public void employeeMenu(){}
//    public void customerMenu(){}
//}


package com.mycompany.dientuoop.Khoi;

import com.mycompany.dientuoop.Hien.Laptop;
import com.mycompany.dientuoop.Hien.Phone;
import com.mycompany.dientuoop.Hien.Product;
import com.mycompany.dientuoop.Hien.ProductList;
import com.mycompany.dientuoop.HuuTien.OrderList;
import com.mycompany.dientuoop.AnhVu.EmployeeList;
import com.mycompany.dientuoop.HuuTien.CustomerList;
import java.util.Scanner;
public class MainApp {
    // Managers
    private ProductList productManager;
    private OrderList orderManager;
    private EmployeeList employeeManager;
    private CustomerList customerManager;
    private WarrantyList warrantyManager;

    // Constructor
    public MainApp() {
        this.productManager = new ProductList();
        this.orderManager = new OrderList();
        this.employeeManager = new EmployeeList();
        this.customerManager = new CustomerList();
        this.warrantyManager = new WarrantyList();
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
        System.out.println("=== Product Menu ===");
        // Add product-related options and logic here
    }

    public void orderMenu() {
        System.out.println("=== Order Menu ===");
        // Add order-related options and logic here
    }

    public void employeeMenu() {
        System.out.println("=== Employee Menu ===");
        // Add employee-related options and logic here
    }

    public void customerMenu() {
        
        // Add customer-related options and logic here
    }

    // Main method to run the application
    public static void main(String[] args) {
        MainApp app = new MainApp();
        app.mainMenu();
    }
}

