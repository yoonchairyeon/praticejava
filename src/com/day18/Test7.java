package com.day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		//파일복사 
		//원본파일? /Users/yoonchairyeon/doc/test.txt
		//대상파일? /Users/yoonchairyeon/doc/out1.txt
		//복사완료!
		
		Scanner sc = new Scanner(System.in);
		
		String str1,str2;
		int data;
		
		try {
			System.out.print("복사할 파일? ");
			str1 = sc.next();
			
			System.out.print("대상 파일? ");
			str2 = sc.next();

			FileInputStream fis = new FileInputStream(str1);
			FileOutputStream fos = new FileOutputStream(str2);

			while((data=fis.read()) !=-1) {
				fos.write(data);
				fos.flush();
			}

			fos.close();
			fis.close();
			
			System.out.println("복사 완료!");
			} catch (Exception e) {
			System.out.println(e.toString());
			}
		
		
	}
}

/*try {
System.out.println("파일 복사!");
int data;
FileInputStream fis = new FileInputStream("/Users/yoonchairyeon/doc/test.txt");
FileOutputStream fos = new FileOutputStream("/Users/yoonchairyeon/doc/out1.txt");

while((data=fis.read()) !=-1) {
	fos.write(data);
	fos.flush();
}

System.out.println("복사 완료!");

fos.close();
fis.close();
} catch (Exception e) {
System.out.println(e.toString());
}*/