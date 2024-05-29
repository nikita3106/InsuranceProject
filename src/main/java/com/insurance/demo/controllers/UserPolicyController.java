package com.insurance.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.demo.entities.Policy;
import com.insurance.demo.serviceImpl.PolicyServiceImpl;
import com.insurance.demo.services.UserService;

@RestController
@RequestMapping("/policies")
public class UserPolicyController
{
	@Autowired
	private PolicyServiceImpl policyServiceImpl ;
	
	@PostMapping("/createPolicy")
	public ResponseEntity<Policy> createPolicy(@PathVariable Policy policy)
	{
		Policy createdPolicy=policyServiceImpl.createPolicy(policy);
		return ResponseEntity.ok().body(createdPolicy);
	}
	@GetMapping("/policyId")
	public ResponseEntity<Policy> getPolicyById(@PathVariable int policyId)
	{	
		Policy policy=policyServiceImpl.getPolicyById(policyId);
		if(policy != null)
		{
			return ResponseEntity.ok(policy);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	@PutMapping("/policyId")
	public ResponseEntity<Policy> updatePolicy(int policyId,Policy policy)
	{
		Policy updatedPolicy=policyServiceImpl.updatePolicy(policyId, policy);
		if(updatedPolicy != null)
		{
			return ResponseEntity.ok(updatedPolicy);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	 @DeleteMapping("/{policyId}")
	 public ResponseEntity<Void> deletePolicy(@PathVariable int policyId) 
	 {
	     boolean deleted = policyServiceImpl.deletePolicy(policyId);
	        if (deleted) 
	        {
	            return ResponseEntity.noContent().build();
	        } else 
	        {
	            return ResponseEntity.notFound().build();
	        }
	 }
	 @GetMapping("/all")
	  public ResponseEntity<List<Policy>> getAllPolicies()
	 {
	        List<Policy> policies = policyServiceImpl.getAllPolicies();
	        return ResponseEntity.ok(policies);
	 }
	 @PutMapping("/{policyId}/cancel")
	 public ResponseEntity<Void> cancelPolicy(@PathVariable int policyId)
	 {
		  boolean canceled = policyServiceImpl.cancelPolicy(policyId);
	        if (canceled) {
	            return ResponseEntity.ok().build();
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	  }
	 @PutMapping("/{policyId}/renew")
	 public ResponseEntity<Policy> renewPolicy(@PathVariable int policyId)
	 {
		    Policy renewedPolicy = policyServiceImpl.renewPolicy(policyId);
		     if (renewedPolicy != null) 
		     {
		            return ResponseEntity.ok(renewedPolicy);
		     } else 
		     {
		    	 	return ResponseEntity.notFound().build();
		     }
	 }
	 @GetMapping("/expired")
	 public ResponseEntity<List<Policy>> getExpiredPolicies() 
	 {
		 List<Policy> expiredPolicies = policyServiceImpl.getExpiredPolicies();
		 return ResponseEntity.ok(expiredPolicies);
	 }
}











