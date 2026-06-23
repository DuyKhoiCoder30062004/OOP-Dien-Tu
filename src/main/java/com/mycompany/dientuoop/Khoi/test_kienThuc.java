/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dientuoop.Khoi;

/**
 *
 * @author HELLO
 */
//LINKED LIST
// Import the LinkedList class
/*
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  }
}
*/
//https://www.w3schools.com/java/java_linkedlist.asp
import java.util.LinkedList;
public class test_kienThuc<T>{
    T duLieu;
    //test_kienThuc dc xem la 1 Node
    test_kienThuc<T> tiepTuc;
    test_kienThuc(T duLieuThem){
        this.duLieu = duLieuThem;
        this.tiepTuc = null;
    }
    public static void main(String[] args){
        /*
        //add item vaò linkedlist
        LinkedList<Object> cars = new LinkedList<Object>();
        cars.add("a");
        cars.add("123");
        // Use addFirst() to add the item to the beginning
        System.out.print(cars);
        cars.addFirst("456");
        //addLast(): Add an element to the end of the list
        cars.addLast("4512");
        //removeFirst(): Remove an element from the beginning of the list
        cars.removeFirst();// liên quan tới invoke tự thân? => yes
        cars.addLast(123.05 + 456);
        //nếu integer + float/double thì có xảy ra mismatch/arithmetic error hay ko?
        // sẽ bị convert sang float lun.
        System.out.println(cars);
        //clear(): The clear() removes all items from the list.
        cars.clear();
        System.out.println(cars);
//ko có space thì ra [a, 123][a, 123, 4512]
*/
        //có hàm thêm, vào đầu, cuối => chưa có them vào giữa or vị trí bất kỳ
        // yêu cầu cần có hàm xóa,sửa,tìm kiếm.
        test_kienThuc<String> n = new test_kienThuc<>("Hello"); 
    String s = n.duLieu; // không cần ép kiểu
        System.out.print(s);
    }
}
