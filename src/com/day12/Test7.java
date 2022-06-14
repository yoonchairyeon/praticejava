package com.day12;

//추상 클래스(abstract class) = 인터페이스 클래스 
//메모리의 낭비없이 클래스를 미리 설계
//메소드를 재정의 해서 사용한다.

abstract class ShapeClass{ //추상 클래스는 반드시 추상 메소드 1개를 갖고 있어야 한다. (일반 메소드도 가지고 있을 수 있다)
	
	public abstract void draw(); //추상 메소드 : 메소드의 내용을 적지 않는다.
		
	public void print() {
		System.out.println("A");
	}
}

class Circ extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("원을 그리다...");
		
	}
	
}

class Rect extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("사각형을 그리다...");
	}
	
}

class Tri extends ShapeClass{
	
	@Override
	public void draw() {
		System.out.println("삼각형을 그리다...");
		
	}
}

public class Test7 {

	public static void main(String[] args) {
		Circ c = new Circ();
		Rect r = new Rect();
		Tri t = new Tri();
		
		c.draw();
		r.draw();
		t.draw();
	}

}
