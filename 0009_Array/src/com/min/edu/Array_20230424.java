package com.min.edu;

import java.util.Arrays;
import java.util.Iterator;

public class Array_20230424 {

	public static void main(String[] args) {
		String[] strs = new String[3];
		/*
		 * array => length
		 * 문자열(String) => *.length();
		 * JCF(Map, Set, List) => *.size();
		 */
		System.out.println("Array의 길이 :"+ strs.length);
		
		/*
		 * 길이는 1부터 시작, index는 0부터 시작
		 * index의 범위를 벗어난 값(index)을 입력하면 예외를 발생
		 * ArrayIndexOutOfBounsException 
		 */
		strs[1] ="월요일";
//		strs[0] = 1;
		for (int i = 0; i < strs.length; ++i) {
			System.out.printf("index: %d / 값: %s \n",i,strs[i]);
		}
		
		Object[] objs = new Object[3];
		objs[0] = 1;
		objs[1] = "2";
		objs[2] = 1.3;
		
		for (Object o : objs) {
			System.out.println(o);
		}
		
		// n차원 Array 
		                  // 0,1  
		int[][] nArray = {
							{1,2}, //0
							{3,4}, //1
							{5,6}  //2
						 };
		
		
		// Array 존재하지 않는 타입 = 클래스가 없음
		// 클래스 = 멤버 = 멈버필드 + 멤버메소드
		// java.util.Arrays
		// 클래스가 없기 때문에 Array를 처리 할 수 있는 기능만을 가지고 있는 클래스
		
		Arrays.fill(strs, "값"); // pass by reference
		
		String print =  Arrays.toString(strs);
		System.out.println(print);
		
		strs[1]="하이";
		Arrays.sort(strs);
		String print1 =  Arrays.toString(strs);
		System.out.println(print1);
		
		
		
	}// method 끝
	
	
	
}





