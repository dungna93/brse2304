package com.vti.lesson11;

/**
 * @created: 30/11/2023 - 8:09 PM
 * @author: dungna
 */
public class House {
    private int dienTich;
    private int soTang;
    private int soPhongNgu;

    public House(int dienTich, int soTang, int soPhongNgu) {
        this.dienTich = dienTich;
        this.soTang = soTang;
        this.soPhongNgu = soPhongNgu;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    public int getSoPhongNgu() {
        return soPhongNgu;
    }

    public void setSoPhongNgu(int soPhongNgu) {
        this.soPhongNgu = soPhongNgu;
    }
}
