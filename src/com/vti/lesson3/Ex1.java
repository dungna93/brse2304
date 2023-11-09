package com.vti.lesson3;

import java.util.Scanner;

/**
 * @created: 09/11/2023 - 8:43 PM
 * @author: dungna
 */
public class Ex1 {
    public static void main(String[] args) {
        // Bài tập nhập 2 số nguyên dương từ bàn phím và in ra tổng của 2 số đó
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhập 2 số nguyên dương.");
        System.out.println("Nhập x = ");
        int x = scan.nextInt();
        System.out.println("Nhập y = ");
        int y = scan.nextInt();
        int tong = x + y;
        System.out.println("Tổng x + y = " + tong);

    }
}
