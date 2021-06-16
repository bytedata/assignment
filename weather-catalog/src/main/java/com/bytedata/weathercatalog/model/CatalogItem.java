package com.bytedata.weathercatalog.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CatalogItem {
	private String high;
	private String low;
	private int countryCode;
	public CatalogItem() {
	}
	public CatalogItem(String high, String low, int countryCode) {
		this.high = high;
		this.low = low;
		this.countryCode = countryCode;
	}
	public String getHigh() {
		return high;
	}
	public void setHigh(String high) {
		this.high = high;
	}
	public String getLow() {
		return low;
	}
	public void setLow(String low) {
		this.low = low;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	
	
	
	
	
	
}
