package com.day18;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Test4 {

	public static void main(String[] args) throws Exception {

		int data;
		System.out.print("문자열 입력!");
		
		Reader rd = new InputStreamReader(System.in);
		
		Writer wr = new OutputStreamWriter(System.out);
		
		while((data=rd.read()) != -1) {
			wr.write(data);
			wr.flush();
			//강제로 배출하는 것 
		}
		
	}

}
