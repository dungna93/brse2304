package com.vti.ontap_buoi2;

import java.util.Scanner;

/**
 * @created: 05/12/2023 - 8:04 PM
 * @author: dungna
 */
public class Main {
    public static void main(String[] args) {
        // Bài tập: Tính tổng và trung bình cộng của 1 mảng số nguyên.
        Scanner scan = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = scan.nextInt(); // n là số phần tử của mảng được nhập vào từ bàn phím

        int[] arr = new int[n]; // khai báo mảng với n phần tử.

        // Nhập giá trị các phần tử của mảng arr
        System.out.println("Nhập các giá trị cho mảng.");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
            arr[i] = scan.nextInt();
        }

        // Tính tổng các phần tử trong mảng.
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        // lần lặp đầu tiên sum = 0 + arr[0] = arr[0]
        // lần lặp thứ 2:   sum = sum + arr[1] = arr[0] + arr[1]
        // lần lặp thứ 3:   sum = sum + arr[2] = (arr[0] + arr[1]) + arr[2]
        System.out.println("Tổng các phần tử trong mảng là: " + sum);

        double average = (double) sum / n;

        System.out.println("Trung bình cộng của mảng arr là: " + average);
    }
}
