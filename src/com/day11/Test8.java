package com.day11;

import java.util.Scanner;

class Sum{
	
	protected int num1, num2, result;
	protected String oper;
	
	public void write() {
		System.out.printf("%d %s %d = %d",num1,oper,num2,result );
	}
}

class Calc extends Sum {
	/*
	String str;
	*/
	public void input(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두개의 수?? ");
		String su = sc.next();
		
		String[] s = su.split(",");
		num1 = Integer.parseInt(s[0]);
		num2 = Integer.parseInt(s[1]);
		
		System.out.println("연산자?");
		oper = sc.next();
		/*str = sc.next();
		str = str.replaceAll("\\s", ""); */
	}
	
	public void calc() {
		if(oper.equals("+")) {
			result = num1 + num2;
		}
		else if(oper.equals("-")) {
			result = num1 - num2;
		}
		else if(oper.equals("*")) {
			result = num1 * num2;
		}
		else if(oper.equals("/")) {
			result = num1 / num2;
		}
	}
	
	/*
	public void Result() {
		String op[] = {"+","-","*","/"};
		for(String o : op) {
			
		int pos = str.indexOf(o);
			if(pos > -1) {
				num1 = Integer.parseInt(str.substring(0,pos));
				num2 = Integer.parseInt(str.substring(pos+1));
			
				oper = str.substring(pos,pos+1);
			
			switch(oper) {
				case "+":
					result = num1 + num2; break;
				case "-":
					result = num1 - num2; break;
				case "*":
					result = num1 * num2; break;
				case "/":
					result = num1 / num2; break;	
				}
		}
		}
			
	}*/
}


public class Test8 {

	public static void main(String[] args) {
		Calc c = new Calc();
		c.input();
		c.calc();
		//c.Result();
		c.write();		
	}
}
