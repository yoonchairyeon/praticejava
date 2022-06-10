package com.day10;

class SuperC{
	
	private String title;
	private int area;
	
	public void set(String title, int area) {
		this.area = area;
		this.title = title;
	}
	
	public void print() {
		System.out.println(title + " : " + area);
	}
}


class Rect extends SuperC{
	private int w,h;
	
	public Rect(int w, int h) {
		this.w =w;
		this.h =h;
	}
	
	public void rectArea() {
		int a = w*h;
		
		set("사각형!",a);
	}
}


public class Test1 {
	public static void main(String[] args) {
		Rect ob = new Rect(10,20);
		ob.rectArea();
		ob.print();
		
	}
}
