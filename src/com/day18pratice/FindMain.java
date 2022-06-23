package com.day18pratice;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class FindMain {

	public FindMain() {
		
	}
	
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		Find ob = new FindImpl();
		

		int ch;
		while(true) {
			do {
				System.out.print("1.입력 2.출력 3.종료 => ");
				ch = sc.nextInt();
			}while(ch<1);
			
			
			
			switch(ch) {
				case 1: ob.input(); 
				break;
				case 2: 
					ob.print();
					break;
				default:
					System.out.println("=========================");
					System.exit(0);
					
			}
			
			FileInputStream fis = new FileInputStream("/Users/yoonchairyeon/doc/hak1.txt");	
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			FindVO oob = null;
			
			try {
				while(true) {
					oob = (FindVO)ois.readObject();
					if(oob==null)
						break;
					System.out.println(oob.toString());
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			ois.close();
			fis.close();
			
		}
	}

}
