package com.naver;

import java.util.Scanner;

public class NaverImpl implements Naver{

	Scanner sc = new Scanner(System.in);
	String str ;
	
	@Override
	public void input() throws Exception {
		int eng = 0, num = 0;
	
		login log = new login();
		do {
			try{
				System.out.print("아이디? ");
				log.setId(sc.next());
				
				for(int i=0; i<log.getId().length(); i++) {
					char ch = log.getId().charAt(i);
					if((ch >= 'A' && ch<='Z') || (ch >='a' && ch<='z')) {
						eng++;
					}else if(ch >= '0' && ch <='9') {
						num++;
					}
				}
				if(eng==0 || num ==0) {
					throw new Exception("영문자와 숫자를 혼용해야합니다.");
				}
				if(log.getId().length() < 8 || log.getId().length() > 15) {
					throw new Exception("문자열의 길이는 8~15자입니다. ");		
			}
			}catch(Exception e) {
				System.out.println(e.toString());	
			}
		}while((eng !=0 || num !=0) && (log.getId().length() < 8 || log.getId().length() > 15));

			
			System.out.print("비밀번호? ");
			log.setPw1(sc.next());
			
			do {
				System.out.print("비밀번호 재확인? ");
				log.setPw2(sc.next());
			}while(!log.getPw1().equals(log.getPw2()));
			
			do {
				System.out.print("이름? ");
				log.setName(sc.next());
				if(log.getName().equals(log)) {
					log.getName().trim();
				}
			}while(log.getName().length() < 0);
			
			
			System.out.print("성별? ");
			log.setGender(sc.next());
			
			System.out.print("e-mail주소? ");
			log.setEmail(sc.next());
			
			System.out.print("생일? ");
			log.setBirth(sc.nextInt());
			
			System.out.print("전화번호? ");
			log.setTel(sc.nextInt());
	}
	
	@Override
	public void print() {
		
	}

	@Override
	public void findId() {
		login log = new login();
		System.out.print("검색할 아이디는? ");
		String Id = sc.next();
		 if(Id.equals(log.getId())) {
	         System.out.println("검색 실패");
		 }
		System.out.println();	
	}
}
