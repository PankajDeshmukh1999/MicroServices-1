package com.example.userService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.userService.entity.User;

@Service
public class Implimantation implements userService {

	List<User> list = List.of(
				new User(112l,"Pankaj","7573587432"),
				new User(113l,"Kiran","75587432"));
	@Override
	public User getuser(Long userId) {
		
		return this.list.stream().filter(user->user.getId().equals(userId)).findAny().orElse(null);
	}

}
