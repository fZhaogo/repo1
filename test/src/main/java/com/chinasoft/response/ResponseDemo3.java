package com.chinasoft.response;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/demo3")
public class ResponseDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//          设置编码格式
        response.setCharacterEncoding("utf-8");
//        设置响应头
//        response.setHeader("content-type","text/html;charset=utf-8");
//        简化写法
        response.setContentType("image/jpg;charset=utf-8");
//        获得输出流
//        PrintWriter writer = response.getWriter();
//        通过输出流向前台页面发送数据
        ServletOutputStream out = response.getOutputStream();
        ServletContext context = this.getServletContext();
        String path = context.getRealPath("/image/cat.jpg");
//        2.2使用字节流读取文件
        FileInputStream fis = new FileInputStream(path);
//        3.设置reponse的响应头
//        3.1设置mime类型
        String mimeType = context.getMimeType("cat.jpg");
        response.setContentType(mimeType);
//        3.2设置打开方式 content-disposition
//        response.setHeader("content-disposition","attachment;filename=cat.jpg");
//        4.使用字节流将数据发送回去
        request.setAttribute("out",fis);

        response.sendRedirect("/down.jsp");



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
