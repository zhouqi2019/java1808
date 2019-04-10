package com.qianfeng.login;

import com.qianfeng.fxmall.user.po.UserInfo;
import com.qianfeng.fxmall.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class SpringTest {

    @Autowired
    private UserService userService;

    @Test
    public void testCase1(){
        /*System.out.println(userService);
        UserInfo tbUser = null;
        System.out.println(tbUser);
        try {
            tbUser = userService.login("123", "123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(tbUser.getUserName());*/
    }
}
