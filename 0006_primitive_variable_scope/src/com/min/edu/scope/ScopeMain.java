package com.min.edu.scope;

public class ScopeMain {

	public static void main(String[] args) {
//		VariableScope scope = new VariableScope();
//		scope.age = 99;
//		System.out.println(scope.age);
//		System.out.println(scope.isc);
//		System.out.println(scope.name);
//		System.out.println(scope.getCnt());
//		scope.cal();

		VariableScope v1 = new VariableScope();
		VariableScope v2 = new VariableScope();
		
		v1.age=22;
		v2.age=33;
		
		VariableScope.num = v1.age+v2.age;
		StaticCal.calculation();
		
		System.out.println(VariableScope.num);
		
		
	}

}




