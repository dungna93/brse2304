package com.vti.lesson1;

/**
 * @created: 04/11/2023 - 8:33 PM
 * @author: dungna
 */
public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Toán tử cơ bản trong java
        // + , -, *, / (chia lấy phần nguyên), % (chia lấy phần dư)

        int a = 5;
        int b = 2;
        int c = a + b;
        int d = a - b;
        int e = a / b;
        int f = a % b;
        int g = a * b;

        System.out.println("Tổng 2 số là: " + c);
        System.out.println("Hiệu 2 số là: " + d);
        System.out.println("Thương 2 số là: " + e);
        System.out.println("Chia lấy phần dư 2 số là: " + f);
        System.out.println("Tích 2 số là: " + g);



        // Toán tử gán
        // toán tử =
        int x1 = 654; // gán giá trị 654 cho biến x1

        // toán tử +=
        int x2 = 1;
        int x3 = 2;


        x2 += x3; // cộng 2 toán hạng rồi gán giá trị cho toán hạng bên trái
        // tương đương x2 = x2 + x3
        System.out.println("Giá trị toán tử +=: " + x2);

        // các phép toán sau tương tự
        x2 -= x3; // tương đương: x2 = x2 -x3;
        System.out.println("Giá trị toán tử -=: " + x2);

        x2 *= x3;
        x2 /= x3;
        x2 %= x3;

        // Toán tử tiếp theo
        // Dịch trái: <<=
        // Dịch phải: >>=
        // phép and bit: &=
        // phép or loại trừ bit: ^=
        // phép or bit: |=


        // Toán từ logic
        // so sánh bằng: ==
        int s = 5;
        int p = 4;

        boolean check = true;

        System.out.println("check bằng gì đây: " + check);

        System.out.println(s == p);

        // Toán tử logic: AND, OR, NOT
        // AND (&&): return true nếu cả 2 biểu thức đều đúng
        /*

        Giá trị	AND (&&)				true: 1
        x	        1	1	0	0	    false: 0
        y	        1	0	1	0
        phép nhân	1	0	0	0

        Giá trị	OR (||)
        x	        1	1	0	0
        y	        1	0	1	0
        phép cộng	1	1	1	0

        Giá trị	NOT (!)
        x	        1	0
        phép ngược	0	1
         */

        System.out.println("==========Toán tử AND (&&)===============");
        int x = 1;
        int y = 1;
        if ( (x==1) && (y==1)) {  // if (true && true)
            System.out.println("1. Giá trị của x và y đều bằng 1");
        }
        System.out.println("true && true: " + ((x==1) && (y==1)));

        x = 2;
        y = 1;
        if ( (x==1) && (y==1)) {  // if (false && true)
            System.out.println("2. biểu thức false và true"); // dòng này sẽ không được in ra
        }
        System.out.println("false && true: " + ((x==1) && (y==1)));

        x = 1;
        y = 2;
        if ( (x==1) && (y==1)) {  // if (true && false)
            System.out.println("3. biểu thức false và true"); // dòng này sẽ không được in ra
        }
        System.out.println("true && false: " + ((x==1) && (y==1)));

        x = 2;
        y = 2;
        if ( (x==1) && (y==1)) {  // if (false && false)
            System.out.println("4. biểu thức false và true"); // dòng này sẽ không được in ra
        }
        System.out.println("false && false: " + ((x==1) && (y==1)));

        // Kết luận: toán tử && chỉ trả ra giá trị true khi cả 2 biểu thức đều là biểu thức đúng (true).
        // Chỉ cần 1 biểu thức sai thì giá trị của toán tử sẽ là false.

        System.out.println("==========Toán tử OR (||)===============");

        x = 1;
        y = 1;
        if ( (x==1) || (y==1)) {  // if (true || true)
            System.out.println("1. Giá trị của x hoặc y bằng 1");
        }
        System.out.println("true || true: " + ((x==1) || (y==1)));

        if ( (x==2) || (y==1)) {  // if (false || true)
            System.out.println("2. Giá trị của x = 2 hoặc y = 1");
        }
        System.out.println("false || true: " + ((x==2) || (y==1)));

        if ( (x==1) || (y==2)) {  // if (true || false)
            System.out.println("3. Giá trị của x = 1 hoặc y = 2");
        }
        System.out.println("true || false: " + ((x==1) || (y==2)));

        if ( (x==2) || (y==2)) {  // if (false || false)
            System.out.println("4. Giá trị của x = 1 hoặc y = 2"); // không in ra dòng này
        }
        System.out.println("false || false: " + ((x==2) || (y==2)));
        // Kết luận: Đối với toán tử OR
        // Sẽ trả ra giá trị true nếu ít nhất 1 trong 2 biểu thức là true.
        // Trả ra giá trị false khi cả 2 biểu thức đồng thời đều là false.

        System.out.println("==========Toán tử NOT (!)===============");
        x = 1;
        if ( !(x != 2) ) { // phủ định của true -> false:  !true
            System.out.println("1. in ra dòng này không");
        }
        System.out.println(!(x != 2));

        if ( !(x == 2) ) { // phủ định của false -> true: !false
            System.out.println("2. in ra dòng này không");
        }
        System.out.println(!(x == 2));
    }
}
