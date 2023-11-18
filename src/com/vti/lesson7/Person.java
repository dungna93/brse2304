package com.vti.lesson7;

/**
 * @created: 17/11/2023 - 9:46 PM
 * @author: dungna
 */
public class Person {
    String name; // Quản lý truy cập default.
    private int age; // Quản lý truy cập private. chú ý cách khai báo nhé: phải có từ khóa private.
    public String address; // Quản lý truy cập public.
    protected String race; // Quản lý truy cập protected.

    // tương tự trong hàm, chúng ta cũng sử dụng các từ khóa trên để khai báo.
    public void drink(){}

    private void talk(){}

    protected void walk(){}

    void run(){}

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 3; // truy cập trực tiếp vào biến instance private
        System.out.println(p1.age);
        p1.name = "Kiên";  // truy cập trực tiếp vào biến instance default
        System.out.println(p1.name);
    }
}
// Cũng tương tự: quản lý truy cập cũng áp dụng cho class
// chú ý đến class Person: ở trên là loại class public
// Trong mỗi class java phải có ít nhất 1 public class và tên của class public phải trùng tên file.
// Vì vậy nếu đổi public sang private sẽ báo lỗi ngay.
// Chúng ta có thể khai báo thêm class như thế này bên dưới

// đây gọi là inner class, chúng ta sẽ học sau này
class User {
    private String name;
    private int age;
}

