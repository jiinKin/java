package com.min.edu;

public class Calculation_Main {

	public static void main(String[] args) {
		ValueMN a = new ValueMN(10.1, 5.1);
		ValueMN b = new ValueMN(2,5);
		
		ValueMN resultAdd=  Object_Calculation.add(a, b);
		System.out.println(resultAdd);
		
		ValueMN resultMinus = Object_Calculation.minus(a, b);
		System.out.println(resultMinus);
	}

}
