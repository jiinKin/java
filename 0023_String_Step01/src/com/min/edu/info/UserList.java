package com.min.edu.info;

import java.util.Iterator;

public class UserList {

	private User_VO[]  lists ;
	
	public UserList() {
		lists = new User_VO[3];
	}
	
	public void addUser(User_VO inVo) {
		
		for (int i = 0; i < lists.length; i++) {
			if(lists[i] == null) {
				lists[i] = inVo;
				break;
			}
			if(i == 2) {
				System.out.println("더이상 추가할 수 없습니다");
			}
		} //for문
		
	} // addUser
	
	/**
	 * 멤버필드에 있는 값중 입력 값과 비교 하는 메소드
	 * @param inVo 입력받은 User_VO 객체 
	 * @return true 같은 값이 있다
	 */
	public boolean listCheck(User_VO inVo) {
		boolean isc = false;
		for (int i = 0; i < lists.length; i++) {
			
			if(lists[i].equals(inVo)) {
				isc = true;
			}
			
			// 각 값들을 분해해서 내부의 값을 각각 비교 하는 방식
			// 많은 값들이 있을 경우 불가능 하다
//			if(lists[i].getName().equals(inVo.getName()) && 
//					lists[i].getAge() == inVo.getAge() &&
//					lists[i].getAddress().equals(inVo.getAddress())) {
//				isc = true;
//			}
			
//			if(lists[i].equals(inVo)) { // 객체를 비교 할때는 equals 비교
//				isc = true;
//			}
//			if(lists[i] == inVo) { // 객체의 ==  비교는 주소를 비교
//				isc = true;
//			}
		}
		return isc;
	}

	public User_VO[] getLists() {
		return lists;
	}
	
	
	
}





