package com.demo.insurance.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.insurance.entities.Policy;
import com.demo.insurance.entities.User;
import com.demo.insurance.repository.PolicyRepository;
import com.demo.insurance.service.PolicyService;


public class PolicyServiceImpl implements PolicyService
{

	 @Autowired
	    private PolicyRepository policyRepository1;

	    
	    public List<Policy> findPoliciesByUser(User user) {
	        return  policyRepository1.findPoliciesByUser(user);
	    }
   
	
	@Override
	public void createPolicy(Policy policy) {
		// TODO Auto-generated method stub
		return;
	}

	@Override
	public Void updatePolicy(Policy policy) {
		return null;
		// TODO Auto-generated method stub
	
	}

	@Override
	public boolean cancelPolicyById(int policyId) {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Policy getPolicyById(int policyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Policy> getAllPolicies() {
		// TODO Auto-generated method stub
		return null;
	}


	public Policy renewPolicy(int policyId) {
		// TODO Auto-generated method stub
		return null;
	}


	public boolean deletePolicy(int policyId) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
