package com.gx.mybatisplus.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

@Getter
public enum SexEnum {
	MALE(1, "M"),
	FEMALE(2, "W");

	@EnumValue //将注解所标识的属性的值存储到数据库中
	private Integer sex;
	private String sexName;

	SexEnum(Integer sex, String sexName) {
		this.sex = sex;
		this.sexName = sexName;
	}
}
