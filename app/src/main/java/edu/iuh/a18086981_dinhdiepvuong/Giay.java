package edu.iuh.a18086981_dinhdiepvuong;

import java.io.Serializable;

public class Giay implements Serializable {
    private int imgGiay;
    private String nameGiay;
    private String priceGiay;

    public Giay(int imgGiay, String nameGiay, String priceGiay) {
        this.imgGiay = imgGiay;
        this.nameGiay = nameGiay;
        this.priceGiay = priceGiay;
    }

    public int getImgGiay() {
        return imgGiay;
    }

    public void setImgGiay(int imgGiay) {
        this.imgGiay = imgGiay;
    }

    public String getNameGiay() {
        return nameGiay;
    }

    public void setNameGiay(String nameGiay) {
        this.nameGiay = nameGiay;
    }

    public String getPriceGiay() {
        return priceGiay;
    }

    public void setPriceGiay(String priceGiay) {
        this.priceGiay = priceGiay;
    }
}
