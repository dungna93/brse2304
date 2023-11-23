package com.vti.lesson9;

/**
 * @created: 23/11/2023 - 7:47 PM
 * @author: dungna
 */
public class Person {
    private String name;
    private int age;
    private DiaChi diaChi; // Has-a: Mỗi 1 person có 1 địa chỉ

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // hàm tính lương
    public int salary(int money) {
        return money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DiaChi getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(DiaChi diaChi) {
        this.diaChi = diaChi;
    }
}
