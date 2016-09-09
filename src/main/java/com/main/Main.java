package com.main;

import com.github.stokito.unitTestExample.calculator.Calculator;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println("10/2 = " + calculator.divide(10, 2));
		System.out.println("5 - 4 = " + calculator.minus(5, 4));
		System.out.println("5 * 5 = " + calculator.multiply(5, 5));
	}
}