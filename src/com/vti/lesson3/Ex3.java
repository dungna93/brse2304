package com.vti.lesson3;

/**
 * @created: 11/11/2023 - 7:26 PM
 * @author: dungna
 */
public class Ex3 {
    public static void main(String[] args) {
        // viết chương trình để in ra các số chẵn từ 1-10 và các số lẻ từ 11-20
        // cách viết thứ nhất

        for(int i = 1; i <= 20; i++) {
            if (i <= 10) {
                if (i%2 == 0) {
                    System.out.println(i);
                }
            } else {
                if (i%2 != 0) {
                    System.out.println(i);
                }
            }
        }

        // cách viết thứ 2
        for(int i = 1; i <= 10; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }

        for(int i = 11; i <= 20; i++) {
            if (i%2 != 0) {
                System.out.println(i);
            }
        }
    }
}
