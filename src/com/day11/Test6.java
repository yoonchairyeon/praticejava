package com.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
			
		System.out.print("수식[3+5]?");// 123+56
		String str = br.readLine();
		
		str = str.replaceAll("\\s", ""); // i = i+1;
		
		//String[] op = {"+","-","*", "/"};
		//for(String o : op) {
		
		for(String op : new String[] {"+","-","*", "/"}){
			
			//123+56
			int pos = str.indexOf(op);

			if(pos > -1) {
				int num1 = Integer.parseInt(str.substring(0,pos)); //123
				int num2 = Integer.parseInt(str.substring(pos+1)); //56
				
				int result = 0;
				char oper = str.charAt(pos); //+
				
				
				switch(oper) {
				
				case '+':
					result = num1 + num2; break;
				case '-':
					result = num1 - num2; break;
				case '*':
					result = num1 * num2; break;
				case '/':
					result = num1 / num2; break;	
				}
				//System.out.printf("%d %c %d = %d", num1,oper,num2,result);
				String s = String.format("%d %c %d = %d", num1,oper,num2,result);
				// 이러한 모습을 가져서 s에 집어 넣어라 (String의 메소드)
				System.out.println(s);
			}
		}
		
		
	
	
	
	
	
	
	}

}
