package com.macro.mall;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.security.crypto.password.PasswordEncoder;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PasswordTest {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void passwordTest(){
        //将密码进行加密操作
        String encodePassword = passwordEncoder.encode("123");
        System.out.println(encodePassword);

    }
}
