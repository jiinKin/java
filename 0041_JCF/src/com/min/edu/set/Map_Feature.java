package com.min.edu.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Feature {

	public void map_check() {
		Map<String, Integer> map =	new HashMap<String, Integer>();
		// key와 value로 입력해야 한다
		// key는 중복안됨,  value 는 중복
		// key가 중복된 값이 있다면, value의 처리는 어떻게 될까?
		
		map.put("가", 10);
		map.put("나", 20);
		map.put("다", 30);
		map.put("라", 100);
		
		//key를 알지 못하면 값을 추출할 수 없음
		System.out.println(map.get("라"));
		System.out.println(map.get("마"));
	}
	
	 public void map_use() {
		 Map<String, Integer> map =	new HashMap<String, Integer>();
			map.put("가", 10);
			map.put("나", 20);
			map.put("다", 30);
			map.put("라", 40);
			map.put("마", 50);
			
//			for (String map : map) { // 하지 마세요
//			}
			
			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				String key = entry.getKey();
				Integer val = entry.getValue();
				System.out.println(key +"/" + val);
			}
			
			// key가 없으면 값을 찾을 수 없음
			
			//삭제는?
			String rm = "10";
			Integer rmI = 10;
			map.remove(rm); // 무조건 key 값을 만을 확인
			System.out.println(map);
			System.out.println(map.remove("마", 50));
			System.out.println(map);
			
			System.out.println(map.containsKey("사"));
			System.out.println(map.containsKey("가"));
			System.out.println(map.containsValue(50));
			System.out.println(map.containsValue(20));
			
			
			// 출력
			Set<String> keys =  map.keySet(); //  map의 key값들은 모두 Set타입으로 만들어 준다
			System.out.println("맵의 key들 : "+ keys);
			Iterator<String> iter = keys.iterator();
			while (iter.hasNext()) {
				String name =  iter.next();
				System.out.println(name+":"+ map.get(name));
//				System.out.println(iter.next());
//				System.out.println(iter.next());
			}
			
			
			
	 }
	
}




