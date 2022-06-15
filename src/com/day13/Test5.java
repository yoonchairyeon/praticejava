package com.day13;

//2.내부 클래스(Local)

class Outer2{
	static int a =10;
	int b = 20;
	
	public void write() {
		
		int c = 30;			//-
		final int d = 40;	//- (1)
		
		class Inner2{				//-(3)
			public void print() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
			}
		}
		
		Inner2 ob = new Inner2(); //-(2)
		ob.print();				//-(4)
		//메소드 안에서만 실행 가능하다.
	}
}

public class Test5 {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.write();
		
	}

}
