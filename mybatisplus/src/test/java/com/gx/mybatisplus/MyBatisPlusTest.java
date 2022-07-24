package com.gx.mybatisplus;

import com.gx.mybatisplus.mapper.UserMapper;
import com.gx.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// @RunWith(SpringRunner.class)
@SpringBootTest
public class MyBatisPlusTest {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void testSelectList() {
		//通过条件构造器查询一个list集合，若没有条件，则可以设置null为参数
		List<User> list = userMapper.selectList(null);
		list.forEach(System.out::println);
	}

	//将属性所对应的字段指定为主键
	//@TableId注解的value属性用于指定主键的字段
	//@TableId注解的type属性设置主键生成策略
	//@TableId(value = "uid", type = IdType.AUTO)
	@Test
	public void testInsert() {
		//实现新增用户信息
		//INSERT INTO user ( id, name, age, email ) VALUES ( ?, ?, ?, ? )
		User user = new User();
		//user.setId(100L);
		user.setName("zs");
		user.setAge(23);
		user.setEmail("zhangsan@atguigu.com");
		int result = userMapper.insert(user);
		System.out.println("result:" + result);
		System.out.println("id:" + user.getId());
	}

	@Test
	public void testDelete(){
		//通过id删除用户信息
		//DELETE FROM user WHERE id=?
        /*int result = userMapper.deleteById(1550692495350939649L);
        System.out.println("result:"+result);*/
		//根据map集合中所设置的条件删除用户信息
		//DELETE FROM user WHERE name = ? AND age = ?
        // Map<String, Object> map = new HashMap<>();
        // map.put("name", "zs");
        // map.put("age", 23);
        // int result = userMapper.deleteByMap(map);
        // System.out.println("result:"+result);
		//通过多个id实现批量删除
		//DELETE FROM user WHERE id IN ( ? , ? , ? )
		List<Long> list = Arrays.asList(1L, 2L, 3L);
		int result = userMapper.deleteBatchIds(list);
		System.out.println("result:"+result);
	}

	@Test
	public void testUpdate(){
		//修改用户信息
		//UPDATE user SET name=?, email=? WHERE id=?
		User user = new User();
		user.setId(4L);
		user.setName("ls");
		user.setEmail("lisi@atguigu.com");
		int result = userMapper.updateById(user);
		System.out.println("result:"+result);
	}

	@Test
	public void testSelect(){
		//通过id查询用户信息
		//SELECT id,name,age,email FROM user WHERE id=?
        /*User user = userMapper.selectById(1L);
        System.out.println(user);*/
		//根据多个id查询多个用户信息
		//SELECT id,name,age,email FROM user WHERE id IN ( ? , ? , ? )
        /*List<Long> list = Arrays.asList(1L, 2L, 3L);
        List<User> users = userMapper.selectBatchIds(list);
        users.forEach(System.out::println);*/
		//根据map集合中的条件查询用户信息
		//SELECT id,name,age,email FROM user WHERE name = ? AND age = ?
        /*Map<String, Object> map = new HashMap<>();
        map.put("name", "Jack");
        map.put("age", 20);
        List<User> users = userMapper.selectByMap(map);
        users.forEach(System.out::println);*/
		//查询所有数据
		//SELECT id,name,age,email FROM user
		List<User> users = userMapper.selectList(null);
		users.forEach(System.out::println);
        /*Map<String, Object> map = userMapper.selectMapById(1L);
        System.out.println(map);*/
	}


}
