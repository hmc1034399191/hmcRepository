package com.j1823.ShoppingMall.util;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet(name = "ImagServlet",urlPatterns ="/ImagServlet" )
public class ImagServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int width=100;
        int height=50;
        String vercode="";
        //创建验证码图片
        //1.创建一张图片到内存中
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        //2.获取该图片上的画笔
        Graphics graphics = img.getGraphics();
        //设置颜色
        Color color = new Color(231, 255, 241);
        //设置背景颜色

        graphics.setColor(color);
        //画矩形          从（0.0）坐标开始，宽高为
        graphics.fillRect(0,0,width,height);
        //随机字符和颜色
        String str="1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        for (int i = 0; i <4 ; i++) {
            //
            Color color1 = new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
            graphics.setColor(color1);
            char c = str.charAt(random.nextInt(str.length()));
            vercode+=c;
            graphics.drawString(Character.toString(c),i * 25 + 3, 35);
        }
        System.out.println(vercode);
        request.getSession().setAttribute("vercode",vercode);
        ImageIO.write(img, "png", response.getOutputStream());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
