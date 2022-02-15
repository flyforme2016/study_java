package ch04;

public class Test {

	public static void main(String[] args) {
		int even = 0, odd = 0;
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + i*j + "\t");
				if((i * j) % 2 == 0) {
					even += i * j;
				}else {
					odd += i * j;
				}
					
			}
			System.out.println("");
		}
		System.out.println("결과값이 짝수인 수들의 합 = " + even);
		System.out.println("결과값이 홀수인 수들의 합 = " + odd);
	}

}
