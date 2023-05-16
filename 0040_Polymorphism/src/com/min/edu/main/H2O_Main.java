package com.min.edu.main;

import com.min.edu.H20;
import com.min.edu.H2OImpl;
import com.min.edu.ctrl.ChoiceFactory;
import com.min.edu.sub.Ice;
import com.min.edu.sub.Steam;
import com.min.edu.sub.Water;

public class H2O_Main {

	public static void main(String[] args) {
		ChoiceFactory c1 = ChoiceFactory.getInstance();
		ChoiceFactory c2 = ChoiceFactory.getInstance();
		System.out.println("주소가 같니? == :" + (c1==c2));
		System.out.println("진짜 heap같은 객체이니? equals" + c1.equals(c2));
		
		
		System.out.println(ChoiceFactory.factoryCount);
		
			for (int i = 1; i < 4; i++) {
				H2OImpl h1 = ChoiceFactory.getInstance().factory(i);
				h1.make();
				h1.print();
			}
			
		System.out.println("생성된 ChoiceFactory 갯수 :  "+ ChoiceFactory.factoryCount);
		
		
		
		/// Polymorphism
		
		H20 h = new Ice(); // 1) 부모타입을 자식을 생성한다
		// 호출과 사용은 생성된객체를 사용하는것이 아닌 선언된 타입에 의해서 결정
		// 3) 부모의 메소드로 자식을 호출 할 수 있다
		h.make(); //VMI : interface 추상화메소드 -> H20Impl abstract 추상화메소드 -> ICE  구현
		h.print();
		
		// 부모는 공통으로  extends 되지만 
		// 1) 기능(method)을 method area에 공통으로 단 1회 
		// 2) 특징(member field)는 각 생성된 heap의 영역에 새로 만들어 짐 (instance를 하게 되면 새로운 ref, hashcode가 부여 된다)
		
		Ice i = new Ice();
		i.num = 10;
		System.out.println(i.num);
		
		Water w = new Water();
		w.num = 20;
		System.out.println(w.num);
		
		Steam s = new Steam();
		s.num = 30;
		System.out.println(s.num);
	}

}





