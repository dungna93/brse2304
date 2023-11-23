package com.vti.lesson9;

/**
 * @created: 23/11/2023 - 9:07 PM
 * @author: dungna
 */
public class DiaChi {
    private String ward; // Phường
    private String district; // Quận
    private int number; // Số nhà
    private String streetName; // tên đường

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
