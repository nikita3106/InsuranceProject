package com.demo.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.demo.insurance.entities.PolicyPremium;
import com.demo.insurance.serviceImpl.PolicyPremiumServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/policypremiums")
public class UserPolicyPremiumController {

    @Autowired
    private PolicyPremiumServiceImpl policyPremiumServiceImpl;

   
    @GetMapping("/all")
    public ResponseEntity<List<PolicyPremium>> getAllPolicyPremiums() {
        List<PolicyPremium> premiums = policyPremiumServiceImpl.getAllPolicyPreminums();
        return ResponseEntity.ok(premiums);
    }

   
    @GetMapping("/premiumId")
    public ResponseEntity<PolicyPremium> getPolicyPremiumsById(@PathVariable int premiumId) {
        PolicyPremium policyPremiums =policyPremiumServiceImpl.getPolicyPremiumById(premiumId);
        return ResponseEntity.ok(policyPremiums);
    }

   

   
    @PostMapping("/createpolicypremium")
    public ResponseEntity<PolicyPremium> createPolicyPremium(@RequestBody PolicyPremium policyPremium) {
        PolicyPremium createPolicyPremium = policyPremiumServiceImpl.createPolicyPremium(policyPremium);
        return ResponseEntity.status(HttpStatus.CREATED).body(createPolicyPremium);
    }

  
    @PutMapping("/policypremiumtype")
    public ResponseEntity<PolicyPremium> updatePolicyPremiumByType(@PathVariable int preminumId,
                                                                     @RequestBody PolicyPremium policyPremium) {
        PolicyPremium updatePolicyPremiumByType = policyPremiumServiceImpl.updatePolicyPremiumByType(preminumId, policyPremium);
        if (updatePolicyPremiumByType != null) {
            return ResponseEntity.ok(updatePolicyPremiumByType);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    
    @DeleteMapping("/premiumId")
    public ResponseEntity<Void> deleteByType(@PathVariable int premiumId) {
        boolean deleted = policyPremiumServiceImpl.deleteByType(premiumId);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
