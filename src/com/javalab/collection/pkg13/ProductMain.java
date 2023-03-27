package com.javalab.collection.pkg13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductMain {

	/*
	 * [RAW DATA] new Product(1, "자전거", 250000)); new Product(2, "노트북", 1250000));
	 * new Product(3, "쌀", 150000)); new Product(4, "세탁기", 800000)); new Product(5,
	 * "시금치", 2500)); new Product(6, "대파", 10000)); new Product(7, "에어컨", 3500000));
	 * new Product(8, "쇼파", 3000000)); new Product(9, "우유", 2500)); new
	 * Product(10,"운동화", 600000));
	 */

	/**
	 * 모든 메소드는 자바독 추가
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// 문제1. 전체 상품 목록 출력 메소드 호출(수동으로 메소드 시그니처 생성)
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(1, "자전거", 250000));
		productList.add(new Product(2, "노트북", 1250000));
		productList.add(new Product(3, "쌀", 150000));
		productList.add(new Product(4, "세탁기", 800000));
		productList.add(new Product(5, "시금치", 2500));
		productList.add(new Product(6, "대파", 10000));
		productList.add(new Product(7, "에어컨", 3500000));
		productList.add(new Product(8, "쇼파", 3000000));
		productList.add(new Product(9, "우유", 2500));
		productList.add(new Product(10, "운동화", 600000));

		System.out.println("[문제1. 전체상품 목록을 출력하라]");
		printAllProduct(productList);
		System.out.println();

		// 문제2. 원하는 상품을 파라미터로 전달받아서 검색해주는 메소드를 만들고 해당 상품 각격을 main() 메소드에서 출력하세요
		System.out.println("[문제2. 원하는 상품의 가격을 출력하라]");
		int price = getProductPrice(productList, "에어컨");
		System.out.println(price);
		System.out.println();

		// 문제3. 구매한 제품의 평균 구매 가격을 조회해서 main 메소드에서 출력
		System.out.println("[문제3. 구매한 제품의 평균 구매 가격을 출력하라]");
		int avgPrice = getAverage(productList);
		System.out.println(avgPrice);
		System.out.println();

		// 문제4. 제품 중에서 100만원이 넘는 제품들을 찾아서 ArrayList로 반환해주는 메소드 만들고 main()메소드에서 출력
		System.out.println("[문제4. 제품 중 100만원이 넘는 제품들을 출력하라]");
		List<Product> productPrice = product100List(productList);
		for (Product product : productPrice) {
			System.out.println(product.getId() + "\t" + product.getName() + "\t" + product.getPrice());
		}

		// 문제5. HashMap을 통한 제품 출력 메소드 만들기
		Map<Integer, Product> productMap = new HashMap<Integer, Product>();
		productMap.put(1, new Product(1, "자전거", 250000));
		productMap.put(2, new Product(2, "노트북", 1250000));
		productMap.put(3, new Product(3, "쌀", 150000));
		productMap.put(4, new Product(4, "세탁기", 800000));
		productMap.put(5, new Product(5, "시금치", 2500));
		productMap.put(6, new Product(6, "대파", 10000));
		productMap.put(7, new Product(7, "에어컨", 3500000));
		productMap.put(8, new Product(8, "쇼파", 3000000));
		productMap.put(9, new Product(9, "우유", 2500));
		productMap.put(10, new Product(10, "운동화", 600000));

		System.out.println();
		System.out.println("[문제5. HashMap을 통한 제품 출력하라]");
		printProductMap(productMap);

	}// main end

	// 문제5. HashMap을 통한 제품 출력 메소드 만들기
	private static void printProductMap(Map<Integer, Product> productMap) {
		for (Integer id : productMap.keySet()) {
			System.out.println(productMap.get(id).getId() + "\t" + productMap.get(id).getName() + "\t"
					+ productMap.get(id).getPrice());
		}

	}

	// 문제4. 제품 중에서 100만원이 넘는 제품들을 찾아서 ArrayList로 반환해주는 메소드 만들고 main()메소드에서 출력
	private static List<Product> product100List(List<Product> productList) {
		List<Product> productPrice = new ArrayList<Product>();
		for (Product product : productList) {
			if (product.getPrice() >= 1000000) {
				productPrice.add(product);
			}
		}
		return productPrice;
	}

	// 문제3. 구매한 제품의 평균 구매 가격을 조회해서 main 메소드에서 출력
	private static int getAverage(List<Product> productList) {
		int sum = 0;
		int avgPrice = 0;
		for (int i = 0; i < productList.size(); i++) {
			sum += productList.get(i).getPrice();
		}
		avgPrice = sum / productList.size();
		return avgPrice;
	}

	// 문제2. 원하는 상품을 파라미터로 전달받아서 검색해주는 메소드를 만들고 해당 상품 각격을 main() 메소드에서 출력하세요
	private static int getProductPrice(List<Product> productList, String string) {
		int price = 0;
		for (Product product : productList) {
			if (product.getName().equals(string)) {
				price = product.getPrice();
			}
		}
		return price;
	}

	// 문제1. 전체 상품 목록 출력 메소드 호출(수동으로 메소드 시그니처 생성)
	private static void printAllProduct(List<Product> productList) {
		for (int i = 0; i < productList.size(); i++) {
			System.out.println(productList.get(i).getId() + "\t" + productList.get(i).getName() + "\t"
					+ productList.get(i).getPrice());
		}
	}
} // class end
