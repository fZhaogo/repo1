package com.chinasoft.web.login$regist;

import cn.hutool.captcha.ShearCaptcha;
import com.alibaba.fastjson.JSON;
import com.chinasoft.domain.Blogger;
import com.chinasoft.service.BloggerService;
import com.chinasoft.service.Impl.BloggerServiceImpl;
import com.chinasoft.utils.CommonUtils;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//正式编码
        request.setCharacterEncoding("utf-8");
        response.setContentType("application/json;charset=utf-8");
//       获取参数
        String verifycode =request.getParameter("vcode");
        System.out.println(verifycode);
//      从session拿到验证码
        HttpSession session = request.getSession();
//        获取验证码
        ShearCaptcha captcha = (ShearCaptcha) session.getAttribute("captcha");
        session.removeAttribute("captcha");
//        验证失败则从新登陆
        if (!captcha.verify(verifycode)){
            response.getWriter().write("{res:0}");

        }else {
//        将获取到的参数封装为map集合
            Map<String, String[]> parameterMap = request.getParameterMap();
//        map集合中的元素封装为对象的属性
            Blogger blogger = CommonUtils.populate(new Blogger(), parameterMap);
            BloggerService bloggerService = new BloggerServiceImpl();
            Blogger bger = bloggerService.findBloggerByNameAndPassword(blogger);
            if (bger != null) {
//            表示登录成功
                session.setAttribute("blogger", blogger);
                response.getWriter().write("{res:2}");
            } else {
                response.getWriter().write("{res:2}");
            }

        }
    }


}
