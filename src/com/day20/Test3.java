package com.day20;

	import java.net.InetAddress;
import java.util.Scanner;
	
	//Network
	
	public class Test3 {
	
		public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			
			String host;
			
			System.out.print("호스트[www.naver.com]");
			//www부분이 호스트 naver.com = 도메인 
			host = sc.next();
			
			try {
				InetAddress ia = InetAddress.getByName(host);
				System.out.println("ip주소: " + ia.getHostAddress());
				System.out.println("호스트: " + ia.getHostName());
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
