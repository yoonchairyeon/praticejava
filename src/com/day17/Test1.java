package com.day17;

//스레드(Thread)
//java.lang 패키지의 Thread 클래스를 사용하는 방법
class MyThread1 extends Thread{

	private int num;
	private String name;
	
	public MyThread1(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	
	@Override
	public void run() {
		int i = 0;
		while(i<num) {
			System.out.println(this.getName() + " : " + name + i);
			
			i++;
			
			try {
				sleep(300); //1000:1초!
			}catch(Exception e) {
				
			}
		}
		
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		//작업을 하나 쓰게되면 하나의 스레드 
		
		System.out.println("main 시작...");
		
		MyThread1 t1 = new MyThread1(100, "첫번째: ");
		MyThread1 t2 = new MyThread1(200, "두번째: ");
		
		
		t1.start(); //run()메소드 자동으로 실행 (VM이)
		t2.start();
		
		System.out.println("main 종료...");
	}

}
