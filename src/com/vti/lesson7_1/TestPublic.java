package com.vti.lesson7_1;

import com.vti.lesson7.Person;

/**
 * @created: 18/11/2023 - 8:13 PM
 * @author: dungna
 */
public class TestPublic {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.address = "Viet nam";
        System.out.println(p1.address);

        p1.drink();
        
    }
}
