package com.day18;

import java.io.File;
import java.io.FileOutputStream;

public class Test12 {

	public static void main(String[] args) {
		
		String str1 = "/Users/yoonchairyeon/doc/temp/test1.txt";
		
		//방법1
		/*
		String path = str1.substring(0, str1.lastIndexOf("/"));
		System.out.println(path);
		
		File f = new File(path);
		
		if(!f.exists()) {
			f.mkdirs();
		}
		*/
		
		//방법2
		
		File f= new File(str1);
		if(!f.getParentFile().exists()) {
			f.getParentFile().mkdirs();
		}
		
		
		try {
			FileOutputStream fos = new FileOutputStream(str1);
			
			System.out.println("문자열?");
			
			int data;
			
			while((data=System.in.read())!=-1) {
				fos.write(data);
				fos.flush();
			}
			
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
