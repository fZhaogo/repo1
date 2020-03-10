package com.chinasoft.web.blog;

import com.chinasoft.domain.Blog;
import com.chinasoft.domain.Blogger;
import com.chinasoft.domain.Data;
import com.chinasoft.service.BlogService;
import com.chinasoft.service.Impl.BlogServiceImpl;
import com.chinasoft.utils.CommonUtils;
import com.chinasoft.utils.UploadUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.Map;

@WebServlet("/blogingServlet")
public class BlogingServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//正式编码
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //存入图片到服务器，并读出图片地址
        Data data = UploadUtils.uploadImage(request, "/blogimages");
        Map<String, String[]> parameterMap = data.getMap();
        Blog blog = CommonUtils.populate(new Blog(), parameterMap);
        //将blg属性补充；
        Blogger bloger=(Blogger) request.getSession().getAttribute("blogger");
        blog.setBlogger_id(bloger.getId());
        System.out.println(data.getImage());
        blog.setImage(data.getImage());
        blog.setDate(new Date(System.currentTimeMillis()));
        System.out.println(blog);
        BlogService blogService = new BlogServiceImpl();
        boolean flag=blogService.insertBlog(blog);
        if (flag) {
            if (blog.getType().equals("个人笔记")) {
                response.getWriter().write("<h3>上传成功<a href='/personlistpic.jsp'>跳转<a></h3>");
            }else{
                response.getWriter().write("<h3>上传成功<a href='/learnlistpic.jsp'>跳转<a></h3>");
            }
        }else {
                response.getWriter().write("<h3>上传失败<a href='/bloging.jsp'>跳转<a></h3>");

        }

    }


}
