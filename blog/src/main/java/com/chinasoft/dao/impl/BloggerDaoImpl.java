package com.chinasoft.dao.impl;

import com.chinasoft.dao.BloggerDao;
import com.chinasoft.domain.Blogger;
import com.chinasoft.utils.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;

/**
 * @Description TODO
 * @ClassName BloggerDaoImpl
 * @Author 86173
 * @Date 2020/3/7 21:56
 * @Version V1.0
 */
public class BloggerDaoImpl implements BloggerDao {
   private JdbcTemplate template= new JdbcTemplate(JDBCUtils.getDataSource());


    @Override//根据昵称及密码在数据库中搜查有没有该用户，返回一个bloger对象；主要用于登录操作

    public Blogger findBloggerByNameAndPassword(Blogger blogger) {

        try {
            String sql="select * from blogger where blogname=? and password=?";
            return template.queryForObject(sql, new BeanPropertyRowMapper<Blogger>(Blogger.class),blogger.getBlogname(),blogger.getPassword());
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public Blogger finByName(String blogname) {
        try {
            String sql="select * from blogger where blogname=?";
            return template.queryForObject(sql, new BeanPropertyRowMapper<Blogger>(Blogger.class),blogname);
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }

    }
    //插入成员

    @Override
    public boolean insertBlogger(Blogger blogger) {
        String sql="insert into blogger values(null,?,?,?,?,?,?,?,?)";
        int in = template.update(sql,blogger.getBlogname(),blogger.getImage(),blogger.getName(),blogger.getSex(),blogger.getAddress(),blogger.getQq(),blogger.getEmail(),blogger.getPassword());
        if (in==0)return false;
        else return true;

    }
}
