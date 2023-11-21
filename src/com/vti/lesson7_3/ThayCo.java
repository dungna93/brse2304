package com.vti.lesson7_3;

/**
 * @created: 20/11/2023 - 8:27 PM
 * @author: dungna
 */
public class ThayCo {
    private String ten;
    private int tuoi;
    private String queQuan;

    public ThayCo() {
    }

    public ThayCo(String ten, int tuoi, String queQuan) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
}
