package com.min.edu;

public class UserDefindException extends Exception {

	private static final long serialVersionUID = -2934992277101747455L;

	public UserDefindException() {
//		super(); //-> Exception()
		this("사용자 예외처리 클래스");
	}

	public UserDefindException(String message) {
		super(message); //-> Exception(String) 
	}
 
	
	
	
	
	
}
