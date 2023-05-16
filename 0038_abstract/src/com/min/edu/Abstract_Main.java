package com.min.edu;

public class Abstract_Main {

	public static void main(String[] args) {
//		ParentImpl pl = new ParentImpl() {
//			@Override
//			public void make() {
//				// TODO Auto-generated method stub
//			}
//		};
		
		IParent p = new Child();
		p.make();
		p.print();
		
	}

}





