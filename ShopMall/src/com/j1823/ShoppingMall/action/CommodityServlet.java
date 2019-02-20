package com.j1823.ShoppingMall.action;
import com.j1823.ShoppingMall.entity.Com_sortBeans;
import com.j1823.ShoppingMall.entity.CommodityBeans;
import com.j1823.ShoppingMall.service.Com_sortService;
import com.j1823.ShoppingMall.service.CommodityService;
import com.j1823.ShoppingMall.service.serviceimpl.CommodityServiceimpl;
import com.j1823.ShoppingMall.service.serviceimpl.com_sortServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "CommodityServlet", urlPatterns = "/CommodityServlet")
public class CommodityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Com_sortService cs = new com_sortServiceimpl();
        CommodityService cs2 = new CommodityServiceimpl();
        List<Com_sortBeans> Com_sort = cs.showall();
        Map<Com_sortBeans, Map<String, CommodityBeans>> map = new HashMap<>();
        Map<String, CommodityBeans> map2;
        //遍历得到的所有商品类别
        for (int j = 0; j < Com_sort.size(); j++) {
            Com_sortBeans com_sortBeans = Com_sort.get(j);
            String c_sort = com_sortBeans.getC_sort();
            System.out.println(c_sort);
            //根据得到的商品类别字段得到商品信息
            List<CommodityBeans> showone = cs2.showone(c_sort);
            //将商品信息遍历
            map2 = new HashMap<>();
            for (int i = 0; i < showone.size(); i++) {
                //一个商品类别对应相对的商品信息
                CommodityBeans commodityBeans = showone.get(i);
                System.out.println(commodityBeans.getC_name());
                map2.put(i + "", commodityBeans);
            }
            map.put(com_sortBeans, map2);
        }
        //将map集合放在session里面
        request.getSession().setAttribute("Commoditymap", map);
//        request.getRequestDispatcher("commodity.jsp").forward(request, response);
        response.sendRedirect("commodity.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
