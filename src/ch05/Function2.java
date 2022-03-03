package ch05;

import java.util.Scanner;

public class Function2 {

	public static void main(String[] args) {
		
		recommendMenu();
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
		food[3] = "알리오올리오";
		food[4] = "부타동";
		System.out.println("오늘 추천 드리는 " + category[cate] + "메뉴는 " + food[cate] + " 입니다.");
	}

}
