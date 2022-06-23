package com.day18;

import java.io.File;
import java.io.IOException;
import java.util.Date;

//File
//파일 및 폴더를 관리할 수 있는 기능을 제공하는 클래스 
//파일 내용을 입출력하기위한 메소드는 없다 

public class Test11 {

	public static void main(String[] args) throws IOException {
		File f = new File("/Users/yoonchairyeon/doc/test.txt");
		
		System.out.println("파일명: " + f.getName());
		System.out.println("파일 사이즈: " + f.length());
		System.out.println("파일경로 : " + f.getAbsolutePath());
		System.out.println("표준경로 : " + f.getCanonicalPath());
		System.out.println("만든날: " + new Date(f.lastModified()));
		System.out.println("폴더의 경로: " + f.getParent());
		System.out.println("읽기 속성: " + f.canRead());
		System.out.println("쓰기 속성: " + f.canWrite());
	}

}
