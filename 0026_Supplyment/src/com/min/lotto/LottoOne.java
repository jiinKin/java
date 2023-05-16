package com.min.lotto;

import java.util.Objects;

/**
 * 로또 숫자 하는 생성하는 클래스
 * 숫자 1 -> 문자 "01"
 */
public class LottoOne {
	private String num;

	// 생성자를 통해서 객체가 생성될때 하나의 숫자가 입력되어 있는 객체를 만들어 줌
	public LottoOne() {
		this.num = makeNum();
	}
	
	private String makeNum() {
		String s = "";
		s += ((int)(Math.random()*45)+1);
		return (s.length()==2)?s:"0"+s;
	}

	@Override
	public String toString() {
		return "*" + num + "*";
	}

	@Override
	public int hashCode() {
		return num.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LottoOne other = (LottoOne) obj;
		return Objects.equals(num, other.num);
	}
	
	
}






