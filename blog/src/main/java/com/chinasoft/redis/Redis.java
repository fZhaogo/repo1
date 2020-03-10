package com.chinasoft.redis;

import com.alibaba.fastjson.JSON;
import com.chinasoft.domain.Blog;
import com.chinasoft.domain.Blogger;
import com.chinasoft.utils.JedisPoolUtils;
import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * @Description TODO
 * @ClassName Redis
 * @Author 86173
 * @Date 2020/3/9 23:08
 * @Version V1.0
 */
public class Redis {

  public static Jedis jedis = JedisPoolUtils.getJedis();

   public static void addBloggerToJedis(Blogger blogger){
        String jblogger = JSON.toJSONString(blogger);//redis中只能存入字符串；
        jedis.sadd("blogger",jblogger);
    }

    //获取blogger
  public static Blogger getBloggerFromJedis(String blogname) {
      try {
          Set<String> jbloggers = jedis.smembers("blogger");
          System.out.println(jbloggers);
          if (jbloggers != null) {
              for (String jblogger : jbloggers) {
                  Blogger blogger = JSON.parseObject(jblogger,Blogger.class);
                  if (blogname.equals(blogger.getBlogname())) {
                      return blogger;
                  }
              }
              return null;
          }
      } catch (Exception e) {
          e.printStackTrace();
      } catch (Error e) {
          e.printStackTrace();
      }finally {
          return null;
      }

  }


    public static void addBlogToJedis(Blog blog) {
        String jblog = JSON.toJSONString(blog);//redis中只能存入字符串；
        jedis.sadd("blog",jblog);
    }
}
