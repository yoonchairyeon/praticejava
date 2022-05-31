package com.day2;

 

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

 

public class Test4 {

 

public static void main(String[] args) throws IOException {

//NumberFormatException : 숫자로 바꾸려다 생기는 오류 해결  

 

BufferedReader br = new BufferedReader(

new InputStreamReader(System.in));

 

//System.in : 키보드로 입력한 1byte문자를 입력 받음 

//InputStreamReader : System.in으로 받은 문자를 2byte로 변경

//BufferedReader : 2byte로 변경된 문자를 저

 

int r;

double area, length;

 

// https://docs.oracle.com/javase/6/docs/api/

//Java.lang에 들어가보면 많이 사용하는 클래스들을 볼 수 있다. (System도 그 중 하나)

System.out.print("반지름? "); //20

 

//parseInt : Int로 바꿔줌 

r = Integer.parseInt(br.readLine());

//readLine은 문자로 읽음 + readLine에 필수적으로 IOException이 있어야 함 

//r=Double.parseDouble(br.readLine()); 문자(readLine)를 double로 바꾸는 

 

area = r*r*3.14;

length = r*2*3.14;

System.out.println("반지름: " + r);

System.out.println("넓이: " + area);

System.out.println("둘레: " + length);

}

 

}