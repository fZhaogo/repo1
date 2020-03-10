package com.chinasoft.dao.impl;

import com.chinasoft.dao.BlogDao;
import com.chinasoft.domain.Blog;
import com.chinasoft.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Description TODO
 * @ClassName BlogDaoImpl
 * @Author 86173
 * @Date 2020/3/7 21:36
 * @Version V1.0
 */
public class BlogDaoImpl implements BlogDao {
    private JdbcTemplate template= new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public boolean insertBlog(Blog blog) {
        String sql="insert into blog values(null,?,?,?,?,?,?,?,0)";
        int in = template.update(sql,blog.getType(),blog.getFont(),blog.getTitle(),blog.getImage(),blog.getContext(),blog.getBlogger_id(),blog.getDate());
        if (in==0)return false;
        else return true;
    }
}
