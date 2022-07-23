package com.gx.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gx.mybatisplus.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserMapper extends BaseMapper<User> {

	/**
	 * 根据id查询用户信息为map集合
	 * @param id
	 * @return
	 */
	Map<String, Object> selectMapById(Long id);
}
