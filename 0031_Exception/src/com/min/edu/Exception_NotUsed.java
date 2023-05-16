package com.min.edu;

import java.util.Scanner;

public class Exception_NotUsed {

	public int calculation() throws UserDefindException {
		int n=  0;
		try {
			Scanner scan = new Scanner(System.in);
			n= scan.nextInt();
		} catch (Exception e) {
//			throw new NullPointerException();
//			e.printStackTrace();
			throw new UserDefindException("값이 이상합니다");
		}
		return n;
	}
	
}
