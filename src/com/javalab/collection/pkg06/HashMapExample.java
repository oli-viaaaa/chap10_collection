package com.javalab.collection.pkg06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>(); // Map<키 타입, 값 타입>

		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90); // 키 타입이 중복
		map.put("동장군", 80);
		map.put("홍길동", 95); // 중복으로 인해 값 타입이 후의 것으로 저장됨
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();

		// 키로 값 얻기
		String key = "홍길동";
		int value = map.get(key);
		System.out.println(key + " : " + value);
		System.out.println();

		// 키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<String> keySet = map.keySet(); // 모든 키를 Set 컬렉션에 담아서 반환
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String k = keyIterator.next(); // k의 type는 String(이름)
			Integer v = map.get(k); // 점수
			System.out.println(k + " : " + v);
		}
		System.out.println();

		// 엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + " : " + v);
		}
		System.out.println();

		// 키로 엔트리 삭제
		// map.remove("홍길동");
		Integer score = map.remove("홍길동");// 삭제된 키와 매핑되는 값을 반환
		System.out.println("score : " + score);
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
	}

}
