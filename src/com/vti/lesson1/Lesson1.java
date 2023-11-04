package com.vti.lesson1;

/**
 * @created: 04/11/2023 - 8:33 PM
 * @author: dungna
 */
public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Toán tử cơ bản trong java
        // + , -, *, / (chia lấy phần nguyên), % (chia lấy phần dư)

        int a = 5;
        int b = 2;
        int c = a + b;
        int d = a - b;
        int e = a / b;
        int f = a % b;
        int g = a * b;

        System.out.println("Tổng 2 số là: " + c);
        System.out.println("Hiệu 2 số là: " + d);
        System.out.println("Thương 2 số là: " + e);
        System.out.println("Chia lấy phần dư 2 số là: " + f);
        System.out.println("Tích 2 số là: " + g);



        // Toán tử gán
        // toán tử =
        int x1 = 654; // gán giá trị 654 cho biến x1

        // toán tử +=
        int x2 = 1;
        int x3 = 2;


        x2 += x3; // cộng 2 toán hạng rồi gán giá trị cho toán hạng bên trái
        // tương đương x2 = x2 + x3
        System.out.println("Giá trị toán tử +=: " + x2);

        // các phép toán sau tương tự
        x2 -= x3; // tương đương: x2 = x2 -x3;
        System.out.println("Giá trị toán tử -=: " + x2);

        x2 *= x3;
        x2 /= x3;
        x2 %= x3;

        // Toán tử tiếp theo
        // Dịch trái: <<=
        // Dịch phải: >>=
        // phép and bit: &=
        // phép or loại trừ bit: ^=
        // phép or bit: |=


        // Toán từ logic
        // so sánh bằng: ==
        int s = 5;
        int p = 4;

        boolean check = true;

        System.out.println("check bằng gì đây: " + check);

        System.out.println(s == p);


    }
}
