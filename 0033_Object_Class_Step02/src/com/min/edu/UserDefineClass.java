package com.min.edu;

public class UserDefineClass {

	private String name ="Dior";
	private int age = 100;
	
	public UserDefineClass() {
//		System.out.println(this);
	}
	
	@Override
	public int hashCode() {
		return (name.hashCode() + 127 + age +31);
	}

	@Override
	public boolean equals(Object obj) { //Object  타입을 자식객체를 up-casting 
		System.out.println("com.min.edu에 있는 equals");
		
		//		if(this == obj) { // obj가 현재의 클래스와 같은 객체 확인
//			return true;
//		}
//		if(obj == null) { // 비교대상의 객체가 존재하는지 확인
//			return false;
//		}
//		// Object 타입인 obj를 원래 생성되었을 것으로 예측되는 클래스로 down-casting
//		UserDefineClass other = (UserDefineClass)obj; 
//		
//		if(name == null) {
//			if(other.name == null) {
//				return false;
//			}
//		}else if(!name.equals(other.name)) {
//			return false;
//		}else if(age != other.age){
//			return false;
//		}
		
		boolean isc= false;
		UserDefineClass other = (UserDefineClass)obj;
		if(name.equals(other.name) && age == other.age) {
			isc =true;
		}
		return isc;
	}
	
	
	
	
	
	
}
