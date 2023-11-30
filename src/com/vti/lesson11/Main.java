package com.vti.lesson11;

import java.util.ArrayList;

/**
 * @created: 30/11/2023 - 8:09 PM
 * @author: dungna
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<House> listHouse = new ArrayList<>();
        House house_1 =  new House(200, 2, 3);
        House house_2 = new House(300, 3, 4);
        House house_3 = new House(250, 1, 5);
        House house_4 = new House(550, 1, 5);
        House house_5 = new House(250, 1, 5);
        House house_6 = new House(750, 1, 5);
        House house_7 = new House(501, 1, 5);
        House house_8 = new House(499, 1, 5);

        listHouse.add(house_1);
        listHouse.add(house_2);
        listHouse.add(house_3);
        listHouse.add(house_4);
        listHouse.add(house_5);
        listHouse.add(house_6);
        listHouse.add(house_7);
        listHouse.add(house_8);


        for (House item : listHouse) {
            System.out.println("Dien Tich: " + item.getDienTich() + ", số tầng: " + item.getSoTang() + ", số phòng ngủ: " + item.getSoPhongNgu());
        }

//        listHouse.remove(house_2);
//        System.out.println("Mảng sau khi gỡ đối tượng đầu tiên");
//        for (House item : listHouse) {
//            System.out.println("Dien Tich: " + item.getDienTich() + ", số tầng: " + item.getSoTang() + ", số phòng ngủ: " + item.getSoPhongNgu());
//        }

        // Bài tập tạo thêm các đối tượng house và add vào listHouse.
        // in các đối tượng để xem thông tin.
        // Kiểm tra danh sách nếu ngôi nhà nào có diện tích lớn hơn 500 thì loại khỏi danh sách.
        // in ra danh sách khi được loại bỏ.

        System.out.println("Loại bỏ các ngôi nhà có diện tích lớn hơn 500");
        ArrayList<House> newListHouse =  new ArrayList<>();
        for (House item : listHouse) {
            if (item.getDienTich() < 500) {
                newListHouse.add(item);
            }
        }

        for (House item : newListHouse) {
            System.out.println("Dien Tich: " + item.getDienTich() + ", số tầng: " + item.getSoTang() + ", số phòng ngủ: " + item.getSoPhongNgu());
        }

        for (int i = 0; i < listHouse.size(); i++) {
            System.out.println(listHouse.get(i)); // listHouse.get(i) sẽ trả về đối tượng House từng vị trí trong danh sách.
        }

    }
}
