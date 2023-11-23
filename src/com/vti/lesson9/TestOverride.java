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

        Employee emp3 = new Employee("Dũng", 31, "Bank");
        System.out.println(emp3.getCongTy() + " " + emp3.getName() + " " + emp3.getAge());

        // Quan hệ is-a và has-a
        Person p2 = new Person();
        p2.setName("Nguyễn Anh Dũng");
        p2.setAge(31);

        DiaChi diaChiP2 = new DiaChi();
        diaChiP2.setNumber(21);
        diaChiP2.setStreetName("Hùng Vương Street");
        diaChiP2.setDistrict("Quận Ba Đình");
        diaChiP2.setWard("Giảng Võ");

        DiaChi diaChiP21 = new DiaChi();
        diaChiP21.setNumber(31);
        diaChiP21.setStreetName("Nguyễn Chí Thanh Street");
        diaChiP21.setDistrict("Quận Đống Đa");
        diaChiP21.setWard("Láng Thượng");


        System.out.println("set giá trị cho thuộc tính địa chỉ của p2 là diaChiP2");
        p2.setDiaChi(diaChiP2);
        System.out.println(diaChiP2.getNumber() + " - " + diaChiP2.getStreetName() + " - " + diaChiP2.getWard() + " - " + diaChiP2.getDistrict());
        System.out.println(p2.getName() + " - " + p2.getAge() + " - " + p2.getDiaChi().getNumber() + p2.getDiaChi().getStreetName());

        System.out.println("========================================================");
        System.out.println("set giá trị cho thuộc tính địa chỉ của p2 là diaChiP21");
        p2.setDiaChi(diaChiP21);
        System.out.println(diaChiP2.getNumber() + " - " + diaChiP2.getStreetName() + " - " + diaChiP2.getWard() + " - " + diaChiP2.getDistrict());
        System.out.println(p2.getName() + " - " + p2.getAge() + " - " + p2.getDiaChi().getNumber() + p2.getDiaChi().getStreetName());


    }
}
