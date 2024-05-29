package com.insurance.demo.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.demo.entities.Policy;
@Repository
public interface PolicyRepository extends JpaRepository<Policy, Integer>{

	Policy save(int policyId);

	List<Policy> FindExpiryDateBefore(LocalDate currentDate);

}
