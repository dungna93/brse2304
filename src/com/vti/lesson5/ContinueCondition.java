package com.vti.lesson5;

import java.util.Scanner;

/**
 * @created: 14/11/2023 - 8:06 PM
 * @author: dungna
 */
public class ContinueCondition {
    public static void main(String[] args) {
        // Câu lệnh continue dùng để tiếp tục vòng lặp và bỏ qua các câu lệnh bên dưới nó.
        // continue khá giống với break chỉ khác là continue sẽ tiếp tục vòng lặp.
        // Thường được sử dụng để check điều kiện nào đó được tiếp tục vòng lặp hay không.
        // continue cũng chỉ ảnh hưởng đến vòng lặp hiện tại của nó mà thôi.


//        for (int i =0; i<10; i++) {
//            if (i < 7) {
//                continue;
//            }
//            System.out.println(i);
//        }

//        for (int i =0; i<10; i++) {
//            System.out.println(i);
//            if ( i == 6) {
//                continue;
//            }
//        }

//        for (int i = 0; i < 10; i++) {
//            System.out.println("Giá trị i = " + i);
//            for (int j = 0; j < 11; j++) {
//                System.out.println("j = " + j);
//                if (j == 4) {
//                    break;
//                }
//            }
//        }

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 11; j++) {
//                if (j == 9) {
//                    break;
//                }
//                System.out.println("j = " + j);
//            }
//            if (i == 7) {
//                break;
//            }
//            System.out.println("Giá trị i = " + i);
//        }

        do {
            System.out.println("thông tin khách hàng");
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            System.out.println(input);
            if (input == 100) {
                scan.close();
                break;
            }
//            scan.close();
        } while (true);
        System.out.println("Kết thúc chương trình");
    }
}
