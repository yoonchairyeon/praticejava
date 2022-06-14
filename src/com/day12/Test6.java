package com.day12;

//final을 사용할 수 있는 3가지 경우
//변수에 final을 붙이면 : 한번만 초기화가 가능하다.
// 메소드에 final을 붙이면 : Override가 불가능하다.
// 클래스에 final을 붙이면 : 상속이 불가능하다.

// final class Super({ 
class Super{
	public static final double PI;
	
	static {
		PI = 3.14;
	}
	
	public double area;
	
	public final void write(String title) {
		System.out.println(title + ":" + area);
	}
}


public class Test6 extends Super {
 
	//@Override
	//public void write(String title) {
	public void circleArea(int r){
		area = (double)r*r*3.14;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test6 ob = new Test6();
		ob.circleArea(9);
		ob.write("원");
	}

}
