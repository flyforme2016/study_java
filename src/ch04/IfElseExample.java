package ch04;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		/*
		 * int score = 85; String grade = "";
		 * 
		 * if(score >= 90) { System.out.println("점수가 90보다 큽니다.");
		 * System.out.println("등급은 A 입니다."); } else {
		 * System.out.println("점수가 90보다 작습니다."); System.out.println("등급은 B 입니다."); }
		 * 
		 * if(score >= 90) { if(score >= 95) grade = "A+"; else grade = "A"; } else if
		 * (score >= 80) { if(score >= 85) grade = "B+"; else grade = "B"; } else if
		 * (score >= 70) { if(score >= 70) grade = "C+"; else grade = "C"; } else if
		 * (score >= 60) { if(score >= 65) grade ="D+"; else grade = "D"; } else grade =
		 * "F"; System.out.println("학점은 : " + grade);
		 */
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x < 0) {
			if(y < 0)
				System.out.println("제3사분면");
			else
				System.out.println("제2사분면");
		}
		else if ( x > 0) {
			if(y < 0)
				System.out.println("제4사분면");
			else
				System.out.println("제1사분면");
		}
	}

}
