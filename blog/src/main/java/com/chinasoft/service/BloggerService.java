package com.chinasoft.service;

import com.chinasoft.domain.Blogger;

public interface BloggerService {
    Blogger findBloggerByNameAndPassword(Blogger blogger);

    Blogger findByName(String blogname);

    Boolean insertBloger(Blogger blogger);
}
