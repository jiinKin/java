package com.min.edu.bmi;

/**
 * bmi를 계산하는 메소드가 있는 클래스
 * @author GDJ
 */
public class BmiClass {

	
	// bmi_caculation 메소드명
	// 실수(double)로 반환
	// 입력 정수(몸무게), 실수(키) ex> 70, 1.7
	// 몸무게/(키*키) 연산 공식
	
	public double bmi_caculation(int w, double h) {
		double d = 0.0;
	
		d = w/(h*h);
		
		return d;
	}
	
	
}




