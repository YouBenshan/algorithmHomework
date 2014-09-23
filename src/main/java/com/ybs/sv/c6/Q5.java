package com.ybs.sv.c6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q5 {

	public static void main(String[] args) {
		int[] a = { 7, 8, 10, 9, 4, 1, 2, 3, 2, 1, 8, 7, 7, 6, 9, 0, 3, 2 };
		m(a);

	}

	private static void m(int[] a) {
		List<Integer> less = new ArrayList<>();
		int max = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < max) {
				max = a[i];
				less.add(i);

			}
		}
		System.out.print(Arrays.toString(less.toArray()));

		List<Integer> more = new ArrayList<>();
		int min = Integer.MIN_VALUE;
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] > min) {
				min = a[i];
				more.add(i);
			}
		}
		System.out.print(Arrays.toString(more.toArray()));

		int i = 0;
		int j = 0;

		if (a[less.get(i)] < a[more.get(j)]) {
			System.out.print(i + " " + j);
			return;
		}

		while (true) {
			if (i < less.size() - 1) {
				i++;

				if (a[less.get(i)] < a[more.get(j)]) {
					System.out.print(i + " " + j);
					return;
				}
			}

			if (j < more.size() - 1) {
				j++;
				if (a[less.get(i)] < a[more.get(j)]) {
					System.out.print(i + " " + j);
					return;
				}
			}
		}
	}

}
