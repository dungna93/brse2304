package com.vti.lesson11;

import java.util.ArrayList;
import java.util.List;

/**
 * @created: 30/11/2023 - 7:32 PM
 * @author: dungna
 */
public class CollectionMain {
    // Collection trong java
    // collection chỉ thao tác với kiểu dữ liệu đối tượng, không thao tác với các kiểu dữ liệu nguyên thủy (int, long, float, ..)
//    Object: Integer, Long, Float, Double, Byte, Short
//    primitive: int, long, float, double, byte, short
    // Khai báo arraylist:

    public static void main(String[] args) {

        ArrayList<Integer> arrayListInt = new ArrayList<>();

        // Sử dụng mảng thuần túy
        System.out.println("Sử dụng mảng thuần túy");
        int[] mangInt = new int[] {1, 2, 4, 5, 12, 123, 123, 123,13, 19};

        int[] mangInt2 = new int[11];
        for(int i = 0; i < mangInt2.length; i++) {
            if (i < mangInt.length) {
                mangInt2[i] = mangInt[i];
            } else {
                mangInt2[i] = 60;
            }
        }

        System.out.println("danh sách mảng sau khi thêm là:");
        for (int i = 0; i < mangInt2.length; i++){
            System.out.print(mangInt2[i] + ", ");
        }

        // Sử dụng array list
        List<Integer> listInt = new ArrayList<>();
        System.out.println("\n==========================================");
        System.out.println("Sử dụng arrayList");
        System.out.println(listInt);
        listInt.add(90);
        listInt.add(770);
        listInt.add(44);
        listInt.add(89);
        listInt.add(70);
        listInt.add(43);
        listInt.add(56);
        System.out.println(listInt);

        listInt.remove(3);
        System.out.println("Mảng sau khi gỡ phần tử");
        System.out.println(listInt);
        System.out.println("độ dài mảng listInt: " + listInt.size());
        for (int i = 0; i < (listInt.size()/2); i++) {
            System.out.println(listInt.get(i));
        }
        System.out.println("=========================");
        for (int i = listInt.size() - 1; i >= (listInt.size()/2); i--) {
            System.out.println(listInt.get(i));
        }

        System.out.println("sử dụng for each");
        for(Integer item : listInt) {
            System.out.println(item);
        }
    }


}
