package com.day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test8 {

	public boolean fileCopy(String str1, String str2) {
		
		File f = new File(str1);
		
		if(!f.exists()) {
			//file이 존재하지 않으면!
			return false;
		}
		
		
		try {
			
			FileInputStream fis = new FileInputStream(f);
			FileOutputStream fos = new FileOutputStream(str2);

			int data;
			byte[] buffer = new byte[1024];
			//1024만큼 buffer에다 넣기 

			
			while((data=fis.read(buffer,0,1024))!=-1) {
				fos.write(buffer,0,data);
			}
			fos.close();
			fis.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
			//실패시 false 출력 
			return false;
		}
		//성공시 true 출력 
		return true;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Test8 ob = new Test8();

		String str1,str2;
		
		System.out.print("원본 파일? ");
		str1 = sc.next();
		
		System.out.print("대상 파일? ");
		str2 = sc.next();
		
		if(ob.fileCopy(str1, str2)) {
			System.out.println("파일 복사 성공!");
		}else {
			System.out.println("파일 복사 실패!");
		}
	}

}
