package com.vti.lesson5;

/**
 * @created: 14/11/2023 - 7:59 PM
 * @author: dungna
 */
public class BreakCondition {
    public static void main(String[] args) {
        // Câu lệnh break
        // Tác dụng: Để kết thúc vòng lặp hoặc để kết thúc câu lệnh trong câu điều kiện switch
        // break thường được dùng để check điều kiện khi nào dừng vòng lặp.
        // Đối với vòng lặp lồng nhau, lệnh break chỉ có tác dụng đối với vòng lặp hiện tại.

        for (int i =0; i<10; i++) {
            System.out.println(i);
            break;
        }

        for (int i =0; i<10; i++) {
            System.out.println(i);
            if ( i == 6) {
                break;
            }
        }
    }
}
