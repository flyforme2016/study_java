package com.urdomain.lecture.ch02;

public class PromotionExample {

	public static void main(String[] args) {
		
		//byte < short < int < long
		//float < double
		//범위가 큰 타입에서 범위가 작은 타입의 변수로 형변환은 불가능

		byte byteValue = 10;
		System.out.println("byteValue: " + byteValue);
		
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		System.out.println("charValue: " + charValue);
		
		intValue = charValue;
		System.out.println("'가'의 유니코드: " + intValue);
		
		intValue = 500;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		intValue = 200;
		float floatValue = intValue;
		System.out.println("floatValue: " + floatValue);
		
	}

}