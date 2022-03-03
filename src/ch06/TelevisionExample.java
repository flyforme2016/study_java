package ch06;

public class TelevisionExample {

	public static void main(String[] args) {
		System.out.println("Television.company: " + Television.company);
		System.out.println("Television.model: " + Television.model);
		System.out.println("Television.info: " + Television.info);
		System.out.println();
		
		Television television = new Television();
		System.out.println("Television.company: " + television.company);
		System.out.println("Television.model: " + television.model);
		System.out.println("Television.info: " + television.info);
		System.out.println();
	}

}
