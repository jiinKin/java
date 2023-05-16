package com.min.edu;

public class Inheritance_Main {

	public static void main(String[] args) {
		
		Child c = new Child();
		// 사용되는 타입 
		System.out.println(c.n);
		c.parentMake();
		
		Parent p =c ; // up-casting
		System.out.println(p.n);
		p.parentMake();
		
		c.callParent();
		
		
		
	}

}
