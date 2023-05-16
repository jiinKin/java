package com.min.edu;

//논리연산자 
// && short circuit
public class Logical_Operation {
	
	public void logical() {
		boolean isc1 = true & false; //false;
		boolean isc2 = true | false; // true;
		boolean isc3 = !(true); //false
	}
//	short circuit 
	//&&, ||
	// & 선행연산과 후행산을 모두 확인
	// && 선행의 연산 결과의 따라서 후행의 연산 여부가 정해진다
	// ex) true && 라면 후행의 결과에 따라서 최종 결과가 정해짐 => 후행연산 실행
	// ex) false && 라면 후행의 결과가 최종 결과에 영향을 미치지 않음 => 후행연산을 건너 뜀
	public void shortcircuit() {
		//1) 선행이 true라면 후행이 실행되는 시나리오 증명
		boolean isc1 = trueValue() && falseValue();
		
		//2) 선행이 false라면 후행이 실행되지 않는 시나리오를 증명하세요
		boolean isc2= falseValue() && trueValue();
	}
	
	private boolean trueValue() {
		System.out.println("trueValue 실행");
		return true;
	}
	private boolean falseValue() {
		System.out.println("falseValue 실행");
		return false;
	}
	

}




