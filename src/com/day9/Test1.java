package com.day9;

//사각형의 둘레와 넓이구하는 클래스 만들기.
/* Overload(Overloading) 오버로딩 = 메소드 중복 정의 
 * 하나의 클래스에서 메소드의 이름은 동일하지만
 * 매개변수의 개수가 다르거나 자료형이 다르면
 * 다른 메소드로 인식한다.
 */
class Rect{
	private int w,h;
	
	public void set(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public int area() {
		return w*h;
	}
	
	public int length() {
		return (w+h)*2;
	}
	
	public void print(int a, int l) {
		System.out.println("1");
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + l);
	}
	
	public void print() {
		System.out.println("2");
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
	}
	
	public void print(int a) {
		System.out.println("3");
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("넓이 : " + a);
	}
	
	public void print(double l) {
		System.out.println("4");
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("둘레 : " + l);
	}
	
}

public class Test1 {

	

	public static void main(String[] args) {
		
		Rect ob = new Rect();
		ob.set(10, 20);
		int area = ob.area();
		int length = ob.length();
		
		ob.print(area, length);
		
		ob.print();
		
		ob.print(area);

		ob.print((double)length);
		
		
		
		
	}

}
