package com.day2;

 

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

 

public class Test5 {

 

public static void main(String[] args) throws IOException {

 

BufferedReader br = new BufferedReader(

new InputStreamReader(System.in));

 

String name;

int kor, eng, tot;


//입력 

System.out.print("이름은? "); //suzy

name = br.readLine();

//name이 문자라서 형변환 안해줘도 된다.

 

System.out.print("국어 점수는? ");//60

kor = Integer.parseInt(br.readLine());//kor은 int형이라서 형변환 해줌 

 

System.out.print("영어 점수는? ");//80

eng = Integer.parseInt(br.readLine());//eng은 int형이라서 형변환 해줌 

 

//연산 

tot = kor + eng;

 

//출력 

System.out.println("이름: " + name);

System.out.println("총점: " + tot);

 

}

 

}