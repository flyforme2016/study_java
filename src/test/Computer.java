package test;

public class Computer extends Calculator{
	
	public Double Area(double radius) {
		Constants constants = new Constants();
		return radius * radius * constants.PAI_2;
	}
}
