package com.min.edu.info;

import java.util.Objects;

// 회원 1명의 정보를 담을 수 있는 클래스 
public class User_VO {

	private String name;
	private int age;
	private String address;
	
	public User_VO(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "{name=" + name + ", age=" + age + ", address=" + address + "}";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User_VO other = (User_VO) obj;
		return Objects.equals(address, other.address) && age == other.age && Objects.equals(name, other.name);
	}
	
	
	
	
	
}
