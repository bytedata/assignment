package com.bytedata.weatherdata.models;

import java.util.List;
//@JsonIgnoreProperties(ignoreUnknown = true)
public class WForcast {
	private List<Wdata> wforcast;
	
	public List<Wdata> getWforcast() {
		return wforcast;
	}

	public void setWforcast(List<Wdata> wforcast) {
		this.wforcast = wforcast;
	}

	
	
}
