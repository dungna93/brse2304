package com.vti.lesson7_2;

import java.util.Scanner;

/**
 * @created: 18/11/2023 - 9:06 PM
 * @author: dungna
 */
public class MangObject {
    public static void main(String[] args) {
        // Khai báo mảng đối tượng trong java
        Person[] arrPersons = new Person[3];
        System.out.println(arrPersons[0]);

        arrPersons[0] = new Person(); // gán vị trí đầu tiên cho 1 đối tượng cụ thể
        System.out.println(arrPersons[0]);
        // set giá trị cho các thuộc tính trong đối tượng
        arrPersons[0].setName("Nguyen Anh Dung");
        arrPersons[0].setAddress("Vietnam");
        arrPersons[0].setAge(30);

        arrPersons[1] = new Person();
        System.out.println(arrPersons[1]);
        arrPersons[1].setName("Nguyen Van C");
        arrPersons[1].setAddress("Cần Thơ");
        arrPersons[1].setAge(20);

        arrPersons[2] = new Person();
        System.out.println(arrPersons[2]);
        arrPersons[2].setName("Trần thị D");
        arrPersons[2].setAddress("Hà Tĩnh");
        arrPersons[2].setAge(34);

        System.out.println(arrPersons[0].getName() + ". " + arrPersons[0].getAddress() + ". " + arrPersons[0].getAge());
        System.out.println(arrPersons[1].getName() + ". " + arrPersons[1].getAddress() + ". " + arrPersons[1].getAge());
        System.out.println(arrPersons[2].getName() + ". " + arrPersons[2].getAddress() + ". " + arrPersons[2].getAge());

        /*
        sử dụng scanner để nhập giá trị cho từng đối tượng
         */
        Scanner scan0 = new Scanner(System.in);
        System.out.println("Nhập tên phần tử 0: ");
        String name0 = scan0.nextLine();
        arrPersons[0].setName(name0);
        System.out.println("Nhập địa chỉ phần tử 0: ");
        String address0 = scan0.nextLine();
        arrPersons[0].setAddress(address0);
        System.out.println("Nhập tuổi phần tử 0: ");
        int age0 = scan0.nextInt();
        arrPersons[0].setAge(age0);

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Nhập tên phần tử 1: ");
        String name1 = scan1.nextLine();
        arrPersons[1].setName(name1);
        System.out.println("Nhập địa chỉ phần tử 1: ");
        String address1 = scan1.nextLine();
        arrPersons[1].setAddress(address1);
        System.out.println("Nhập tuổi phần tử 1: ");
        int age1 = scan1.nextInt();
        arrPersons[1].setAge(age1);

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Nhập tên phần tử 2: ");
        String name2 = scan2.nextLine();
        arrPersons[2].setName(name2);
        System.out.println("Nhập địa chỉ phần tử 2: ");
        String address2 = scan2.nextLine();
        arrPersons[2].setAddress(address2);
        System.out.println("Nhập tuổi phần tử 2: ");
        int age2 = scan2.nextInt();
        arrPersons[2].setAge(age2);


//        System.out.println(arrPersons[0].getName() + ". " + arrPersons[0].getAddress() + ". " + arrPersons[0].getAge());
//        System.out.println(arrPersons[1].getName() + ". " + arrPersons[1].getAddress() + ". " + arrPersons[1].getAge());
//        System.out.println(arrPersons[2].getName() + ". " + arrPersons[2].getAddress() + ". " + arrPersons[2].getAge());

        // Sử dụng vòng for hoặc foreach để in ra thông tin Person
        for (int i = 0; i < arrPersons.length; i++) {
            System.out.println(arrPersons[i].getName() + ". " + arrPersons[i].getAddress() + ". " + arrPersons[i].getAge());
        }
        // foreach
        for (Person item : arrPersons) {
            System.out.println(item.getName() + ". " + item.getAddress() + ". " + item.getAge());
        }


        // Sử dụng vòng for và scanner để nhập và in ra thông tin
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arrPersons.length; i++) {
            scan = new Scanner(System.in);
            System.out.println("Nhập tên phần tử " + i + ": ");
            arrPersons[i].setName(scan.nextLine());
            System.out.println("Nhập địa chỉ phần tử " + i + ": ");
            arrPersons[i].setAddress(scan.nextLine());
            System.out.println("Nhập tuổi phần tử " + i + ": ");
            arrPersons[i].setAge(scan.nextInt());

           // System.out.println(arrPersons[i].getName() + ". " + arrPersons[i].getAddress() + ". " + arrPersons[i].getAge());
        }
        for (Person item : arrPersons) {
            System.out.println(item.getName() + ". " + item.getAddress() + ". " + item.getAge());
        }

        scan.close();
        scan0.close();
        scan1.close();
        scan2.close();
    }
}
