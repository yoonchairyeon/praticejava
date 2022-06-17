package com.score4;

import java.io.IOException;
import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		Score ob = new ScoreImpl();
		
		int ch;
		while(true) {
			do {
				System.out.print("1.입력 2.출력 3.삭제 4.수정 "
						+ "5.학번검색 6.이름검색 7.종료 \n");
				System.out.print(": ");
				ch = sc.nextInt();
			}while(ch<1);
			
			switch(ch) {
				case 1: ob.input(); break;
				case 2: ob.print(); break;
				case 3: ob.delete(); break;
				case 4: ob.update();break;
				case 5: ob.findHak(); break;
				case 6: ob.findName(); break;
				default:
					System.out.println("학사정보 시스템을 종료합니다.");
					System.exit(0);
					
			}
		}
		
	}
}
