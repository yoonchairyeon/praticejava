package com.day13;

//4. 내부 클래스 (무명의, 익명의, Annoymous 클래스)

public class Test7 {

	public Object getTitle(){ //Object 근처에 있으면 UPCAST
		
		//String str = "무명의 클래스 ";
		
		return new Object() {
		
			@Override
			public String toString() {
				return "무명의 클래스";
			}
		};
	}
	
	public static void main(String[] args) {
		
		Test7 ob = new Test7();
		System.out.println(ob.getTitle());
	}

}
