package com.min.edu;

//TODO 001 String  문자열 합치기
public class String_Concatenation {

	  public static void main(String[] args) {
		// 문자열과 연산자(+)와 만나면 보이는 그대로 문자열로 생성된다
		String str = "kor";
		int a = 2;
		char c = 'A';
		String result1 = str+2+'A';
		System.out.println(result1);
		
		String result2 = str+(a+c);
		System.out.println(result2);
		
		String result3 = c+a+str;
		System.out.println(result3);
		
		String result4 = c + str + a;
		System.out.println(result4);
	}
}





