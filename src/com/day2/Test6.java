package com.day2;

 

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

 

public class Test6 {

 

public static void main(String[] args) throws IOException {

//밑변(w)과 높이(h)를 입력받아 삼각형의 넓이(a) 구하기 

//밑변? 23.5

//높이? 34.7

//넓이 : xxx.xx

//넓이 구하는 공식 = (밑변 * 높이) / 2

 

BufferedReader br = new BufferedReader(

new InputStreamReader(System.in));

 

float w,h,a;

 

System.out.print("밑변은? "); //23.5

w = Float.parseFloat(br.readLine());

 

System.out.print("높이는? "); //34.7

h = Float.parseFloat(br.readLine());

 

a = (w * h) / 2;

 

System.out.printf("넓이 : %.2f", a);

 

}

 

}