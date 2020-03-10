package com.chinasoft.service.Impl;

import com.alibaba.fastjson.JSON;
import com.chinasoft.dao.BloggerDao;
import com.chinasoft.dao.impl.BloggerDaoImpl;
import com.chinasoft.domain.Blogger;
import com.chinasoft.redis.Redis;
import com.chinasoft.service.BloggerService;
import com.chinasoft.utils.JedisPoolUtils;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * @Description TODO
 * @ClassName BloggerServiceImpl
 * @Author 86173
 * @Date 2020/3/7 21:34
 * @Version V1.0
 */
public class BloggerServiceImpl implements BloggerService {
    private BloggerDao Dao = new BloggerDaoImpl();


    @Override
    public Blogger findBloggerByNameAndPassword(Blogger blogger) {

        return Dao.findBloggerByNameAndPassword(blogger);
    }

    @Override
    public Blogger findByName(String blogname) {
        //试图通过redis数据库查找；
        Blogger blogger1 = Redis.getBloggerFromJedis(blogname);
        if (blogger1 !=null) return blogger1;
        //若redis中不存在,通过mysql数据库查询，并将结果对象存入到redis的set集合中；
        Blogger blogger = Dao.finByName(blogname);
        Redis.addBloggerToJedis(blogger);
        return blogger ;
    }
    //插入成员

    @Override
    public Boolean insertBloger(Blogger blogger) {
        Random random = new Random();
        int i = random.nextInt(10);
        blogger.setImage("defaultphoto/default"+i+".jpg");
        boolean flag=Dao.insertBlogger(blogger);
        if (flag){
            Redis.addBloggerToJedis(blogger);
        }
        return flag;
    }
}
