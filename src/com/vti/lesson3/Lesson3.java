package com.vti.lesson3;

import java.util.Scanner;

/**
 * @created: 09/11/2023 - 7:53 PM
 * @author: dungna
 */
public class Lesson3 {

    // Tên hằng số thì viết hoa tất cả các chữ cái, các từ cách nhau bởi dấu _
    // Khai báo Hằng số
    public static final int THANG_CUA_NAM = 12;
    public static final String MEMBER = "Nguyễn Anh Dũng";

    public static void main(String[] args) {
        // I. Chuỗi.
        String str = "Xin chào các bạn.";
        System.out.println(str);

        // 1.1. Ghép chuỗi
        String str2 = "Các bạn có khỏe không? " + "Mình tên là Nguyễn Anh Dũng" + ". Mình năm nay 30 tuổi";
        System.out.println(str2);

        // 1.2. Ghép chuỗi với 2 biến str và str2
        System.out.println(str + str2);

        // II. Hằng số
        System.out.println("1 năm có bao nhiêu tháng? " + THANG_CUA_NAM);
        System.out.println("Tên của thành viên là: " + MEMBER);

        // III. Đọc dữ liệu từ bàn phím sử dụng scanf
        Scanner scan = new Scanner(System.in); // cấu trúc tiêu chuẩn khi cần nhập thông tin
//        System.out.println("Nhập 1 số bất kỳ");
//        scan.nextInt();
//
//        Scanner scan2 = new Scanner(System.in);
//        System.out.println("Nhập tên của anh chị");
//        scan2.nextLine();

        // Gán giá trị nhập vào biến
        System.out.println("Nhập 1 số nguyên dương");
        int nguyenDuong = scan.nextInt();

        System.out.println("Số bạn vừa nhập là: " + nguyenDuong);

        scan.close();
//        scan2.close();
    }
}
