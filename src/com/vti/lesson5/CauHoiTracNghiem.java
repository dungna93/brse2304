package com.vti.lesson5;

import java.util.Scanner;

/**
 * @created: 14/11/2023 - 8:52 PM
 * @author: dungna
 */
public class CauHoiTracNghiem {
    // Tạo câu hỏi trắc nghiệm và kiểm tra đáp án đúng
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Cấu trúc toán tử điều kiện trong java là gì?");
            System.out.println("A. [biểu thức điều kiện] ? [giá trị đúng] : [giá trị sai]");
            System.out.println("B. [giá trị đúng] ? [biểu thức điều kiện] : [giá trị sai]");
            System.out.println("C. [giá trị sai] ? [biểu thức điều kiện] : [giá trị đúng]");
            System.out.println("D. Không có đáp án nào đúng");

            String phuongAnChon = scan.nextLine();
//            if ("A".equalsIgnoreCase(phuongAnChon)) {
//                System.out.println("Bạn trả lời đúng");
//                break;
//            } else if ("B".equalsIgnoreCase(phuongAnChon)) {
//                System.out.println("Bạn trả lời sai");
//                break;
//            } else if ("C".equalsIgnoreCase(phuongAnChon)) {
//                System.out.println("Bạn trả lời sai");
//                break;
//            } else if ("D".equalsIgnoreCase(phuongAnChon)) {
//                System.out.println("Bạn trả lời sai");
//                break;
//            } else {
//                System.out.println("Vui lòng lựa chọn đáp án!");
//            }


            // if else kết hợp toán tử logic OR (||)
            if ("A".equalsIgnoreCase(phuongAnChon)) {
                System.out.println("Bạn trả lời đúng");
                break;
            } else if ("B".equalsIgnoreCase(phuongAnChon) || "C".equalsIgnoreCase(phuongAnChon) || "D".equalsIgnoreCase(phuongAnChon)) {
                System.out.println("Bạn trả lời sai");
                break;
            } else {
                System.out.println("Vui lòng lựa chọn đáp án!");
            }
        }
        System.out.println("Kết thúc chương trình");
        scan.close();
    }
}
