package com.day11;

//StringBuffer : 동기화 작업을 지원한다.(속도가 느림)
//StringBuilder : 동기화 작업을 지원하지 않는다.(속도가 빠름)

public class Test3 {

	public void stringTime() {
		
		System.out.println("String...");
		
		//long start = System.currentTimeMillis();
		long start = System.nanoTime();
		
		String str = "A";
		for(int i=1; i<50000; i++) {
			str += "A";
			// 출력하면 (A\nAA\nAAA\nAAAA\n...)
		}
		long end = System.nanoTime();
		System.out.println("실행시간: " + (end - start) + "ms");
	}
	
public void stringBufferTime() {
		
		System.out.println("StringBuffer...");
		
		//long start = System.currentTimeMillis();
		long start = System.nanoTime();
		
		StringBuffer str = new StringBuffer("A"); //class
		for(int i=1; i<50000; i++) {
			str.append("A");
			//누적하는것. (AAAAAAAAAAAA....)
		}
		long end = System.nanoTime();
		System.out.println("실행시간: " + (end - start) + "ms");
	}

public void stringBuilderTime() {
	
	System.out.println("StringBuilder...");
	
	//long start = System.currentTimeMillis();
	long start = System.nanoTime();
	
	StringBuilder str = new StringBuilder("A"); //class
	for(int i=1; i<50000; i++) {
		str.append("A");
		//누적하는것. (AAAAAAAAAAAA....)
	}
	long end = System.nanoTime();
	System.out.println("실행시간: " + (end - start) + "ms");
}
	
	public static void main(String[] args) {
		Test3 ob = new Test3();
		ob.stringTime();
		ob.stringBufferTime();
		//stringBufferTime이 stringTime보다 빠르다.
		ob.stringBuilderTime();
		//stringBuilderTime이 제일 빠르다.
	}

}
