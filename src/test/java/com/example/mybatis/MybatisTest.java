package com.example.mybatis;

import com.example.mybatis.mapper.UserMapper;
import com.example.mybatis.model.entity.User;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional

public class MybatisTest {

	public MybatisTest(UserMapper userMapper){
		this.userMapper = userMapper;
	}
	private UserMapper userMapper;
	@Test
	public void testOne(){
		User user = new User("이름", "파트");
		System.out.println(user.getId());

		userMapper.userAdd(user);
		System.out.println(user.getId());
	}
}
