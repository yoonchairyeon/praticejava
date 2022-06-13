package com.day11;

//Wrapper class
//기본 자료형을 객체로 사용할 수 있게 해준다.
//자료형 : boolean,byte,char,short,int,long,float,double

//reference(class) 자료형 
//Boolean,Byte,Character,Short,Integer,Long,Float,Double

//Auto-Boxing: (stack에 있는 int 값이 heap영역으로 넘어가는 것)
//Auto-UnBoxing: (heap -> stack)

public class Test7 {

	public static void main(String[] args) {
		
		int a = 24;
		
		//Integer b = 24;

		System.out.println(a); //24
		System.out.println(Integer.toString(a)); 
		//24 (문자로 바꾼것이므로 연산이 불가능) +10 하면 그냥 2410 출력.
		System.out.println(Integer.toString(a,2)); //2진수로 변경!
		System.out.println(Integer.toString(a,16)); //16진수로 변경!!
		
		int n1 = 10;
		int n2;
		Integer num1;
		Integer num2 = new Integer(20);
		
		num1 = n1; //auto-boxing
		n2 = num2; //오토 언박싱
	
		System.out.println(n1 + " : " + +num1);
		System.out.println(n2 + " : " + +num2);
		
	}
}




/*
 int a = 10; 
 float b;
 
 b=a;			암시적 형변환(10.0)		--o
 b = (float)a;	명시적 형변환			--o
 큰 데이터를 넣기 위해서는 반드시 명시적 형변화 필수!
 
 a = b; 		에러 		  --x
 a = (int)b; 	명시적 형변환 --o
 -----------------------------
 B(부모) - A(자식)

 B = A; 		UPCAST	--o
 B = (B)A;		명시적 UPCAST	--o
 
 A = B; 		에러 			--x
 A = (A)B;		명시적 DOWNCAST	--o
 
 */




