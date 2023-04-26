package com.company;

class Calculator {

	public int add(int x, int y) {
		int result = x + y;
		return result;
	}
}

class CalculatorNew extends Calculator {

	public int multi(int x, int y) {
		int result = x * y;
		return result;
	}
}

public class Iheritance {

	public static void main(String[] args) {

		CalculatorNew calc = new CalculatorNew();
		System.out.println("Add: " + calc.add(5, 8));
		System.out.println("Multi: " + calc.multi(8, 9));
	}

}
