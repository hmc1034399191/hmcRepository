package com.j1823.ShoppingMall.action;

import com.j1823.ShoppingMall.entity.UseresBeans;
import com.j1823.ShoppingMall.service.UserService;
import com.j1823.ShoppingMall.service.serviceimpl.UserServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "IsloginServlet",urlPatterns = "/IsloginServlet")
public class IsloginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        UserService us=new UserServiceimpl();
        String u_usernum = request.getParameter("u_usernum");
        String u_pwd = request.getParameter("u_pwd");
        UseresBeans ub = us.seleUser(u_usernum);
        if(ub.getU_usernum().equals(u_usernum)&&ub.getU_pwd().equals(u_pwd)){
            System.out.println("验证通过");
            request.getRequestDispatcher("index.jsp").forward(request,response);
            return;
        }else{
            System.out.println("验证失败");
            request.getRequestDispatcher("register.jsp").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
