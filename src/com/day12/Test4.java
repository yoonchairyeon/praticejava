package com.day12;

class Test{
	protected int a = 10, b = 20;
	
	public void write() {
		System.out.println("부모 클래스 write()...");
		
		System.out.println("a: " + a+ ",b: " + b);
	}
}

class Demo extends Test{
	protected int b = 30, c = 40;
	
	@Override
	public void write() {
		
		System.out.println("자식 클래스 write()...");
		System.out.println("a: " + a+ ", b: " + b+ ", c: " + c); //내꺼는 내꺼! b=30
		System.out.println("super.b: " + super.b);
		System.out.println("------------------");
	}
	
	public void print1() {
		System.out.println("자식 클래스 print1()...");	
		write();
		
	}
	
	public void print2() {
		System.out.println("자식 클래스 print2()...");	
		write();
	}
}

public class Test4 {

	public static void main(String[] args) {
		Demo ob = new Demo();
		ob.write();
		ob.print1();
		ob.print2();
		
		System.out.println(ob.b); //30 내꺼는 내꺼!!
		// System.out.println(super.b); : 오류남! super은 인식이 안된다!
		System.out.println("------------------");
		
		System.out.println(((Test)ob).b); //부모 값 나옴! UPCAST!!!
		System.out.println("------------------");
		
		((Test)ob).write();
	}

}
