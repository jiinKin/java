package com.min.edu;

public class Assignment_Operation {

	public void assigment() {
		//일반적인 대입연산
		int i = 0;
		//단축연산
		//변수에 대해 연산을 수행한 다음 결과를 동일 변수에 다시 저장
		i+=5;  //i = i+5;
		//i=+5; // => i = (+5);  //연산이 처리 됩니다
		
		i -= 5; // i = i-5;
		i /= 5; // i = i/5;
		i *= 5; // i = i*5
		
		 System.out.println(i);
	}
	
	// 증감연산자
	// 선처리 후증가, 선증가 후처리
	public void in_decrement() {
		// 변수를 1씩만 증가 ++
		// 변수를 1씩만 감소 --
		
		// 변수 뒤에 ++ : 선처리 후증가
		// 변수 앞에 ++ : 선증가 후처리
//		y =y+1;
//		y +=1;
		
		int y = 100; // 101 ->100 -> 101 ->100 ->101 ->102 ->101
		
		System.out.println(++y); // 101
		System.out.println(--y); // 100
		System.out.println(++y); // 101 
		System.out.println(--y); // 100
		System.out.println(y++); // 100 -> 101
		System.out.println(y++); // 101 -> 102
		System.out.println(y--); // 102 ->101
		System.out.println(y); //101
		
//		int m, n, x=10, z;
		
		int m, n;
		m=5;
		n=m++;
		System.out.println(m+"/"+n);
		m=5;
		n = ++m;
		System.out.println(m+"/"+n);
		
	}
	
}





