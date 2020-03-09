package com.chinasoft.service;

import com.chinasoft.domain.Blogger;

public interface BloggerService {
    Blogger findBloggerByNameAndPassword(Blogger blogger);
}
