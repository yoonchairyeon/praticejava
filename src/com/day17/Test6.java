package com.day17;

//스레드 생명주기 

class MyThread6 extends Thread{
	@Override
	public void run() {
		
		try {
			System.out.println("스레드 시작...");
			
			System.out.println("우선순위 : " + getPriority());
			System.out.println("스레드 이름 : " + getName());
			
			//0.5
			sleep(500);
			
			//우선순위 
			setPriority(2);
			System.out.println("변경된 우선운위: " + getPriority());
			
			System.out.println("스레드 종료...");
			
		} catch (Exception e) {
			e.printStackTrace();		}
		
	}
}


public class Test6 {

	public static void main(String[] args) {
		Thread t1 = Thread.currentThread(); //main
		Thread t2 = new MyThread6();
		
		System.out.println("메인 스레드 우선순위: " + t1.getPriority());
		System.out.println("메인 스레드 이름 : " + t1.getName());
		
		System.out.println("t2.start메소드 호줄전 isAlive: "); //false
		
		t2.start();
		
		
		//t2.우선순위 
		System.out.println("t2우선 순위 : " + t2.getPriority());
		
		t2.setPriority(1); //우선순위 1로 지정.
		
		try {
			Thread.sleep(100); //main 0.1초 쉰다.
			
			System.out.println("t2 살아있?" + t2.isAlive());
			
			Thread.sleep(1000);//main 1초 쉰다.
			System.out.println("1초 쉬고 t2 살아있?" + t2.isAlive());
			
			t2.join(); //데몬 스레드에서 사용함.
			System.out.println("t2 살아있?" + t2.isAlive());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		System.out.println("main finish");
	}

}
