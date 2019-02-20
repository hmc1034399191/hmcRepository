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

@WebServlet(name = "OrdersServlet",urlPatterns = "/OrdersServlet")
public class OrdersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获得ID转类型为int
        //int i=Integer.valueOf(request.getParameter("c_id")).intValue();
        int i = Integer.parseInt(request.getParameter("c_id"));
        CommodityService cs=new CommodityServiceimpl();
        CommodityBeans commodityBeans = cs.showCom(i);
        request.getSession().setAttribute("commodityBeans",commodityBeans);
        response.sendRedirect("details.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
