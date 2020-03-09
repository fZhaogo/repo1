package com.chinasoft.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo1")
public class ResponseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//            如何设置重定向
//        设置响应状态码
//        response.setStatus(302);
////        设置响应头
//        response.setHeader("location","https://www.baidu.com");

//        获取虚拟路径
        String path = request.getContextPath();
//        重定向的简化写法
        response.sendRedirect(path+"/demo2");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
