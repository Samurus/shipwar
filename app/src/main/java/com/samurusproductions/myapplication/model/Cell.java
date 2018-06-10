package com.samurusproductions.myapplication.model;


/**
 * Created by Julius on 10.06.2018.
 */

public class Cell {

    String name;
    Integer imageId;
    private int x;
    private int y;

    public Cell(int x, int y, String name, Integer listFlag) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.imageId = listFlag;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

}
