package com.javalab.collection.pkg07_01;

public class HashMapMain {

	public static void main(String[] args) {
		// 1. 과일 객체 생성
		// 과일 변수명 : apple, banana, orange
		Fruit apple = new Fruit("Apple", 3000);
		Fruit banana = new Fruit("Banna", 3500);
		Fruit orange = new Fruit("Orange", 4000);

		// 2. 과일 객체를 담을 박스(Box) 객체 생성
		Box<Fruit> box = new Box();
		box.addIteam(apple); // 박스 객체에 과일 생성 추가
		box.addIteam(banana);
		box.addIteam(orange);

		// 3. 박스의 내용 확인
		for (Fruit fruit : box.getItems()) {
			System.out.println(fruit.getName() + "\t" + fruit.getPrice());
		}
		System.out.println();

		// 4. 야채 객체 생성
		// 야채 변수 명 : 시금치, 양배추, 대파
		Vegitable 시금치 = new Vegitable("시금치", 1500);
		Vegitable 양배추 = new Vegitable("양배추", 2500);
		Vegitable 대파 = new Vegitable("대파", 3500);

		// 5. 야채 객체를 담을 박스(Box) 객체 생성
		Box<Vegitable> box2 = new Box();
		box2.addIteam(시금치);
		box2.addIteam(양배추);
		box2.addIteam(대파);

		// 6. 박스의 야채 확인
		for (Vegitable vegitable : box2.getItems()) {// box2.getItems => ArrayList
			System.out.println(vegitable.getName() + "\t" + vegitable.getPrice());
		}

	}

}
