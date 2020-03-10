package com.chinasoft.filter;

import org.springframework.util.ObjectUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 该过滤器用来狼姐用户登录方面的设置；
 *    如果该用户没有登录，则让他调到登录页面
 *    如果该用户已经登录过，则么可以放行直接访问index.jsp页面
 */

@WebFilter("/*")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //1.将req的类型强制转换
        HttpServletRequest request = (HttpServletRequest)req;
        //获取请求资源的路径；
        String uri = request.getRequestURI();
        //判断是否包含有登录相关的路径，然后放行掉；
        if (uri.contains(".jsp")||uri.equals("/")){
            if (uri.contains("login.jsp")||uri.contains("temporary.jsp"))chain.doFilter(req,resp);
            else{
                //如果登录了，则可以放行到index.jsp页面
                Object blogger = request.getSession().getAttribute("blogger");
                if (!ObjectUtils.isEmpty(blogger)){
                    chain.doFilter(req,resp);
                }else{
                    HttpServletResponse response =(HttpServletResponse)resp;
                    response.sendRedirect("/login.jsp");
                }
            }
        } else {
            chain.doFilter(req,resp);
        }

    }



    public void init(FilterConfig config) throws ServletException {

    }

}
