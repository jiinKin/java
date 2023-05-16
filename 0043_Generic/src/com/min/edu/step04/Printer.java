package com.min.edu.step04;

public class Printer <T extends Animal> {

	private T printerValue;

	public Printer(T printerValue) {
		this.printerValue = printerValue;
	}
	
	public void print() {
		System.out.println("무엇이든 Animal 이라면 출력하세요 : "+printerValue);
	}
	
	
	
}
