package ch04;

public class SwitchExample {

	public static void main(String[] args) {
		int sum = 0;
		int ran;
		for(int i = 1; i < 3; i++) {
			ran = (int)((Math.random()*6) + 1);
			sum += ran;
			switch(ran){
				case 1 :
					System.out.println(i + "번째 주사위는 1입니다.");
					break;
				case 2 :
					System.out.println(i + "번째 주사위는 2입니다.");
					break;
				case 3 :
					System.out.println(i + "번째 주사위는 3입니다.");
					break;
				case 4 :
					System.out.println(i + "번째 주사위는 4입니다.");
					break;
				case 5 :
					System.out.println(i + "번째 주사위는 5입니다.");
					break;
				case 6 :
					System.out.println(i + "번째 주사위는 6입니다.");
					break;
				default:
					System.out.println("잘못된 값입니다.");
					break;
			}
		}
		System.out.println("두 수의 합은 " + sum + "입니다.");
	}

}
