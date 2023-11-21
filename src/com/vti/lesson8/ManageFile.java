package com.vti.lesson8;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @created: 21/11/2023 - 7:28 PM
 * @author: dungna
 */
public class ManageFile {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\03_Project_workspace\\Private_Project\\VTI_Academy\\File\\dungna31.txt");
        if (file.exists()) {
            System.out.println("File tồn tại");
        } else {
            System.out.println("Không tồn tại file");
        }
        // Đọc nội dung trong file. In ra thông tin trong file

        FileInputStream fileInputStream = new FileInputStream("D:\\03_Project_workspace\\Private_Project\\VTI_Academy\\File\\dungna31.txt");
        // Cách 1:
        byte[] arrByte = new byte[1024];
        int length = fileInputStream.read(arrByte);
        System.out.println("length: " + length);
        while (length > -1) {
            String content = new String(arrByte, 0, length);
            System.out.println(content);
            length = fileInputStream.read(arrByte);
            System.out.println("length_1: " + length);
        }
        fileInputStream.close();

        // Cách 2: nhược điểm, không thể đọc ký tự enter
//        Scanner myReader = new Scanner(file);
//        while (myReader.hasNextLine()) {
//            String data = myReader.nextLine();
//            System.out.println(data);
//        }
//        myReader.close();
        // end.


        // Viết 1 nội dung vào file đã tồn tại
        String content234 = "Youtube.com";
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\03_Project_workspace\\Private_Project\\VTI_Academy\\File\\dungna31.txt", false);
        fileOutputStream.write(content234.getBytes());
        fileOutputStream.close();


        File file_1 = new File("D:\\03_Project_workspace\\Private_Project\\VTI_Academy\\File\\classBrse.docx");
        if (file_1.exists()) {
            System.out.println("File Test.txt tồn tại");
        } else {
            System.out.println("Không tồn tại file Test.txt");
            System.out.println("Bắt đầu tạo file Test.txt");
            if (file_1.createNewFile()) {
                System.out.println("Tạo file Test.txt thành công");
            } else {
                System.out.println("Tạo file Test.txt thất bại");
            }
        }

        // TO DO:
        // Dùng vòng lặp for tạo 10 file khác nhau và viết nội dung vào 10 file đó, in ra nội dung của từng file
    }
}
