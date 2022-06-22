package com.day18;

import java.io.IOException;
import java.io.OutputStream;

//out

public class Test2 {

	public static void main(String[] args) throws IOException{
		
		//io = input,output
		OutputStream os = System.out; //문자를 console창으로 내보냄!
		
		byte[] b = new byte[3]; //배열 3개 만든다.
		//buffer
		
		b[0] = 65;
		b[1] = 97;
		b[2] = 122;
		
		os.write(b);
		os.close(); //outputstream은 꼭 close 를 해줘야 한다.
		
		System.out.println("나 보이니?");
		
	}

}
