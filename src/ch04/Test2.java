package ch04;

public class Test2 {

	public static void main(String[] args) {
		int ran;
		int arr[] = new int[46];
		int lotto[] = new int[6];
		int cnt = 0;
		while(cnt < 6) {
			ran = (int)((Math.random()*45) + 1);
			if(arr[ran] == 0) {
				arr[ran] = 1;
				lotto[cnt] = ran;
				cnt++;
			}
			else continue;
		}
		System.out.print("당신이 뽑은 번호는 ");
		for(int i = 0; i < 6; i++) 
			System.out.print(lotto[i] + ", ");
		System.out.println("입니다.");
	}

}
