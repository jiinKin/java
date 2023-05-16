package com.min.edu;

import com.min.edu.hierachy.ChildClass_A;
import com.min.edu.hierachy.ChildClass_B;
import com.min.edu.hierachy.ParentClass;

//TODO 003 객체의 형변환
//                용어 : up-casting = 자식클래스의 타입에서 부모타입으로 변경되는 것
//                          down-casting = 부모의 타입에서 자식의 구체화된 타입으로 변경되는 것
public class Object_Exchange {

	public static void main(String[] args) {
		// 자식의 타입을 자식의 객체를 생성
		ChildClass_A a = new ChildClass_A();
		ChildClass_B b = new ChildClass_B();
		
		a.parentMethod();
		b.parentMethod();
		
		a.make_a();
		b.make_b();
		
		// 자식의 타입 부모타입으로 변경
		// up-casting
		ParentClass pa = a;
		pa.parentMethod();
		
		ParentClass pb = b;
		pb.parentMethod();
		
		Object obj = pa;

		// pa는 ChildClass_A로 구현되어 있었음
		// pb는 ChildClass_B로 구현되어 있었음
		
		//부모가 생성어진 원래의 자식 타입으로 구체화하는것
		// down-casting
		ChildClass_A aa = (ChildClass_A)pa;
		ChildClass_B ao = (ChildClass_B)pa;
		
		
		
	}
	
}






