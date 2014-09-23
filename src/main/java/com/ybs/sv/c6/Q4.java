package com.ybs.sv.c6;

import java.util.Arrays;

public class Q4 {
	private static final int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };

	public static void main(String[] args) {

		m(0);
		m(1);
		m(2);
		m(3);
		m(4);
		m(5);
		m(9);

	}

	public static void m(int k) {
		int n = 0;
		int start = 0;
		int ni = 0, tv = a[ni];
		boolean first = true;
		while (start != ni || first) {
			if (first) {
				first = false;
			}

			int ti = ni + k;
			while (ti > a.length - 1) {
				ti = ti - a.length;
			}

			int temp = a[ti];
			a[ti] = tv;
			tv = temp;
			ni = ti;

			n++;

			if (n == a.length) {
				break;
			}
			if (start == ni) {
				start++;
				ni = start;
				tv = a[ni];
				first = true;

			}

		}
		System.out.println(Arrays.toString(a));
	}
}
