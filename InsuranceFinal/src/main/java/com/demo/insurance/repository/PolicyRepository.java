package com.demo.insurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.insurance.entities.Policy;
import com.demo.insurance.entities.User;


@Repository
public interface PolicyRepository extends JpaRepository<Policy, Integer>{

	List<Policy> findPoliciesByUser(User user);

}
