package ch03;

public class StringConcatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "JDK" + 1.8;
		String str2 = str1 + "입니다.";
		
		System.out.println("str2: " + str2);
		
		String strA = "김기정: ";
		String strB = "01094803615";
		String strC = strA + strB + "입니다";
		
		System.out.println("strC: " + strC);
	}

}
