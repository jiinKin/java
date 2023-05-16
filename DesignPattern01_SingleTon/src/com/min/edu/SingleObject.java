package com.min.edu;

/**
 * heap에 객체가 단 1회만 생성되도록 만들어진 클래스
 */
public class SingleObject {
	
	private static SingleObject single;
	private SingleObject() {
	}
	
	public static SingleObject getInstance() {
		if(single == null) {
			single = new SingleObject();
		}
		return single;
	}

}
