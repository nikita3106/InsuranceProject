package com.demo.insurance.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.insurance.entities.PolicyPremium;


@Service
public interface PolicyPremiumService {
 
	PolicyPremium createPolicyPremium(PolicyPremium policyPremium);
	PolicyPremium getPolicyPremiumById(int premiumId);
	PolicyPremium updatePolicyPremiumByType(int preminumId,PolicyPremium policyPremium);
	boolean deleteByType(int preminumId);
	List<PolicyPremium> getAllPolicyPremiumsByPolicyType(int preminumId);
	List<PolicyPremium> getAllPolicyPreminums();
	PolicyPremium getPolicyPremiumByType(int preminumId);
}

