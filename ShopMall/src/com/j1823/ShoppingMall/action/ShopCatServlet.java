package com.j1823.ShoppingMall.action;

import com.j1823.ShoppingMall.entity.CommodityBeans;
import com.j1823.ShoppingMall.service.CommodityService;
import com.j1823.ShoppingMall.service.serviceimpl.CommodityServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ShopCatServlet",urlPatterns = "/ShopCatServlet")
public class ShopCatServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CommodityBeans commodityBeans = (CommodityBeans) request.getSession().getAttribute("commodityBeans");
        List<CommodityBeans> list=new ArrayList<>();
        list.add(commodityBeans);
        request.getSession().setAttribute("list",list);
        response.sendRedirect("shopcart.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
