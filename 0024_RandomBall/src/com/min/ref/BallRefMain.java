package com.min.ref;

public class BallRefMain {

	public static void main(String[] args) {
//		BallOne one = new BallOne();
//		System.out.println(one.getBall());
//		System.out.println(one);
		
		RandomBoxRef rbr = new RandomBoxRef();
//		System.out.println(rbr);
//		for (BallOne one : rbr.getBox()) {
//			System.out.println(one);
//		}
		rbr.inputBallOne();
		System.out.println(rbr);
		for (BallOne one : rbr.getBox()) {
			System.out.print(one.hashCode()+"\t");
		}
		
	}
}
