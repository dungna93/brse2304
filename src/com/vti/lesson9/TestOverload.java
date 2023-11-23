package com.vti.lesson9;

/**
 * @created: 23/11/2023 - 7:40 PM
 * @author: dungna
 */
public class TestOverload {

    // Hàm static hay hàm class (chứa từ khóa static)
    public static int dienTich(int cd, int cr) {
        return cd*cr;
    }

    // overload hàm dienTich
    private static float dienTich(float cd, float cr, float h) {
        return cd*cr*h;
    }

    public static void main(String[] args) {
        // Khái niệm về overload method:
        // Tên method: phải giống với tên hàm cần overload
        // Danh sách tham số truyền vào: phải khác nhau.
        // Kiểu dữ liệu trả về: có thể khác nhau.
        // Phạm vi truy cập: có thể khác nhau.
        // Ngữ cảnh cài đặt: có thể nạp chồng trong lớp con hoặc chính lớp cha.
        // không thể sử dụng từ khóa this
        System.out.println("Overrload method result: ");
        System.out.println(dienTich(4.2f, 2.1f, 3.5f));
    }
}
