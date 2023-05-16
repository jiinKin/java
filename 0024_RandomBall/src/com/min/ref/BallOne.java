package com.min.ref;

import java.util.Objects;

/**
 * 렌덤숫자 하나를 생성하는 클래스
 */
public class BallOne {

	private int ball;
	
	public BallOne() {
		ball = (int)(Math.random()*45) +1;
	}

	public int getBall() {
		return ball;
	}

	@Override
	public String toString() {
		return "[" + ball + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ball);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BallOne other = (BallOne) obj;
		return ball == other.ball;
	}
	
	
	
	
}






