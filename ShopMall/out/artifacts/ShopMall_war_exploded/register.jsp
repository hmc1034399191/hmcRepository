<!DOCTYPE html>
<html lang="en">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="res/static/css/main.css">
    <link rel="stylesheet" type="text/css" href="res/layui/css/layui.css">
    <script type="text/javascript" src="res/layui/layui.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
</head>
<body>

<div class="site-nav-bg">
    <div class="site-nav w1200">
        <p class="sn-back-home">
            <i class="layui-icon layui-icon-home"></i>
            <a href="#">首页</a>
        </p>
        <div class="sn-quick-menu">
            <div class="login"><a href="login.jsp">登录</a></div>
            <div class="sp-cart"><a href="shopcart.html">购物车</a><span>2</span></div>
        </div>
    </div>
</div>



<div class="header">
    <div class="headerLayout w1200">
        <div class="headerCon">
            <h1 class="mallLogo">
                <a href="#" title="母婴商城">
                    <img src="res/static/img/logo.png">
                </a>
            </h1>
            <div class="mallSearch">
                <form action="" class="layui-form" novalidate>
                    <input type="text" name="title" required  lay-verify="required" autocomplete="off" class="layui-input" placeholder="请输入需要的商品">
                    <button class="layui-btn" lay-submit lay-filter="formDemo">
                        <i class="layui-icon layui-icon-search"></i>
                    </button>
                    <input type="hidden" name="" value="">
                </form>
            </div>
        </div>
    </div>
</div>


<div class="content content-nav-base  login-content">
    <div class="main-nav">
        <div class="inner-cont0">
            <div class="inner-cont1 w1200">
                <div class="inner-cont2">
                    <a href="commodity.html" class="active">所有商品</a>
                    <a href="buytoday.html">今日团购</a>
                    <a href="information.html">母婴资讯</a>
                    <a href="about.html">关于我们</a>
                </div>
            </div>
        </div>
    </div>
    <div class="login-bg">
        <div class="login-cont w1200">
            <div class="form-box">
                <form class="layui-form" action="UploadHandleServlet" enctype="multipart/form-data" method="post">
                    <legend>
                        <img src="/upload/1.png"id="img1">
                        <input type="file" name="file2" id="file1">
                    </legend>
                    <div class="layui-form-item">
                        <div class="layui-inline iphone">
                            <div class="layui-input-inline">
                                <i class="layui-icon layui-icon-username iphone-icon"></i>
                                <input type="tel" name="u_name"  placeholder="请输入用户名" lay-verify="username" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-inline iphone">
                            <div class="layui-input-inline">
                                <i class="layui-icon layui-icon-username iphone-icon"></i>
                                <input type="tel" name="u_usernum" lay-verify="usernum" placeholder="请输入账号" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-inline iphone">
                            <div class="layui-input-inline">
                                <i class="layui-icon layui-icon-password iphone-icon"></i>
                                <input type="password" name="u_pwd" id="pwd" lay-verify="pass"  placeholder="请输入密码" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-inline iphone">
                            <div class="layui-input-inline">
                                <i class="layui-icon layui-icon-password iphone-icon"></i>
                                <input type="password" name="u_pwd"lay-verify="expass"  placeholder="确认密码" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-inline iphone">
                            <div class="layui-input-inline">
                                <i class="layui-icon layui-icon-male iphone-icon"></i>
                                <input type="text" name="u_sex" lay-verify="issex"  placeholder="请输入性别" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-inline iphone">
                            <div class="layui-input-inline">
                                <i class="layui-icon layui-icon-cellphone iphone-icon"></i>
                                <input type="text" name="u_phone" lay-verify="required|phone"placeholder="请输入电话" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-inline iphone">
                            <div class="layui-input-inline">
                                <i class="layui-icon layui-icon-star iphone-icon"></i>
                                <input type="text" name="u_adds"placeholder="请输入地址" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-inline iphone">
                            <div class="layui-input-inline">
                                <i class="layui-icon layui-icon-file iphone-icon"></i>
                                <input type="text" name="u_emall"  placeholder="请输入邮箱" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-inline veri-code">
                            <div class="layui-input-inline">
                                <%--<i class="layui-icon layui-icon-vercode iphone-icon"></i>--%>
                                <input id="pnum" type="text" name="pnum"  lay-verify="isvercode" placeholder="请输入验证码" autocomplete="off" class="layui-input"onblur="mya()">
                                <div ><img src="ImagServlet"class="layui-btn" id="find"></div>
                            </div>
                        </div>
                    </div>
                    <div class="layui-form-item login-btn">
                        <div class="layui-input-block">
                            <button class="layui-btn" lay-submit>确定</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<div class="footer">
    <div class="ng-promise-box">
        <div class="ng-promise w1200">
            <p class="text">
                <a class="icon1" href="javascript:;">7天无理由退换货</a>
                <a class="icon2" href="javascript:;">满99元全场免邮</a>
                <a class="icon3" style="margin-right: 0" href="javascript:;">100%品质保证</a>
            </p>
        </div>
    </div>
    <div class="mod_help w1200">
        <p>
            <a href="javascript:;">关于我们</a>
            <span>|</span>
            <a href="javascript:;">帮助中心</a>
            <span>|</span>
            <a href="javascript:;">售后服务</a>
            <span>|</span>
            <a href="javascript:;">母婴资讯</a>
            <span>|</span>
            <a href="javascript:;">关于货源</a>
        </p>
        <p class="coty">母婴商城版权所有 &copy; 2012-2020</p>
    </div>
</div>
<script type="text/javascript">
    var smark=false;
    var xmlhttp;

    function mya(){
        //开源 ajax
        //1.获得XMLHttpRequest对象

        try{
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");  //创建ie浏览器核 心的XMLHttpRequest对象
        }catch(e){
            xmlhttp = new XMLHttpRequest();  //非IE浏览器XMLHttpRequest对象
        }

        //获得uname组件的值
        var imags = document.getElementById("pnum").value;


        //2.open()
        xmlhttp.open("post", "IsimagServlet", true);

        //3.设置请求头setRequestHeader

        xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");

        //4.设置回调函数
        xmlhttp.onreadystatechange=myb;
        //5.发送send()
        xmlhttp.send(null);
    }


    //回调函数
    function myb(){

        if(xmlhttp.readyState==4){
            if(xmlhttp.status==200){
                //编写区域
                smark = xmlhttp.responseText; //获得从servlet输出的结果
                 // alert(smark)
                //alert(n);

            }
        }
    }
    layui.config({
        base: '../res/static/js/util' //你存放新模块的目录，注意，不是layui的模块目录
    }).use(['jquery', 'form'], function () {
        var $ = layui.$, form = layui.form;
        $(document).ready(function () {
            $("#img1").click(function () {
                $("#file1").click();
                $("#file1").change(function(){
                    var objUrl = getObjectURL(this.files[0]) ;
                    console.log("objUrl = "+objUrl) ;
                    if (objUrl) {
                        $("#img1").attr("src", objUrl) ;
                    }
                }) ;
                //建立一個可存取到該file的url
                function getObjectURL(file) {
                    var url = null;
                    if (window.createObjectURL != undefined) { // basic
                        url = window.createObjectURL(file);
                    } else if (window.URL != undefined) { // mozilla(firefox)
                        url = window.URL.createObjectURL(file);
                    } else if (window.webkitURL != undefined) { // webkit or chrome
                        url = window.webkitURL.createObjectURL(file);
                    }
                    return url;
                }
            });
        });

        form.verify({
            username: function(value){ //value：表单的值、item：表单的DOM对象
                if(!new RegExp("^[a-zA-Z0-9_\u4e00-\u9fa5\\s·]+$").test(value)){
                    return '用户名不能有特殊字符';
                }
                if(/(^\_)|(\__)|(\_+$)/.test(value)){
                    return '用户名首尾不能出现下划线\'_\'';
                }
                if(/^\d+\d+\d$/.test(value)){
                    return '用户名不能全为数字';
                }
            }
            ,usernum:function(value){
                if(value.length<3){
                    return '账号不能小于三位';
                }
                if(value.length>8){
                    return '账号不能大于八位';
                }
                if(!new RegExp("^[a-zA-Z0-9_\u4e00-\u9fa5\\s·]+$").test(value)){
                    return '用户名不能有特殊字符';
                }
            }
            ,expass:function(value){
                var pwd=document.getElementById("pwd").value;
                if(pwd!=value){
                    return '两次输入不一致';
                }
            }
            ,issex:function (value) {

                if(!new RegExp("^[男]$").test(value)&&!new RegExp("^[女]$").test(value)){
                    return '请输入正确的性别';
                }
            }
            ,isvercode:function (value) {
                if(smark!=value){
                    return '验证码输入错误';
                }
            }

            //我们既支持上述函数式的方式，也支持下述数组的形式
            //数组的两个值分别代表：[正则匹配、匹配不符时的提示文字]
            ,pass: [
                /^[\S]{6,12}$/
                ,'密码必须6到12位，且不能出现空格'
            ]
        });
    })


</script>

</body>
</html>