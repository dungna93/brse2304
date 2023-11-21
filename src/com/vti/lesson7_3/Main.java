package com.vti.lesson7_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @created: 20/11/2023 - 8:20 PM
 * @author: dungna
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        // Hệ thống quản lý sinh viên
        // Quản lý được thông tin sinh viên
        // Sinh viên: bao gồm các thông tin sau: tên, tuổi, quê quán, hệ sinh viên.
        // Thầy cô: bao gồm các thông tin sau: tên, tuổi, quê quán.
        // Lớp học: tên lớp, môn học, thời gian học, số lượng sinh viên.
        SinhVien sv1 = new SinhVien("Nguyễn Văn A", 19, "HCM", "Đại học");
        SinhVien sv2 = new SinhVien("Nguyễn Văn B", 19, "HCM", "Đại học");
        SinhVien sv3 = new SinhVien("Nguyễn Văn C", 19, "HCM", "Cao đẳng");
        SinhVien sv4 = new SinhVien("Nguyễn Văn D", 19, "HCM", "DH - Từ xa");
        SinhVien sv5 = new SinhVien("Nguyễn Văn E", 19, "HCM", "Trung cấp nghề");
        System.out.println(sv1.getTen());

        ThayCo gv1 = new ThayCo("Nguyễn Văn T", 45, "Cần Thơ");
        ThayCo gv2 = new ThayCo("Nguyễn Văn P", 50, "Hậu Giang");
        ThayCo gv3 = new ThayCo("Nguyễn Văn H", 55, "Sóc Trăng");

        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date dayStart = formatDate.parse("2023-02-28");
//        System.out.println(dayStart);

        Date sysDate = new Date();
//        LocalDate.now();

        System.out.println("chua format: " + sysDate);
        String deParseDate = formatDate.format(sysDate);
        System.out.println("Da format: " + deParseDate);

//        LopHoc class1 = new LopHoc("Lập trình", "Java Basic",
//                12, dayStart, 12);
//        System.out.println(class1.getThoiGianBatDau());

        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
