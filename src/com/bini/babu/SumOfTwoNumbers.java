package com.bini.babu;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		System.out.println("Enter 2 numbers");
		Scanner scanner = new Scanner(System.in);
		int num1 = Integer.parseInt(scanner.next());
		int num2 = Integer.parseInt(scanner.next());
		int result = num1 + num2;
		System.out.println("Result: " + result);

	}

}
