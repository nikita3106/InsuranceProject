package com.insurance.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.demo.entities.User;
import com.insurance.demo.serviceImpl.UserServiceImpl;
import com.insurance.demo.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController
{
	@Autowired
	private UserServiceImpl userService;
	
	@PostMapping("/createuser")
	public ResponseEntity<User> createUser(@RequestBody User user)
	{
		User createUser=userService.createUser(user);
		return ResponseEntity.ok().body(createUser);
	}
	@GetMapping("/getUser/{userId}")
	public ResponseEntity<Optional<User>> getUserById(@PathVariable int userId)
	{
		Optional<User> user1=userService.getById(userId);
		return ResponseEntity.ok().body(user1);
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<User>> getAllUsers()
	{
		List<User> userList=userService.getByAllUsers();
		return ResponseEntity.ok().body(userList);
	}
	@PutMapping("/updateuser/{userId}")
	public ResponseEntity<Optional<User>> updateUser(@PathVariable int userId)
	{
		Optional<User> updateUser=userService.updateById(userId);
		return ResponseEntity.ok().body(updateUser);
	}
	
	@DeleteMapping("/deleteUser/{userId}")
	public ResponseEntity<String> deleteUserById(@PathVariable int userID)
	{
		 userService.deleteById(userID);
		 return ResponseEntity.ok().body("Successfully Deleted");
	}
	
}
