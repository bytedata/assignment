package com.bytedata.weatherinfo.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather implements Serializable{
	private String weatherId;
	private String low;


	public Weather() {
	}

	public Weather(String weatherId, String low) {
		this.weatherId = weatherId;
		this.low = low;
	}

	public String getWeatherId() {
		return weatherId;
	}

	public void setWeatherId(String weatherId) {
		this.weatherId = weatherId;
	}

	public String getLow() {
		return low;
	}

	public void setLow(String low) {
		this.low = low;
	}

	

}
