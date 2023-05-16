package com.min.edu.gd67;

public class UserDefineClass {
	
	private String name ="Dior";
	private int age = 100;
	
	@Override
	public int hashCode() {
		return (name.hashCode() + 127 + age +31);
	}
	@Override
	public boolean equals(Object obj) { //Object  타입을 자식객체를 up-casting 
		boolean isc= false;
		UserDefineClass other = (UserDefineClass)obj;
		if(name.equals(other.name) && age == other.age) {
			isc =true;
		}
		return isc;
	}
	
	
	
}
