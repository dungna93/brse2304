package com.vti.ontap_buoi2;

import java.util.Scanner;

/**
 * @created: 05/12/2023 - 8:51 PM
 * @author: dungna
 */
public class KiemTraTamGiac {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Nhập độ dài các cạnh từ người dùng
        System.out.print("Nhập độ dài cạnh a: ");
        double a = scan.nextDouble();

        System.out.print("Nhập độ dài cạnh b: ");
        double b = scan.nextDouble();

        System.out.print("Nhập độ dài cạnh c: ");
        double c = scan.nextDouble();

        // Điều kiện để trở thành 1 tam giác:
//        if ( (a+b) > c && (a+c) > b && (b+c)>a) {
//            System.out.println("Tam giác thỏa mãn điều kiện nhập vào");
//        } else {
//            System.out.println("Ba cạnh nhập vào không thể tạo thành tam giác");
//        }

        if (isTamGiac(a, b, c)) {
            System.out.println("là tam giác");
//            if (a==b && b==c) {
//                System.out.println("Là tam giác đều");
//            } else {
//                System.out.println("Không phải tam giác đều");
//            }

//            if (a==b || b==c || c==a) {
//                System.out.println("Là tam giác cân");
//            } else {
//                System.out.println("Không phải tam giác cân");
//            }

            if (a==b || b==c || c==a) {
                if (a==b && b==c) {
                    System.out.println("Là tam giác đều");
                } else {
                    System.out.println("Là tam giác cân");
                }
            }


            // Kiểm tra tam giác vuông
            // Gợi ý: sử dụng hàm max trong thư viện Math
//            Math.max(Math.max(a,b), c);
            if (a > b && a > c) {
                if (a*a == b*b + c*c) {
                    System.out.println("tam giác vuông");
                }
            }
            if (b > a && b > c) {
                if (b*b == a*a + c*c) {
                    System.out.println("tam giác vuông");
                }
            }
            if (c > a && c > b) {
                if (c*c == a*a + b*b) {
                    System.out.println("tam giác vuông");
                }
            }
        } else {
            System.out.println("không phải tam giác");
        }

        // a + b > c
        // a + c > b
        // b + c > a
    }

    public static boolean isTamGiac(double x, double y, double z) {
        boolean result = (x+y) > z && (x+z) > y && (y+z)>x;
        return result;
    }
}
