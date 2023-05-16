package com.min.pri;

import java.util.Arrays;

public class RandomBox {

	private int[] balls;

	public RandomBox(int n) {
		balls = new int[n];
		inputRandomNum();
	}

	public int[] getBalls() {
		return balls;
	}

	@Override
	public String toString() {
		return "RandomBox [balls=" + Arrays.toString(balls) + "]";
	}
	
	public void inputRandomNum() {
		int idx = 0;
		while (true) {
			int num = (int)(Math.random()*45)+1; 
			if(!checkNum(num)) {
				balls[idx++] = num;
			}
			if(idx == balls.length) {
				break;
			}
		}
	}
	
	private boolean checkNum(int num) {
		boolean isc = false;
		for (int i = 0; i < balls.length; i++) {
			if(balls[i] == num) {
				isc = true;
				break;
			}
		}
		return isc;
	}
	
	
	
	
}
