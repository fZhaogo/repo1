package com.chinasoft.web.login$regist;

import com.chinasoft.domain.Blogger;
import com.chinasoft.service.BloggerService;
import com.chinasoft.service.Impl.BloggerServiceImpl;
import com.chinasoft.utils.CommonUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/registServlet")
public class RegistServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//正式编码
        request.setCharacterEncoding("utf-8");
        Map<String, String[]> parameterMap = request.getParameterMap();
        Blogger blogger = CommonUtils.populate( new Blogger(),parameterMap);
        //使用service服务
        BloggerService bloggerService = new BloggerServiceImpl();
        Boolean flag = bloggerService.insertBloger(blogger);
        if (flag){
            request.setAttribute("msg","恭喜您注册成功，请登录");
            request.getRequestDispatcher("/temporary.jsp").forward(request,response);
        }


    }




}
