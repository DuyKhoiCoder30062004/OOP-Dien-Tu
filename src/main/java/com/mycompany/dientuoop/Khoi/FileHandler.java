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
    public void saveToFile(List<Supplier> data, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(fileName))) {
            oos.writeObject(data);
            System.out.println("Suppliers saved to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Read supplier list from file
    @SuppressWarnings("unchecked")
    public List<Supplier> readFromFile(String fileName) {
        List<Supplier> suppliers = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(fileName))) {
            suppliers = (List<Supplier>) ois.readObject();
            System.out.println("Suppliers loaded from " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return suppliers;
    }
}
