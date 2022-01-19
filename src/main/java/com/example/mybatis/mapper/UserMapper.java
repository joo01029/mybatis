package com.example.mybatis.mapper;

import com.example.mybatis.model.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface UserMapper {
	List<User> findAll();
	List<User> findByNames(List<String> userNames);
	void userAdd(User user);
}
