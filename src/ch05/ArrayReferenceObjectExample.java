package ch05;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		
		String strArray[] = new String[3];
		strArray[0] = "김기정";
		strArray[1] = "김홍기";
		strArray[1] = new String("이명희");
		
		for(int i = 0; i < strArray.length; i++)
			System.out.println(strArray[i]);
		
		System.out.println(strArray[0] == strArray[1]); //true
		System.out.println(strArray[0] == strArray[2]); //false

		System.out.println(strArray[0].equals(strArray[1])); //true
		System.out.println(strArray[0].equals(strArray[2])); //true
		
	}

}
