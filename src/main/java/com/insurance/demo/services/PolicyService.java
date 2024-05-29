package com.insurance.demo.services;

import java.util.List;
import com.insurance.demo.entities.Policy;

public interface PolicyService
{
	Policy createPolicy(Policy policy);
    Policy getPolicyById(int policyId);
	Policy updatePolicy(int policyId, Policy policy);
	boolean deletePolicy(int policyId);
    List<Policy> getAllPolicies();
    boolean cancelPolicy(int policyId);
	Policy renewPolicy(int policyId);
    List<Policy> getExpiredPolicies();
	

}
