package com.min.edu;

import java.util.Arrays;

public class Argument_Test {

	public static void main(String[] args) {
		ValueChange vc = new ValueChange();
		int num = 100;
		int[] nums = new int[2];
		
		System.out.println("원본 기본타입값 : " + num);
		vc.changePrimivive(num);
		System.out.println("메소드 실행후 기본타입값 : " + num);
		
		System.out.println("원본 참조타입값: "+ Arrays.toString(nums));
		vc.changeReference(nums);
		System.out.println("메소드 실행후 참조타입값: "+ Arrays.toString(nums));
		
		
		
	}

}
