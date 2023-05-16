package com.min.edu;

//TODO 001 약수의 합을 구하는 클래스
//    - 진약수 : 0과 자신의 숫자를 제외하고 나누어 떨어지는 수


// 약수확인 메소드에 의해서 약수라판단되면 누적하는 메소드
public class Yaksu {
	/**
	 * 입력받은 숫자 미만의 값과 판단하여  true라면 누적 하는 함수
	 * @param num
	 */
	public void yaksu_Sum(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) { //구하고자 하는 진약수의 범위 1234
			if(siCheck(num, i)) { // 약수이면  true
				sum +=i;
			}
		}
		System.out.println(sum);
	}
	
	
	/**
	 * 두개의 숫자를 입력받아 약수인지 확인하는 메소드
	 * @param num 약수 대상 
	 * @param chkNum 약수인지 판단되어지는 값
	 * @return 약수 true , 안약수 false
	 */
	public boolean siCheck(int num, int chkNum) {
		return (num%chkNum == 0)? true:false;
		
//		boolean isc = false;
//		if(num%chkNum ==0) {
//			isc =true;
//		}
//		return isc;
	} // isCheck
}




