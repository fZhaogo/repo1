package com.chinasoft.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Description TODO
 * @ClassName JedisPoolUtils
 * @Author 86173
 * @Date 2020/3/4 14:48
 * @Version V1.0
 */
public class JedisPoolUtils {
    private static JedisPool jedisPool;

    static{
        try {
            InputStream in = JedisPoolUtils.class.getClassLoader().getResourceAsStream("jedis.properties");
            Properties pro = new Properties();
            pro.load(in);
            JedisPoolConfig config = new JedisPoolConfig();
            config.setMaxIdle(Integer.parseInt(pro.getProperty("MaxIdle")));
            config.setMaxTotal(Integer.parseInt(pro.getProperty("MaxTotal")));
            jedisPool=new JedisPool(config,pro.getProperty("host"),Integer.parseInt(pro.getProperty("port")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Jedis getJedis(){
        return jedisPool.getResource();
    }
}
