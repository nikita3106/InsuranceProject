package com.insurance.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.insurance.demo.entities.User;
import com.insurance.demo.repositories.UserRepository;
import com.insurance.demo.services.UserService;

@Service
public class UserServiceImpl implements UserService
{
	private UserRepository userRepository;

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

	
}
