package com.day2;

public class Test2 {

public static void main(String[] args) {

//자료형: int(정수)

//num1 : 변수명, 

int num1 = 20; //변수 초기화

int num2 = 10;

int num3, num4; //쓰레기 값.

System.out.println(num1);

System.out.println(num2);

//System.out.println(num3); //컴파일 에러(쓰레기 값은 보여주지 않음)

//System.out.println(num4);

 

num3 = num1 + num2;

System.out.println(num3);

 

num4 = num1 - num2;

System.out.println(num4);

 

System.out.println(num1 + "+" + num2 + "=" + num3); 

System.out.println(num1 + "-" + num2 + "=" + num4); 

 

num1 = 200;

num2 = 100;

 

System.out.println(num1 + "+" + num2 + "=" + num3); 

System.out.println(num1 + "-" + num2 + "=" + num4); 

 

//f = format의 약자 ,printf에서만 %n(=\n) 사용 가능 

System.out.printf("%d + %d = %d %n", num1,num2,num3);

System.out.printf("%d + %d = %d \n", num1,num2,num4);

}

 

}