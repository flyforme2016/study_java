package ch05;

public class ArrayFunctionExample {

	public static void main(String[] args) {
		/*
		 * int score[] = {83, 90, 87};
		 * 
		 * int sum = 0;
		 * 
		 * System.out.println("score.length: " + score.length);
		 * 
		 * for(int i = 0; i < score.length; i++) sum += score[i];
		 * System.out.println("총합은 : " + sum);
		 */
		
		int num1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int num2[] = {2, 3, 4, 5, 6, 7, 8, 9};
		
		for(int i = 0; i < num1.length; i++) {
			for(int j = 0; j < num2.length; j++) 
				System.out.print(num2[j] + " * " + num1[i] + " = " + num2[j] * num1[i] + "\t");
			System.out.println();
		}
	}

}
