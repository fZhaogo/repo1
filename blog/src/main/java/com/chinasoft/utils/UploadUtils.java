package com.chinasoft.utils;

import com.chinasoft.domain.Data;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description TODO
 * @ClassName UploadUtils
 * @Author 86173
 * @Date 2020/3/11 0:08
 * @Version V1.0
 */
public class UploadUtils {
   public static Data uploadImage(HttpServletRequest request,String dir) throws UnsupportedEncodingException {
       System.out.println("我进来了");
        DiskFileItemFactory factory = new DiskFileItemFactory();
//创建解析类的实例
        ServletFileUpload sfu = new ServletFileUpload(factory);
       //创建存储表单中的集合
        Map<String, String[]> map=new HashMap<>();
//开始解析
        sfu.setFileSizeMax(1024*400);
//每个表单域中数据会封装到一个对应的FileItem对象上
        try {
            List<FileItem> items = sfu.parseRequest(request);
            StringBuilder sb = new StringBuilder();
//区分表单域
            for (int i = 0; i < items.size(); i++) {
                System.out.println("我进循环了");
                FileItem item = items.get(i);
//isFormField为true，表示这不是文件上传表单域
                if(!item.isFormField()){
                    ServletContext sctx =request.getServletContext();
//获得存放文件的物理路径
//upload下的某个文件夹 得到当前在线的用户 找到对应的文件夹

                    String path = sctx.getRealPath(dir);
                    System.out.println("这是我需要的地址");
                    System.out.println(path);
//获得文件名
                    String fileName = item.getName();
                    System.out.println(fileName);
//该方法在某些平台(操作系统),会返回路径+文件名
                    fileName = fileName.substring(fileName.lastIndexOf("/")+1);
                    File file = new File(path+"\\"+fileName);
                    if(!file.exists()){
                        item.write(file);
//将上传图片的名字记录到数据库中
                    }
                    sb.append(dir+"/"+fileName+";");
                }else {
                    String inputname =item.getFieldName();
                    String inputvalue = new String(item.getString().getBytes("iso-8859-1"),"utf-8");
                    String[]strs={inputvalue};
                    map.put(inputname,strs);
                }
            }
            return new Data(sb.toString(),map);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }


}
