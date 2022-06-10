package com.day10;

class SuperB{
	
	private String title; 
	protected int area;
	
	public void set(String title) {
		this.title = title;
	}
	
	public void print() {
		System.out.println(title + " : " + area);
	}
}


class RectB extends SuperB{
	private int w,h;
	
	public RectB(int w, int h) {
		this.w =w;
		this.h =h;
	}
	
	public void rectArea() {
		area = w*h; //3. protected로 선언한것은 상속이 가능하다.(같은 패키지 안에 있는 클래스들)
		set("사각형!"); //1. 부모껀 자식꺼.(public 상속 가능)
	}
}


public class Test2 {
	public static void main(String[] args) {
		
		RectB ob = new RectB(100,200);
		ob.rectArea();
		ob.print();//1. 부모껀 자식꺼.(public 상속 가능)
		
	}
}
