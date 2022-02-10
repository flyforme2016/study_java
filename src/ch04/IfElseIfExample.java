package ch04;

public class IfElseIfExample {

	public static void main(String[] args) {
		int score = 85;
		
		if(score >= 90) {
			System.out.println("점수가 90이상 입니다.");
			System.out.println("등급은 A 입니다.");
		} else if (score >= 80){
			System.out.println("점수가 80~89 입니다.");
			System.out.println("등급은 B 입니다.");
		} else {
			System.out.println("점수가 80미만 입니다.");
			System.out.println("등급은 C 입니다.");
		}
		
		int a = 50;
		int b = 60;
		if(a > b)
			System.out.println(">");
		else if(a < b)
			System.out.println("<");
		else
			System.out.println("==");
		
		if(score >= 95) 
			System.out.println("A+");
		else if(score >= 90) 
			System.out.println("A");
		else if(score >= 85) 
			System.out.println("B+");
		else if(score >= 80)
			System.out.println("B");
		else if(score >= 75)
			System.out.println("C+");
		else if(score >= 70)
			System.out.println("C");
		else if(score >= 65)
			System.out.println("D+");
		else if(score >= 60)
			System.out.println("D");
		else
			System.out.println("F");
	}

}
