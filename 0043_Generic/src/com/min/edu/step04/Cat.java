package com.min.edu.step04;

public class Cat  extends Animal{

	private String catName;

	public Cat(String catName) {
		super();
		this.catName = catName;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	@Override
	public String toString() {
		return "Cat [catName=" + catName + "]";
	}

	
	
}
