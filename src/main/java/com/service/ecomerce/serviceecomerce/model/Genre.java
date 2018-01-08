package com.service.ecomerce.serviceecomerce.model;

public class Genre {
    String name;
    int num;

    public Genre(String name, int num) {
        this.name = name;
        this.num = num;
    }
    public Genre(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
