package com.insurance.demo.services;

import java.util.List;

import com.insurance.demo.entities.PolicyPremium;

public interface PolicyPermiumService {
	PolicyPremium createPolicyPremium(PolicyPremium policyPremium);
	PolicyPremium getPolicyPremiumById(int preminumId);
	PolicyPremium updatePolicyPremiumById(int preminumId,PolicyPremium policyPremium);
	void deleteByType(int preminumId);
	List<PolicyPremium> getAllPolicyPremiumsByPolicyId(int preminumId);
	List<PolicyPremium> getAllPolicyPreminums();

}
