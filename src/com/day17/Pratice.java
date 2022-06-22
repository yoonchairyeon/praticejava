package com.day17;

import java.util.Random;
import java.util.Scanner;

public class Pratice extends Thread{
	
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	
	private static String[] name = {"오세라","안수언","엄희성","김성현","윤다영",
			"김희진","이동우","최재혁","김홍수","서수현",
			"윤재일","정영진","박선미","전은지","류창주",
			"김수지","이은지","박수정","정성경","심민정",
			"윤채련","김영운","안시연","이정민","박수진",
			"윤서혜","정민정"};

	
	@Override
	public void run() {
		System.out.print("발표자 인원수? ");
		int num = sc.nextInt();
		
		System.out.print("고민중!");
			
		try {
				System.out.print("...");
				sleep(1000);
			
		} catch (Exception e) {
		}
			System.out.println("\n\n축하합니다! 발표자입니다.");
			System.out.println();
			
			int a=0;
			for(int i =0; i<num; i++) {
				System.out.print((i+1) + "번 발표자: ");
				a = rd.nextInt(name.length);
				if(name[i].equals(name[a])) {
					a--;	
					break;
				}
				System.out.print(name[a]+"\n");	
		}
		
		
		
	}
	
	public static void main(String[] args) {
		Pratice ob = new Pratice();
		
		ob.start(); 
		
		try {
			ob.join();
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
