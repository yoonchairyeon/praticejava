package com.day10;

class SuperD{
	private String title;
	protected int area;
	
	public SuperD(String title) {
		this.title = title;
	}
	
	public void print() {
		System.out.println(title + ":" + area);
	}
}

class RectD extends SuperD{
	private int w,h;
	public RectD(int w,int h) {
		super("사각형!!");
		
		this.w=w;
		this.h=h;
	}
	/* public RectD() {
		super("A");}*/
	public void rectArea() {
		area = w*h;
	}
}

public class Test3 {

	public static void main(String[] args) {
		RectD ob = new RectD(10,30);
		
		ob.rectArea();
		ob.print();
	}

}
