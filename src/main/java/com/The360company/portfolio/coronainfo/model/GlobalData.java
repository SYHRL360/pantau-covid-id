package com.The360company.portfolio.coronainfo.model;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GlobalData {

	private String countryName;
	
	private int confirmCase;
	
	private int death;
	
	private int recovery;

	
	@JsonProperty("attributes")
	private void unpackJson(Map<String, Object> attributes) {
		this.countryName = (String) attributes.get("Country_Region");
		this.confirmCase = (int) attributes.get("Confirmed");
		this.death = (int) attributes.get("Deaths");
		if(attributes.get("Recovered") != null) {
			this.recovery = (int) attributes.get("Recovered");
		} else {
			this.recovery = 0;
		}
		
				
	}
	
	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getConfirmCase() {
		return confirmCase;
	}

	public void setConfirmCase(int confirmCase) {
		this.confirmCase = confirmCase;
	}

	public int getDeath() {
		return death;
	}

	public void setDeath(int death) {
		this.death = death;
	}

	public int getRecovery() {
		return recovery;
	}

	public void setRecovery(int recovery) {
		this.recovery = recovery;
	}
	
}
