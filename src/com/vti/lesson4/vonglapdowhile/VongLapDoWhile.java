package com.vti.lesson4.vonglapdowhile;

/**
 * @created: 11/11/2023 - 8:13 PM
 * @author: dungna
 */
public class VongLapDoWhile {
    public static void main(String[] args) {
        // Cấu trúc
        /*
        do {
            // câu lệnh cần thực hiện
        } while ([điều kiện thực hiện]);
        */
        int i = 0;
        do {
            System.out.println(i);
            i = i - 1;
        } while (i < 10);
    }
}
