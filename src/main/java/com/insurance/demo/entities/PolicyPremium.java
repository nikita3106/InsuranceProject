package com.insurance.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PolicyPremium
{
	@Id
	private int preminumId;
	private String premiumType;
	private int premiumAmount;
	private String premiumStatus;
	public int getPreminumId() {
		return preminumId;
	}
	public void setPreminumId(int preminumId) {
		this.preminumId = preminumId;
	}
	public String getPremiumType() {
		return premiumType;
	}
	public void setPremiumType(String premiumType) {
		this.premiumType = premiumType;
	}
	public int getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(int premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	public String getPremiumStatus() {
		return premiumStatus;
	}
	public void setPremiumStatus(String premiumStatus) {
		this.premiumStatus = premiumStatus;
	}
	@Override
	public String toString() {
		return "PolicyPremium [preminumId=" + preminumId + ", premiumType=" + premiumType + ", premiumAmount="
				+ premiumAmount + ", premiumStatus=" + premiumStatus + "]";
	}
	
	
}
