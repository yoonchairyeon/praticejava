package com.day17;

import java.util.Random;
import java.util.Scanner;

public class Pratice extends Thread{

	private static String[] name = {"오세라","안수언","엄희성","김성현","윤다영",
			"김희진","이동우","최재혁","김홍수","서수현",
			"윤재일","정영진","박선미","전은지","류창주",
			"김수지","이은지","박수정","정성경","심민정",
			"윤채련","김영운","안시연","이정민","박수진",
			"윤서혜","정민정"};

	private Thread next;
	public void setNext(Thread next) {
		this.next = next;
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int i = 0;
		System.out.print("발표자 인원수? ");
		int num = sc.nextInt();
		System.out.print("고민중!");
		try {
			System.out.print("...");
			sleep(1000);
		} catch (Exception e) {
		}
		if(next.isAlive()) {
			
			next.interrupt();
		}
		System.out.println("\n\n축하합니다! 발표자입니다.");
		System.out.println();
		int a=0;
		for(i =0; i<num; i++) {
			System.out.print((i+1) + "번 발표자: ");
			a = rd.nextInt(name.length);
			if(name[num].equals(name[a])) {
				num--;	
				break;
			}
			System.out.print(name[a]+"\n");	
		}
	}
	
	public static void main(String[] args) {
		Pratice ob = new Pratice();
		Pratice ob1 = new Pratice();
		ob.setNext(ob1);
		ob1.setNext(ob);
		
		ob.start(); 

		try {
			ob.join();
			ob1.join();
		}catch(Exception e) {
			
		}
	}

}
