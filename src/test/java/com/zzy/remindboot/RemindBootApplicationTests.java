package com.zzy.remindboot;

import com.zzy.mapper.UserMapper;
import com.zzy.pojo.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RemindBootApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void contextLoads() {
    }

    @Test
    public void testQuery() throws  Exception{
        List<UserEntity> users=userMapper.getAll();
        System.out.println(users.toString());
    }
}
