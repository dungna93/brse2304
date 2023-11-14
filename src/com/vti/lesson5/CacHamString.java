package com.vti.lesson5;

/**
 * @created: 14/11/2023 - 10:14 PM
 * @author: dungna
 */
public class CacHamString {
    public static void main(String[] args) {
        String s1 = "Xin chào các bạn ";
        String s2 = s1;
        // hàm equals để so sánh 2 chuỗi có giá trị bằng nhau hay không
        System.out.println(s2.equals(s1));

        String s3 = "XIN CHÀO CÁC BẠN ";
        // hàm equalsIgnoreCase so sánh 2 chuỗi không phân biệt chữ hoa, chữ thường
        System.out.println(s3.equalsIgnoreCase(s1));

        // hàm length trả ra độ dài chuỗi bao gồm cả dấu cách (space)
        System.out.println("Độ dài chuỗi s1 là: " + s1.length());

        // hàm trim, xóa khoảng trắng đầu và cuối chuỗi
        String s4 = "   Hello World!    ";
        String s5 = s4.trim();
        System.out.println("Trước khi xóa khoảng trắng:==" + s4);
        System.out.println("Sau khi xóa khoảng trắng:==" + s5);

        // hàm contains. chứa chuỗi trong chuỗi
        String s6 = "Hôm nay là thứ 3 ngày 14/11/2023.";
        String s7 = "14/11/2023 ";
        System.out.println("chuỗi s6 có chứa nội dung của s7 hay không: " + s6.contains(s7));
    }
}
