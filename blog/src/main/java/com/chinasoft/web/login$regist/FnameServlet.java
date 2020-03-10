package com.chinasoft.web.login$regist;

import com.alibaba.fastjson.JSON;
import com.chinasoft.domain.Blogger;
import com.chinasoft.service.BloggerService;
import com.chinasoft.service.Impl.BloggerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/fnameServlet")
public class FnameServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//正式编码
        request.setCharacterEncoding("utf-8");
        response.setContentType("application/json;charset=utf-8");
        String blogname = request.getParameter("blogname");
        BloggerService bloggerService = new BloggerServiceImpl();
        Blogger blogger = bloggerService.findByName(blogname);
        Map<String,Object> map=new HashMap<>();
        if (blogger ==null){
            map.put("res",true);
        }else{
            map.put("res",false);
        }
        response.getWriter().write(JSON.toJSONString(map));

    }


}
