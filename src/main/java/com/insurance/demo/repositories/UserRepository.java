package com.insurance.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.demo.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{
	Optional<User> updateById(int userId);
}
