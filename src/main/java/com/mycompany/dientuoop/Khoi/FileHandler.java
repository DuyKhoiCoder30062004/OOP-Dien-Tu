package com.mycompany.dientuoop.Khoi;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler<T> {
    private String filePath;

    public FileHandler(String filePath) {
        this.filePath = filePath;
    }

    // Save supplier list to file
    public void saveToFile(List<T> data, String fileName) {
    try (BufferedWriter writer = new BufferedWriter(
           new OutputStreamWriter(new FileOutputStream(fileName, true), "UTF-8"))) {
        for (T item : data) {
            writer.write(item.toString()); // toString có thể chứa tiếng Việt
            writer.newLine();
        }
        System.out.println("Thông tin được lưu vào file " + fileName);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    public void saveToFileEdit(List<T> data, String fileName) {
    try (BufferedWriter writer = new BufferedWriter(
           new OutputStreamWriter(new FileOutputStream(fileName, false), "UTF-8"))) {
        for (T item : data) {
            writer.write(item.toString()); // toString có thể chứa tiếng Việt
            writer.newLine();
        }
        System.out.println("Thông tin được lưu vào file " + fileName);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    public void saveToFileDelete(List<T> data, String fileName) {
    try (BufferedWriter writer = new BufferedWriter(
           new OutputStreamWriter(new FileOutputStream(fileName, false), "UTF-8"))) {
        for (T item : data) {
            writer.write(item.toString()); // toString có thể chứa tiếng Việt
            writer.newLine();
        }
        System.out.println("Thông tin được lưu vào file " + fileName);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    // Read supplier list from file
    @SuppressWarnings("unchecked")
 public T readFromFile(String fileName) throws IOException{
   try (BufferedReader reader = new BufferedReader(
        new InputStreamReader(new FileInputStream(fileName), "UTF-8"))) {
    String line;
    while ((line = reader.readLine()) != null) {
        System.out.println("Đang tải Dữ liệu lên hệ thống");
        System.out.println(line);
    }
}
        return null;
    }
}
