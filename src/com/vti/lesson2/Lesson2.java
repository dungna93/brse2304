package com.vti.lesson2;

/**
 * @created: 07/11/2023 - 7:24 PM
 * @author: dungna
 */
public class Lesson2 {

    public static void main(String[] args) {

        System.out.println("Hàm tongHaiSo không có đối số truyền vào: " + tongHaiSo());

        // Khai báo khai biến x và y
        int x = 30;
        int y = 16;

        // Mọi người chú ý, biến x và y trong hàm main khác biến x và y trong hàm hieuHaiSo là hoàn toàn khác nhau
        // vì biến chỉ tồn tại trong mỗi hàm và mỗi hàm thì lại độc lập với nhau. Vì vậy chúng ta có thể khai báo
        // tên biến trùng nhau trong 2 hàm khác nhau.
        // Để mọi người dễ hiểu hơn: ví dụ ai cũng có ngôi nhà (coi nó là tên biến đúng không), nhưng ngôi nhà
        // của chị Huyền thì khác so với ngôi nhà của anh Hoàng Anh.

        // khai báo biến hieu
        int hieu = hieuHaiSo(x, y); // khi gọi đến hàm hieuHaiSo thì ta truyền giá trị của x và y được khai báo ở phía
                                    // trên là 30 và 16
        System.out.println(hieu); // sẽ trả ra giá trị 14 vì 30-16 = 14

        // Tương tự giờ sẽ in ra giá trị của hàm tongHaiSo
        System.out.println(tongHaiSo()); // sẽ in ra giá trị 21. vì biến x và y được khai báo trong ham tongHaiSo
                                        // và được gán giá trị 10 và 11 đồng thời cũng return giá trị tong là 10 + 11


        // Gọi đến hàm xinChao()
        xinChao(); // sẽ in ra dòng chữ: Xin chào: Nguyễn Anh Dũng. Vì trong hàm này chúng ta có câu lệnh
                    // System.out.println(........)
    }

    // I. Hàm không có đối số truyền vào nhưng có giá trị trả về
    /* Tạo hàm tongHaiSo - Tên hàm từ đầu tiên viết thường, bắt đầu từ ghép thứ 2 trở đi, viết hoa
        chữ cái đầu tiên.
    */
    // Hàm tongHaiSo này thì không có đối số truyền vào nên ở trong dấu () sẽ không có gì cả
    public static int tongHaiSo() {
        // khai báo 2 biến
        int x = 10;
        int y = 11;

        // khai báo biến t là tổng của x + y
        int tong = x + y;

        // sử dụng từ khóa return ở đây tức là trả về giá trị của hàm tongHaiSo.
        // Như chúng ta thấy, kiểu dữ liệu của hàm là kiểu int. Vì vậy return cũng phải trả về giá trị kiểu int
        return tong;
    }

    // II.
    // Hàm hieuHaiSo nhận 2 đối số truyền vào là x và y. Giá trị return của hàm là x - y
    public static int hieuHaiSo(int x, int y) {
        int hieu = x - y;
        return hieu;
    }

    // III.
    // Hàm không có giá trị trả về. sử dụng từ khóa void
    public static void xinChao() {
        System.out.println("Xin chào: Nguyễn Anh Dũng.");
        // không sử dụng từ khóa return để trả về giá trị nữa
    }


}
