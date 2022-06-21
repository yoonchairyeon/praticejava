package com.day17;

//인터럽트 : 우선순위가 높은 프로그램을 먼저 실행 시키고
//다시 돌아옴. 

class MyThread7 extends Thread{
	
	private Thread next;
	public void setNext(Thread next) {
		this.next = next;
	}
	
	@Override
	public void run() {
		for(int i = 1; i<=20; i++) {
			try {
				sleep(2000);
			} catch (Exception e) {
				
			}
			System.out.println(getName() + " : " + i);
			if(next.isAlive()) {
				next.interrupt();
			}
		}
	}
	
}

public class Test7 {

	public static void main(String[] args) {
		MyThread7 t1 = new MyThread7();
		MyThread7 t2 = new MyThread7();
		MyThread7 t3 = new MyThread7();
		
		
		t1.setNext(t2); //interrupt t1실행하고 t2
		t2.setNext(t3); //interrupt t2실행하고 t3
		t3.setNext(t1); //interrupt t3실행하고 t1
		
		 t1.start();
		 t2.start();
		 t3.start();
		
		 t1.interrupt();
		 
		 
		 try {
			t1.join();
			t2.join();
			t3.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("main finish");
	}

}
