package com.chinasoft.web.load;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/download")
public class DownLoadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        1.获取请求过来的需要下载的文件的名称
        String filename = request.getParameter("filename");
//        2.通过名称取获取对应名称的文件并将其加载到内存当中
//        2.1找到文件在服务器中的路径

        ServletContext context = this.getServletContext();
        String path = context.getRealPath("/image/" + filename);
//        2.2使用字节流读取文件
        FileInputStream fis = new FileInputStream(path);
//        3.设置reponse的响应头
//        3.1设置mime类型
        String mimeType = context.getMimeType(filename);
        response.setContentType(mimeType);
//        3.2设置打开方式 content-disposition
        response.setHeader("content-disposition","attachment;filename="+filename);
//        4.使用字节流将数据发送回去
        ServletOutputStream sos = response.getOutputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes))!=-1){
            sos.write(bytes,0,len);
        }
        fis.close();
        sos.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
        

    }
}
