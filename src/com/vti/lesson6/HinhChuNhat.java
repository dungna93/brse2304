package com.vti.lesson6;

/**
 * @created: 16/11/2023 - 8:53 PM
 * @author: dungna
 */
public class HinhChuNhat {
    // các biến chứa từ khóa static được gọi là biến class hay biến static
    static int chieuDai = 5;

    // Hàm static hay hàm class (chứa từ khóa static)
    public static int dienTich(int cd, int cr) {
        return cd*cr;
    }

    // Khai báo biến instance và hàm instance
    int dem = 7;

    public int getDem() {
        return dem;
    }

    public void setDem(int dem) {
        this.dem = dem;
    }

    public int chuVi(int cd, int cr) {
        return (cd + cr)*2;
    }

    public static void main(String[] args) {
        System.out.println(HinhChuNhat.chieuDai);
        System.out.println(HinhChuNhat.dienTich(4, 3));

        HinhChuNhat.chieuDai = 16;


        HinhChuNhat hcn = new HinhChuNhat();
        System.out.println(hcn.dem);
        hcn.dem = 15;
        System.out.println(hcn.dem);
        System.out.println(hcn.chuVi(5, 2));

        HinhChuNhat hcn2 = new HinhChuNhat();
        System.out.println(hcn2.dem);
        hcn2.setDem(89);
        System.out.println(hcn2.dem);
    }
}
