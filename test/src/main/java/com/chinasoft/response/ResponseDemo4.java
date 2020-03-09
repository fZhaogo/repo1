package com.chinasoft.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description TODO
 * @ClassName ResponseDemo4
 * @Author Jack.Shen
 * @Date 2020/2/22 9:14
 * @Version V1.0
 */
@WebServlet("/demo4")
public class ResponseDemo4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/demo2").forward(req,resp);
    }
}
