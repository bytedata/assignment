package com.bytedata.weatherinfo.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherSummary implements Serializable {
	private String Country;
	private String city;

	public WeatherSummary() {
		super();
	}

	public WeatherSummary(String country, String city) {
		Country = country;
		this.city = city;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
