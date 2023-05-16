package com.min.edu.api;

public class UserDefineCharacter {

	public static int getNumericValue(char c) {
		int result =0;
		// 문자형정수의 범위 
		// 
		if(c>=48 && c<=57) {
			result = c -48;
		}else {
			result = 777;
		}
		return result;
	}
	
}
