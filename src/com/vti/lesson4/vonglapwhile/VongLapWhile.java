package com.vti.lesson4.vonglapwhile;

/**
 * @created: 11/11/2023 - 8:04 PM
 * @author: dungna
 */
public class VongLapWhile {
    public static void main(String[] args) {
        // cấu trúc
        /*
        while ([điều kiện thực hiện vòng lặp]) {
            // các câu lệnh cần thực hiện
        }
         */
        // Vòng lặp while luôn kiểm tra điều kiện trước rồi mới thực hiện câu lệnh trong dấu {}
        // test: In ra các số từ 1 đến 10
        int k = 1;
        while (k <= 10) {
            System.out.println(k);
            k++;
        }

        int count = 19987;
        boolean flag = true;
        int dem = 1;
        while (flag) {
            System.out.println("Lần thứ " + dem + " thực hiện: ");
            if (count % 13 == 0) {
                System.out.println("số chia hết cho 13 là: " + count);
                flag = false;
            }
            count--;
            dem++;
        }
    }
}
