package com.min.edu;

public class Singleton_Main {

	public static void main(String[] args) {
//		SingleObject s1 = new SingleObject();
//		SingleObject s2 = new SingleObject();
		
		SingleObject s1 = SingleObject.getInstance();
		SingleObject s2 = SingleObject.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
