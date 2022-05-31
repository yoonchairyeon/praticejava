package com.day2;

 

public class Test3 {

 

public static void main(String[] args) {

int r = 10;

// float : 실수(소수점 있는 숫자들만 입력 가능)

float area, length;

 

area = 10;

System.out.println(area);

 

// 20.0 실수를 정수로 변환

// r = (int)20.0; //형 변환

// System.out.println(r);

// 자바는 실수가 나오면 무조건 double로 인식

// 3.14f안쓰는 방법은 double area로 변경

 

area = r * r * 3.14f;

length = r * 2 * 3.14f;

 

// %d = 정수형(int), %f = 실수형(float)

System.out.printf("반지름 : %d, 넓이 : %f\n", r, area);

System.out.printf("반지름 : %d, 넓이 : %.2f\n", r, area);

// %.3f= 소수점 아래 3자리, %.2f = 소수점 아래 2자리

System.out.println("반지름: " + r + ", 둘레:" + length);

 

}

 

}