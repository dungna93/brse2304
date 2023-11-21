package com.vti.lesson7_3;

import java.util.Date;

/**
 * @created: 20/11/2023 - 8:27 PM
 * @author: dungna
 */
public class LopHoc {
    private String tenLopHoc;
    private String monHoc;
    private int thoiGianHoc;
    private Date thoiGianBatDau;
    private int soLuongSV;

    public LopHoc() {
    }

    public LopHoc(String tenLopHoc, String monHoc, int thoiGianHoc, Date thoiGianBatDau, int soLuongSV) {
        this.tenLopHoc = tenLopHoc;
        this.monHoc = monHoc;
        this.thoiGianHoc = thoiGianHoc;
        this.thoiGianBatDau = thoiGianBatDau;
        this.soLuongSV = soLuongSV;
    }

    public String getTenLopHoc() {
        return tenLopHoc;
    }

    public void setTenLopHoc(String tenLopHoc) {
        this.tenLopHoc = tenLopHoc;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public int getThoiGianHoc() {
        return thoiGianHoc;
    }

    public void setThoiGianHoc(int thoiGianHoc) {
        this.thoiGianHoc = thoiGianHoc;
    }

    public Date getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(Date thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public int getSoLuongSV() {
        return soLuongSV;
    }

    public void setSoLuongSV(int soLuongSV) {
        this.soLuongSV = soLuongSV;
    }
}
