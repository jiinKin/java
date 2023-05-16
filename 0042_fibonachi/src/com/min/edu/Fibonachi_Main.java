package com.min.edu;

public class Fibonachi_Main {

	public static void main(String[] args) {
//		System.out.println("피보나치의 수열 층 값 : " + fibonachi(5));
		System.out.println("피보나치의 수열 층 값 : " + fibonachi_iterator(5));
		
		System.out.printf("%s 입니다" , "수업");
		String resut =  String.format("%s 입니다", "수업");
		System.out.println(resut);
	}
	
	public static int fibonachi(int num) {
		if(num ==1) {
			return 1;
		} else if(num ==2) {
			return 1;
		}else {
			return fibonachi(num-1) +  fibonachi(num-2);
		}
	}
	
	public static int fibonachi_iterator(int num) {
		int a =1;
		int b =1;
		int result = 0;
		if(num ==1) {
			return a;
		} else if(num ==2) {
			return b;
		}else {
			for (int i = 2; i < num; i++) {
				result =a+b;
				b = a;
				b= result;
			}
		}
	return result;
	}

}
