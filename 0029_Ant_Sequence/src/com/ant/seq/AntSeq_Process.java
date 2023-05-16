package com.ant.seq;

/**
 * 게미수열의 연산 클래스
 * 11 -> 12
 */
public class AntSeq_Process {

	public void ant_Iterator(int stage) { // 11
		String val = "11";
		System.out.println(val);
		for (int i = 0; i < stage; i++) {
			val = process(val);
			System.out.println(val);
		}
	}
	
	
	/**
	 * @param x 처음 시작하는 게미수열의 값 문자열 "11"
	 */
	public String process(String x) {
		String result = "";
		int count = 1; // 자신의 갯수 1개는 기본으로 가지고 있음
		char initValue = x.charAt(0);// 비교할 대상 첫번째 초기값
		
		for (int i = 1; i < x.length(); i++) {
			if(initValue == x.charAt(i)) {
				count++;
			}// if
			else {
				result = result + initValue + count;
				initValue = x.charAt(i);
				count = 1;
			}
		}//for
		result = result + initValue + count;
//		System.out.println("다음층의 수열값 : " + result);
		return result;
	}
	
}




