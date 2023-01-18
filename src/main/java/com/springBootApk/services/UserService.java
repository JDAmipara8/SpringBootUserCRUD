package com.springBootApk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springBootApk.entities.User;

import com.springBootApk.repo.UserRepository;

@Component
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User add(User user) {
		return userRepository.save(user);
	
	}

	public List<User> getUsers() {
		return (List<User>) userRepository.findAll();
	}

	public User getUserById(long uId) {
		Optional<User> optionalUser = userRepository.findById(uId);
		return optionalUser.get();
	}

	public void delete(long uId) {
		userRepository.deleteById(uId);
	}

	public User updateUser(User user, long uId) {
		user.setuId(uId);
		return userRepository.save(user);
	}
}
