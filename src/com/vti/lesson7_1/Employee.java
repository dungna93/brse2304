package com.vti.lesson7_1;

import com.vti.lesson7.Person;

/**
 * @created: 18/11/2023 - 7:54 PM
 * @author: dungna
 */
public class Employee extends Person {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.race = "Kinh"; // truy xuất trực tiếp protected của Persion
        System.out.println(emp1.race);

        emp1.address = "jhskjdhfjk";
    }
}
