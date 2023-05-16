package com.min.ref;

import java.util.Arrays;

public class RandomBoxRef {

	private BallOne[] box;
	
	public RandomBoxRef() {
		box = new BallOne[6];
	}

	public BallOne[] getBox() {
		return box;
	}
	
	public void inputBallOne() {
		int idx = 0;
		while (true) {
			BallOne one = new BallOne();
//			if(!checkBox(one)) {
				box[idx++] = one;
//			}
			if(idx == box.length) {
				break;
			}
		}
	} //inputBallOne
	
	private boolean checkBox(BallOne o) {
		boolean isc = false;
		for (int i = 0; i < box.length; i++) {
			if(box[i] != null && box[i].equals(o)) {
				isc = true;
				break;
			}
		}
		return isc;
	}

	@Override
	public String toString() {
		return "RandomBoxRef [box=" + Arrays.toString(box) + "]";
	}
	
	
	
}




