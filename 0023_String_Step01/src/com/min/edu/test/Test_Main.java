package com.min.edu.test;

public class Test_Main {

	public static void main(String[] args) {
		Test_VO t1 = new Test_VO(); // kokoa
		Test_VO t2 = new Test_VO(); // kokoa
		Test_VO t3 = new Test_VO(); // kokoa
		System.out.println("t1 hashcode :" + t1.hashCode());
		System.out.println("t2 hashcode :" + t2.hashCode());
		System.out.println("t3 hashcode :" + t3.hashCode());
		
		System.out.println("t1 toString() : " + t1);
		System.out.println("t2 toString() : " + t2);
		System.out.println("t3 toString() : " + t3);
		
		
	}

}
