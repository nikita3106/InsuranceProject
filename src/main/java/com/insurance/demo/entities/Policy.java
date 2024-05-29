package com.insurance.demo.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
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
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name ="premiumType")
	private List<PolicyPremium> policyPermiums;
	
	public int getPolicySerialNo() {
		return policySerialNo;
	}
	public void setPolicySerialNo(int policySerialNo) {
		this.policySerialNo = policySerialNo;
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
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
	@Override
	public String toString() {
		return "Policy [policySerialNo=" + policySerialNo + ", policyId=" + policyId + ", policyName=" + policyName
				+ ", policyStatus=" + policyStatus + ", policyCoverage=" + policyCoverage + ", policyTerm=" + policyTerm
				+ "]";
	}
	
	
	
	
}
