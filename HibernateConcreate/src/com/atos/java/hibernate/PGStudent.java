package com.atos.java.hibernate;

public class PGStudent extends Student{
	
	private float points;
	private String specilization;
	public float getPoints() {
		return points;
	}
	public void setPoints(float points) {
		this.points = points;
	}
	public String getSpecilization() {
		return specilization;
	}
	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}
	
	

}