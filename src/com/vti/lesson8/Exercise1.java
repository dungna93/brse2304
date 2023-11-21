package com.vti.lesson8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @created: 21/11/2023 - 9:02 PM
 * @author: dungna
 */
public class Exercise1 {
    public static void main(String[] args) throws IOException {
        // TO DO:
        // Dùng vòng lặp for tạo 10 file khác nhau và viết nội dung vào 10 file đó,
        // in ra nội dung của từng file
        Scanner scan = new Scanner(System.in);

        for (int i = 10; i <= 20; i++) {
            String pathFile = "D:\\03_Project_workspace\\Private_Project\\VTI_Academy\\File\\test_file_" + i + ".txt";
            File file = new File(pathFile);
            if (file.exists()) {
                System.out.println("Đã tồn tại file: test_file_" + i);
            } else {
                if (file.createNewFile()) {
                    System.out.println("=========================================");
                    System.out.println("Tạo file: test_file_" + i + " thành công.");
                    // ghi nội dung vào file
                    scan = new Scanner(System.in);
                    System.out.println("Nhập nội dung file test_file_" + i + ": ");
                    String content = scan.nextLine();
                    FileOutputStream fileOutputStream = new FileOutputStream(pathFile, false);
                    fileOutputStream.write(content.getBytes());
                    fileOutputStream.close();

                    // đọc nội dung vừa ghi được
                    FileInputStream fileInputStream = new FileInputStream(pathFile);
                    byte[] arrByte = new byte[1024];
                    int length = fileInputStream.read(arrByte);
                    while (length > -1) {
                        String contentRead = new String(arrByte, 0, length);
                        System.out.println(contentRead);
                        length = fileInputStream.read(arrByte);
                    }
                    fileInputStream.close();
                } else {
                    System.out.println("Tạo file: test_file_" + i + " thất bại.");
                }
            }
        }

        System.out.println("Kết thúc chương trình.");
        scan.close();
    }
}
