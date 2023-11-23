package com.vti.lesson9;

/**
 * @created: 23/11/2023 - 7:48 PM
 * @author: dungna
 */
public class Employee extends Person {

    private String congTy;

    public String getCongTy() {
        return congTy;
    }

    public void setCongTy(String congTy) {
        this.congTy = congTy;
    }
    // sử dụng từ khóa extends để cho biết class con được kế thừa từ class cha nào
    // như ở trên đây class Employee là con của class Person.

    // Override method
    /*
    Khái niệm:
    Override method được sử dụng khi class con muốn ghi đè 1 hàm của class cha.
    Sử dụng annotation: @Override để chú thích cho hàm người dùng biết đâu là hàm override từ hàm khác.
    - Tên method: Phải giống nhau.
    - Tham số truyền vào: Phải giống nhau.
    - Kiểu dữ liệu trả về: Phải giống nhau.
    - Có thể sử dụng từ khóa super.
     */

    public Employee() {
    }
    public Employee(String congTy) {
        super();
        this.congTy = congTy;
    }

    public Employee(String name, int age, String congTy) {
        super(name, age);
        this.congTy = congTy;
    }

    //    @Override
//    public int salary(int money) {
//        return money*12;
//    }

    @Override
    public int salary(int money) {
        return super.salary(money);
    }
}
