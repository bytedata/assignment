package com.bytedata.weatherdata.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class Wdata {
	private String wId;
	private int wdata;
	public Wdata() {
	}
	public Wdata(String wId, int wdata) {
		super();
		this.wId = wId;
		this.wdata = wdata;
	}
	public String getwId() {
		return wId;
	}
	public void setwId(String wId) {
		this.wId = wId;
	}
	public int getWdata() {
		return wdata;
	}
	public void setWdata(int wdata) {
		this.wdata = wdata;
	}
	
	
	
	

}
