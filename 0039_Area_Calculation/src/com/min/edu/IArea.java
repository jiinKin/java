package com.min.edu;
/**
 *  면적계산을 위한 구성 메소드 및 필요 상수 선언 클래스
 */
public interface IArea {

	/**
	 * 원관련 면적 계산에 필요한 상수 
	 */
	public float PI= (float) 3.14;
	
	/**
	 * 면적 계산을 위한 메소드
	 * @param x 가로, 반지름
	 * @param y 세로, 반지름
	 */
	public void cal();
	/**
	 * 각 자식 클래스에서 계산된 결과를 출력하는 메소드
	 */
	public void print();
	
}
