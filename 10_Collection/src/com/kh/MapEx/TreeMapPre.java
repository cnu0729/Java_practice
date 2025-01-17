package com.kh.MapEx;

import java.util.TreeMap;

public class TreeMapPre {
	public static void main(String[] args) {
		TreeMap<String,String> tmp = new TreeMap<>();
		
		String[] keys = {"apple", "banana", "orange", "grape", "watermelon"};
		String[] values = {"사과", "바나나", "오렌지", "포도", "수박"};
		
		for(int i = 0; i<keys.length; i++) {
			tmp.put(keys[i], values[i]);
		}
		System.out.println(tmp);
		System.out.println("banana에 해당하는 값은? "+tmp.get("banana"));
		System.out.println("저장된 개수는? " +tmp.size());
		System.out.println("grape가 존재하나요? " +tmp.containsKey("grape"));
		System.out.println("포도가 존재하나요? " +tmp.containsValue("포도"));
		System.out.println("모든 키 출력: " +tmp.keySet());
		System.out.println("모든 값 출력: " +tmp.values());
		System.out.println("첫번째 키: " +tmp.firstKey());
		System.out.println("마지막 키: " +tmp.lastKey());
		
		tmp.clear();
		System.out.println("모두 삭제 되었나요? " +tmp.isEmpty());
		
	}
}
