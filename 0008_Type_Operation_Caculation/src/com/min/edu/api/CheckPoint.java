package com.min.edu.api;

public class CheckPoint {

	public static void main(String[] args) {
		char test01 = '\u216C';
		System.out.println(test01);
		
		int n= Character.getNumericValue(test01);
		System.out.println(n);
		
		char lower_a = 'a';
		char upper_A = 'A';
		int lower_a_i = Character.getNumericValue(lower_a);
		int upper_A_i = Character.getNumericValue(upper_A);
		System.out.println(lower_a_i);
		System.out.println(upper_A_i);
		
		char etc = '&';
		int etc_conv = Character.getNumericValue(etc);
		System.out.println(etc_conv);
		
		char num = '8';
		int num_conv = Character.getNumericValue(num);
		System.out.println(num_conv);
		
		char zero = '0';
		char nine = '9';
		System.out.println((int)zero);
		System.out.println((int)nine);
		
		int m = UserDefineCharacter.getNumericValue('1');
		System.out.println(m);
		
	}
}
