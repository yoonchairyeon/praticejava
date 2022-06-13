package com.day11;

//Object : 모든 클래스의 최상위 부모!
class Test{ //extends Object 가 생략되어 있는 것.
	private int a = 10;
	
	public void write() {
		System.out.println("a: " + a);
	}
}



public class Test1 {

	public static void main(String[] args) {
		Test ob1 = new Test();
		Test ob2 = new Test();
		System.out.println("ob1 == ob2 : " + (ob1==ob2)); //false
		// "=="는 주소를 비교하는 것이므로 ob1과 ob2는 같지 않다.
		System.out.println("ob1.equals(ob2): " + ob1.equals(ob2));
		// equals는 주소를 비교하는 것.
		
		//Hash 코드[클래스이름@해쉬코드]
		System.out.println("ob1: " + ob1); //ob1의 주소 나타냄.
		//com.day11.Test@7e774085
		System.out.println("ob2: " + ob2); //ob1의 주소 나타냄.
		//com.day11.Test@3f8f9dd6
		System.out.println("ob1.toString[]: " + ob1.toString());
		//com.day11.Test@7e774085
		//toString 메소드 : 안에 들어있는 것의 자료형이 무엇이든 String형태의 문자로 출력.
		//Test의 부모가 object여서 toString 사용가능함.
	}

}
