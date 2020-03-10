package com.chinasoft;

import static org.junit.Assert.assertTrue;

import com.chinasoft.domain.Blogger;
import com.chinasoft.service.BloggerService;
import com.chinasoft.service.Impl.BloggerServiceImpl;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void f1(){
        Blogger blogger = new Blogger(null,"jack","ar","fff","男","afa","ew","434","2343");
        BloggerService bloggerService = new BloggerServiceImpl();
        Boolean aBoolean = bloggerService.insertBloger(blogger);
        System.out.println(aBoolean);
    }
}
