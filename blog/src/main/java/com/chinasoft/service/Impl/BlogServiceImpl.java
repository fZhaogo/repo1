package com.chinasoft.service.Impl;

import com.chinasoft.dao.BlogDao;
import com.chinasoft.dao.BloggerDao;
import com.chinasoft.dao.impl.BlogDaoImpl;
import com.chinasoft.dao.impl.BloggerDaoImpl;
import com.chinasoft.domain.Blog;
import com.chinasoft.redis.Redis;
import com.chinasoft.service.BlogService;

/**
 * @Description TODO
 * @ClassName BlogServiceImpl
 * @Author 86173
 * @Date 2020/3/11 0:29
 * @Version V1.0
 */
public class BlogServiceImpl implements BlogService {
    private BlogDao Dao = new BlogDaoImpl();
    @Override
    public boolean insertBlog(Blog blog) {
        boolean flag=Dao.insertBlog(blog);
        if (flag){
            Redis.addBlogToJedis(blog);
        }
        return flag;

    }
}
