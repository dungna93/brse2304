package com.vti.lesson2;

/**
 * @created: 07/11/2023 - 7:24 PM
 * @author: dungna
 */
public class Lesson2 {

    public static void main(String[] args) {
        // ôn lại kiến thức về toán tử trong java
        // 1. Toán tử quan hệ
        int x = 2;
        int y = 2;
        // 1.1. Toán tử !=
        System.out.println(x != y);
        // 1.2 Toán tử <=
        x = 10;
        y = 10;
        System.out.println(x <= y);

        //1.3. chia lấy phần dư
        tong2So();
        System.out.println("Hieu 2 so: " + hieu2So());


        int c = tich2So(8, 9);
        System.out.println(c);
        System.out.println("Tích 2 so: " + tich2So(8,10));
        System.out.println("Tích 2 so với biến c truyền vào: " + tich2So(20));

        Ex1.customerName();

    }

    public static void tong2So() {
        System.out.println("Tổng 2 sô 2 và 3 là: " + (2+3) );
    }

    // hàm khai báo kiểu dữ liệu gì thì sẽ phải return về giá trị của kiểu dữ liệu đó
    public static int hieu2So() {
        return 10;
    }

    // hàm có tham số truyền vào (parameter)
    public static int tich2So(int a, int b) {
        return a*b;
    }

    public static int tich2So(int c) {
        return c*6;
    }



}
