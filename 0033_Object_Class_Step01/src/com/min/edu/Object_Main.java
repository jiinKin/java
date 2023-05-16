package com.min.edu;

public class Object_Main {

	public static void main(String[] args) {
		// 객체의 생성(instance)
		// 같은 멤버필드를 가지고 있지만 다른 객체다. new를 heap 새로운 주소와 hashcode를 가지고 있다
		// u1, u2 에 있는 것 주소 
		// 기본타입(pass by value, immutable)과 참조타입(pass by reference, mutable)
		UserDefineClass u1 = new UserDefineClass();
		UserDefineClass u2 = new UserDefineClass();
		com.min.edu.gd67.UserDefineClass u3 = new com.min.edu.gd67.UserDefineClass();
		
		//1) getClass를 통해서 생성된객체의 설계도(Class)의 위치를 확인하자
		System.out.println(u1.getClass());
		System.out.println(u2.getClass());
		System.out.println(u3.getClass());
		String urlU1 = u1.getClass().toString();
		System.out.println(urlU1);
		
		//2) hashcode를 통한 고유값 확인
		System.out.println("u1의 hashcode 값: "+u1.hashCode());
		System.out.println(System.identityHashCode(u1));
		System.out.println("u2의 hashcode 값: "+u2.hashCode());
		System.out.println("u3의 hashcode 값: "+u3.hashCode());
		
		//3) toString() 객체는 위치@고유값
		// System.out.println() 기능의 출력 함수는 보여주는 것 객체는 위치를 출력해 준다
		// System.out.println()은 toString()을 호출한다. 기본타입은  stack의 값을 출력
		System.out.println(u1);
		// 부모클래스에서 자식 클래스를 표출해줌
		// getClass().getName()+"@"+Integer.toHexaString(hashcode())
		String present = u1.toString(); 
		System.out.println(present);
		
		System.out.println("-------------------");
		System.out.print(u1.getClass().getName());
		System.out.print("@");
		System.out.println(Integer.toHexString(u1.hashCode()));
		
		//4) equals() 부모객체를 통해서 자식의 클래스의 같음 비교 하는 것
		//    객체의 비교는 equals()
		//    객체의 비교는 생성한 Object  클래스를 통해서 
		//       1) 같은 곳에서 생성됐는지 package.Class명
		//       2) 같은 객체인지  down casting이 되는지 // 참조타입의 형변환 부모타입은 변경 up-casting, 자식의 타입으로 변경 down-casting
		//       3) 같은 값을 내부에 가지고 있는지
		//       전제 조건은 같은 타입이어야 한다
		
		UserDefineClass ud01= new UserDefineClass();
		UserDefineClass ud02 = new UserDefineClass();
		
		String ud01_one = ud01.getClass().getName();
		String ud02_one = ud01.getClass().getName();
		
		System.out.println(ud01_one == ud02_one); // 같은  package와 클래스에서 생성된 객체다
		
		Object ud01_two = ud01; // up-casting 
		Object ud02_two = ud02; // up-casting
		UserDefineClass ud01_two_c = (UserDefineClass)ud01_two; // true
		UserDefineClass ud02_two_c = (UserDefineClass)ud02_two; //true
		
		try {
			com.min.edu.gd67.UserDefineClass ud01_two_tt = (com.min.edu.gd67.UserDefineClass)ud01_two;
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("객체가 서로 다르기 때문에 비교 대상이 되지 않습니다");
		}
		
		System.out.println("객체 내부의 값은 getter를 통해  stack으로 가져와 확인");
		boolean isc = (ud01.getName().equals(ud02.getName()) && ud01.getAge() == ud02.getAge())?true:false;
		System.out.println(isc);
		

		
	}

}





