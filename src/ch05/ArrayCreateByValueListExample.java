package ch05;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		int[] score;
		int score2[];
		int[] score3 = {1,2,3,4,5,6,7,8,9,10};
		int score4[] = {4, 5, 6};
		double[] score5 = {1, 2, 3, 4};
		String[] strArray = {"장원영", "김기정"};
	
		int[] score6 = {83, 90, 87, 99};
		
		System.out.println("score[0]" + score6[0]);
		System.out.println("score[1]" + score6[1]);
		System.out.println("score[2]" + score6[2]);
		
		int sum = 0;
		for(int i = 0; i < 4; i++)
			sum += score6[i];
		System.out.println("총합은 : " + sum);
		System.out.println("평균은 : " + (double)sum/4);
		
	}

}
