package com.insurance.demo.services;

import java.util.List;
import java.util.Optional;

import com.insurance.demo.entities.User;

public interface UserService 
{
	User createUser(User user);
	Optional<User> getById(int userId);
	List<User> getByAllUsers();
	Optional<User> updateById(int userId);
	void deleteById(int userId);
	
	
}
