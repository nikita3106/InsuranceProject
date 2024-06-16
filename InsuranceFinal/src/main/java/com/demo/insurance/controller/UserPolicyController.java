package com.demo.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import  com.demo.insurance.entities.Policy;
import  com.demo.insurance.service.UserService;
import  com.demo.insurance.serviceImpl.PolicyServiceImpl;

@RestController
@RequestMapping("/policies")
public class UserPolicyController
{
	@Autowired
	private PolicyServiceImpl policyServiceImpl ;
	
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
	public ResponseEntity<Void> updatePolicy(@RequestBody Policy policy)
	{
		Void updatedPolicy=policyServiceImpl.updatePolicy(policy);
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
		  boolean canceled = policyServiceImpl.cancelPolicyById(policyId);
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
	
}