package com.interview.assesments.mandark;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = input.nextInt();
		System.out.println(checkPerfectNumber(n));
	}

	public static boolean checkPerfectNumber(int n) {
		if (n == 1)
			return false;
		int s = 1;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				s += i;
			}
		}
		return n == s;
	}
}
