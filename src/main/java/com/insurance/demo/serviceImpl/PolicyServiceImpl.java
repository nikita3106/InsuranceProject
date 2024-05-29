package com.insurance.demo.serviceImpl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.insurance.demo.entities.Policy;
import com.insurance.demo.repositories.PolicyRepository;
import com.insurance.demo.services.PolicyService;

public class PolicyServiceImpl implements PolicyService
{	
	@Autowired
	private PolicyRepository policyRepository;
	
	@Override
	public Policy createPolicy(Policy policy) 
	{
		return policyRepository.save(policy);
	}
	@Override
	public Policy getPolicyById(int policyId)
	{
		 return policyRepository.findById(policyId).orElse(null);
	}
	@Override
	public Policy updatePolicy(int policyId,Policy policy) {
		if(policyRepository.existsById(policyId))
		{
			policy.setPolicyId(policyId);
			return policyRepository.save(policyId);
		}
		else
		return null;
	}
	@Override
	public boolean deletePolicy(int policyId) {
		if(policyRepository.existsById(policyId))
		{
			policyRepository.deleteById(policyId);
			return true;
		}
		return false;
	}
	
	@Override
	public List<Policy> getAllPolicies() {
		return policyRepository.findAll();	
	}

	@Override
	public boolean cancelPolicy(int policyId) {
		Policy policy=policyRepository.findById(policyId).orElse(null);
		if(policy !=null)
		{
			policy.setPolicyStatus("cancelled");
			policyRepository.save(policyId);
			return true;
		}
		return false;
	}
	@Override
	public Policy renewPolicy(int policyId) {
		Policy policy=policyRepository.findById(policyId).orElse(null);
		if(policy!=null)
		{
	        policy.setPolicyStatus("Renewed");
	        return policyRepository.save(policy);
		}
		return null;
	}
	
	
	@Override
	public List<Policy> getExpiredPolicies() {
		LocalDate currentDate=LocalDate.now();
		return policyRepository.FindExpiryDateBefore(currentDate);

	}

	
	
}
