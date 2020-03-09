package com.chinasoft.response;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/inCode")
public class IndentifyCodeServelt extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int width = 100;
        int height = 50;
        //        1.创建图片对象，将验证码对象放到图像对象中
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

        //        2.美化图像
        //  1.填充背景颜色
        Graphics g = image.getGraphics();
        g.setColor(Color.cyan);
        g.fillRect(0,0,width,height);
        // 2.画边框
        g.setColor(Color.magenta);
        g.drawRect(0,0,width-1,height-1);

        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0987654321";
        //随机挑选字符串
        Random random = new Random();
        for (int i = 1; i <= 4 ; i++) {
//            通过随机数取字符串的下标
            int index = random.nextInt(str.length());
//            通过下标取字符串
            char c = str.charAt(index);
//           将字符写到图片中
            g.drawString(c+"",width/5*i,height/2);
        }
//          画干扰线
            g.setColor(Color.GREEN);
//         随机生成干扰线的位置
        for (int i = 0; i < 10 ; i++) {
            int x1 = random.nextInt(width);
            int x2 = random.nextInt(width);
            int y1 = random.nextInt(height);
            int y2 = random.nextInt(height);
            g.drawLine(x1,y1,x2,y2);
        }
//        3.将验证码发送到前台页面
        ImageIO.write(image,"jpg",response.getOutputStream());



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
