package com.min.edu.copy;

import java.util.Arrays;

public class Shallow_Deep_Copy {

	public void shallow() {
		// pass by reference 참조타입 특징
		// 값의 복제하는 것이 아닌 같은 객체를  사용할 수 있도록 주소를 전달
		// 주소를 전달한다는 것의 의미는? 같은 객체를 바라보고 있다
		
		// == 비교연산자
		// 기본타입을 비교연산하면 값을 비교
		// 참조타입은 비교현산하면 객체의 메모리 주소를 비교
		
		// 기본타입 변수의 특징
		// 한번값이 입력되면 다시 입력하기 전까지는 기존 값을 유지 합니다
		int i1 = 10;
		int i2 = 20;  
		i2=10;
		System.out.println(i1==i2);
		
		int[] arr1 = {1,2,3}; // 새로운생성 => heap  주소/hashcode
		int[] arr2 = {1,2,3}; // 새로운생성 => heap  주소/hashcode
		int[] arrC = arr1; // shallow copy : 주소를 전달
		
		System.out.println(arr1 == arr2);
		System.out.println(arr1 == arrC); // arr1과 aarC 주소가 같다 = 같은 객체이다
		
		System.out.println("원본:"+Arrays.toString(arr1));
		System.out.println("복사:"+Arrays.toString(arrC));
		arrC[2] =100;
		System.out.println("원본:"+Arrays.toString(arr1));
		System.out.println("복사:"+Arrays.toString(arrC));
	}
	
	//TODO 002 java Array의 복사방법
	// java의  array는 크기를 늘리거나 줄이는 것이 불가능함
	// 1) stack 을 이용하는 방법
	// 2) heap을 이용하는 방법
	// 3) 메모리를 사용하는 방법
	public void deep() {
		String[] strs = {"d","r","e","a","m"};
		//1)
		String[] strs_C1 = new String[strs.length]; // 5
		for (int i = 0; i < strs_C1.length; i++) {
			strs_C1[i] = strs[i];
		}
		
		//2)
		String[] strs_c2 = strs.clone();
		
		//3)
		System.out.println();
		String[] strs_c3 = new String[5];// 0 1 2 3 4 
		System.arraycopy(strs,0,strs_c3,1,2);
		
		
		strs[0] = "K";
		System.out.println("원본:"+Arrays.toString(strs));
		System.out.println("stack 복사:"+Arrays.toString(strs_C1));
		System.out.println("heap 복사:"+Arrays.toString(strs_c2));
		System.out.println("System 복사:"+Arrays.toString(strs_c3));
		
		
	}
	
}






