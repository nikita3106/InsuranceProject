package com.demo.insurance.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.insurance.entities.PolicyPremium;
import com.demo.insurance.repository.PolicyPremiumRepository;
import com.demo.insurance.service.PolicyPremiumService;



@Service
public class PolicyPremiumServiceImpl implements PolicyPremiumService {
	


	private PolicyPremiumRepository policyPreminumRepository;
	@Override
	public PolicyPremium createPolicyPremium(PolicyPremium policyPremium) {
		return policyPreminumRepository.save(policyPremium);
	}

	@Override
	public PolicyPremium getPolicyPremiumByType(int preminumId) {
		Optional<PolicyPremium> preminumOptional=policyPreminumRepository.findById(null);
		return preminumOptional.orElse(null);
	}

	@Override
	public PolicyPremium updatePolicyPremiumByType(int preminumId, PolicyPremium policyPremium) {
		if(policyPreminumRepository.existsById(preminumId)) {
			policyPremium.setPremiumAmount(preminumId);
			return policyPreminumRepository.save(preminumId);
		}
		else
		return null;
	}

	@Override
	public boolean deleteByType(int preminumId) {
		return false;
		
	}

	@Override
	public List<PolicyPremium> getAllPolicyPremiumsByPolicyType(int preminumId) {
		return 	policyPreminumRepository.findAllById(preminumId);

	}

	@Override
	public List<PolicyPremium> getAllPolicyPreminums(){
		return policyPreminumRepository.findAll();
	}

	@Override
	public PolicyPremium getPolicyPremiumById(int premiumId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}