package com.day18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test9 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("/Users/yoonchairyeon/doc/test.txt");
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(fis));

			String str;
			
			while((str=br.readLine())!= null) {
				System.out.println(str);
			}
			
			fis.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
