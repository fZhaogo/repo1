package com.chinasoft.filter;

import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

@WebFilter("")
public class SensitiveWordsFilter implements Filter {
    //    用来装敏感词的集合
    private List<String> lists = new ArrayList<>();

    public void doFilter(final ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        // 1.创建代理对象，增强req
        ServletRequest request = (ServletRequest) Proxy.newProxyInstance(req.getClass().getClassLoader(),
                req.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                       可以做铭感词的过滤
//                        判断是否是获取参数的方法
                        if (method.getName().equals("getParameter")) {
//                            获取返回值
                            String value = (String)method.invoke(req,args);
                            if (!StringUtils.isEmpty(value)){
                                for (String str : lists) {
                                    if (value.contains(str)){
                                        value = value.replaceAll(str,"**");
                                    }
                                }
                            }
                            return value;
                        }
//                        完成 getParameterMap 敏感词过滤
//                        if (method.getName().equals("getParameterMap")){
//
//                        }
                        return method.invoke(req,args);
                    }
                });

        chain.doFilter(request, resp);
    }

    /**
     *  用来加载铭感词
     * @param config
     * @throws ServletException
     */
    public void init(FilterConfig config) throws ServletException {
        try {
            ServletContext servletContext = config.getServletContext();
            String realPath = servletContext.getRealPath("/WEB-INF\\classes\\sensitiveWords.txt");
//       使用流读取文件
            BufferedReader br = new BufferedReader(new FileReader(realPath));
//          将敏感词装入集合当中
            String line ;
            while ((line = br.readLine()) != null){
                lists.add(line);
            }
            br.close();
            System.out.println(lists);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void destroy() {
    }

}



