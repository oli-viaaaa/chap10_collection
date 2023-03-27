package com.javalab.collection.pkg02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		// ArrauList 컬렉션 객체 생성
		List<String> list1 = new ArrayList<String>();
		// ArrayList<String> list1 = new ArrayList<String>() interface로 넣는것과 빼는것 그 어느것도
		// 상관없음.

		// LinkedList 컬렉션 객체 생성
		List<String> list2 = new LinkedList<String>();

		// 시작 시간과 끝 시간을 저장할 변수 선언
		long startTime;
		long endTime;

		// ArrayList 컬렉션에 저장하는 시간 측정
		startTime = System.nanoTime(); // 컴퓨터에 있는 시간을 가져옴
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간 : ", (endTime - startTime));

		// LinkedList 컬렉션에 저장하는 시간 측정
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간", (endTime - startTime));
	}

}
