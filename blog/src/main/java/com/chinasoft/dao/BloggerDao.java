package com.chinasoft.dao;

import com.chinasoft.domain.Blogger;

/**
 * @Description TODO
 * @ClassName BloggerDao
 * @Author 86173
 * @Date 2020/3/7 21:55
 * @Version V1.0
 */
public interface BloggerDao {
    Blogger findBloggerByNameAndPassword(Blogger blogger);

    Blogger finByName(String blogname);

    boolean insertBlogger(Blogger blogger);
}
