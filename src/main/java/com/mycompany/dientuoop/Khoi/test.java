/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dientuoop.Khoi;

/**
 *
 * @author HELLO
 */
import java.io.*;
import java.util.*;

public class test<T> implements Serializable {
    private String name;
    private int age;

    public test() {}

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        this.name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        this.age = sc.nextInt();
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
    public static void saveToFile(List<test> data, String fileName) {
    try (BufferedWriter writer = new BufferedWriter(
           new OutputStreamWriter(new FileOutputStream(fileName, true), "UTF-8"))) {
        for (test item : data) {
            writer.write(item.toString()); // toString có thể chứa tiếng Việt
            writer.newLine();
        }
        System.out.println("Thông tin được lưu vào file " + fileName);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    public static void readFromFile(String fileName) throws IOException{
   try (BufferedReader reader = new BufferedReader(
        new InputStreamReader(new FileInputStream(fileName), "UTF-8"))) {
    String line;
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }
}
    }
    public static void main(String[] args) throws IOException {
        List<test> students = new ArrayList<>();

        // Nhập 2 sinh viên
        test s1 = new test();
        s1.nhap();
        students.add(s1);

        test s2 = new test();
        s2.nhap();
        students.add(s2);
        //test append
        System.out.print(students);
        // Lưu danh sách vào file
        test a = new test();
        a.saveToFile(students, "C:\\Users\\HELLO\\Downloads\\abc.txt");
        readFromFile("C:\\Users\\HELLO\\Downloads\\abc.txt");
    }
}

    

