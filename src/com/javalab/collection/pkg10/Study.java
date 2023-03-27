package com.javalab.collection.pkg10;

import java.util.ArrayList;
import java.util.List;

public class Study {
	public static void main(String[] args) {

		System.out.println("문제.1 1~10을 갖는 ArrayList를 생성하고 값을 출력하세요");

		// Data 생성
		List<Integer> number = new ArrayList<>();

		// 값 저장
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		number.add(6);
		number.add(7);
		number.add(8);
		number.add(9);
		number.add(10);

		for (int i = 0; i < number.size(); i++) {
			System.out.println(number.get(i));
		}

//		for (Integer integer : number) {
//			System.out.println(integer);
//		}

		System.out.println();
		System.out.println("===========================================");
		System.out.println("문제.2 다음 값을 갖는 ArryList를 생성하고 값을 출력하세요");
		/*
		 * Volvo Benz BMW Hyundai
		 */

		List<String> car = new ArrayList<>();
		car.add("Volvo");
		car.add("Benz");
		car.add("BMW");
		car.add("Hyundai");
		// 출력
		for (String string : car) {
			System.out.println(string);
		}

		System.out.println();
		System.out.println("=================================================================================");
		System.out.println("문제 3. 다음 raw data를 담을 수 있는 Student 클래스를 설계하고 " + "객체를 생성하여 ArrayList에 담고 출력하세요.");
		/*
		 * studentId, jumin, name, year, juso, department "1234", "123456-1234567",
		 * "홍길동", 3, "천안", 210 "5678", "987456-2334567", "김길동", 4, "대전", 220 "8970",
		 * "357556-2334789", "이길동", 1, "서울", 230
		 */

		Student stu1 = new Student("1234", "123456-1234567", "홍길동", 3, "천안", 210);
		Student stu2 = new Student("5678", "987456-2334567", "김길동", 4, "대전", 220);
		Student stu3 = new Student("8970", "357556-2334789", "이길동", 1, "서울", 230);

		List<Student> studentList = new ArrayList<>();

		studentList.add(stu1);
		studentList.add(stu2);
		studentList.add(stu3);

		for (Student student : studentList) {
			System.out.println(student.toString());
		}

	} // main end
} // class end

class Student {
	private String studentId;
	private String jumin;
	private String name;
	private int year;
	private String juso;
	private int department;

	public Student() {
		super();
	}

	public Student(String studentId, String jumin, String name, int year, String juso, int department) {
		super();
		this.studentId = studentId;
		this.jumin = jumin;
		this.name = name;
		this.year = year;
		this.juso = juso;
		this.department = department;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getJuso() {
		return juso;
	}

	public void setJuso(String juso) {
		this.juso = juso;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [studentId : " + studentId + ", jumin : " + jumin + ", name : " + name + ", year : " + year
				+ ", juso : " + juso + ", department : " + department + "]";
	}

}
