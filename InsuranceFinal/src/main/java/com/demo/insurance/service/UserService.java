package com.demo.insurance.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.insurance.entities.Policy;
import com.demo.insurance.entities.User;

@Service
public interface UserService 
{
	User createUser(User user);
	Optional<User> getById(int userId);
	List<User> getByAllUsers();
	Optional<User> updateById(int userId);
	void deleteById(int userId);
     List<Policy> getUserPolicies(User user);
     User getUserById(int userId);
	
	
}