package com.samurusproductions.myapplication.model;


/**
 * Created by Julius on 10.06.2018.
 */

public class Cell {
    public Cell(int x, int y, String listCountry, Integer listFlag) {
        this.x = x;
        this.y = y;
        this.listCountry = listCountry;
        this.listFlag = listFlag;
    }

    private int x;
    private int y;
    String listCountry;
    Integer listFlag;

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



    public String getListCountry() {
        return listCountry;
    }

    public void setListCountry(String listCountry) {
        this.listCountry = listCountry;
    }

    public Integer getListFlag() {
        return listFlag;
    }

    public void setListFlag(Integer listFlag) {
        this.listFlag = listFlag;
    }





}
