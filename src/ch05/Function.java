package ch05;

import java.util.Scanner;

public class Function {

	public static void main(String[] args) {
		
		/*
		 * int result[] = arithmeticOperation(6, 3); for(int i = 0; i < result.length;
		 * i++) System.out.println(result[i]);
		 * 
		 * for(int a : allInOne(6, 3)) { System.out.println(a); }
		 */
		recommendMenu();
	}
	
	public static int add (int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static int minus (int a, int b) {
		int sum = a - b;
		return sum;
	}
	
	public static int[] arithmeticOperation(int a, int b) {
		
		int plus = a + b;
		int minus = a - b;
		int multiply = a * b;
		int divide = a / b;
		int result[] = {plus, minus, multiply, divide};
		
		System.out.println("a + b = " + plus);
		System.out.println("a - b = " + minus);
		System.out.println("a * b = " + multiply);
		System.out.println("a / b = " + divide);
		
		return result;
	}
	
	
	public static int[] allInOne(int a, int b) {
		int sum = 0;
		int[] sum2 = new int[5];
			sum2[0] = a + b;
			sum2[1] = a-b;
			sum2[2] = a*b;
			sum2[3] = a/b;
			sum2[4] = a%b;
		
		return sum2;
	}
	
	public static String concat(String a , String b) {
		return a + b;
	}
	
	public static void recommendMenu() {
		Scanner sca = new Scanner(System.in);
		System.out.println("원하시는 카테고리를 선택해 주세요.");
		System.out.println("중식 = 1" + " 한식 = 2" + " 양식 = 3" + " 일식 = 4" + " 원하시는 카테고리를 숫자로 입력해주세요");
		int category = sca.nextInt();
		printMenu(category);
		
	}
	
	public static void printMenu(int cate) {
		String food[] = new String[5];
		String category[] = {"", "중식", "한식", "양식", "일식"};
		food[1] = "짜장면";
		food[2] = "제육볶음";
		food[3] = "파스타";
		food[4] = "부타동";
		System.out.println("오늘 추천 드리는 " + category[cate] + "메뉴는 " + food[cate] + " 입니다.");
	}

}
