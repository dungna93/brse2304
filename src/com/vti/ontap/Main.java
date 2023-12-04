package com.vti.ontap;

import java.util.ArrayList;

/**
 * @created: 04/12/2023 - 7:48 PM
 * @author: dungna
 */
public class Main {
    public static void main(String[] args) {
        //câu số 2: chuyển đổi kiểu dữ liệu từ long -> int
//        long x = 10;
//        int y = (int) x;
//        System.out.println(y);

        //câu số 3: Autoboxing và Unboxing là gì?
        int x = 3;
        // Quá trình Autoboxing -> tự động chuyển đổi kiểu dữ liệu nguyên thủy về kiểu dữ liệu tham chiếu (đối tượng)
        Integer y = x;
        System.out.println(y);
        // Quá trình Unboxing -> là quá trình ngược lại so vói Autoboxing
        Integer z = 10;
        int a = z;
        System.out.println(a);

        // câu số 4: Khai báo mảng trong java
        // Muốn truy cập hay lấy giá trị 1 phần tử trong mảng, ta sử dụng chỉ số để truy cập hoặc lấy giá trị đó.
        // Chú ý mảng bắt đầu từ vị trí 0.
        int[] array = new int[10];
        int[] array_1 = {1, 2, 3, 4, 10};
        System.out.println(array_1[1]);

        // Câu số 5: Làm sao để đọc và ghi tệp trong Java?
        // Sử dụng thư viện java.io
        // các hàm: exists (kiểm tra sự tồn tại của file trong đường dẫn)
        // đọc nội dung file sử dụng: FileInputStream
        // ghi nội dung file sử dụng: FileOutputStream

        // Câu số 6: có bao nhiêu loại vòng lặp
        // 3 loại vòng lặp chính: for, while, do..while
        // for (int i = 1; i < 11; i++)
        // for (int x : mảng số nguyên int)
        // x = 10;
        // while (x > 5) {
        //     x--;
        // }
        // do { // thực hiện hành động và tăng giảm giá trị hoặc thay đổi logic để dừng vòng lặp} while (x>5)

        // câu 10: cách để dừng 1 vòng lặp trong java
        // Sử dụng câu lệnh break hoặc return

//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//            if (i > 6) {
//                return;
//            }
//        }

        // câu 18: Toán từ ba ngôi
        // (điều kiện cần kiểm tra) ? [Giá trị trả về nếu điều kiện đúng] : [Giá trị trả về nếu điều kiện không đúng]

        // Toán tử logic: AND (&&), OR (||), NOT (!)
        // if (  !(x > 2)  ) {

        //  }

        // Kiẻu

    }
}
