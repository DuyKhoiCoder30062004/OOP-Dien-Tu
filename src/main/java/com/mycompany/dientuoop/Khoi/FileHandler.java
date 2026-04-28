package com.mycompany.dientuoop.Khoi;
import java.io.*;
import java.util.*;

public class FileHandler<T> {
    private String tenDuongDan;

    public void saveToFile(List<T> data, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<T> readFromFile(String fileName) {
        List<T> data = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            data = (List<T>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }

//    public void saveTest() {
//        List<String> names = new ArrayList<>();
//        names.add("Alice");
//        names.add("Bob");
//        //serialize and save as binary stream of text
//        try (ObjectOutputStream oos = new ObjectOutputStream(
//                new FileOutputStream("C:\\Users\\HELLO\\Downloads\\name.dat"))) {
//            oos.writeObject(names);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    public void readTest(){
//    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\HELLO\\Downloads\\name.dat"))){
//    List<String> names = (List<String>)ois.readObject();
//    System.out.println(names); // [Alice, Bob]
//} catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
    public void saveTest() {
    List<String> names = new ArrayList<>();
    names.add("Alice");
    names.add("Bob");

    try (PrintWriter pw = new PrintWriter("C:\\Users\\HELLO\\Downloads\\names.txt")) {
        for (String name : names) {
            pw.println(name);  // write each name as a line of text
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    public void readTest() {
    List<String> names = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\HELLO\\Downloads\\names.txt"))) {
        String line;
        while ((line = br.readLine()) != null) {
            names.add(line);  // add each line back into the list
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    System.out.println(names); // [Alice, Bob]
}
    
  //class diagram
  //nha cung cap + phieu bao hanh` 
    
    
 


//    public static void main(String[] args) {
//        FileHandler<String> a = new FileHandler<>();
//        a.saveTest();
//        a.readTest();
//    }
}
