<%--
  Created by IntelliJ IDEA.
  User: Boy
  Date: 2018/12/20
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
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


<div class="content content-nav-base commodity-content">
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
    <div class="commod-cont-wrap">
        <div class="commod-cont w1200 layui-clear">
            <div class="left-nav">
                <div class="title">所有分类</div>
                <div class="list-box">
                    <dl>
                        <c:forEach var="name" items="${sessionScope.Commoditymap}">
                            <dt>${name.key.c_sort}</dt>
                            <c:forEach var="Commodity" items="${name.value}">
                            <dd><a href="javascript:;">${Commodity.value.c_name}</a><dd>
                            </c:forEach>
                        </c:forEach>
                    </dl>
                </div>
            </div>
            <div class="right-cont-wrap">
                <div class="right-cont">
                    <div class="sort layui-clear">
                        <a class="active" href="javascript:;" event = 'volume'>销量</a>
                        <a href="javascript:;" event = 'price'>价格</a>
                        <a href="javascript:;" event = 'newprod'>新品</a>
                        <a href="javascript:;" event = 'collection'>收藏</a>
                    </div>
                    <div class="prod-number">
                        <span>&nbsp;</span>
                    </div>
                    <div class="cont-list layui-clear" id="list-cont">
                        <c:forEach var="ComAll" items="${sessionScope.Commoditymap}">
                            <c:forEach var="Commodity" items="${ComAll.value}">
                            <div class="item">
                                <div class="img">
                                    <a href="OrdersServlet?c_id=${Commodity.value.c_id}"><img src="res/static/img/paging_img1.jpg"></a>
                                </div>
                                <div class="text">
                                    <p class="title">${Commodity.value.c_name}</p>
                                    <p class="price">
                                        <span class="pri">￥${Commodity.value.c_proce}</span>
                                        <span class="nub">剩余：${Commodity.value.c_count}</span>
                                    </p>
                                </div>
                            </div>
                            </c:forEach>
                        </c:forEach>
                        <div class="item">
                            <div class="img">
                                <a href="javascript:;"><img src="res/static/img/paging_img1.jpg"></a>
                            </div>
                            <div class="text">
                                <p class="title">森系小清新四件套</p>
                                <p class="price">
                                    <span class="pri">￥200</span>
                                    <span class="nub">1266付款</span>
                                </p>
                            </div>
                        </div>
                    </div>
                    <div id="demo0" style="text-align: center;"></div>
                </div>
            </div>
        </div>
    </div>
</div>


</body>
</html>
