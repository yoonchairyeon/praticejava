package com.day15pratice;


public class HealthData {
	private String name;
	private int cm,kg;
	private float tot;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCm() {
		return cm;
	}
	public void setCm(int cm) {
		this.cm = cm;
	}
	public int getKg() {
		return kg;
	}
	public void setKg(int kg) {
		this.kg = kg;
	}
	public float getTot() {
		return (kg/(cm*cm/10000));
	}
	
	@Override
	public String toString() {
		String str = String.format("%6s %4d %4d %.1f(Bmi 값)",
				name,cm,kg,getTot());
		return str;
	}
}