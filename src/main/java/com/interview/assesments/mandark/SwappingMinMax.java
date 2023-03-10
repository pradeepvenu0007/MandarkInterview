package com.interview.assesments.mandark;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SwappingMinMax {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the Size of  the list");
		int n = ip.nextInt();
		ArrayList<Integer> a = new ArrayList();
		System.out.println("Enter the list 1");

		for (int i = 0; i < n; i++) {
			a.add(ip.nextInt());
		}
		ArrayList<Integer> b = new ArrayList();
		System.out.println("Enter the list 2");
		for (int i = 0; i < n; i++) {
			b.add(ip.nextInt());
		}
		swapList(a, b);
		System.out.println(maxProduct(a, b));
	}

	public static void swapList(ArrayList<Integer> a, ArrayList<Integer> b) {
		boolean c = true;
		while (c) {
			int max = Collections.max(a);
			int index = a.indexOf(max);
			if (b.get(index) < max) {
				int t = b.get(index);
				b.set(index, a.get(index));
				a.set(index, t);
			} else
				c = false;
		}
	}

	public static int maxProduct(ArrayList<Integer> a, ArrayList<Integer> b) {
		return Collections.max(a)*Collections.max(b);
	}
}
