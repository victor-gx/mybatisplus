package com.gx.mybatisplus;

import com.gx.mybatisplus.enums.SexEnum;
import com.gx.mybatisplus.mapper.UserMapper;
import com.gx.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyBatisPlusEnumTest {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void test() {
		User user = new User();
		user.setName("admin");
		user.setAge(33);
		user.setSex(SexEnum.MALE);
		int result = userMapper.insert(user);
		System.out.println("result:" + result);
	}
}
