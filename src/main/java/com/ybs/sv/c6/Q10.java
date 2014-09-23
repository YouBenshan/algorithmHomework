package com.ybs.sv.c6;

import java.util.Arrays;

public class Q10 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };

		int[] b = { 3, 4, 6, 5 };

		m(a, b);

	}

	private static void m(int[] a, int[] b) {
		Arrays.sort(a);
		int missedIndex = -1;
		for (int i = 0; i < b.length; i++) {
			int index = Arrays.binarySearch(a, i, a.length, b[i]);
			if (index < 0) {
				missedIndex = i;
				break;
			} else {
				a[index] = a[i];
				a[i] = b[i];
				Arrays.sort(a, i + 1, a.length);
			}
		}

		if (missedIndex == -1) {
			System.out.print(Arrays.toString(b));
		} else {
			for (int j = missedIndex; j >= 0; j--) {
				if (b[j] > a[a.length - 1]) {
					Arrays.sort(a, j, a.length);
				} else {
					int start = j;
					int end = a.length;
					while (end - start > 1) {
						int mid = (end + start) >> 1;
						if (a[mid] > b[j]) {
							end = mid;
						} else {
							start = mid;
						}
					}
					int temp = a[end];
					a[end] = a[j];
					a[j] = temp;
					break;
				}
			}
			System.out.print(Arrays.toString(a));
		}
	}
}
