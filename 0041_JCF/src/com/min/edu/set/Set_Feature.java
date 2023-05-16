package com.min.edu.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;import java.util.function.IntFunction;

import com.google.common.collect.Sets;

public class Set_Feature {

	public void set_Check2() {
		Set<String> sets = 	new HashSet<String>();
		String a = "가", b="나", c="다";
		String d = new String("다");
		// contains는 hashcode
		sets.add(a);
		sets.add(b);
		sets.add(c);
		
		//삭제
		sets.remove(d);
		System.out.println(sets.contains("다"));
		System.out.println(sets.size());
		
		// JCF -> Array로 변경
//		String[] strArray = (String[]) sets.toArray(); // 사용하지 마세요
//		System.out.println(Arrays.toString(strArray)); 
		Object[] objArray =  sets.toArray();
		System.out.println(Arrays.toString(objArray));
		
		for (int i = 0; i < objArray.length; i++) {
			String s = (String) objArray[i];
			System.out.println(i + ":" + s);
		}
		
		for (Object o : objArray) {
			System.out.println( (String)o);
		}
		
	}
	
	
	public void set_Check() {
		Set<String> sets = 	new HashSet<String>();
		String a = "가", b="나", c="다";
		String d = new String("다");
		
		 System.out.println("c 생성 의 원래 hashcode : " +  System.identityHashCode(c));
		 System.out.println("d new 의 원래 hashcode : " + System.identityHashCode(d));
		 
		 sets.add(a);
		 sets.add(b);
		 sets.add(c);
		 sets.add(d); // 기존 값을 유지합니다
		 
		 // 출력은 Set의 정의에 의해서 순서가 없다
		 for (String s : sets) {
			System.out.println(s + "/" +System.identityHashCode(s));
		}
		
		 // 비교
		 System.out.println(sets.contains("다"));
		 System.out.println(sets.contains(d));// d의 주소가 아닌 값으로 판단
		 
		 //출력
		 // enhanced for 향상된 for
		 // 순서가 없기때문  Iterator Design Pattern
		Iterator<String> iter =  sets.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
		 
		
	}
	
	
	
	
	public void set_use() {
		Set<Integer> set = new HashSet<Integer>();
		
		Integer i = (int)(Math.random()*10);
		System.out.println(i);	System.out.println(i.hashCode());	System.out.println(System.identityHashCode(i));
		
		int loopCnt = 0;
			
		while (true) {
			loopCnt++;
			Integer n = (int)(Math.random()*10);
			set.add(n);
			if(set.size() == 5) {
				break;
			}
		}// while
		
		System.out.println("중복되지 않는  set 객체 출력");
		System.out.println(set);
		System.out.println("반복횟수 : "+ loopCnt);
		
		// JCF를 array로 변경
		Integer[] arryI = (Integer[]) set.toArray(new Integer[0]);
		System.out.println(arryI);
		System.out.println(Arrays.toString(arryI));
		
		int[] result = {2,4,6,8,0}; 
		int successCnt = 0;
		for (int j = 0; j < result.length; j++) {
			boolean isc = set.contains(result[j]);
			if(isc) {
				successCnt++;
			}
		}
		switch (successCnt) {
		case 3:
			System.out.println("오늘은 로또를 구입하자");
			break;
		default:
			System.out.println("공부를 열심히 하자");
			break;
		}
		
		
		
		//import / 외부라이브러 사용
		// package는 라이브러리 개발 2단위 이상
//		Set<Integer> inSet = Sets.newHashSet(1,2,3,1);
//		System.out.println(inSet);
		// 같은 객체라면
		// 문제) 1.기존 객체 유지
		//         2.기존 객체 제거
		
		
	}
}
