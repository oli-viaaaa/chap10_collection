package com.javalab.collection.pkg01;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList02 {
	public static void main(String[] args) {
		// ArrayList 컬렉션 객체 생성(10칸짜리)
		ArrayList<Integer> list1 = new ArrayList<>(10);

		list1.add(5);
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));

		// public List<E> subList(...)
		ArrayList<Integer> list2 = new ArrayList<>(list1.subList(1, 4)); // subList(시작 인덱스 번호~4번째 앞까지 자르겠다)
		print(list1, list2);
		System.out.println();

		// 정렬(String)
		Collections.sort(list1); // list1과 list2를 정렬한다 // sort : 오름차순, 내림차순 정렬 가능
		Collections.sort(list2); // Collections.sort(List 1)
		print(list1, list2);

	} // main end

	// 프린트 메소드
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}

}
