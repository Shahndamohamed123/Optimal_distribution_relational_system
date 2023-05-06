package com.android.optimaldistributionrelationalsystem.shahand;

public class orderItem {
    int orderImage;
    String name;
    String number;

    public orderItem(int orderImage, String name, String number) {
        this.orderImage = orderImage;
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }


    public void setNumber(String number) {
        this.number = number;
    }

    public int getOrderImage() {
        return orderImage;
    }

    public void setOrderImage(int orderImage) {
        this.orderImage = orderImage;
    }

}
