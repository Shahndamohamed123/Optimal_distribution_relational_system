package com.android.optimaldistributionrelationalsystem.shahand;

public class orderItem {
    int orderImage;
    String name;
    int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getOrderImage() {
        return orderImage;
    }

    public void setOrderImage(int orderImage) {
        this.orderImage = orderImage;
    }

    public orderItem(String name, int number, int orderImage) {
        this.name = name;
        this.number = number;
        this.orderImage = orderImage;
    }
}
