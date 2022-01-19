package com.example.mybatis;

import com.example.mybatis.model.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
	private final UserService userService;

	@GetMapping
	public List<User> AllUser(){
		return userService.getAllUser();
	}
	@GetMapping("/name")
	public List<User> getUserByNames(@RequestParam List<String> userNames){
		return userService.getUsersByNames(userNames);
	}
}
