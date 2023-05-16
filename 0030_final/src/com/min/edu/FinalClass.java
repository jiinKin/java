package com.min.edu;

/*
 * class의 final을 작성한다면 상속금지 <-> 상속강요 abstract / interface
 */
public /* final */ class FinalClass {
	// 멤버필드는 외부에서 new을 했을때 혹은 static이 메모리에 올라갈때
	// 선언만 되어 졌다면 자동으로 타입의 초기값이 대입되어짐
	// 근데 final로 되어 있다면 재입력으로 인식되기 때문에 사용할 수 없음
	// 하지만 static은 static  생성자가 생성의 우선순위와 같은 시점을 갖기 때문에 static생성자를 통해 단 1회 입력 가능
	public static final int[] ARR;
	static {
		ARR = new int[3];
	}
	
	public static final int AGE = 10;
	
	public void change() {
//		ARR = new int[4]; // 참조타입은 주소가 고정되기 때문에 새로운 주소를 입력할 수 없다
		ARR[0] = 100; // 참조타입은 주소가 고정되는 것이지 객체 내부의 값이 고정되는 것이 아님
		
		final int a;  // local variable은 선언만 하고 사용하면 오류, 선언한 하면 사용되지 않는 변수 의미없음
		                // local variable은 선언 후 입력이 가능 왜냐면 생성 시점과 입력시점이 같기 때문에
		a = 10;
//		a = 20;
		System.out.println(a);
	}

	public static int[] getArr() {
		return ARR.clone();
	}
	
	public final String callMethod() {
		 return "난 부모메소드 이다";
	}
	
}





