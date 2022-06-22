package com.day18;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Test10 {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("/Users/yoonchairyeon/doc/out3.txt");
			PrintStream ps = new PrintStream(fos);
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			
			String str;
			
			while((str = br.readLine())!= null) {
				ps.println(str);
			}
			
			ps.close();
			fos.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
