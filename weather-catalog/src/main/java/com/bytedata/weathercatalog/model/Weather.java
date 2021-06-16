package com.bytedata.weathercatalog.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
	private String weatherId;
	private String name;

	public Weather() {
	}

	public Weather(String weatherId, String name) {
		this.weatherId = weatherId;
		this.name = name;
	}

	public String getWeatherId() {
		return weatherId;
	}

	public void setWeatherId(String weatherId) {
		this.weatherId = weatherId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
