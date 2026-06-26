package org.example;

import org.example.mapper.UserMapper;
import org.example.pojo.user;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot03MybatisApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void findall() {
        List<user> users = userMapper.findall();
        for (user u : users) {
            System.out.println(u);
        }
    }
    @Test
    public void delete() {
        System.out.println("影响的行数是"+userMapper.delete(5));
    }
    @Test
    public void insert() {
        userMapper.insert(new user(null,"libai","1234567890","李白",20));
    }
    @Test
    public void update() {
        userMapper.update(new user(1,"luvink","1234","momo",18));
    }
    @Test
    public void select() {
        user libai = userMapper.findById("libai", "1234567890");
        System.out.println(libai);
    }
}
