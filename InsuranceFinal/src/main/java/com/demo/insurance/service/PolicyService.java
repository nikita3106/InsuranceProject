package com.demo.insurance.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.insurance.entities.Policy;
import com.demo.insurance.entities.User;


@Service
public interface PolicyService
{
	void createPolicy(Policy policy);
    Void updatePolicy(Policy policy);
    boolean cancelPolicyById(int policyId);
    Policy getPolicyById(int policyId);
    List<Policy> getAllPolicies();
    
}    
    
