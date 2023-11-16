package com.vti.lesson6;

/**
 * @created: 16/11/2023 - 8:12 PM
 * @author: dungna
 */
public class Person {

    //I. Biến instance (đại diện cho thuộc tính của đối tượng)
    String name;
    int age;
    String address;

    //II. Hàm instance (hàm đối tượng) không có từ khóa static. Hành vi - phương thức (riêng) của đối tượng
    // Muốn sử dụng các hàm này phải sử dụng từ khóa new để tạo đối tượng

    // cho bên thứ 3 muốn sử dụng
    public String readPassport() {
        System.out.println("name" + name);
        return name;
    }


    // dành cho cơ quan công quyền
    public void writePassPort(String name) {
        this.name = name;
    }

    public void walk(String name) {
        System.out.println(name + " đi bộ.");
    }

    public void setName(String ten) {
        this.name = ten;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //III. contructor và contructor mặc định
    // tương tự như hàm nhưng được sử dụng để khởi tạo giá trị cho các biến instance
    public Person() {
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static void main(String[] args) {
        new Person(); // đối tượng 1
        Person p1 = new Person(); // đối tượng 2
        Person p2 = new Person(); // đối tượng 3
        // p1 và p2 là 2 đối tượng hoàn toạn độc lập nhau
        p1.walk("bạn A");
        p2.walk("bạn B");

        // p1 và p2 là 2 biến được gán đối tượng Person
        // p1 và p2 có thể gọi được các hàm instance
        // ví dụ:
        Person p3 = new Person();
        System.out.println(p3.name); // sẽ in ra giá trị null vì mới chỉ tạo đối tượng từ từ khóa new chưa set giá trị
        // cho các thuộc tính trong đối tượng này.

        p3.setName("Dũng"); // set giá trị cho thuộc tính name của đối tượng p3
        System.out.println(p3.name);
        System.out.println(p2.name);

        // gán giá trị cho biến instance bằng cách sử dụng contructor
        Person p5 = new Person(); // Constructor mặc định
        Person p6 = new Person();
        Person p9 = new Person();
        Person p16 = new Person();
        Person p15 = new Person();

        p5.setName("Trang");
        p5.setAddress("korea");
        p5.setAge(20);

        System.out.println(p5.getName() + " - " + "tuoi: " + p5.getAge() + " - " + p5.getAddress());

        Person p4 = new Person("Dung", 30, "Vietnam"); // Constructor với 3 biến instance được gán giá trị
        p4.setAddress("Japan");
        System.out.println(p4.getAddress());
        System.out.println(p4.getName() + " - " + "tuoi: " + p4.getAge() + " - " + p4.getAddress());

    }
}
