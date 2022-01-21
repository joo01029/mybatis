package com.example.mybatis;

import com.example.mybatis.mapper.UserMapper;
import com.example.mybatis.model.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
	private final UserMapper userMapper;

	public List<User> getAllUser(){
		return userMapper.findAll();

	}
	public List<User> getUsersByNames(List<String> userNames){
		return userMapper.findByNames(userNames);
	}

	public List<User> getUserByName(String name){
		return userMapper.findByName(name);
	}

}
