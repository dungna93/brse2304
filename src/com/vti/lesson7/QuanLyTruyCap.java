package com.vti.lesson7;

/**
 * @created: 18/11/2023 - 7:40 PM
 * @author: dungna
 */
public class QuanLyTruyCap {
    public static void main(String[] args) {
        Person p1 = new Person();
//        p1.age = 3;
        p1.name = "Phong"; // truy cập trực tiếp đối với phạm vi default
        System.out.println(p1.name);

        Employee2 emp2 = new Employee2();
        emp2.race = "jksfj";
    }
}
