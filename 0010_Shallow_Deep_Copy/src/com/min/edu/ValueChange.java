package com.min.edu;

//TODO 001 전달받은 arguments 실제의 값을 기본타입과 참조타입을 받는 메소드
//         를 통해서 argument의 값을 변경해 봄 
public class ValueChange {

	
	/**
	 * 기본타입(pbv)은 값을 복제해준다. 따라서 메소드에서 전달받음 num을 변경해도 원본값은 유지한다
	 * @param num 기본타입
	 */
	public void changePrimivive(int num) {
		num += 100;
	}
	/**
	 * 참조타입(pbr)은 주소를 전달해 준다. 따라서 주소를 전달받은 어떠한 곳에서 원본의 값을 변경가능하다
	 * @param nums
	 */
	public void changeReference(int[] nums) {
		nums[0] = nums[0] +100;
	}
	
}
