package com.demo.insurance.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="Policy")
public class Policy
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int policyId;
	private int policySerialNo;
	private String policyName;
	private String policyStatus;
	private String policyCoverage;
	private String policyTerm;
	private List<PolicyPremium> policyPremiums;
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public int getPolicySerialNo() {
		return policySerialNo;
	}
	public void setPolicySerialNo(int policySerialNo) {
		this.policySerialNo = policySerialNo;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getPolicyStatus() {
		return policyStatus;
	}
	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}
	public String getPolicyCoverage() {
		return policyCoverage;
	}
	public void setPolicyCoverage(String policyCoverage) {
		this.policyCoverage = policyCoverage;
	}
	public String getPolicyTerm() {
		return policyTerm;
	}
	public void setPolicyTerm(String policyTerm) {
		this.policyTerm = policyTerm;
	}
	public List<PolicyPremium> getPolicyPremiums() {
		return policyPremiums;
	}
	public void setPolicyPremiums(List<PolicyPremium> policyPremiums) {
		this.policyPremiums = policyPremiums;
	}
	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policySerialNo=" + policySerialNo + ", policyName=" + policyName
				+ ", policyStatus=" + policyStatus + ", policyCoverage=" + policyCoverage + ", policyTerm=" + policyTerm
				+ ", policyPremiums=" + policyPremiums + "]";
	}
	
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Policy> policyPremiums1 = new ArrayList<>();
	
	 
	
	
	
	
}