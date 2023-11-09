package com.vti.lesson3;

import java.util.Scanner;

/**
 * @created: 09/11/2023 - 9:11 PM
 * @author: dungna
 */
public class Ex2 {
    public static void main(String[] args) {
        // Bài tập về câu điều kiện
        // Viết chương trình nhập 1 số nguyên từ bàn phím. Kiểm tra số đó và in ra màn hình số đó là âm, dương hay bằng 0
        System.out.println("Nhập số nguyên từ bàn phím");
        System.out.println("Nhập x = ");
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        System.out.println("Giá trị của x là: " + x);

        if (x > 0) {
            System.out.println("x là số dương");
        }

        if (x < 0) {
            System.out.println("x là số âm");
        }

        if (x == 0) {
            System.out.println("x = 0");
        }

        // if else lồng nhau
        if (x > 0) {
            System.out.println("x là số dương");
        } else if (x < 0) {
            System.out.println("x là số âm");
        } else {
            System.out.println("x = 0");
        }

        // if else lồng nhau sẽ tương đương với đoạn code sau
        if (x > 0) {
            System.out.println("x là số dương");
        } else {
            if (x < 0) {
                System.out.println("x là số âm");
            } else {
                System.out.println("x = 0");
            }
        }

        // Toán tử điều kiện
        // [Kiểu dữ liệu khai báo] [tên biến] = [biểu thức logic] ? [kết quả của biểu thức đúng] : [Kết quả của biểu thức sai]
                 String            kiemTra    = (x > 10)           ? "x lớn hơn 10"              : "x nhỏ hơn 10";
        // giải thích câu lệnh phía trên
        if (x > 10) {
            kiemTra = "x lớn hơn 10";
        } else {
            kiemTra = "x nhỏ hơn 10";
        }
        System.out.println(kiemTra);

        int z = 3;
        int y = (z > 5) ? 4 : 1;
        System.out.println(y);

    }
}
