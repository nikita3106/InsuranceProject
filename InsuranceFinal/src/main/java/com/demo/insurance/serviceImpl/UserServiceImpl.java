package com.demo.insurance.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.insurance.entities.Policy;
import com.demo.insurance.entities.User;
import com.demo.insurance.repository.UserRepository;
import com.demo.insurance.service.UserService;


@Service
public class UserServiceImpl implements UserService
{    @Autowired
	private UserRepository userRepository;


	@Override
	public User getUserById(int userId) {
	    return userRepository.findById(userId).orElse(null);
	}

     @Override
	public User createUser(User user) 
	{
		return userRepository.save(user);
	}
	
	@Override
	public Optional<User> getById(int userId) {
		return userRepository.findById(userId);
	}

	@Override
	public List<User> getByAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public Optional<User> updateById(int userId) {
		return userRepository.updateById(userId);
	}

	@Override
	public void deleteById(int userId) {
		userRepository.deleteById(userId);
		
	}
    @Override
	public List<Policy> getUserPolicies(User user) {
		
		return null;
	}

	
	
}
