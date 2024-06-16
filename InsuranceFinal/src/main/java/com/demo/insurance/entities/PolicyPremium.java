package com.demo.insurance.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PolicyPremiums")
public class PolicyPremium
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int premiumId;
	private int premiumAmount;
	private String premiumType;
	private String premiumStatus;
	
	 
	 

	public int getPremiumId() {
		return premiumId;
	}
	public void setPremiumId(int premiumId) {
		this.premiumId = premiumId;
	}
	public int getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(int premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	public String getPremiumType() {
		return premiumType;
	}
	public void setPremiumType(String premiumType) {
		this.premiumType = premiumType;
	}
	public String getPremiymStatus() {
		return premiumStatus;
	}
	public void setPremiymStatus(String premiymStatus) {
		this.premiumStatus = premiymStatus;
	}
	@Override
	public String toString() {
		return "PolicyPremium [premiumId=" + premiumId + ", premiumAmount=" + premiumAmount + ", premiumType="
				+ premiumType + ", premiymStatus=" + premiumStatus + "]";
	}
	
	
	
}
