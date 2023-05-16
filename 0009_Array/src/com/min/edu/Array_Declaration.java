package com.min.edu;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 자바의 타입 
 * 기본타입(primitive) 프로그램 기본을 제공되어 stack에서 사용되어 지는것
 * 참조타입(reference) Class로 되어있고 Heap생성되어 주소와 hashcode를 가지고 있음 
 * java.lang => 자동으로 값이 기본타입<->참조타입 변경이 된다 AutoBoxing AutoUnBoxing
 * java.lang.String : 문자열은 문자형이 조합되어 있는 형태 => 참조타입
 * 
 * Class는 없지는 객체 [](Array)
 */
public class Array_Declaration {

	public static void main(String[] args) {
//		Object obj = new Scanner(System.in);
		//TODO 001 Array의 선언방법
		int[] x;
		
		// new를 통해서 객체를 생성하면서 값을 입력함
		int[] arr1 = new int[] {1,2,3};
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		// 값을 입력하여 객체를 생성
		int[] arr2 = {1,2,3};
		
		// 객체의 공간만을 생성하는데, 생성하는 타입의 default value로 초기값이 생성됨
		int[] arr3 = new int[3];
		
		//TODO 002 입력 출력
		// array는 객체이기 때문에 변수의 값은 객체를 찾아가는 주소로 되어있음
		// [int index]를 사용하여 해당 인덱의 값을 출력 혹은 입력
		arr3[1] = 100;
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		
		System.out.println(arr3.length);
		
//		arr3[3] =100;
		System.out.println(arr3[4]);
	}
}




