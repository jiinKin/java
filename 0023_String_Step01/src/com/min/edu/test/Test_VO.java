package com.min.edu.test;

import java.util.Objects;

public class Test_VO {

	private String name ="kokoa";
	
	
	@Override
	public String toString() {
		return "입력된 멤버필드 : " + name;
	}


	@Override
	public int hashCode() {
		return Objects.hash(name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test_VO other = (Test_VO) obj;
		return Objects.equals(name, other.name);
	}
	
	
}
