package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.respositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository respository;
	
	public List<User> findAll() {
		return respository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = respository.findById(id);
		return obj.get();
	}
}
