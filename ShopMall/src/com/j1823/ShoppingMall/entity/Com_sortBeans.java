package com.j1823.ShoppingMall.entity;

public class Com_sortBeans {
    private String c_sort;
    private Integer s_id;

    public Com_sortBeans() {
    }

    public Com_sortBeans(String c_sort, Integer s_id) {
        this.c_sort = c_sort;
        this.s_id = s_id;
    }

    public String getC_sort() {
        return c_sort;
    }

    public void setC_sort(String c_sort) {
        this.c_sort = c_sort;
    }

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }
}
