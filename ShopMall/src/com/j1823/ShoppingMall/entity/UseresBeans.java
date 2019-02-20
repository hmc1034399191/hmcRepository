package com.j1823.ShoppingMall.entity;

public class UseresBeans {
    private Integer id;   //用户ID
    private String u_name;//用户名
    private String u_usernum;//用户账号
    private String u_pwd; //用户密码
    private String u_sex; //性别
    private String u_phone;//电话
    private String u_adds; //地址
    private String u_emall;//邮箱
    private String u_imag;   //头像

    public UseresBeans() {
    }
    public void setUb(String key,String value){
        if(key.equals("u_name")){
            this.u_name=value;
        }
        if(key.equals("u_usernum")){
            this.u_usernum=value;
        }
        if(key.equals("u_pwd")){
            this.u_pwd=value;
        }
        if(key.equals("u_sex")){
            this.u_sex=value;
        }
        if(key.equals("u_phone")){
            this.u_phone=value;
        }
        if(key.equals("u_adds")){
            this.u_adds=value;
        }
        if(key.equals("u_emall")){
            this.u_emall=value;
        }
        if(key.equals("u_imag")){
            this.u_imag=value;
        }
    }

    public UseresBeans(Integer id, String u_name, String u_usernum, String u_pwd, String u_sex, String u_phone, String u_adds, String u_emall, String u_imag) {
        this.id = id;
        this.u_name = u_name;
        this.u_usernum = u_usernum;
        this.u_pwd = u_pwd;
        this.u_sex = u_sex;
        this.u_phone = u_phone;
        this.u_adds = u_adds;
        this.u_emall = u_emall;
        this.u_imag = u_imag;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_usernum() {
        return u_usernum;
    }

    public void setU_usernum(String u_usernum) {
        this.u_usernum = u_usernum;
    }

    public String getU_pwd() {
        return u_pwd;
    }

    public void setU_pwd(String u_pwd) {
        this.u_pwd = u_pwd;
    }

    public String getU_sex() {
        return u_sex;
    }

    public void setU_sex(String u_sex) {
        this.u_sex = u_sex;
    }

    public String getU_phone() {
        return u_phone;
    }

    public void setU_phone(String u_phone) {
        this.u_phone = u_phone;
    }

    public String getU_adds() {
        return u_adds;
    }

    public void setU_adds(String u_adds) {
        this.u_adds = u_adds;
    }

    public String getU_emall() {
        return u_emall;
    }

    public void setU_emall(String u_emall) {
        this.u_emall = u_emall;
    }

    public String getU_imag() {
        return u_imag;
    }

    public void setU_imag(String u_imag) {
        this.u_imag = u_imag;
    }
}
