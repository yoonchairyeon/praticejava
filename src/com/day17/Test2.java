package com.day17;

//java.lang 패키지의 Runnable 인터페이스를 사용하는 방법   
class MyThread2 implements Runnable{
	private int num;
	private String name;
	
	public MyThread2(int num,String name) {
		this.num = num;
		this.name = name;
	}

	@Override
	public void run() {
		int i = 0;
		while(i<num) {
			System.out.println(name + i);
			//runnable 은 getname()메소드가 존재하지 않는다.
			i++;
			
			try {
				Thread.sleep(100); 
				//runnable 사용시 Thread. 으로 사용하기
			}catch(Exception e) {
				
			}
		}
	}
}

public class Test2  {

	public static void main(String[] args) {
		System.out.println("main 시작...");
		
		Thread t1 = new Thread(new MyThread2(100, "1번째: "));		
		Thread t2 = new Thread(new MyThread2(200, "2번째: "));		
		
		t1.start(); 
		t2.start();
		
		System.out.println("main 종료...");
	}

}
