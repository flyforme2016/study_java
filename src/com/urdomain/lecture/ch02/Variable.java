package com.urdomain.lecture.ch02;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullName = "Gijeong Kim";
		String name = "Gijeong";
		
		int roomNumber = 1;
		int roomnumber = 2;
		
		System.out.println("rommNumber: " + roomNumber);
		System.out.println("rommnumber: " + roomnumber);
		
		int a;
		a = 1;
		
		int b = 1;
		int c = 0;
		c = a + b;
		
		
		boolean defaultNy = false;
		byte aa = 0;
		short bb = 0;
		int cc = 0;
		long dd = 0;
		float ee = 0.0f;
		double ff = 0.0;
		char gg = ' ';
		String hh = "";
		
		System.out.println(c);
		System.out.println("Gijeong Kim");
		System.out.println("Gijeong Kim : " + c + "warm!!");
		
		System.out.println("한칸들여쓰기");
		System.out.println("\t한칸들여쓰기");
		
		System.out.println("한줄바꿈");
		System.out.println("\n한줄바꿈");
		
		System.out.println("한줄바꿈2");
		System.out.println("\r한줄바꿈");
		
		System.out.println("\'나는생각한다\'");
		System.out.println("쏘크라테스가 말했다 \"나는 존재한다.\"");
		System.out.println("\\");
		
		if(a == 1) {
			int aaa = 10;
			int bbb = aaa + a;
			System.out.println("bbb: " + bbb);
		}
	}

}
