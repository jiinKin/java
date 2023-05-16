package com.min.edu.sub;

import com.min.edu.H2OImpl;

public class Ice extends H2OImpl {

	@Override
	public void make() {
		System.out.println("ICE의 make");
	}

	@Override
	public void print() {
		System.out.println("ICE의 print");
	}

}
