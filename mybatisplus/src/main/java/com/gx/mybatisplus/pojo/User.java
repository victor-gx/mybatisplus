package com.gx.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gx.mybatisplus.enums.SexEnum;
import lombok.*;

// @NoArgsConstructor
// @AllArgsConstructor
// @Getter
// @Setter
// @EqualsAndHashCode
@Data
// 设置实体类所对应的表名
@TableName("t_user")
public class User {

	//将属性所对应的字段指定为主键
	//@TableId注解的value属性用于指定主键的字段
	//@TableId注解的type属性设置主键生成策略
	//@TableId(value = "uid", type = IdType.AUTO)
	@TableId("uid")
	private Long id;

	//指定属性所对应的字段名
	@TableField("user_name")
	private String name;

	private Integer age;

	private String email;

	private SexEnum sex;

	@TableLogic
	private Integer isDeleted;

	// @Override
	// public String toString() {
	// 	return "User{" +
	// 			"id=" + id +
	// 			", name='" + name + '\'' +
	// 			", age=" + age +
	// 			", email='" + email + '\'' +
	// 			'}';
	// }
}
