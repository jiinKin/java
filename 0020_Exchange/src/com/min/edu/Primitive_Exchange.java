package com.min.edu;

// TODO 001 기본타입은 java 프로그램에서 제공해주는 기본 값이다
public class Primitive_Exchange {
	 public static void main(String[] args) {
		// 정수형,		// 실수형,		// 문자형,		// 논리형
		//TODO 00101 기본타입의 형변환
		// 1) 값의 크기의 형변환
		// 2) 타입의 형변환
		// 용어 :  Promotion - 자동으로 값이 다른 형태로 변경되는 것
		//           Casting -  Casting연산자를 통해서 강제로 값의 손실을 감수하고 타입을 변경하는 것
		 
		 int a = 256; // byte, short <- int ->long
		 byte b= (byte)a; // Casting 연산자 이다
		 System.out.println("int 100이 변경된 byte 값 : " +  b);
		 
		 int max = Integer.MAX_VALUE;
		 long l = max+1L;
		 System.out.println("int 100이 변경된 long 값 : " +  l);
		 
		 double d1 = 3.14;
		 float f1 = (float)d1;
		 System.out.println("double은 float으로 크기의 형변환 일어날때  Casting연산자를 해줘야한다 :" + f1);
		 
		 // Promotion
		 // 같은 타입 일때는 작은->큰 크기로 자동으로 변경
		 int i1 = 100;
		 long l1 = i1; // promotion
		 
		 float f2 = 3.33F;
		 double d2 = f2; //promotion
		 
		 double d3 = 4.44; // 8
		 long l3 = (long)d3; // 8
		 int i = (int)d3; // 4
		 
		 int soultion = (int)(long)d3;
		 
		 double d5 = 1.01;
		 float f5 = 1.01F;
		 
		 // 실수부를 버려야 하기 때문에 반드시 casting 연산자를 사용해야 한다
//		 long l5 = d5;
//		 int i5 = d5;
//		 byte b5 = d5;
		 
		 byte b6 = 127;
		 int i6 = 1000;
		 long l6 = 2000; // 8
		 
		 float f6 = b6; // byte 1
		 f6 = i6; // int 4
		 // long 의 크기가 정수에서는 8byte이지만 float의 4byte로 형태가 변경될시 promotion으로 동작 된다
		 f6 = l6; // long 8
		 
		 
		 // char 3가지의 리터럴을 가진다 : 'A' , int (code point, index), /u000
		 char c1 = 'A';
		 char c2 = 65; // 리터럴의 정수 값을 넣어 줌
		 char c3 = '\u0401';
		 
		 int i3 = 65;
		 char c4 = (char)i3; // 변수에 담겨 있는 정수값을 반드시 casting 연산자를 통해서 char로 변경해 줘야 한다
		 
		 int i4 = c4; // char는 가질 수 있는 정수값을 가짐 
		 byte i5 = (byte)c4; // char는 가질 수 있는 정수값을 int의 크기로 가지고 있다
		 							 // 'A' - promotion > int 65 -casting> byte 65
		 
		 
		 
		 
	}
}




