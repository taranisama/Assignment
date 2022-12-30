package com.te.problem1;

public class UserMainCode {
	public static Integer getLuckySum(Integer a, Integer b, Integer c) {
		Integer sum = 0;
		if (a == 19 && b == 19 && c == 19) {
			sum = sum + 0;
		} else if (a == 19) {
			if (c != 19 && b != 19) {
				sum = sum + c;
			}
		} else if (b == 19) {
			sum = sum + a;
		} else if (c == 19) {
			sum = a + b;
		} else {
			sum = a + b + c;
		}
		return sum;
	}
}