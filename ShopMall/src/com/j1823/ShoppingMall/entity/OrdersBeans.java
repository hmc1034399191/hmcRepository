package com.j1823.ShoppingMall.entity;

public class OrdersBeans {
    //订单表
    private String o_number;      //订单编号
    private String o_Shippingadd; //收货地址
    private String o_uname;       //收货人姓名
    private Float o_money;        //商品金额
    private String o_mailing;     //邮寄方式
    private String o_shopcount;   //商品数量
    private Integer u_id;         //用户ID
    private String c_number;      //商品编号

    public OrdersBeans() {
    }

    public OrdersBeans(String o_number, String o_Shippingadd, String o_uname, Float o_money, String o_mailing, String o_shopcount, Integer u_id, String c_number) {
        this.o_number = o_number;
        this.o_Shippingadd = o_Shippingadd;
        this.o_uname = o_uname;
        this.o_money = o_money;
        this.o_mailing = o_mailing;
        this.o_shopcount = o_shopcount;
        this.u_id = u_id;
        this.c_number = c_number;
    }

    public String getO_number() {
        return o_number;
    }

    public void setO_number(String o_number) {
        this.o_number = o_number;
    }

    public String getO_Shippingadd() {
        return o_Shippingadd;
    }

    public void setO_Shippingadd(String o_Shippingadd) {
        this.o_Shippingadd = o_Shippingadd;
    }

    public String getO_uname() {
        return o_uname;
    }

    public void setO_uname(String o_uname) {
        this.o_uname = o_uname;
    }

    public Float getO_money() {
        return o_money;
    }

    public void setO_money(Float o_money) {
        this.o_money = o_money;
    }

    public String getO_mailing() {
        return o_mailing;
    }

    public void setO_mailing(String o_mailing) {
        this.o_mailing = o_mailing;
    }

    public String getO_shopcount() {
        return o_shopcount;
    }

    public void setO_shopcount(String o_shopcount) {
        this.o_shopcount = o_shopcount;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getC_number() {
        return c_number;
    }

    public void setC_number(String c_number) {
        this.c_number = c_number;
    }
}
