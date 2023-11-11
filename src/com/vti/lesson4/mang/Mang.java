package com.vti.lesson4.mang;

/**
 * @created: 11/11/2023 - 8:30 PM
 * @author: dungna
 */
public class Mang {
    public static void main(String[] args) {
        // Cấu trúc mảng. Cách khai báo mảng
        // cách 1: [Kiểu dữ liệu của mảng][] [tên mảng] = new [Kiểu dữ liệu mảng][số phần tử];
        // cách 2: [Kiểu dữ liệu của mảng][] [tên mảng] = {khởi tạo các phần tử cho mảng};

        // 1 mảng là 1 tập hợp tất cả các phần tử (đối tượng) có cùng tính chất, đặc điểm tương tự nhau
        int[] mangSoNguyen = {1,2,3,4,5,6,7};
        int[] mang2 = new int[7];
        mang2[0] = 1;
        mang2[1] = 8;
        mang2[2] = 10;
        mang2[3] = 12;
        mang2[4] = 21;
        mang2[5] = 19;
        mang2[6] = 100;

        System.out.println("Tôi muốn biết số phần tử của mangSoNguyen: ");
        System.out.println(mangSoNguyen.length);
        for (int viTri = 0; viTri < mang2.length; viTri++) {
            System.out.println(mang2[viTri]);
        }

        // cấu trúc for each
        // khai báo biến có cùng kiểu dữ liệu với mảng.
        // Ứng dụng trong việc in thông báo ra màn hình console hoặc in thông tin từng phần tử của mảng
        for (int item : mang2) {
            System.out.println(item);
        }
    }
}
