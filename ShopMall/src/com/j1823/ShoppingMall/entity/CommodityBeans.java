package com.j1823.ShoppingMall.entity;

public class CommodityBeans {
    //商品表
    private Integer c_id;   //商品ID
    private String c_sort;  //商品类别
    private String c_name;  //商品名字
    private Float c_proce;  //商品单价
    private String c_count; //商品数量
    private String c_imag;  //商品图片
    private String c_place; //商品产地

    public CommodityBeans() {
    }

    public CommodityBeans(Integer c_id, String c_sort, String c_name, Float c_proce, String c_count, String c_imag, String c_place) {
        this.c_id = c_id;
        this.c_sort = c_sort;
        this.c_name = c_name;
        this.c_proce = c_proce;
        this.c_count = c_count;
        this.c_imag = c_imag;
        this.c_place = c_place;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public String getC_sort() {
        return c_sort;
    }

    public void setC_sort(String c_sort) {
        this.c_sort = c_sort;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public Float getC_proce() {
        return c_proce;
    }

    public void setC_proce(Float c_proce) {
        this.c_proce = c_proce;
    }

    public String getC_count() {
        return c_count;
    }

    public void setC_count(String c_count) {
        this.c_count = c_count;
    }

    public String getC_imag() {
        return c_imag;
    }

    public void setC_imag(String c_imag) {
        this.c_imag = c_imag;
    }

    public String getC_place() {
        return c_place;
    }

    public void setC_place(String c_place) {
        this.c_place = c_place;
    }
}
