package com.example.capstoneproject.model;

public class Model {
    private String name;
    private int rate;
    private String img;

    public Model(String name, int rate, String img) {
        this.name = name;
        this.rate = rate;
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
