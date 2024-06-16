package com.demo.insurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.insurance.entities.Policy;
import com.demo.insurance.entities.PolicyPremium;
import com.demo.insurance.service.PolicyPremiumService;


@Repository
public interface PolicyPremiumRepository extends JpaRepository<PolicyPremium, Integer>{

	List<PolicyPremiumService> findByPolicy(Policy policy);

	List<PolicyPremium> findAllById(int preminumId);

	PolicyPremium save(int preminumId);

}
