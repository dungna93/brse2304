package com.vti.lesson9;

/**
 * @created: 23/11/2023 - 7:46 PM
 * @author: dungna
 */
public class TestOverride {
    public static void main(String[] args) {
        // Kiểm tra tính kế thừa
        Employee emp = new Employee();
        emp.setName("Phong");
        emp.setAge(21);

        System.out.println(emp.getName() + " " + emp.getAge());

        Student student = new Student();
        student.setName("Trí");
        student.setAge(18);

        Person p1 = new Person();
        p1.setName("Hùng");
        p1.setAge(40);

        System.out.println(student.getName() + " " + student.getAge());
        /*
        Khái niệm:
        Kế thừa là khả năng thừa hưởng lại những biến và hàm của 1 class khác.
        class kế thừa gọi là subclass (class con) và class được kế thừa gọi là superclass (class cha)
        superclass có thể có nhiều subclass nhưng subclass chỉ có duy nhất 1 superclass.
         */

        //
        int luongP1 = p1.salary(400000);
        System.out.println("Lương của đối tượng p1: " + luongP1);
        int luongEmp = emp.salary(400000);
        System.out.println("Lương của đối tượng emp: " + luongEmp);
        int luongStudent = student.salary(400000);
        System.out.println("Lương của đối tượng student: " + luongStudent);

        // Test contructor không sử dụng từ khóa super()
        Employee emp2 = new Employee("samsung");
        System.out.println(emp2.getCongTy() + " " + emp2.getName() + " " + emp2.getAge());

    }
}
