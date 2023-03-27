package com.javalab.collection.pkg08;

/*
 * Properties
 * 	- HashTable의 자식(하위 클래스)로서 HashTable 특징을 갖고 있음
 * 	- key와 value가 String type이어야함.
 * 	- key와 value가 "="로 매핑되어 있다.
 */

import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception {
		// Properties 컬렉션 생성
		Properties properties = new Properties();
		
		// PropertiesExample.class와 동일한 classPath에 있는
		// database.properties 파일 메모리로 로드
		// getResourceAsStream : 주어진 상대경로의 리소스를 읽는 InputStram 반환 // InputStram은 읽을 파일 경로가 있어야 함 ex) PropertiesExample.class
	properties.load(PropertiesExample.class.getResourceAsStream("database.properties"));
		
		// 주어진 키에 대한 값 읽기
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String admin = properties.getProperty("admin");
		
		// 값 출력
		System.out.println("driver : "+ driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : "+ password);
		System.out.println("admin : "+ admin);
	} // main end
	

} // class end
