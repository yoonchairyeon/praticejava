package com.day18;

import java.io.FileInputStream;

//파일 입출력 
//FileInputStream
//<-> FileOutputStream

public class Test5 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("/Users/yoonchairyeon/doc/test.txt");
			//파일 내용을 읽어옴 
			
			int data;
			while((data=fis.read()) !=-1) {
				System.out.write(data);
				System.out.flush();
			}			
		} catch (Exception e) {
			// TODO: handle exception
		}		
	}
}
