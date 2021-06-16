package com.bytedata.weathercatalog.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class WForcast {
	
	private List<Wdata> wforcast;
	
	public WForcast() {
	}
	

	public WForcast(List<Wdata> wforcast) {
		this.wforcast = wforcast;
	}


	public List<Wdata> getWforcast() {
		return wforcast;
	}

	public void setWforcast(List<Wdata> wforcast) {
		this.wforcast = wforcast;
	}

	
	
}
