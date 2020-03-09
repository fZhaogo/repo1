package com.chinasoft.service.Impl;

import com.chinasoft.dao.BloggerDao;
import com.chinasoft.dao.impl.BloggerDaoImpl;
import com.chinasoft.domain.Blogger;
import com.chinasoft.service.BloggerService;

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
}
