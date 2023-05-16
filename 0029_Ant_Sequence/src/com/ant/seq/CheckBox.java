package com.ant.seq;

import java.util.Objects;

public class CheckBox {

	public String str ;
	
	public CheckBox() {
		String b = String.valueOf((int)(Math.random()*45)+1); 
		str = (b.length()==2)?b:"0"+b;
	}

	@Override
	public int hashCode() {
		return Objects.hash(str);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CheckBox other = (CheckBox) obj;
		return Objects.equals(str, other.str);
	}

	@Override
	public String toString() {
		return "CheckBox [str=" + str + "]";
	}
	
	
	
	
}
