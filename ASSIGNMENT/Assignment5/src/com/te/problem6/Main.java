package com.te.problem6;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Double value");
		Double input=scanner.nextDouble();
		System.out.println(UserMainCode.findNoDigits(input));
		
	}
}