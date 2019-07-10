package com.test06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MTest {

	public static void main(String[] args) {
		// Collection : <generic : 타입 강제> 여러개의 값들을 효과적으로 관리하기 위한 객체
		// Array : (같은 타입의) 여러개의 값들을 효과적으로 관리하기 위한 객체
		// 차이점 : 크기가 가변
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		for(int i=0;i<10;i++) {
			list.add(i);
			set.add(i);
			map.put(i,"유저"+i);
		}
		
		list.add(100);
		list.add(100);
		list.add(100);
		set.add(100);
		set.add(100);
		set.add(100);
		map.put(100, "유저1");
		map.put(100, "유저2");
		map.put(100, "유저2");
		
		// iterator : collection의 값을 가져오는 표준화된 객체
		Iterator<Integer> ir01 = list.iterator();
		while(ir01.hasNext()) {
			System.out.print(ir01.next() + " ");
		}
		
		System.out.println();
		
		Iterator<Integer> ir02 = set.iterator();
		while(ir02.hasNext()) {
			System.out.print(ir02.next() + " ");
		}
		
		System.out.println();
		
		// Map.Entry : key, value 분리
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		for(Map.Entry<Integer, String> entry : entrySet) {
			System.out.print(entry.getKey() + " : " + entry.getValue() + " / ");
		}
		
		// list : 순서o 중복o
		// set : 순서x 중복x
		// map : 순서x 중복 (key -> x / value -> o)
		
	}
	
}
